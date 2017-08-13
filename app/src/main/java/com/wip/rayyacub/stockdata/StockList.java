package com.wip.rayyacub.stockdata;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.wip.rayyacub.stockdata.Adapter.StocksViewAdapter;
import com.wip.rayyacub.stockdata.ListSort.QuoteSort;
import com.wip.rayyacub.stockdata.ListSort.VolleySort;
import com.wip.rayyacub.stockdata.Model.Query;
import com.wip.rayyacub.stockdata.Model.Quote;
import com.wip.rayyacub.stockdata.Model.Results;
import com.wip.rayyacub.stockdata.Model.StockListModel;
import com.wip.rayyacub.stockdata.Model.StockQuery;
import com.wip.rayyacub.stockdata.Network.ApiClient;
import com.wip.rayyacub.stockdata.Network.ApiService;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;

public class StockList extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener, SearchView.OnQueryTextListener {
    public static final String ENDPOINT_URI = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.quotes%20where%20symbol%20in%20(%22ADP%22,%22MA%22,%22BBVA%22,%22AMZN%22,%22UNH%22)&format=json&env=store://datatables.org/alltableswithkeys";
    @BindView(R.id.refresh_layout)
    private SwipeRefreshLayout swipeRefreshLayout;
    @BindView(R.id.search_bar)
    private SearchView searchView;
    @BindView(R.id.stock_list)
    private RecyclerView recyclerView;
    public ArrayList<StockListModel> listModels;
    public ArrayList<StockListModel> detailModels;
    public List<Quote> quoteArrayList;
    private StocksViewAdapter stocksViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        //networkCall();
        retrofitNetworkCall();
    }

    //layout initialize
    private void init() {
        ButterKnife.bind(this);
        listModels = new ArrayList<>();
        detailModels = new ArrayList<>();
        quoteArrayList = new ArrayList<>();
        rvInit();
        swipeRefreshLayout.setOnRefreshListener(this);
        searchView.setOnQueryTextListener(this);
    }

    //recycler view Initialization
    private void rvInit() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(stocksViewAdapter);
    }

    //swipe on refresh
    @Override
    public void onRefresh() {
        listModels = new ArrayList<>();
        detailModels = new ArrayList<>();
        quoteArrayList = new ArrayList<>();
        retrofitNetworkCall();
    }

    //search view functionality
    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        stocksViewAdapter.getFilter().filter(newText);
        return true;
    }

    //background network processing to retrieve the stock quotes
    //retrofit method
    private void retrofitNetworkCall() {
        ApiClient.getClient()
                .create(ApiService.class)
                .getQuery()
                .enqueue(new Callback<StockQuery>() {
                    @Override
                    public void onResponse(@NonNull Call<StockQuery> call, @NonNull retrofit2.Response<StockQuery> response) {
                        Query query = response.body().getQuery();
                        Results results = query.getResults();
                        quoteArrayList = results.getQuote();
                        //sorting the list
                        Collections.sort(quoteArrayList, new QuoteSort());
                        stocksViewAdapter = new StocksViewAdapter(StockList.this);
                        recyclerView.setAdapter(stocksViewAdapter);

                        //update the view
                        stocksViewAdapter.notifyDataSetChanged();
                        if (swipeRefreshLayout.isRefreshing()) {
                            swipeRefreshLayout.setRefreshing(false);
                        }

                    }

                    @Override
                    public void onFailure(Call<StockQuery> call, Throwable t) {
                        Toast.makeText(StockList.this, "failed", Toast.LENGTH_SHORT).show();

                    }
                });
    }

    //volley method
    private void networkCall() {
        StringRequest stringRequest = new StringRequest(Request.Method.GET, ENDPOINT_URI,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Result handling
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            JSONObject query = jsonObject.getJSONObject("query");
                            JSONObject results = query.getJSONObject("results");
                            JSONArray quote = results.getJSONArray("quote");

                            for (int i = 0; i < quote.length(); i++) {
                                JSONObject stock = quote.getJSONObject(i);
                                //data for the detail view
                                String symbol = stock.getString("symbol");
                                String name = stock.getString("Name");
                                String ask = stock.getString("Ask");
                                String bid = stock.getString("Bid");
                                String change = stock.getString("Change");
                                //data for the list
                                String lastTradePrice = stock.getString("LastTradePriceOnly");
                                String changeInPercent = stock.getString("ChangeinPercent");

                                listModels.add(new StockListModel(symbol, lastTradePrice, changeInPercent));
                                detailModels.add(new StockListModel(symbol, name, ask, bid, change));
                            }
                            //sorting the lists in ascending order
                            Collections.sort(listModels, new VolleySort());
                            Collections.sort(detailModels, new VolleySort());

                            stocksViewAdapter.notifyDataSetChanged();
                            if (swipeRefreshLayout.isRefreshing()) {
                                swipeRefreshLayout.setRefreshing(false);
                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                // Error handling
                System.out.println("Something went wrong!");
                error.printStackTrace();

            }
        });

        Volley.newRequestQueue(StockList.this).add(stringRequest);
    }


}

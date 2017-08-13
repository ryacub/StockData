package com.wip.rayyacub.stockdata.Adapter;


import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.wip.rayyacub.stockdata.Model.Quote;
import com.wip.rayyacub.stockdata.R;
import com.wip.rayyacub.stockdata.StockDetail;
import com.wip.rayyacub.stockdata.StockList;

import java.util.ArrayList;

public class StocksViewAdapter extends RecyclerView.Adapter<StocksViewAdapter.stocksViewHolder> implements Filterable {

    private StockList stockList;
    private ArrayList<Quote> copyCatList = new ArrayList<>();

    public StocksViewAdapter(StockList stockList) {
        this.stockList = stockList;
    }

    @Override
    public stocksViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_view_layout, parent, false);
        return new stocksViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(final stocksViewHolder holder, final int position) {

        holder.symbol.setText(stockList.quoteArrayList.get(position).getSymbol());
        holder.tradePrice.setText(stockList.quoteArrayList.get(position).getLastTradePriceOnly());
        holder.changePercent.setText(stockList.quoteArrayList.get(position).getChangeinPercent());
        holder.rowCardView.setOnClickListener(new cardClick(position));
    }

    @Override
    public int getItemCount() {
        return stockList.quoteArrayList.size();
    }

    //search filter
    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                FilterResults results = new FilterResults();
                //copys arraylist to hold reference
                copyCatList.addAll(stockList.quoteArrayList);

                if (charSequence == null || charSequence.length() == 0) {
                    //filter for none
                    stockList.quoteArrayList.clear();
                    stockList.quoteArrayList = (ArrayList<Quote>) copyCatList.clone();
                    results.values = stockList.quoteArrayList;
                    results.count = stockList.quoteArrayList.size();
                } else {
                    for (int i = 0; i < copyCatList.size(); i++) {
                        if ((copyCatList.get(i).getSymbol().toUpperCase()).contains(charSequence.toString().toUpperCase())) {
                            ArrayList<Quote> filterList = new ArrayList<>();
                            filterList.add(copyCatList.get(i));
                            results.count = filterList.size();
                            results.values = filterList;
                        }
                    }
                }
                return results;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                stockList.quoteArrayList = (ArrayList<Quote>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    //stocks view holder
    class stocksViewHolder extends RecyclerView.ViewHolder {
        CardView rowCardView;
        TextView symbol;
        TextView tradePrice;
        TextView changePercent;

        stocksViewHolder(View itemView) {
            super(itemView);
            rowCardView = (CardView) itemView.findViewById(R.id.card_row_view);
            symbol = (TextView) itemView.findViewById(R.id.symbol);
            tradePrice = (TextView) itemView.findViewById(R.id.trade_price);
            changePercent = (TextView) itemView.findViewById(R.id.change_percent);
        }
    }

    //card click for each stock detail
    private class cardClick implements View.OnClickListener {
        int position;

        public cardClick(int position) {
            this.position = position;
        }

        @Override
        public void onClick(View v) {
            click();
        }

        private void click() {
            String name = stockList.quoteArrayList.get(position).getName();
            String symbol = stockList.quoteArrayList.get(position).getSymbol();
            String ask = String.valueOf(stockList.quoteArrayList.get(position).getAsk());
            String bid = String.valueOf(stockList.quoteArrayList.get(position).getBid());
            String change = stockList.quoteArrayList.get(position).getChange();

            //bid and ask tend to be null at times
            if (bid == null || bid.equalsIgnoreCase("") || bid.equalsIgnoreCase("null")) {
                bid = "0";
            }
            if (ask == null || ask.equalsIgnoreCase("") || ask.equalsIgnoreCase("null")) {
                ask = "0";
            }

            //detailed fragment view for each stock
            StockDetail stockDetail = new StockDetail();
            Bundle stockfrag = new Bundle();
            stockfrag.putString("NAME", name);
            stockfrag.putString("SYMBOL", symbol);
            stockfrag.putString("ASK", ask);
            stockfrag.putString("BID", bid);
            stockfrag.putString("CHANGE", change);
            stockDetail.setArguments(stockfrag);

            FragmentTransaction transaction = stockList.getSupportFragmentManager()
                    .beginTransaction();
            transaction.replace(R.id.main, stockDetail)
                    .addToBackStack(null)
                    .commit();
        }
    }
}

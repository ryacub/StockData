package com.wip.rayyacub.stockdata.Network;


import com.wip.rayyacub.stockdata.Model.StockQuery;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("v1/public/yql?q=select%20*%20from%20yahoo.finance.quotes%20where%20symbol%20in%20(%22ADP%22,%22MA%22,%22BBVA%22,%22AMZN%22,%22UNH%22)&format=json&env=store://datatables.org/alltableswithkeys")
    Call<StockQuery> getQuery();

}

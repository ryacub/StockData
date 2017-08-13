package com.wip.rayyacub.stockdata.ListSort;


import com.wip.rayyacub.stockdata.Model.StockListModel;

import java.util.Comparator;

public class VolleySort implements Comparator<StockListModel> {
    @Override
    public int compare(StockListModel stockListModel, StockListModel t1) {
        return stockListModel.getSymbol().compareTo(t1.getSymbol());
    }
}

package com.wip.rayyacub.stockdata.ListSort;


import com.wip.rayyacub.stockdata.Model.Quote;

import java.util.Comparator;

public class QuoteSort implements Comparator<Quote> {

    @Override
    public int compare(Quote o1, Quote o2) {
        return o1.getSymbol().compareTo(o2.getSymbol());
    }
}

package com.wip.rayyacub.stockdata;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StockDetail extends Fragment {

    @BindView(R.id.name)
    private TextView name;
    @BindView(R.id.symbol)
    private TextView symbol;
    @BindView(R.id.ask)
    private TextView ask;
    @BindView(R.id.change)
    private TextView change;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.detail_view_layout, container, false);
        ButterKnife.bind(this,rootView);
        //bundle null check
        if (getArguments() != null) {
            //these values might be null sometimes
            String symbolFormat = String.format(getString(R.string.stock_name), getArguments().getString("SYMBOL"));
            String pricing = String.format(getString(R.string.ask), getArguments().getString("ASK") + " / " + String.format(getString(R.string.bid), getArguments().getString("BID")));
            String changeInPrice = String.format(getString(R.string.change), getArguments().getString("CHANGE"));

            name.setText(getArguments().getString("NAME"));
            symbol.setText(symbolFormat);
            ask.setText(pricing);
            change.setText(changeInPrice);
        }

        return rootView;
    }
}

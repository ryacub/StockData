package com.wip.rayyacub.stockdata.Model;


public class StockListModel {

    private String symbol;
    private String lastTradePriceOnly;
    private String changeInPercent;
    private String name;
    private String ask;
    private String bid;
    private String change;

    public StockListModel(String symbol, String lastTradePriceOnly, String changeInPercent) {
        this.symbol = symbol;
        this.lastTradePriceOnly = lastTradePriceOnly;
        this.changeInPercent = changeInPercent;
    }

    public StockListModel(String symbol, String name, String ask, String bid, String change) {
        this.symbol = symbol;
        this.name = name;
        this.ask = ask;
        this.bid = bid;
        this.change = change;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getLastTradePriceOnly() {
        return lastTradePriceOnly;
    }

    public void setLastTradePriceOnly(String lastTradePriceOnly) {
        this.lastTradePriceOnly = lastTradePriceOnly;
    }

    public String getChangeInPercent() {
        return changeInPercent;
    }

    public void setChangeInPercent(String changeInPercent) {
        this.changeInPercent = changeInPercent;
    }
}

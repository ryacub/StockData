package com.wip.rayyacub.stockdata.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Quote {
    @SerializedName("Ask")
    @Expose
    private Object ask;
    @SerializedName("AverageDailyVolume")
    @Expose
    private String averageDailyVolume;
    @SerializedName("Bid")
    @Expose
    private Object bid;
    @SerializedName("AskRealtime")
    @Expose
    private Object askRealtime;
    @SerializedName("BidRealtime")
    @Expose
    private Object bidRealtime;
    @SerializedName("BookValue")
    @Expose
    private String bookValue;
    @SerializedName("Change_PercentChange")
    @Expose
    private String changePercentChange;
    @SerializedName("Change")
    @Expose
    private String change;
    @SerializedName("Commission")
    @Expose
    private Object commission;
    @SerializedName("Currency")
    @Expose
    private String currency;
    @SerializedName("ChangeRealtime")
    @Expose
    private Object changeRealtime;
    @SerializedName("AfterHoursChangeRealtime")
    @Expose
    private Object afterHoursChangeRealtime;
    @SerializedName("DividendShare")
    @Expose
    private String dividendShare;
    @SerializedName("LastTradeDate")
    @Expose
    private String lastTradeDate;
    @SerializedName("TradeDate")
    @Expose
    private Object tradeDate;
    @SerializedName("EarningsShare")
    @Expose
    private String earningsShare;
    @SerializedName("ErrorIndicationreturnedforsymbolchangedinvalid")
    @Expose
    private Object errorIndicationreturnedforsymbolchangedinvalid;
    @SerializedName("EPSEstimateCurrentYear")
    @Expose
    private String ePSEstimateCurrentYear;
    @SerializedName("EPSEstimateNextYear")
    @Expose
    private String ePSEstimateNextYear;
    @SerializedName("EPSEstimateNextQuarter")
    @Expose
    private String ePSEstimateNextQuarter;
    @SerializedName("DaysLow")
    @Expose
    private String daysLow;
    @SerializedName("DaysHigh")
    @Expose
    private String daysHigh;
    @SerializedName("YearLow")
    @Expose
    private String yearLow;
    @SerializedName("YearHigh")
    @Expose
    private String yearHigh;
    @SerializedName("HoldingsGainPercent")
    @Expose
    private Object holdingsGainPercent;
    @SerializedName("AnnualizedGain")
    @Expose
    private Object annualizedGain;
    @SerializedName("HoldingsGain")
    @Expose
    private Object holdingsGain;
    @SerializedName("HoldingsGainPercentRealtime")
    @Expose
    private Object holdingsGainPercentRealtime;
    @SerializedName("HoldingsGainRealtime")
    @Expose
    private Object holdingsGainRealtime;
    @SerializedName("MoreInfo")
    @Expose
    private Object moreInfo;
    @SerializedName("OrderBookRealtime")
    @Expose
    private Object orderBookRealtime;
    @SerializedName("MarketCapitalization")
    @Expose
    private String marketCapitalization;
    @SerializedName("MarketCapRealtime")
    @Expose
    private Object marketCapRealtime;
    @SerializedName("EBITDA")
    @Expose
    private String eBITDA;
    @SerializedName("ChangeFromYearLow")
    @Expose
    private String changeFromYearLow;
    @SerializedName("PercentChangeFromYearLow")
    @Expose
    private String percentChangeFromYearLow;
    @SerializedName("LastTradeRealtimeWithTime")
    @Expose
    private Object lastTradeRealtimeWithTime;
    @SerializedName("ChangePercentRealtime")
    @Expose
    private Object changePercentRealtime;
    @SerializedName("ChangeFromYearHigh")
    @Expose
    private String changeFromYearHigh;
    @SerializedName("PercebtChangeFromYearHigh")
    @Expose
    private String percebtChangeFromYearHigh;
    @SerializedName("LastTradeWithTime")
    @Expose
    private String lastTradeWithTime;
    @SerializedName("LastTradePriceOnly")
    @Expose
    private String lastTradePriceOnly;
    @SerializedName("HighLimit")
    @Expose
    private Object highLimit;
    @SerializedName("LowLimit")
    @Expose
    private Object lowLimit;
    @SerializedName("DaysRange")
    @Expose
    private String daysRange;
    @SerializedName("DaysRangeRealtime")
    @Expose
    private Object daysRangeRealtime;
    @SerializedName("FiftydayMovingAverage")
    @Expose
    private String fiftydayMovingAverage;
    @SerializedName("TwoHundreddayMovingAverage")
    @Expose
    private String twoHundreddayMovingAverage;
    @SerializedName("ChangeFromTwoHundreddayMovingAverage")
    @Expose
    private String changeFromTwoHundreddayMovingAverage;
    @SerializedName("PercentChangeFromTwoHundreddayMovingAverage")
    @Expose
    private String percentChangeFromTwoHundreddayMovingAverage;
    @SerializedName("ChangeFromFiftydayMovingAverage")
    @Expose
    private String changeFromFiftydayMovingAverage;
    @SerializedName("PercentChangeFromFiftydayMovingAverage")
    @Expose
    private String percentChangeFromFiftydayMovingAverage;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Notes")
    @Expose
    private Object notes;
    @SerializedName("Open")
    @Expose
    private String open;
    @SerializedName("PreviousClose")
    @Expose
    private String previousClose;
    @SerializedName("PricePaid")
    @Expose
    private Object pricePaid;
    @SerializedName("ChangeinPercent")
    @Expose
    private String changeinPercent;
    @SerializedName("PriceSales")
    @Expose
    private String priceSales;
    @SerializedName("PriceBook")
    @Expose
    private String priceBook;
    @SerializedName("ExDividendDate")
    @Expose
    private String exDividendDate;
    @SerializedName("PERatio")
    @Expose
    private String pERatio;
    @SerializedName("DividendPayDate")
    @Expose
    private String dividendPayDate;
    @SerializedName("PERatioRealtime")
    @Expose
    private Object pERatioRealtime;
    @SerializedName("PEGRatio")
    @Expose
    private String pEGRatio;
    @SerializedName("PriceEPSEstimateCurrentYear")
    @Expose
    private String priceEPSEstimateCurrentYear;
    @SerializedName("PriceEPSEstimateNextYear")
    @Expose
    private String priceEPSEstimateNextYear;
    @SerializedName("Symbol")
    @Expose
    private String symbol;
    @SerializedName("SharesOwned")
    @Expose
    private Object sharesOwned;
    @SerializedName("ShortRatio")
    @Expose
    private String shortRatio;
    @SerializedName("LastTradeTime")
    @Expose
    private String lastTradeTime;
    @SerializedName("TickerTrend")
    @Expose
    private Object tickerTrend;
    @SerializedName("OneyrTargetPrice")
    @Expose
    private String oneyrTargetPrice;
    @SerializedName("Volume")
    @Expose
    private String volume;
    @SerializedName("HoldingsValue")
    @Expose
    private Object holdingsValue;
    @SerializedName("HoldingsValueRealtime")
    @Expose
    private Object holdingsValueRealtime;
    @SerializedName("YearRange")
    @Expose
    private String yearRange;
    @SerializedName("DaysValueChange")
    @Expose
    private Object daysValueChange;
    @SerializedName("DaysValueChangeRealtime")
    @Expose
    private Object daysValueChangeRealtime;
    @SerializedName("StockExchange")
    @Expose
    private String stockExchange;
    @SerializedName("DividendYield")
    @Expose
    private String dividendYield;
    @SerializedName("PercentChange")
    @Expose
    private String percentChange;

    public Object getAsk() {
        return ask;
    }

    public void setAsk(Object ask) {
        this.ask = ask;
    }

    public String getAverageDailyVolume() {
        return averageDailyVolume;
    }

    public void setAverageDailyVolume(String averageDailyVolume) {
        this.averageDailyVolume = averageDailyVolume;
    }

    public Object getBid() {
        return bid;
    }

    public void setBid(Object bid) {
        this.bid = bid;
    }

    public Object getAskRealtime() {
        return askRealtime;
    }

    public void setAskRealtime(Object askRealtime) {
        this.askRealtime = askRealtime;
    }

    public Object getBidRealtime() {
        return bidRealtime;
    }

    public void setBidRealtime(Object bidRealtime) {
        this.bidRealtime = bidRealtime;
    }

    public String getBookValue() {
        return bookValue;
    }

    public void setBookValue(String bookValue) {
        this.bookValue = bookValue;
    }

    public String getChangePercentChange() {
        return changePercentChange;
    }

    public void setChangePercentChange(String changePercentChange) {
        this.changePercentChange = changePercentChange;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public Object getCommission() {
        return commission;
    }

    public void setCommission(Object commission) {
        this.commission = commission;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Object getChangeRealtime() {
        return changeRealtime;
    }

    public void setChangeRealtime(Object changeRealtime) {
        this.changeRealtime = changeRealtime;
    }

    public Object getAfterHoursChangeRealtime() {
        return afterHoursChangeRealtime;
    }

    public void setAfterHoursChangeRealtime(Object afterHoursChangeRealtime) {
        this.afterHoursChangeRealtime = afterHoursChangeRealtime;
    }

    public String getDividendShare() {
        return dividendShare;
    }

    public void setDividendShare(String dividendShare) {
        this.dividendShare = dividendShare;
    }

    public String getLastTradeDate() {
        return lastTradeDate;
    }

    public void setLastTradeDate(String lastTradeDate) {
        this.lastTradeDate = lastTradeDate;
    }

    public Object getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Object tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getEarningsShare() {
        return earningsShare;
    }

    public void setEarningsShare(String earningsShare) {
        this.earningsShare = earningsShare;
    }

    public Object getErrorIndicationreturnedforsymbolchangedinvalid() {
        return errorIndicationreturnedforsymbolchangedinvalid;
    }

    public void setErrorIndicationreturnedforsymbolchangedinvalid(Object errorIndicationreturnedforsymbolchangedinvalid) {
        this.errorIndicationreturnedforsymbolchangedinvalid = errorIndicationreturnedforsymbolchangedinvalid;
    }

    public String getEPSEstimateCurrentYear() {
        return ePSEstimateCurrentYear;
    }

    public void setEPSEstimateCurrentYear(String ePSEstimateCurrentYear) {
        this.ePSEstimateCurrentYear = ePSEstimateCurrentYear;
    }

    public String getEPSEstimateNextYear() {
        return ePSEstimateNextYear;
    }

    public void setEPSEstimateNextYear(String ePSEstimateNextYear) {
        this.ePSEstimateNextYear = ePSEstimateNextYear;
    }

    public String getEPSEstimateNextQuarter() {
        return ePSEstimateNextQuarter;
    }

    public void setEPSEstimateNextQuarter(String ePSEstimateNextQuarter) {
        this.ePSEstimateNextQuarter = ePSEstimateNextQuarter;
    }

    public String getDaysLow() {
        return daysLow;
    }

    public void setDaysLow(String daysLow) {
        this.daysLow = daysLow;
    }

    public String getDaysHigh() {
        return daysHigh;
    }

    public void setDaysHigh(String daysHigh) {
        this.daysHigh = daysHigh;
    }

    public String getYearLow() {
        return yearLow;
    }

    public void setYearLow(String yearLow) {
        this.yearLow = yearLow;
    }

    public String getYearHigh() {
        return yearHigh;
    }

    public void setYearHigh(String yearHigh) {
        this.yearHigh = yearHigh;
    }

    public Object getHoldingsGainPercent() {
        return holdingsGainPercent;
    }

    public void setHoldingsGainPercent(Object holdingsGainPercent) {
        this.holdingsGainPercent = holdingsGainPercent;
    }

    public Object getAnnualizedGain() {
        return annualizedGain;
    }

    public void setAnnualizedGain(Object annualizedGain) {
        this.annualizedGain = annualizedGain;
    }

    public Object getHoldingsGain() {
        return holdingsGain;
    }

    public void setHoldingsGain(Object holdingsGain) {
        this.holdingsGain = holdingsGain;
    }

    public Object getHoldingsGainPercentRealtime() {
        return holdingsGainPercentRealtime;
    }

    public void setHoldingsGainPercentRealtime(Object holdingsGainPercentRealtime) {
        this.holdingsGainPercentRealtime = holdingsGainPercentRealtime;
    }

    public Object getHoldingsGainRealtime() {
        return holdingsGainRealtime;
    }

    public void setHoldingsGainRealtime(Object holdingsGainRealtime) {
        this.holdingsGainRealtime = holdingsGainRealtime;
    }

    public Object getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(Object moreInfo) {
        this.moreInfo = moreInfo;
    }

    public Object getOrderBookRealtime() {
        return orderBookRealtime;
    }

    public void setOrderBookRealtime(Object orderBookRealtime) {
        this.orderBookRealtime = orderBookRealtime;
    }

    public String getMarketCapitalization() {
        return marketCapitalization;
    }

    public void setMarketCapitalization(String marketCapitalization) {
        this.marketCapitalization = marketCapitalization;
    }

    public Object getMarketCapRealtime() {
        return marketCapRealtime;
    }

    public void setMarketCapRealtime(Object marketCapRealtime) {
        this.marketCapRealtime = marketCapRealtime;
    }

    public String getEBITDA() {
        return eBITDA;
    }

    public void setEBITDA(String eBITDA) {
        this.eBITDA = eBITDA;
    }

    public String getChangeFromYearLow() {
        return changeFromYearLow;
    }

    public void setChangeFromYearLow(String changeFromYearLow) {
        this.changeFromYearLow = changeFromYearLow;
    }

    public String getPercentChangeFromYearLow() {
        return percentChangeFromYearLow;
    }

    public void setPercentChangeFromYearLow(String percentChangeFromYearLow) {
        this.percentChangeFromYearLow = percentChangeFromYearLow;
    }

    public Object getLastTradeRealtimeWithTime() {
        return lastTradeRealtimeWithTime;
    }

    public void setLastTradeRealtimeWithTime(Object lastTradeRealtimeWithTime) {
        this.lastTradeRealtimeWithTime = lastTradeRealtimeWithTime;
    }

    public Object getChangePercentRealtime() {
        return changePercentRealtime;
    }

    public void setChangePercentRealtime(Object changePercentRealtime) {
        this.changePercentRealtime = changePercentRealtime;
    }

    public String getChangeFromYearHigh() {
        return changeFromYearHigh;
    }

    public void setChangeFromYearHigh(String changeFromYearHigh) {
        this.changeFromYearHigh = changeFromYearHigh;
    }

    public String getPercebtChangeFromYearHigh() {
        return percebtChangeFromYearHigh;
    }

    public void setPercebtChangeFromYearHigh(String percebtChangeFromYearHigh) {
        this.percebtChangeFromYearHigh = percebtChangeFromYearHigh;
    }

    public String getLastTradeWithTime() {
        return lastTradeWithTime;
    }

    public void setLastTradeWithTime(String lastTradeWithTime) {
        this.lastTradeWithTime = lastTradeWithTime;
    }

    public String getLastTradePriceOnly() {
        return lastTradePriceOnly;
    }

    public void setLastTradePriceOnly(String lastTradePriceOnly) {
        this.lastTradePriceOnly = lastTradePriceOnly;
    }

    public Object getHighLimit() {
        return highLimit;
    }

    public void setHighLimit(Object highLimit) {
        this.highLimit = highLimit;
    }

    public Object getLowLimit() {
        return lowLimit;
    }

    public void setLowLimit(Object lowLimit) {
        this.lowLimit = lowLimit;
    }

    public String getDaysRange() {
        return daysRange;
    }

    public void setDaysRange(String daysRange) {
        this.daysRange = daysRange;
    }

    public Object getDaysRangeRealtime() {
        return daysRangeRealtime;
    }

    public void setDaysRangeRealtime(Object daysRangeRealtime) {
        this.daysRangeRealtime = daysRangeRealtime;
    }

    public String getFiftydayMovingAverage() {
        return fiftydayMovingAverage;
    }

    public void setFiftydayMovingAverage(String fiftydayMovingAverage) {
        this.fiftydayMovingAverage = fiftydayMovingAverage;
    }

    public String getTwoHundreddayMovingAverage() {
        return twoHundreddayMovingAverage;
    }

    public void setTwoHundreddayMovingAverage(String twoHundreddayMovingAverage) {
        this.twoHundreddayMovingAverage = twoHundreddayMovingAverage;
    }

    public String getChangeFromTwoHundreddayMovingAverage() {
        return changeFromTwoHundreddayMovingAverage;
    }

    public void setChangeFromTwoHundreddayMovingAverage(String changeFromTwoHundreddayMovingAverage) {
        this.changeFromTwoHundreddayMovingAverage = changeFromTwoHundreddayMovingAverage;
    }

    public String getPercentChangeFromTwoHundreddayMovingAverage() {
        return percentChangeFromTwoHundreddayMovingAverage;
    }

    public void setPercentChangeFromTwoHundreddayMovingAverage(String percentChangeFromTwoHundreddayMovingAverage) {
        this.percentChangeFromTwoHundreddayMovingAverage = percentChangeFromTwoHundreddayMovingAverage;
    }

    public String getChangeFromFiftydayMovingAverage() {
        return changeFromFiftydayMovingAverage;
    }

    public void setChangeFromFiftydayMovingAverage(String changeFromFiftydayMovingAverage) {
        this.changeFromFiftydayMovingAverage = changeFromFiftydayMovingAverage;
    }

    public String getPercentChangeFromFiftydayMovingAverage() {
        return percentChangeFromFiftydayMovingAverage;
    }

    public void setPercentChangeFromFiftydayMovingAverage(String percentChangeFromFiftydayMovingAverage) {
        this.percentChangeFromFiftydayMovingAverage = percentChangeFromFiftydayMovingAverage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getNotes() {
        return notes;
    }

    public void setNotes(Object notes) {
        this.notes = notes;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(String previousClose) {
        this.previousClose = previousClose;
    }

    public Object getPricePaid() {
        return pricePaid;
    }

    public void setPricePaid(Object pricePaid) {
        this.pricePaid = pricePaid;
    }

    public String getChangeinPercent() {
        return changeinPercent;
    }

    public void setChangeinPercent(String changeinPercent) {
        this.changeinPercent = changeinPercent;
    }

    public String getPriceSales() {
        return priceSales;
    }

    public void setPriceSales(String priceSales) {
        this.priceSales = priceSales;
    }

    public String getPriceBook() {
        return priceBook;
    }

    public void setPriceBook(String priceBook) {
        this.priceBook = priceBook;
    }

    public String getExDividendDate() {
        return exDividendDate;
    }

    public void setExDividendDate(String exDividendDate) {
        this.exDividendDate = exDividendDate;
    }

    public String getPERatio() {
        return pERatio;
    }

    public void setPERatio(String pERatio) {
        this.pERatio = pERatio;
    }

    public String getDividendPayDate() {
        return dividendPayDate;
    }

    public void setDividendPayDate(String dividendPayDate) {
        this.dividendPayDate = dividendPayDate;
    }

    public Object getPERatioRealtime() {
        return pERatioRealtime;
    }

    public void setPERatioRealtime(Object pERatioRealtime) {
        this.pERatioRealtime = pERatioRealtime;
    }

    public String getPEGRatio() {
        return pEGRatio;
    }

    public void setPEGRatio(String pEGRatio) {
        this.pEGRatio = pEGRatio;
    }

    public String getPriceEPSEstimateCurrentYear() {
        return priceEPSEstimateCurrentYear;
    }

    public void setPriceEPSEstimateCurrentYear(String priceEPSEstimateCurrentYear) {
        this.priceEPSEstimateCurrentYear = priceEPSEstimateCurrentYear;
    }

    public String getPriceEPSEstimateNextYear() {
        return priceEPSEstimateNextYear;
    }

    public void setPriceEPSEstimateNextYear(String priceEPSEstimateNextYear) {
        this.priceEPSEstimateNextYear = priceEPSEstimateNextYear;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Object getSharesOwned() {
        return sharesOwned;
    }

    public void setSharesOwned(Object sharesOwned) {
        this.sharesOwned = sharesOwned;
    }

    public String getShortRatio() {
        return shortRatio;
    }

    public void setShortRatio(String shortRatio) {
        this.shortRatio = shortRatio;
    }

    public String getLastTradeTime() {
        return lastTradeTime;
    }

    public void setLastTradeTime(String lastTradeTime) {
        this.lastTradeTime = lastTradeTime;
    }

    public Object getTickerTrend() {
        return tickerTrend;
    }

    public void setTickerTrend(Object tickerTrend) {
        this.tickerTrend = tickerTrend;
    }

    public String getOneyrTargetPrice() {
        return oneyrTargetPrice;
    }

    public void setOneyrTargetPrice(String oneyrTargetPrice) {
        this.oneyrTargetPrice = oneyrTargetPrice;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public Object getHoldingsValue() {
        return holdingsValue;
    }

    public void setHoldingsValue(Object holdingsValue) {
        this.holdingsValue = holdingsValue;
    }

    public Object getHoldingsValueRealtime() {
        return holdingsValueRealtime;
    }

    public void setHoldingsValueRealtime(Object holdingsValueRealtime) {
        this.holdingsValueRealtime = holdingsValueRealtime;
    }

    public String getYearRange() {
        return yearRange;
    }

    public void setYearRange(String yearRange) {
        this.yearRange = yearRange;
    }

    public Object getDaysValueChange() {
        return daysValueChange;
    }

    public void setDaysValueChange(Object daysValueChange) {
        this.daysValueChange = daysValueChange;
    }

    public Object getDaysValueChangeRealtime() {
        return daysValueChangeRealtime;
    }

    public void setDaysValueChangeRealtime(Object daysValueChangeRealtime) {
        this.daysValueChangeRealtime = daysValueChangeRealtime;
    }

    public String getStockExchange() {
        return stockExchange;
    }

    public void setStockExchange(String stockExchange) {
        this.stockExchange = stockExchange;
    }

    public String getDividendYield() {
        return dividendYield;
    }

    public void setDividendYield(String dividendYield) {
        this.dividendYield = dividendYield;
    }

    public String getPercentChange() {
        return percentChange;
    }

    public void setPercentChange(String percentChange) {
        this.percentChange = percentChange;
    }
}

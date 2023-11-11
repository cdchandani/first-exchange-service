package com.chanchal.futures.bo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

///home/hp/dev/work/FinancialData/future_trades/nse_future_stock_25Jan2023_sample.csv
@Entity
@Table(name = "tbl_futures_trades", schema = "futures")
public class FuturesTradesBO {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private String contractDate;
	private String previousS;
	private String openPrice;
	private String highPrice;
	private String lowPrice;
	private String closePric;
	private String settlement;
	private String netChange;
	private String oiNoCon;
	private String tradedQty;
	private String tradedVolume;
	private String tradedVal;
	private String expiry;
	private String symbol;
	private String extractionDate;

	public String getContractDate() {
		return contractDate;
	}

	public void setContractDate(String contractDate) {
		this.contractDate = contractDate;
	}

	public String getPreviousS() {
		return previousS;
	}

	public void setPreviousS(String previousS) {
		this.previousS = previousS;
	}

	public String getOpenPrice() {
		return openPrice;
	}

	public void setOpenPrice(String openPrice) {
		this.openPrice = openPrice;
	}

	public String getHighPrice() {
		return highPrice;
	}

	public void setHighPrice(String highPrice) {
		this.highPrice = highPrice;
	}

	public String getLowPrice() {
		return lowPrice;
	}

	public void setLowPrice(String lowPrice) {
		this.lowPrice = lowPrice;
	}

	public String getClosePric() {
		return closePric;
	}

	public void setClosePric(String closePric) {
		this.closePric = closePric;
	}

	public String getSettlement() {
		return settlement;
	}

	public void setSettlement(String settlement) {
		this.settlement = settlement;
	}

	public String getNetChange() {
		return netChange;
	}

	public void setNetChange(String netChange) {
		this.netChange = netChange;
	}

	public String getOiNoCon() {
		return oiNoCon;
	}

	public void setOiNoCon(String oiNoCon) {
		this.oiNoCon = oiNoCon;
	}

	public String getTradedQty() {
		return tradedQty;
	}

	public void setTradedQty(String tradedQty) {
		this.tradedQty = tradedQty;
	}

	public String getTradedVolume() {
		return tradedVolume;
	}

	public void setTradedVolume(String tradedVolume) {
		this.tradedVolume = tradedVolume;
	}

	public String getTradedVal() {
		return tradedVal;
	}

	public void setTradedVal(String tradedVal) {
		this.tradedVal = tradedVal;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getExtractionDate() {
		return extractionDate;
	}

	public void setExtractionDate(String extractionDate) {
		this.extractionDate = extractionDate;
	}

}

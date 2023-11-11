package com.chanchal.futures.bo;

import jakarta.persistence.Column;

import java.util.Date;

///home/hp/dev/work/FinancialData/OPTSTK_ACC_CE_01-Jul-2023_TO_29-Sep-2023
//@Entity
//@Table(name = "tbl_trade", schema="futures")
public class RedundantTradeBO {

//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private String symbol;
	private Date date;
	private Date expiry;
//	@Column(name = "option_type")
	private String optionType;
	@Column(name = "strike_price")
	private float strikePrice;
	@Column(name = "open_price")
	private float openPrice;
	@Column(name = "high_price")
	private float highPrice;
	@Column(name = "low_price")
	private float lowPrice;
	@Column(name = "last_traded_price")
	private float lastTradedPrice;
	@Column(name = "settle_price")
	private float settlePrice;
	@Column(name = "no_of_contracts")
	private float noOfmps;
	@Column(name = "turnover_lakhs")
	private float turnoverLakhs;
	@Column(name = "premium_turnover_lakhs")
	private float premiumTurnoverLakhs;
	@Column(name = "open_interest")
	private long openInterest;
	@Column(name = "change_in_open_interest")
	private int changeInOpenInterest;
	@Column(name = "underlying_value")
	private float underlyingValue;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	public String getOptionType() {
		return optionType;
	}

	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}

	public float getStrikePrice() {
		return strikePrice;
	}

	public void setStrikePrice(float strikePrice) {
		this.strikePrice = strikePrice;
	}

	public float getOpenPrice() {
		return openPrice;
	}

	public void setOpenPrice(float openPrice) {
		this.openPrice = openPrice;
	}

	public float getHighPrice() {
		return highPrice;
	}

	public void setHighPrice(float highPrice) {
		this.highPrice = highPrice;
	}

	public float getLowPrice() {
		return lowPrice;
	}

	public void setLowPrice(float lowPrice) {
		this.lowPrice = lowPrice;
	}

	public float getLastTradedPrice() {
		return lastTradedPrice;
	}

	public void setLastTradedPrice(float lastTradedPrice) {
		this.lastTradedPrice = lastTradedPrice;
	}

	public float getSettlePrice() {
		return settlePrice;
	}

	public void setSettlePrice(float settlePrice) {
		this.settlePrice = settlePrice;
	}

	public float getNoOfmps() {
		return noOfmps;
	}

	public void setNoOfmps(float noOfmps) {
		this.noOfmps = noOfmps;
	}

	public float getTurnoverLakhs() {
		return turnoverLakhs;
	}

	public void setTurnoverLakhs(float turnoverLakhs) {
		this.turnoverLakhs = turnoverLakhs;
	}

	public float getPremiumTurnoverLakhs() {
		return premiumTurnoverLakhs;
	}

	public void setPremiumTurnoverLakhs(float premiumTurnoverLakhs) {
		this.premiumTurnoverLakhs = premiumTurnoverLakhs;
	}

	public long getOpenInterest() {
		return openInterest;
	}

	public void setOpenInterest(long openInterest) {
		this.openInterest = openInterest;
	}

	public int getChangeInOpenInterest() {
		return changeInOpenInterest;
	}

	public void setChangeInOpenInterest(int changeInOpenInterest) {
		this.changeInOpenInterest = changeInOpenInterest;
	}

	public float getUnderlyingValue() {
		return underlyingValue;
	}

	public void setUnderlyingValue(float underlyingValue) {
		this.underlyingValue = underlyingValue;
	}

}

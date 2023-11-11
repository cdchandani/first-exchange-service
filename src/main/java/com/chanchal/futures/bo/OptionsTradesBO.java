package com.chanchal.futures.bo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

///home/hp/dev/work/FinancialData/option_trades/option_stock_dump_file.csv
@Entity
@Table(name = "tbl_option_trades", schema = "futures")
@Getter
@Setter
@ToString
public class OptionsTradesBO {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private String oi;
	private String oiChange;
	private String volume;
	private String chgInLtp;
	private String ltp;
	private String strikePrice;
	private String ltp1;
	private String chgInLtp1;
	private String volume1;
	private String oiChange1;
	private String oi1;
	private String symbol;
	private String mcSymbol;
	private String undrlngSt;
	private String expiry;
	private String extractionDt;

	public String getOi() {
		return oi;
	}

	public void setOi(String oi) {
		this.oi = oi;
	}

	public String getOiChange() {
		return oiChange;
	}

	public void setOiChange(String oiChange) {
		this.oiChange = oiChange;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getChgInLtp() {
		return chgInLtp;
	}

	public void setChgInLtp(String chgInLtp) {
		this.chgInLtp = chgInLtp;
	}

	public String getLtp() {
		return ltp;
	}

	public void setLtp(String ltp) {
		this.ltp = ltp;
	}

	public String getStrikePrice() {
		return strikePrice;
	}

	public void setStrikePrice(String strikePrice) {
		this.strikePrice = strikePrice;
	}

	public String getLtp1() {
		return ltp1;
	}

	public void setLtp1(String ltp1) {
		this.ltp1 = ltp1;
	}

	public String getChgInLtp1() {
		return chgInLtp1;
	}

	public void setChgInLtp1(String chgInLtp1) {
		this.chgInLtp1 = chgInLtp1;
	}

	public String getVolume1() {
		return volume1;
	}

	public void setVolume1(String volume1) {
		this.volume1 = volume1;
	}

	public String getOiChange1() {
		return oiChange1;
	}

	public void setOiChange1(String oiChange1) {
		this.oiChange1 = oiChange1;
	}

	public String getOi1() {
		return oi1;
	}

	public void setOi1(String oi1) {
		this.oi1 = oi1;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getMcSymbol() {
		return mcSymbol;
	}

	public void setMcSymbol(String mcSymbol) {
		this.mcSymbol = mcSymbol;
	}

	public String getUndrlngSt() {
		return undrlngSt;
	}

	public void setUndrlngSt(String undrlngSt) {
		this.undrlngSt = undrlngSt;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public String getExtractionDt() {
		return extractionDt;
	}

	public void setExtractionDt(String extractionDt) {
		this.extractionDt = extractionDt;
	}

}

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
@Table(name = "tbl_raw_option_trades", schema = "futures")
@Getter
@Setter
@ToString
public class OptionsTradesBO {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private Long orderId;
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

}

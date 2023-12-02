package com.chanchal.futures.bo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

///home/hp/dev/work/FinancialData/future_trades/nse_future_stock_25Jan2023_sample.csv
@Entity
@Table(name = "tbl_raw_futures_trades", schema = "futures")
@Getter
@Setter
@ToString
public class FuturesTradesBO {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private Long orderId;
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
}

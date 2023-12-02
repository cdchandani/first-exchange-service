package com.chanchal.futures.processor.helper;

import com.chanchal.futures.bo.FuturesTradesBO;
import com.chanchal.futures.bo.OptionsTradesBO;
import com.chanchal.futures.bo.OrderBO;
import com.chanchal.futures.to.FuturesTradesTO;
import com.chanchal.futures.to.OptionsTradesTO;
import com.chanchal.futures.to.OrderTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-02T10:35:57+0530",
    comments = "version: 1.6.0.Beta1, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.4.jar, environment: Java 17.0.8.1 (Private Build)"
)
@Component
public class SimpleMapperImpl implements SimpleMapper {

    @Override
    public OrderBO OrderTOToOrderBO(OrderTO source) {
        if ( source == null ) {
            return null;
        }

        OrderBO orderBO = new OrderBO();

        orderBO.setPrc( source.getPrc() );
        orderBO.setRequestId( source.getRequestId() );
        orderBO.setCancelQty( source.getCancelQty() );
        orderBO.setDiscQtyPerc( source.getDiscQtyPerc() );
        orderBO.setCustomText( source.getCustomText() );
        orderBO.setMktpro( source.getMktpro() );
        orderBO.setDefMktProval( source.getDefMktProval() );
        orderBO.setOptionType( source.getOptionType() );
        orderBO.setUsecs( source.getUsecs() );
        orderBO.setMpro( source.getMpro() );
        orderBO.setQty( source.getQty() );
        orderBO.setOrderGenerationType( source.getOrderGenerationType() );
        orderBO.setUnFilledSize( source.getUnFilledSize() );
        orderBO.setOrderAuthStatus( source.getOrderAuthStatus() );
        orderBO.setUserComments( source.getUserComments() );
        orderBO.setTickSize( source.getTickSize() );
        orderBO.setPrcType( source.getPrcType() );
        orderBO.setStatus( source.getStatus() );
        orderBO.setMinQty( source.getMinQty() );
        orderBO.setOrderCriteria( source.getOrderCriteria() );
        orderBO.setSym( source.getSym() );
        orderBO.setMultiplier( source.getMultiplier() );
        orderBO.setExseg( source.getExseg() );
        orderBO.setExchOrdID( source.getExchOrdID() );
        orderBO.setExchConfrmtime( source.getExchConfrmtime() );
        orderBO.setSyomOrderId( source.getSyomOrderId() );
        orderBO.setPCode( source.getPCode() );
        orderBO.setDscQty( source.getDscQty() );
        orderBO.setExchange( source.getExchange() );
        orderBO.setOrdValdate( source.getOrdValdate() );
        orderBO.setAccountId( source.getAccountId() );
        orderBO.setExchangeUserInfo( source.getExchangeUserInfo() );
        orderBO.setAvgPrc( source.getAvgPrc() );
        orderBO.setTrgPrc( source.getTrgPrc() );
        orderBO.setTranType( source.getTranType() );
        orderBO.setBQty( source.getBQty() );
        orderBO.setFillShares( source.getFillShares() );
        orderBO.setTrsym( source.getTrsym() );
        orderBO.setAlgoCategory( source.getAlgoCategory() );
        orderBO.setStrikePrice( source.getStrikePrice() );
        orderBO.setSipIndicator( source.getSipIndicator() );
        orderBO.setAlgoID( source.getAlgoID() );
        orderBO.setReportType( source.getReportType() );
        orderBO.setNoMktPro( source.getNoMktPro() );
        orderBO.setBrokerClient( source.getBrokerClient() );
        orderBO.setOrderUserMessage( source.getOrderUserMessage() );
        orderBO.setDecprec( source.getDecprec() );
        orderBO.setExpDate( source.getExpDate() );
        orderBO.setCOPercentage( source.getCOPercentage() );
        orderBO.setMarketProtectionPercentage( source.getMarketProtectionPercentage() );
        orderBO.setExpSsbDate( source.getExpSsbDate() );
        orderBO.setNstOrdNo( source.getNstOrdNo() );
        orderBO.setOrderedTime( source.getOrderedTime() );
        orderBO.setModifiedBy( source.getModifiedBy() );
        orderBO.setRejReason( source.getRejReason() );
        orderBO.setScripName( source.getScripName() );
        orderBO.setStat( source.getStat() );
        orderBO.setOrderenTryTime( source.getOrderenTryTime() );
        orderBO.setPriceDenomenator( source.getPriceDenomenator() );
        orderBO.setPanNo( source.getPanNo() );
        orderBO.setRefLmtPrice( source.getRefLmtPrice() );
        orderBO.setPriceNumerator( source.getPriceNumerator() );
        orderBO.setOrderSource( source.getOrderSource() );
        orderBO.setToken( source.getToken() );
        orderBO.setGeneralDenomenator( source.getGeneralDenomenator() );
        orderBO.setValidity( source.getValidity() );
        orderBO.setSeries( source.getSeries() );
        orderBO.setInstName( source.getInstName() );
        orderBO.setGeneralNumerator( source.getGeneralNumerator() );
        orderBO.setUsers( source.getUsers() );
        orderBO.setRemarks( source.getRemarks() );
        orderBO.setISinceBOE( source.getISinceBOE() );

        return orderBO;
    }

    @Override
    public FuturesTradesBO FuturesTradesTOToFuturesTradesBO(FuturesTradesTO source) {
        if ( source == null ) {
            return null;
        }

        FuturesTradesBO futuresTradesBO = new FuturesTradesBO();

        futuresTradesBO.setContractDate( source.getContractDate() );
        futuresTradesBO.setPreviousS( source.getPreviousS() );
        futuresTradesBO.setOpenPrice( source.getOpenPrice() );
        futuresTradesBO.setHighPrice( source.getHighPrice() );
        futuresTradesBO.setLowPrice( source.getLowPrice() );
        futuresTradesBO.setClosePric( source.getClosePric() );
        futuresTradesBO.setSettlement( source.getSettlement() );
        futuresTradesBO.setNetChange( source.getNetChange() );
        futuresTradesBO.setOiNoCon( source.getOiNoCon() );
        futuresTradesBO.setTradedQty( source.getTradedQty() );
        futuresTradesBO.setTradedVolume( source.getTradedVolume() );
        futuresTradesBO.setTradedVal( source.getTradedVal() );
        futuresTradesBO.setExpiry( source.getExpiry() );
        futuresTradesBO.setSymbol( source.getSymbol() );
        futuresTradesBO.setExtractionDate( source.getExtractionDate() );

        return futuresTradesBO;
    }

    @Override
    public OptionsTradesBO OptionsTradesTOToOptionsTradesBO(OptionsTradesTO source) {
        if ( source == null ) {
            return null;
        }

        OptionsTradesBO optionsTradesBO = new OptionsTradesBO();

        optionsTradesBO.setOi( source.getOi() );
        optionsTradesBO.setOiChange( source.getOiChange() );
        optionsTradesBO.setVolume( source.getVolume() );
        optionsTradesBO.setChgInLtp( source.getChgInLtp() );
        optionsTradesBO.setLtp( source.getLtp() );
        optionsTradesBO.setStrikePrice( source.getStrikePrice() );
        optionsTradesBO.setLtp1( source.getLtp1() );
        optionsTradesBO.setChgInLtp1( source.getChgInLtp1() );
        optionsTradesBO.setVolume1( source.getVolume1() );
        optionsTradesBO.setOiChange1( source.getOiChange1() );
        optionsTradesBO.setOi1( source.getOi1() );
        optionsTradesBO.setSymbol( source.getSymbol() );
        optionsTradesBO.setMcSymbol( source.getMcSymbol() );
        optionsTradesBO.setUndrlngSt( source.getUndrlngSt() );
        optionsTradesBO.setExpiry( source.getExpiry() );
        optionsTradesBO.setExtractionDt( source.getExtractionDt() );

        return optionsTradesBO;
    }
}

package com.chanchal.futures.processor.helper;

import com.chanchal.futures.bo.FuturesTradesBO;
import com.chanchal.futures.bo.OptionsTradesBO;
import com.chanchal.futures.bo.OrderBO;
import com.chanchal.futures.to.FuturesTradesTO;
import com.chanchal.futures.to.OptionsTradesTO;
import com.chanchal.futures.to.OrderTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface SimpleMapper {

    SimpleMapper INSTANCE = Mappers.getMapper(SimpleMapper.class);

    OrderBO OrderTOToOrderBO(OrderTO source);

    FuturesTradesBO FuturesTradesTOToFuturesTradesBO(FuturesTradesTO source);

    OptionsTradesBO OptionsTradesTOToOptionsTradesBO(OptionsTradesTO source);
}

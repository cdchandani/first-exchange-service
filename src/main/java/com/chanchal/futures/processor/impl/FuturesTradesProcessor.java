package com.chanchal.futures.processor.impl;

import com.chanchal.futures.bo.FuturesTradesBO;
import com.chanchal.futures.to.FuturesTradesTO;
import com.chanchal.futures.processor.IMessageProcessor;
import com.chanchal.futures.processor.helper.SimpleMapper;
import org.springframework.stereotype.Component;

@Component
public class FuturesTradesProcessor implements IMessageProcessor<FuturesTradesBO, FuturesTradesTO> {

    @Override
    public FuturesTradesBO processMessage(FuturesTradesTO source) {
        SimpleMapper mapper = SimpleMapper.INSTANCE;
        return mapper.FuturesTradesTOToFuturesTradesBO(source);
    }
}

package com.chanchal.futures.processor.impl;

import com.chanchal.futures.bo.OptionsTradesBO;
import com.chanchal.futures.to.OptionsTradesTO;
import com.chanchal.futures.processor.IMessageProcessor;
import com.chanchal.futures.processor.helper.SimpleMapper;
import org.springframework.stereotype.Component;

@Component
public class OptionsTradesProcessor implements IMessageProcessor<OptionsTradesBO, OptionsTradesTO> {
    @Override
    public OptionsTradesBO processMessage(OptionsTradesTO source) {
        SimpleMapper mapper = SimpleMapper.INSTANCE;
        return mapper.OptionsTradesTOToOptionsTradesBO(source);
    }
}

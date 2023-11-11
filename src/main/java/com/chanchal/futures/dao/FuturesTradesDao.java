package com.chanchal.futures.dao;

import com.chanchal.futures.bo.FuturesTradesBO;
import com.chanchal.futures.repository.FuturesTradesRepository;
import com.chanchal.futures.to.FuturesTradesTO;
import com.chanchal.futures.processor.impl.FuturesTradesProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FuturesTradesDao {
    private final Logger logger = LoggerFactory.getLogger(FuturesTradesDao.class);

    @Autowired
    private FuturesTradesProcessor transformer;
    @Autowired
    private FuturesTradesRepository repository;

    public FuturesTradesBO persistData(FuturesTradesTO futuresTradesTO) {
        FuturesTradesBO futuresTradesBO = transformer.processMessage(futuresTradesTO);
        FuturesTradesBO savedOptionsTrade = repository.save(futuresTradesBO);
        logger.info("savedOptionsTrade::{}", savedOptionsTrade);
        return savedOptionsTrade;
    }

}

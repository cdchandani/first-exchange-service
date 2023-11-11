package com.chanchal.futures.dao;

import com.chanchal.futures.bo.OptionsTradesBO;
import com.chanchal.futures.repository.OptionsTradesRepository;
import com.chanchal.futures.to.OptionsTradesTO;
import com.chanchal.futures.processor.impl.OptionsTradesProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OptionsTradesDao {
    private final Logger logger = LoggerFactory.getLogger(OptionsTradesDao.class);

    @Autowired
    private OptionsTradesProcessor transformer;
    @Autowired
    private OptionsTradesRepository repository;

    public OptionsTradesBO persistData(OptionsTradesTO optionsTradesTO) {
        OptionsTradesBO optionsTradesBO = transformer.processMessage(optionsTradesTO);
        OptionsTradesBO savedOptionsTrade = repository.save(optionsTradesBO);
        logger.info("savedOptionsTrade::{}", savedOptionsTrade);
        return savedOptionsTrade;
    }

}

package com.chanchal.futures.kafka.consumer;

import com.chanchal.futures.bo.ApplicationErrorBO;
import com.chanchal.futures.bo.FuturesTradesBO;
import com.chanchal.futures.bo.OptionsTradesBO;
import com.chanchal.futures.bo.OrderBO;
import com.chanchal.futures.dao.FuturesTradesDao;
import com.chanchal.futures.dao.OptionsTradesDao;
import com.chanchal.futures.dao.OrderDao;
import com.chanchal.futures.kafka.producer.KafkaProducerService;
import com.chanchal.futures.mappers.FuturesTradesMapper;
import com.chanchal.futures.mappers.OptionsTradesMapper;
import com.chanchal.futures.mappers.OrderMapper;
import com.chanchal.futures.repository.ApplicationErrorRepository;
import com.chanchal.futures.to.FuturesTradesTO;
import com.chanchal.futures.to.OptionsTradesTO;
import com.chanchal.futures.to.OrderTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class KafkaConsumerService {
    private final Logger logger = LoggerFactory.getLogger(KafkaConsumerService.class);
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private FuturesTradesMapper futuresTradesMapper;
    @Autowired
    private OptionsTradesMapper optionsTradesMapper;

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private FuturesTradesDao futuresTradesDao;
    @Autowired
    private OptionsTradesDao optionsTradesDao;
    @Autowired
    private KafkaProducerService producer;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private ApplicationErrorRepository errorRepository;

    @KafkaListener(topics = "first-exchange-topic-queue", groupId = "group-1")
    public void receiveMessageFromFirstExchange(String message, @Header(KafkaHeaders.OFFSET) Long offset, @Header(KafkaHeaders.RECEIVED_KEY) String key) throws JsonProcessingException {
        logger.info("received message with offset:{} and key: {}. Message:: {}", offset, key, message);
        try {
            switch (key) {
                case "order":
                    OrderTO orderTO = orderMapper.map(message);
                    OrderBO orderBO = orderDao.persistData(orderTO);
                    logger.info("persisted order message");
                    producer.sendMessageToExchange(objectMapper.writeValueAsString(orderBO), "order-topic", "order");
                    break;
                case "future_trades":
                    FuturesTradesTO futuresTradesTO = futuresTradesMapper.map(message);
                    FuturesTradesBO futuresTradesBO = futuresTradesDao.persistData(futuresTradesTO);
                    logger.info("persisted futures trade message");
                    producer.sendMessageToExchange(objectMapper.writeValueAsString(futuresTradesBO), "future-trades-topic", "future_trades");
                    break;
                case "option_trades":
                    OptionsTradesTO optionsTradesTO = optionsTradesMapper.map(message);
                    OptionsTradesBO optionsTradesBO = optionsTradesDao.persistData(optionsTradesTO);
                    logger.info("persisted options trade message");
                    producer.sendMessageToExchange(objectMapper.writeValueAsString(optionsTradesBO), "option-trades-topic", "option_trades");
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            logger.error("Exception occurred while consuming message from first exchange. Key:{}, message:{}", key, message);
            ApplicationErrorBO applicationErrorBO = ApplicationErrorBO.builder().messageType(key).source("First-Exchange").message(message).error(Arrays.toString(e.getStackTrace())).errorMessage(e.getMessage()).build();
            errorRepository.save(applicationErrorBO);
        }
    }
//
//	@KafkaListener(topics = "second-exchange-topic-queue", groupId = "group-1")
//	public void receiveMessageFromSecond(String message,@Header(KafkaHeaders.OFFSET) Long offset) {
//		System.out.println("received message with offset:" + offset + "message: " + message);
//	}
//	
//	@KafkaListener(topics = "third-exchange-topic-queue", groupId = "group-1")
//	public void receiveMessageFromThirdExchange(String message,@Header(KafkaHeaders.OFFSET) Long offset) {
//		System.out.println("received message with offset:" + offset + "message: " + message);
//	}
//	
//	@KafkaListener(topics = "fourth-exchange-topic-queue", groupId = "group-1")
//	public void receiveMessageFromFourthExchange(String message,@Header(KafkaHeaders.OFFSET) Long offset) {
//		System.out.println("received message with offset:" + offset + "message: " + message);
//	}
}

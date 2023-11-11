package com.chanchal.futures.processor.impl;

import com.chanchal.futures.bo.OrderBO;
import com.chanchal.futures.to.OrderTO;
import com.chanchal.futures.processor.IMessageProcessor;
import com.chanchal.futures.processor.helper.SimpleMapper;
import org.springframework.stereotype.Component;

@Component
public class OrderProcessor implements IMessageProcessor<OrderBO, OrderTO> {

    @Override
    public OrderBO processMessage(OrderTO orderTO) {
//        ObjectMapper helper = new ObjectMapper();
//        OrderBO orderBO = new OrderBO();
//        BeanUtils.copyProperties(orderTO, orderBO);
//        return helper.convertValue(orderTO, OrderBO.class);
        SimpleMapper test = SimpleMapper.INSTANCE;
        return test.OrderTOToOrderBO(orderTO);
    }
}






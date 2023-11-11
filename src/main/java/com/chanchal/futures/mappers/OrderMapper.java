package com.chanchal.futures.mappers;

import com.chanchal.futures.to.OrderTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper implements IMapper<OrderTO> {

    private final Logger logger = LoggerFactory.getLogger(OrderMapper.class);

    public OrderTO map(String inputMessage) {
        String message = "";
        if (inputMessage.trim().indexOf(",") == 0) {
            message = inputMessage.substring(1);
        } else {
            message = inputMessage;
        }
        String[] split = message.split(",");
        OrderTO orderTO = OrderTO.builder().build();
        try {
            OrderTO.OrderTOBuilder orderTOBuilder = OrderTO.builder()
                    .prc(split[0])
                    .requestId(split[1])
                    .cancelQty(split[2])
                    .discQtyPerc(split[3])
                    .customText(split[4])
                    .mktpro(split[5])
                    .defMktProval(split[6])
                    .optionType(split[7])
                    .usecs(split[8])
                    .mpro(split[9])
                    .qty(split[10])
                    .orderGenerationType(split[11])
                    .unFilledSize(split[12])
                    .orderAuthStatus(split[13])
                    .userComments(split[14])
                    .tickSize(split[15])
                    .prcType(split[16])
                    .status(split[17])
                    .minQty(split[18])
                    .orderCriteria(split[19])
                    .exseg(split[20])
                    .sym(split[21])
                    .multiplier((split[22]))
                    .exchOrdID(split[23])
                    .exchConfrmtime(split[24])
                    .pCode(split[25])
                    .syomOrderId(split[26])
                    .dscQty(split[27])
                    .exchange(split[28])
                    .ordValdate(split[29])
                    .accountId(split[30])
                    .exchangeUserInfo(split[31])
                    .avgPrc(split[32])
                    .trgPrc(split[33])
                    .tranType(split[34])
                    .bQty(split[35])
                    .trsym(split[36])
                    .fillShares(split[37])
                    .algoCategory(split[38])
                    .sipIndicator(split[39])
                    .strikePrice(split[40])
                    .reportType(split[41])
                    .algoID(split[42])
                    .noMktPro(split[43])
                    .brokerClient(split[44])
                    .orderUserMessage(split[45])
                    .decprec(split[46])
                    .expDate(split[47])
                    .cOPercentage(split[48])
                    .marketProtectionPercentage(split[49]);

            if (split.length > 50) {
                orderTOBuilder.nstOrdNo(split[50])
                        .expSsbDate(split[51])
                        .orderedTime(split[52])
                        .rejReason(split[53])
                        .modifiedBy(split[54])
                        .scripName(split[55])
                        .stat(split[56])
                        .orderenTryTime(split[57])
                        .priceDenomenator(split[58])
                        .panNo(split[59])
                        .refLmtPrice(split[60])
                        .priceNumerator(split[61])
                        .token(split[62])
                        .orderSource(split[63])
                        .validity(split[64])
                        .generalDenomenator(split[65])
                        .series(split[66])
                        .instName(split[67])
                        .generalNumerator(split[68])
                        .users(split[69])
                        .remarks(split[70])
                        .iSinceBOE(split[71]);
            }

            orderTO = orderTOBuilder.build();
        } catch (Exception e) {
            logger.error("Error occurred", e);
        }
        return orderTO;

    }
}


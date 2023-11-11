package com.chanchal.futures.mappers;

import com.chanchal.futures.to.FuturesTradesTO;
import org.springframework.stereotype.Component;

@Component
public class FuturesTradesMapper implements IMapper<FuturesTradesTO> {

    public FuturesTradesTO map(String message) {
        String[] split = message.split(",");
        FuturesTradesTO futuresTradesTO = FuturesTradesTO.builder()
                .contractDate(split[0])
                .previousS(split[1])
                .openPrice(split[2])
                .highPrice(split[3])
                .lowPrice(split[4])
                .closePric(split[5])
                .settlement(split[6])
                .netChange(split[7])
                .oiNoCon(split[8])
                .tradedQty(split[9])
                .tradedVolume(split[10])
                .tradedVal(split[11])
                .expiry(split[12])
                .symbol(split[13])
                .extractionDate(split[14])
                .build();

        return futuresTradesTO;

    }
}


package com.chanchal.futures.mappers;

import com.chanchal.futures.to.OptionsTradesTO;
import org.springframework.stereotype.Component;

@Component
public class OptionsTradesMapper implements IMapper<OptionsTradesTO> {

    public OptionsTradesTO map(String message) {
        String[] split = message.split(",");
        OptionsTradesTO futuresTradesTO = OptionsTradesTO.builder()
                .oi(split[0])
                .oiChange(split[1])
                .volume(split[2])
                .chgInLtp(split[3])
                .ltp(split[4])
                .strikePrice(split[5])
                .ltp1(split[6])
                .chgInLtp1(split[7])
                .volume1(split[8])
                .oiChange1(split[9])
                .oi1(split[10])
                .symbol(split[11])
                .mcSymbol(split[12])
                .undrlngSt(split[13])
                .expiry(split[14])
                .extractionDt(split[15])
                .build();

        return futuresTradesTO;

    }
}


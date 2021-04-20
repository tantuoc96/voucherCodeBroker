package com.abc.voucherbroker.client.reception;

import lombok.Data;

@Data
public class ThirdPartyReception {

    private String voucherCode;
    private String creationTime;
    private long expiredSecond;
}

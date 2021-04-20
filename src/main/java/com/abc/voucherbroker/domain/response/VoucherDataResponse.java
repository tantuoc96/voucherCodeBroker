package com.abc.voucherbroker.domain.response;

import lombok.Data;

@Data
public class VoucherDataResponse implements DataResponse {
    private String voucherCode;
    private String creationTime;
    private Long expirationTime;

    public VoucherDataResponse of(String voucherCode, String creationTime, String expirationTime){
        this.voucherCode = voucherCode;
        this.creationTime = creationTime;
        this.expirationTime = Long.valueOf(expirationTime);
        return this;
    }
}

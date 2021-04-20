package com.abc.voucherbroker.domain.model;

import lombok.Data;

@Data
public class VoucherBrokerModel {

    private String phoneNumber;
    private String voucherPrice;

    public VoucherBrokerModel of(String phoneNumber, String voucherPrice){
        this.phoneNumber = phoneNumber;
        this.voucherPrice = voucherPrice;
        return this;
    }
}

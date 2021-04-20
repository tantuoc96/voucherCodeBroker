package com.abc.voucherbroker.domain.response;


import lombok.Data;

@Data
public class VoucherBrokerResponse {

    private String code;
    private String message;
    private DataResponse data;
}

package com.abc.voucherbroker.domain.response;

import lombok.Data;

@Data
public class InvalidRequestResponse implements DataResponse {
    private int code;
    private String field;
    private String message;

    public InvalidRequestResponse of(int code, String field, String message) {
        this.code = code;
        this.field = field;
        this.message = message;
        return this;
    }
}

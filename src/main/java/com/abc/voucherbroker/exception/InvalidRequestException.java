package com.abc.voucherbroker.exception;

import lombok.Data;

@Data
public class InvalidRequestException extends RuntimeException {

    private int code;
    private String field;
    private String message;

    public InvalidRequestException(int code, String field, String message) {
        this.code = code;
        this.field = field;
        this.message = message;
    }
}

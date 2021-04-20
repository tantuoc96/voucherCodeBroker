package com.abc.voucherbroker.controller.advice;

import com.abc.voucherbroker.domain.response.InvalidRequestResponse;
import com.abc.voucherbroker.domain.response.VoucherBrokerResponse;
import com.abc.voucherbroker.exception.InvalidRequestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class VoucherBrokerAdviceController {

    @ExceptionHandler(InvalidRequestException.class)
    public ResponseEntity<VoucherBrokerResponse> invalidRequestExceptionHandler(InvalidRequestException invalidRequestException) {
       log.error("Invalid request was throw.", invalidRequestException);
        VoucherBrokerResponse voucherResponse = new VoucherBrokerResponse();
        voucherResponse.setCode("INVALID_REQUEST");
        voucherResponse.setMessage("Request invalid.");
        voucherResponse.setData(new InvalidRequestResponse().of(invalidRequestException.getCode(), invalidRequestException.getField(), invalidRequestException.getMessage()));
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(voucherResponse);
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<VoucherBrokerResponse> invalidRequestExceptionHandler(Throwable throwable) {
        log.error("Throwable exception was throw.", throwable);
        VoucherBrokerResponse voucherResponse = new VoucherBrokerResponse();
        voucherResponse.setCode("SERVER_ERROR");
        voucherResponse.setMessage("Server error. Please contact administrator");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(voucherResponse);
    }
}

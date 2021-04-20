package com.abc.voucherbroker.domain.service.implement;

import static com.abc.voucherbroker.constant.VoucherConstant.Regex.PRICE_REGEX;
import static com.abc.voucherbroker.constant.VoucherConstant.Regex.PHONE_GLOBAL_REGEX_STRING;

import com.abc.voucherbroker.domain.model.VoucherBrokerModel;
import com.abc.voucherbroker.domain.service.VoucherBrokerService;
import com.abc.voucherbroker.exception.InvalidRequestException;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class VoucherBrokerServiceImpl implements VoucherBrokerService {

    @Override
    public void validateVoucherRequest(String phoneNumber, String voucherPrice) {

        if (!Pattern.compile(PHONE_GLOBAL_REGEX_STRING).matcher(phoneNumber).matches())
            throw new InvalidRequestException(1, "phoneNumber", "phoneNumber invalid.");
        if (!Pattern.compile(PRICE_REGEX).matcher(phoneNumber).matches())
            throw new InvalidRequestException(2, "voucherPrice", "phoneNumber invalid.");
    }

    @Override
    public VoucherBrokerModel convertToVoucherBrokerModel(String phoneNumber, String voucherPrice) {
        return new VoucherBrokerModel().of(phoneNumber, voucherPrice);
    }

    @Override
    public VoucherBrokerModel voucherCreation(String phoneNumber, String voucherPrice) {
        return null;
    }
}

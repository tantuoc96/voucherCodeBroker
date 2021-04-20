package com.abc.voucherbroker.domain.service;

import com.abc.voucherbroker.domain.model.VoucherBrokerModel;

public interface VoucherBrokerService {

    void validateVoucherRequest(String phoneNumber, String voucherPrice);

    VoucherBrokerModel convertToVoucherBrokerModel(String phoneNumber, String voucherPrice);
    VoucherBrokerModel voucherCreation(String phoneNumber, String voucherPrice);


}

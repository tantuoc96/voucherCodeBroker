package com.abc.voucherbroker.controller;

import com.abc.voucherbroker.domain.model.VoucherBrokerModel;
import com.abc.voucherbroker.domain.response.VoucherDataResponse;
import com.abc.voucherbroker.domain.response.VoucherBrokerResponse;
import com.abc.voucherbroker.domain.service.VoucherBrokerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class VoucherBrokerController {

    private final VoucherBrokerService voucherService;

    public ResponseEntity<VoucherBrokerResponse> registerVoucher(@RequestParam("phoneNumber") String phoneNumber,
                                                                 @RequestParam("voucherPrice")String voucherPrice){

        voucherService.validateVoucherRequest(phoneNumber,voucherPrice);

        VoucherBrokerModel voucherBrokerModel = voucherService.convertToVoucherBrokerModel(phoneNumber,voucherPrice);

        VoucherBrokerResponse voucherResponse = new VoucherBrokerResponse();
        voucherResponse.setCode("SUCCESSFUL");
        voucherResponse.setMessage("Request success.");
        voucherResponse.setData(new VoucherDataResponse().of("","",""));
        return  ResponseEntity.ok(null);
    }
}

package com.abc.voucherbroker.client;

import com.abc.voucherbroker.client.config.ThirdPartyConfig;
import com.abc.voucherbroker.client.reception.ThirdPartyReception;
import com.abc.voucherbroker.client.transmission.ThirdPartyAuthorizationTransmission;
import com.abc.voucherbroker.client.transmission.ThirdPartyRegistryVoucherTransmission;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(contextId = "3rd-client", url = "https://localhost:1000", configuration = ThirdPartyConfig.class)
public interface ThirdPartyClient {

    ResponseEntity<ThirdPartyReception> requestToken(@RequestBody ThirdPartyAuthorizationTransmission authorizationTransmission);
    ResponseEntity<ThirdPartyReception> registerVoucher(@RequestBody ThirdPartyRegistryVoucherTransmission registryVoucherTransmission);
}

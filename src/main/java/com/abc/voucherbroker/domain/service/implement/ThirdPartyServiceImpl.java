package com.abc.voucherbroker.domain.service.implement;

import com.abc.voucherbroker.client.ThirdPartyClient;
import com.abc.voucherbroker.client.reception.ThirdPartyReception;
import com.abc.voucherbroker.client.transmission.ThirdPartyRegistryVoucherTransmission;
import com.abc.voucherbroker.domain.service.ThirdPartyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ThirdPartyServiceImpl implements ThirdPartyService {

    private final ThirdPartyClient thirdPartyClient;

    @Override
    public ThirdPartyReception voucherRegistration(ThirdPartyRegistryVoucherTransmission transmission) {
        return null;
    }
}

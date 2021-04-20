package com.abc.voucherbroker.domain.service;

import com.abc.voucherbroker.client.reception.ThirdPartyReception;
import com.abc.voucherbroker.client.transmission.ThirdPartyRegistryVoucherTransmission;

public interface ThirdPartyService {

    ThirdPartyReception voucherRegistration(ThirdPartyRegistryVoucherTransmission transmission);
}

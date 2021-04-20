package com.abc.voucherbroker.domain.model.other;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ThirdPartyAuthorizationTemporaryModel {

    private String token;
    private String creationTime;
    private long expiredTime;
}

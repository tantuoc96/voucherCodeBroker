package com.abc.voucherbroker.client.config;

import com.abc.voucherbroker.domain.model.other.ThirdPartyAuthorizationTemporaryModel;
import feign.RequestInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class ThirdPartyConfig {

    private final ThirdPartyAuthorizationTemporaryModel authorizationTemporaryModel;

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            requestTemplate.header("Bearer ", authorizationTemporaryModel.getToken());
        };
    }
}

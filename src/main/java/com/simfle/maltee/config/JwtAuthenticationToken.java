package com.simfle.maltee.config;

import lombok.Builder;


@Builder
public class JwtAuthenticationToken implements AuthenticationToken {

    private String token;

    @Override
    public String getToken() {
        return token;
    }
}

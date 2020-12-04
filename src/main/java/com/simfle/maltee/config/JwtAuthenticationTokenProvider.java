package com.simfle.maltee.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class JwtAuthenticationTokenProvider implements AuthenticationTokenProvider {

    private static final Logger logger = LoggerFactory.getLogger(JwtAuthenticationToken.class);

    private static final String SECRET_KEY = "SOME_SECRET_KEY";
    private static final long EXPIRATION_MS = 1000 * 60 * 60 * 24;

    @Override
    public String parseTokenString(HttpServletRequest request) {
        return null;
    }

    @Override
    public AuthenticationToken issue(Long userNo) {
        return null;
    }

    @Override
    public Long getTokenOwnerNo(String token) {
        return null;
    }

    @Override
    public boolean validateToken(String token) {
        return false;
    }
}

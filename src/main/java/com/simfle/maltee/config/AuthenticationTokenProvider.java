package com.simfle.maltee.config;

import javax.servlet.http.HttpServletRequest;

public interface AuthenticationTokenProvider {

    /**
     * HTTP 요청에서 토큰 취득
     * @param request
     * @return
     */
    String parseTokenString(HttpServletRequest request);

    /**
     *
     * @param userNo
     * @return
     */
    AuthenticationToken issue(Long userNo);

    /**
     * 토큰에서 userNO 취득
     * @param token
     * @return
     */
    Long getTokenOwnerNo(String token);

    /**
     * 토큰 유효성 검사
     * @param token
     * @return
     */
    boolean validateToken(String token);


}

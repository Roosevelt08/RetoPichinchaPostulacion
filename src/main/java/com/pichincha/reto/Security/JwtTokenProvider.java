package com.pichincha.reto.Security;

import jakarta.servlet.http.HttpServletRequest;

public enum JwtTokenProvider {
    ;

    public String getUsername(String token) {
        return null;
    }

    public boolean validateToken(String token) {
        return false;
    }

    public String resolveToken(HttpServletRequest request) {
        return null;
    }

}

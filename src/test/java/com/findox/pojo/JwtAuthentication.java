package com.findox.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JwtAuthentication {
    @JsonProperty("access_token")
    private String accessToken;

    public String getAccessToken() {
        return this.accessToken;
    }


}

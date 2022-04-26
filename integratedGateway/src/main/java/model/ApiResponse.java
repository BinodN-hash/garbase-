package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApiResponse {

    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("payload")
    @Expose
    private Payload payload;

    @SerializedName("access_token")
    private String accessToken;

    @SerializedName("refresh_token")
    private String refreshToken;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}

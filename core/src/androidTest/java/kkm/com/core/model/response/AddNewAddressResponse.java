package kkm.com.core.model.response;

import com.google.gson.annotations.SerializedName;

public class AddNewAddressResponse {

    @SerializedName("response")
    private String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return
                "AddNewAddressResponse{" +
                        "response = '" + response + '\'' +
                        "}";
    }
}
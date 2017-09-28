package com.example.surajvishwakarma.okhttp_android;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AppIDPost {

    @SerializedName("applicationId")
    @Expose
    private String applicationId;

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }
}
package com.example.surajvishwakarma.okhttp_android;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostData {

    @SerializedName("wlpID")
    @Expose
    private String wlpID;
    @SerializedName("languageID")
    @Expose
    private String languageID;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("emailAddress1")
    @Expose
    private String emailAddress1;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("password")
    @Expose
    private String password;

    public String getWlpID() {
        return wlpID;
    }

    public void setWlpID(String wlpID) {
        this.wlpID = wlpID;
    }

    public String getLanguageID() {
        return languageID;
    }

    public void setLanguageID(String languageID) {
        this.languageID = languageID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress1() {
        return emailAddress1;
    }

    public void setEmailAddress1(String emailAddress1) {
        this.emailAddress1 = emailAddress1;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
package com.example.surajvishwakarma.okhttp_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainScreen extends AppCompatActivity {


    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        /*new Thread(new Runnable() {
            @Override
            public void run() {
                getMethod("http://api.drivewealth.io/v1/countries");
            }
        }).start();*/
        new Thread(new Runnable() {
            @Override
            public void run() {
                postMethod("http://api.drivewealth.io/v1/signups/live");
            }
        }).start();
    }

    public MediaType getJsonMedia() {
        return MediaType.parse("application/json; charset=utf-8");
    }

    public OkHttpClient getClient() {
        return new OkHttpClient();
    }

    public Request getResquest(String url) {
        return new Request.Builder().url(url).header("x-mysolomeo-session-key", "02e57c7d-d071-4c63-b491-1194a9939ea5.2016-11-01T18:15:11.005Z").build();
    }

    public Request getResquest(String url, RequestBody _postData) {
        return new Request.Builder().url(url).post(_postData).header("Authorization", "Basic QWxhZGRpbjpvcGVuIHNlc2FtZQ==").header("Content-Type", "application/json").build();
    }

    public void getMethod(String url) {
        Response response = null;
        try {
            response = getClient().newCall(getResquest(url)).execute();
            System.out.println("Responce from Url" + response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void postMethod(String url) {
        PostData postData = new PostData();
        postData.setWlpID("DW");
        postData.setLastName("Belcher");
        postData.setLanguageID("en_US");
        postData.setFirstName("Bob");
        postData.setEmailAddress1("bob@belcher.coms");
        postData.setUsername("bobbelc");
        postData.setPassword("Start@1234");
        String myJsonObj = new Gson().toJson(postData);
        Response response = null;
        try {
            RequestBody _postData = RequestBody.create(getJsonMedia(), myJsonObj);
            response = getClient().newCall(getResquest(url, _postData)).execute();
            System.out.println("Responce from Url" + response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

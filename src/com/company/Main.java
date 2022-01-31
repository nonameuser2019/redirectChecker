package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {

    public static int StatusCodeChecker(String inputUrl)throws IOException {
        URL url = new URL(inputUrl);
        HttpURLConnection connect = (HttpURLConnection) url.openConnection();
        connect.setRequestMethod("GET");
        connect.connect();
        return connect.getResponseCode();

    }

    public static void main(String[] args)throws IOException  {
	    String testUrl = "https://starter.ms/";
        System.out.println(StatusCodeChecker(testUrl));
    }
}

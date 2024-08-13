package com.example.demo2.lotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class LottoGetApi {


    public static StringBuffer getNumber() throws MalformedURLException {

        URL url = new URL("https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo=100");
        StringBuffer sb = new StringBuffer();
        try {
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.setRequestMethod("POST");


            connection.connect();
            InputStream in = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            int rsps = connection.getResponseCode();
            System.out.println(sb);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sb;
    }

}

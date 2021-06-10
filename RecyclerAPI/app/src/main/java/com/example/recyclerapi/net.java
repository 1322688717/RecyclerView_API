package com.example.recyclerapi;

import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class net {
    public static void parseByGson() {
        Gson gson = new Gson();
        //将对象变成json字符串
    // ================解析一个实际的字符串
        new Thread() {
            @Override
            public void run() {
                super.run();
                //运行get方法得到彩云的json对象
                String json = get();
                //拿到json对象
                try {
                    //用jsonobject解析json字符串
                    JSONObject js = new JSONObject(json);
                    Msg msg = gson.fromJson(String.valueOf(js), Msg.class);
                    Log.e("TAG","Msg对象为："+msg);
                    Log.e("TAG","Speed为："+msg.getResult().getHourly().getWind().get(0).getSpeed());
                    Log.e("TAG","Speed为："+msg.getResult().getHourly().getWind().get(1).getSpeed());

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }


        }.start();

    }

    //=================================get请求
    public static String get(){
        try {
            //实例化一个URL对象
            URL url = new URL("https://api.caiyunapp.com/v2.5/7KlicJFJqOmm3iIn/121.6544,25.1552/weather.json");
            try {
                //获取HttpURLConnection实例
                HttpURLConnection conn = (HttpURLConnection)url.openConnection();
                //设置和请求相关的属性
                conn.setRequestMethod("GET");
                conn.setConnectTimeout(6000);
                //获取响应码并获取响应数据
                if(conn.getResponseCode()==HttpURLConnection.HTTP_OK){
                    //实例化一个响应流
                    InputStream in = conn.getInputStream();
                    //实例化一个数组
                    byte[] b = new byte[1024];
                    //int一个长度
                    int len = 0;
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    //将字节数组里面的内容写入缓存流
                    while((len = in.read(b))>-1){
                        //参数一：待写入的数组   参数二：起点    参数三：长度
                        baos.write(b,0,len);
                    }
                    //在控制台上显示出获取的数据
                    String msg = new String(baos.toByteArray());
                    Log.e("TAG",msg+"===这里是get方法拿到的json对象");
                    return msg;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

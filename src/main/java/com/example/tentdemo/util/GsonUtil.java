package com.example.tentdemo.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class GsonUtil {
    public static String YYYYMMDD_HHMMSS = "yyyy-MM-dd HH:mm:ss";

    public static String toJson(Object obj) {
        Gson gson = new GsonBuilder()
                .serializeNulls()
                .setDateFormat(YYYYMMDD_HHMMSS).create();
        return gson.toJson(obj);
    }

    public static String toJson(List<Object> objList) {
        Gson gson = new GsonBuilder()
                .serializeNulls()
                .setDateFormat(YYYYMMDD_HHMMSS).create();
        return gson.toJson(objList);
    }
}

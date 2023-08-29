package com.example.tentdemo.util;

import com.example.tentdemo.response.HttpResponseListType;
import com.example.tentdemo.response.HttpResponseObjectType;
import com.google.gson.GsonBuilder;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class ResponseAPI {
    public static ResponseEntity<Object> returnDataObject(HttpServletRequest req, Object data){
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(GsonUtil.toJson(new HttpResponseObjectType(req.getRequestURI(), data)));
    }

    public static ResponseEntity<Object> returnDataList(HttpServletRequest req, List data){
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(GsonUtil.toJson(new HttpResponseListType(req.getRequestURI(), data)));
    }
}

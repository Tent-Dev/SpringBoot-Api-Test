package com.example.tentdemo.response;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.List;

public class HttpResponseListType extends HttpResponseMain {
    @Getter
    private final List data;

    public HttpResponseListType(String path, List data) {
        super(HttpStatus.OK, null, path);
        this.data = data;
    }
}

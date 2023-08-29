package com.example.tentdemo.response;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public class HttpResponseObjectType extends HttpResponseMain {
    @Getter
    private final Object data;

    public HttpResponseObjectType(String path, Object data) {
        super(HttpStatus.OK, null, path);
        this.data = data;
    }
}

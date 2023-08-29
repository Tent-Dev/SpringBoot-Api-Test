package com.example.tentdemo.response;

import io.micrometer.common.util.StringUtils;
import org.springframework.http.HttpStatus;
import java.util.Date;

public class HttpResponseMain {
    protected Date timestamp;
    protected int status;
    protected String message;
    protected String path;

    public HttpResponseMain(int status, String message, String path) {
        this.timestamp = new Date();
        this.status = status;
        this.message = message;
        this.path = path;
    }
    public HttpResponseMain(HttpStatus httpStatus, String message, String path) {
        this.timestamp = new Date();
        this.status = httpStatus.value();
        this.message = StringUtils.isNotBlank(message) ? message : httpStatus.getReasonPhrase();
        this.path = path;
    }
}

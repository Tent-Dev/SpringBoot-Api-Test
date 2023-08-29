package com.example.tentdemo.service;

import java.util.Map;

public interface UserServiceInterface {
    Map<String, Object> getUserById(Long id) throws Exception;

}

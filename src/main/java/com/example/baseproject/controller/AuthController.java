package com.example.baseproject.controller;

import com.example.baseproject.exception.RecordNotFoundException;
import com.example.baseproject.model.response.BaseResponse;
import com.example.baseproject.model.response.SuccessResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("prelogin")
    public BaseResponse<?> prelogin() {
//        throw new RecordNotFoundException("Invalid employee id : 123");

        return new BaseResponse<>().success("Successfully Added User");
    }
}

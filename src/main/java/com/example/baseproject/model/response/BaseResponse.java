package com.example.baseproject.model.response;

public class BaseResponse<T> {
    private int status;
    private String message;
    private T data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BaseResponse<T> success(String message) {
        BaseResponse<T> baseResponse = new BaseResponse<T>();
        baseResponse.setStatus(200);
        baseResponse.setMessage(message);
        return baseResponse;
    }

    public BaseResponse<T> success(String message, T data) {
        BaseResponse<T> baseResponse = new BaseResponse<T>();
        baseResponse.setStatus(200);
        baseResponse.setMessage(message);
        baseResponse.setData(data);
        return baseResponse;
    }

    public BaseResponse<T> success(int statusCode, String message, T data) {
        BaseResponse<T> baseResponse = new BaseResponse<T>();
        baseResponse.setStatus(statusCode);
        baseResponse.setMessage(message);
        baseResponse.setData(data);
        return baseResponse;
    }

    public BaseResponse<T> error(int StatusCode, String message) {
        BaseResponse<T> baseResponse = new BaseResponse<T>();
        baseResponse.status = StatusCode;
        baseResponse.message = message;
        return baseResponse;
    }
}

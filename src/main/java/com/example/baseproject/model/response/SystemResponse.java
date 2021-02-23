package com.example.baseproject.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * DTO chứa thông tin lỗi
 *
 * @param <T>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SystemResponse<T> {

    private int status;

    private String message;

    private T data;

    public SystemResponse(int status, String message) {
        this.setStatus(status);
        this.setMessage(message);
    }

    public SystemResponse(int status, String message, T data) {
        this.setStatus(status);
        this.setMessage(message);
        this.setData(data);
    }

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
}


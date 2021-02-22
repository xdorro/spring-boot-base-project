package com.example.baseproject.model.dto;

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
        this.status = status;
        this.error = message;
    }

    public SystemResponse(int status, String message, T data) {
        this.status = status;
        this.error = message;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}


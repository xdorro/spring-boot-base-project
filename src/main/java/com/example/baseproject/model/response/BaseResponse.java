package com.example.baseproject.model.response;

import com.example.baseproject.common.constrant.StringResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * DTO trả về thông tin lỗi
 */
public class BaseResponse {

    public static <T> SystemResponse<T> from(HttpStatus status, String msg) {
        return new SystemResponse<>(status.value(), msg);
    }

    /**
     * Trả về lỗi không có quyền truy cập
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> ResponseEntity<SystemResponse<T>> unauthorized(String msg) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new SystemResponse<>(401, msg));
    }

    /**
     * Trả về lỗi không có quyền truy cập
     * @param code
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> ResponseEntity<SystemResponse<T>> unauthorized(int code, String msg) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new SystemResponse<>(code, msg));
    }

    /**
     * Trả về lỗi truy vấn
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> ResponseEntity<SystemResponse<T>> badRequest(String msg) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new SystemResponse<>(400, msg));
    }

    /**
     * Trả về lỗi truy vấn
     * @param code
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> ResponseEntity<SystemResponse<T>> badRequest(int code, String msg) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new SystemResponse<>(code, msg));
    }

    /**
     * Trả về lỗi truy vấn
     * @param code
     * @param msg
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseEntity<SystemResponse<T>> badRequest(int code, String msg, T data) {
        return ResponseEntity.badRequest().body(new SystemResponse<>(code, msg, data));
    }

    /**
     * Trả về thông báo thành công
     * @param code
     * @param msg
     * @param body
     * @param <T>
     * @return
     */
    public static <T> ResponseEntity<SystemResponse<T>> ok(int code, String msg, T body) {
        return ResponseEntity.ok(new SystemResponse<>(code, msg, body));
    }

    /**
     * Trả về thông báo thành công
     * @param body
     * @param <T>
     * @return
     */
    public static <T> ResponseEntity<SystemResponse<T>> ok(T body) {
        return ResponseEntity.ok(new SystemResponse<T>(100, StringResponse.SUCCESS.name(), body));
    }

    /**
     * Trả về thông báo thành công
     * @param <T>
     * @return
     */
    public static <T> ResponseEntity<SystemResponse<T>> ok() {
        return ResponseEntity.ok(new SystemResponse<T>(100, StringResponse.SUCCESS.name()));
    }

    /**
     * Trả về thông báo thành công
     * @param code
     * @param message
     * @param <T>
     * @return
     */
    public static <T> ResponseEntity<SystemResponse<T>> ok(int code, String message) {
        return ResponseEntity.ok(new SystemResponse<>(code, message));
    }

    /**
     * Trả về thông báo thành công
     * @param message
     * @param body
     * @param <T>
     * @return
     */
    public static <T> ResponseEntity<SystemResponse<T>> ok(String message, T body) {
        return ResponseEntity.ok(new SystemResponse<>(100, message, body));
    }

//    public static <T> ResponseEntity<SystemResponse<T>> httpError(HttpErrorException e) {
//        return ResponseEntity
//                .status(e.getStatus())
//                .body(from(e.getStatus(), e.getMessage()));
//    }

}


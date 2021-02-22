package com.example.baseproject.model.response;

import java.util.List;

//@JsonInclude(JsonInclude.Include.NON_NULL)
//public class ErrorResponse<T> {
//    private ErrorDTO<T> error;
//
//    public ErrorResponse(Object object, List<String> message) {
//        error = new ErrorDTO<T>(object, message);
//    }
//
//    public ErrorDTO<T> getError() {
//        return error;
//    }
//
//    public void setError(ErrorDTO<T> error) {
//        this.error = error;
//    }
//}

public class ErrorResponse
{
    public ErrorResponse(String message, List<String> details) {
        super();
        this.message = message;
        this.details = details;
    }

    //General error message about nature of error
    private String message;

    //Specific errors in API request processing
    private List<String> details;

    //Getter and setters
}
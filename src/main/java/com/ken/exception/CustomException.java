package com.ken.exception;

public class CustomException extends RuntimeException {

    private int code;

    public CustomException() {
    }

    public CustomException(int code, String message) {
        super(message);
        this.code = code;
    }

    public CustomException(int code, String message, Throwable throwable) {
        super(message, throwable);
        this.code = code;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

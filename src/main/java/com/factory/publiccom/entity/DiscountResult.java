package com.factory.publiccom.entity;

public class DiscountResult {
    private String status; // 状态码
    private String message; // 信息

    public DiscountResult(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

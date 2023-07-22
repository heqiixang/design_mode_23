package com.factory.publiccom.entity;

public class ResponseResult {
    private String status; // 状态码
    private String message; // 信息
    private Object data;   //数据

    @Override
    public String toString() {
        return "ResponseResult{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public ResponseResult(String status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResponseResult(String status, String message) {
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

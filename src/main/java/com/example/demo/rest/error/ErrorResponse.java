package com.example.demo.rest.error;

public class ErrorResponse {
    private int status;
    private String message;
    private long timeStamp;

    public ErrorResponse() {
    }

    public ErrorResponse(long timeStamp, String message, int status) {
        this.timeStamp = timeStamp;
        this.message = message;
        this.status = status;
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

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}

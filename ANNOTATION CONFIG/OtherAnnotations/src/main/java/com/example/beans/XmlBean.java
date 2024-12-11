package com.example.beans;


public class XmlBean {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "XmlBean{" + "message='" + message + '\'' + '}';
    }
}
package com.example.demo.bean;

import org.springframework.context.annotation.Bean;

/**
 * 功能描述
 * 异常实体类
 *
 * @author: scott
 * @date: 2022年07月22日 16:09
 */

public class ResponseData {
    private int code=200;
    private String message;
    private String data;
    private boolean status=true;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

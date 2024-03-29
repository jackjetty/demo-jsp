package com.siemens.csds.sso.bean;

import java.io.Serializable;

public class ResultBean<T> implements Serializable {

    public static final String SUCCESS_MSG = "成功";
    public static final Integer SUCCESS_CODE = 0;

    private static final long serialVersionUID = -6026881334722194709L;
    private Integer code = SUCCESS_CODE;
    private String msg = SUCCESS_MSG;
    private T data;

    public ResultBean() {
        super();

    }

    public ResultBean(T data) {
        this();
        this.data = data;
    }

    public ResultBean(Integer code, String msg, T data) {
        super();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
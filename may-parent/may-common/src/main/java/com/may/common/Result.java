package com.may.common;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Result<T> implements Serializable {

    private Boolean success;

    private String message;

    private String code;

    private Integer pageNum;

    private Integer pageSize;

    private Long total;

    private Integer pageCount;

    private T data;

    public Result() {
        this.success = true;
        this.code = Status.SUCCESS.code;
        this.message = Status.SUCCESS.msg;
    }

    public static <T> Result<T> newResult() {
        return new Result<>();
    }


    enum Status {

        SUCCESS("20000", "成功");

        private String code;

        private String msg;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        Status(String code, String msg) {
            this.code = code;
            this.msg = msg;
        }
    }

}

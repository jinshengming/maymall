package com.may.common;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Result<T> implements Serializable {

    private Boolean success;

    private String message;

    private Status code;

    private Integer pageNum;

    private Integer pageSize;

    private Long total;

    private Integer pageCount;

    private T data;

    public Result() {
        this.success = true;
        this.code = Status.SUCCESS;
    }

    public static <T> Result<T> newResult() {
        return new Result<>();
    }


    enum Status {

        SUCCESS("20000");

        Status(String code) {

        }
    }

}

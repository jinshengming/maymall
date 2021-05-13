package com.may.common.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result<T> {

    private Boolean success;

    private String message;

    private String code;

    private T data;





}

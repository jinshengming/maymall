package com.may.common.dto;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.may.common.util.PageI;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BasicDTO {


    @JsonUnwrapped
    private PageI page;

}

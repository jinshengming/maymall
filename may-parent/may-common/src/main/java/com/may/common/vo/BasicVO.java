package com.may.common.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.may.common.util.PageI;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class BasicVO implements Serializable {



    @JsonIgnore
    private PageI page;
}

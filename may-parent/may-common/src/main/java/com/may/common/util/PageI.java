package com.may.common.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageI {


    private Integer pageNum;

    private Integer pageSize;

    public PageI() {
        this.pageNum = 1;
        this.pageSize = 10;
    }

}

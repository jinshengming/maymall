package com.may.common;

import com.may.common.util.PageI;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class BaseEntity implements Serializable {

    private PageI page;

}

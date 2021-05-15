package com.may.common.controller;


import com.github.pagehelper.Page;
import com.may.common.Result;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public class BaseController {


    /**
     * 组装分页
     * @param page .
     * @param data .
     * @author jinshengming
     * @date 2021/5/15 13:27
     * @return {com.may.common.Result<java.util.List<T>>}
     */
    public <T> Result<List<T>> handlePage(Page<?> page, List<T> data) {
        Result<List<T>> result = Result.newResult();
        result.setPageCount(page.getPages());
        result.setTotal(page.getTotal());
        result.setPageNum(page.getPageNum());
        result.setPageSize(page.getPageSize());
        result.setData(data);
        return result;
    }
}

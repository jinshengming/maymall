package com.may.common.service;

import com.github.pagehelper.Page;

import java.util.List;

public interface BasicService {




    /**
     * 组装分页
     * @param objects .
     * @param list .
     * @author jinshengming
     * @date 2021/5/15 13:19
     * @return {com.github.pagehelper.Page<E>}
     */
    <E> Page<E> handlePage(Page<Object> objects, List<E> list);



}

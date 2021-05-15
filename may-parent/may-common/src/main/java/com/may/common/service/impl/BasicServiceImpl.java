package com.may.common.service.impl;

import com.github.pagehelper.Page;
import com.may.common.service.BasicService;

import java.util.List;

public class BasicServiceImpl implements BasicService {



    @Override
    public <E> Page<E> handlePage(Page<Object> objects, List<E> list) {
        Page<E> page = new Page<>();
        page.addAll(list);
        page.setPageNum(objects.getPageNum());
        page.setPageSize(objects.getPageSize());
        page.setTotal(objects.getTotal());
        page.setPages(objects.getPages());
        return page;
    }

}

package com.may.service.goods.service;

import com.github.pagehelper.Page;
import com.may.common.dto.goods.BrandDTO;
import com.may.common.service.BasicService;

public interface BrandService extends BasicService {



    /**
     * 分页条件查询
     * @param record .
     * @author jinshengming
     * @date 2021/5/15 13:16
     * @return {com.github.pagehelper.Page<com.may.common.dto.goods.BrandDTO>}
     */
    Page<BrandDTO> select(BrandDTO record);


}

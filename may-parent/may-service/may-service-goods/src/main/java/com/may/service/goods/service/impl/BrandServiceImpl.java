package com.may.service.goods.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.may.common.dto.goods.BrandDTO;
import com.may.common.service.impl.BasicServiceImpl;
import com.may.common.util.PageI;
import com.may.common.vo.goods.BrandVO;
import com.may.service.api.goods.pojo.Brand;
import com.may.service.goods.mapper.BrandMapper;
import com.may.service.goods.service.BrandService;
import com.may.service.goods.struct.BrandStruct;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BrandServiceImpl extends BasicServiceImpl implements BrandService {


    @Resource
    private BrandMapper brandMapper;

    @Override
    public Page<BrandDTO> select(BrandDTO record) {
        PageI page = record.getPage();
        Page<Object> objects = PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Brand> brands = brandMapper.selectAll();

        List<BrandDTO> dtos = BrandStruct.INSTANCE.toDTO(brands);

        return handlePage(objects, dtos);

    }
}

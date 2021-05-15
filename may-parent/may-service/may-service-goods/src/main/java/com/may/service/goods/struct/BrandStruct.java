package com.may.service.goods.struct;


import com.github.pagehelper.Page;
import com.may.common.dto.goods.BrandDTO;
import com.may.common.vo.goods.BrandVO;
import com.may.service.api.goods.pojo.Brand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BrandStruct {

    BrandStruct INSTANCE = Mappers.getMapper(BrandStruct.class);

    /**
     * 转vo
     * @param records .
     * @author jinshengming
     * @date 2021/5/15 12:50
     * @return {java.util.List<com.may.common.vo.goods.BrandVO>}
     */
    List<BrandVO> toVo(List<BrandDTO> records);

    /**
     * 转vo
     * @param records .
     * @author jinshengming
     * @date 2021/5/15 12:50
     * @return {java.util.List<com.may.common.vo.goods.BrandVO>}
     */
    List<BrandDTO> toDTO(List<Brand> records);

}

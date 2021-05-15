package com.may.common.dto.goods;

import com.may.common.dto.BasicDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BrandDTO extends BasicDTO {

    @ApiModelProperty(value = "品牌id")
    private Integer id;

    @ApiModelProperty(value = "品牌名称")
    private String name;

    @ApiModelProperty(value = "品牌图片地址")
    private String image;

    @ApiModelProperty(value = "品牌的首字母")
    private String letter;

    @ApiModelProperty(value = "排序")
    private Integer seq;
}

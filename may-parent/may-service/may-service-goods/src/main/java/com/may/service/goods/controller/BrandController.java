package com.may.service.goods.controller;

import com.github.pagehelper.Page;
import com.may.common.Result;
import com.may.common.controller.BaseController;
import com.may.common.dto.goods.BrandDTO;
import com.may.common.vo.goods.BrandVO;
import com.may.service.goods.service.BrandService;
import com.may.service.goods.struct.BrandStruct;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
@Api(tags = {"品牌"})
@RequestMapping("/brand")
public class BrandController extends BaseController {


    @Resource
    private BrandService brandService;


    @PostMapping
    @ApiOperation(value = "分页条件查询品牌信息")
    public Result<List<BrandVO>> select(@RequestBody BrandDTO record) {
        Page<BrandDTO> page = brandService.select(record);
        List<BrandVO> vos = BrandStruct.INSTANCE.toVo(page.getResult());
        return handlePage(page, vos);
    }



}

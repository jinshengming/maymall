package com.may.service.file.goods.brand;

import com.may.common.controller.BaseController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/brand/upload")
public class BrandFileController extends BaseController {



    @PostMapping()
    public void upload(@RequestBody MultipartFile file) {

    }



}

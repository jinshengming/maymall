package com.may.service.api.goods.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 品牌实体类
 * @author jinshengming
 * @date 2021/5/15 14:07
 */
@Getter
@Setter
@Table(name="tb_brand")
public class Brand implements Serializable {

	/**
	 * 品牌id
	 */
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;

	/**
	 * 品牌名称
	 */
    @Column(name = "name")
	private String name;

	/**
	 * 品牌图片地址
	 */
    @Column(name = "image")
	private String image;

	/**
	 * 品牌的首字母
	 */
    @Column(name = "letter")
	private String letter;

	/**
	 * 排序
	 */
    @Column(name = "seq")
	private Integer seq;



}

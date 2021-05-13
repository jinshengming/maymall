package com.may.service.api.goods.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Album构建
 * @author:admin
 * @date 2019/6/14 19:13
 **/
@Getter
@Setter
@Table(name="tb_album")
public class Album implements Serializable{


	//编号
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;

	//相册名称
    @Column(name = "title")
	private String title;

	//相册封面
    @Column(name = "image")
	private String image;

	//图片列表
    @Column(name = "image_items")
	private String imageItems;



}

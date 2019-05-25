package com.pingyougou.sellergoods.service;

import java.util.List;

import com.pingyougou.pojo.TbBrand;

/**
 * 品牌列表
 * @author Administrator
 *
 */
public interface BrandService {
	/**
	 * 查询全部品牌
	 * @return
	 */
	public List<TbBrand> findAll();

}

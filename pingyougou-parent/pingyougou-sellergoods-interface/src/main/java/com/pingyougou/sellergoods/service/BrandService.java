package com.pingyougou.sellergoods.service;

import java.util.List;

import com.pingyougou.pojo.TbBrand;

import entity.PageResult;

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
	
	/**
	 * 品牌分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	/**
	 * 保存品牌
	 * @param tbBrand
	 */
	public void add(TbBrand tbBrand);

}

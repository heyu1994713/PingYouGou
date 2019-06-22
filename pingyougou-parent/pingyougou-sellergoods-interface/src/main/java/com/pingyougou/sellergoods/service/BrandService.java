package com.pingyougou.sellergoods.service;

import java.util.List;
import java.util.Map;

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
	
	/**
	 * 返回查询品牌
	 * @param Id
	 * @return
	 */
	public TbBrand findOne(Long Id) ;
	
	/**
	 * 更新品牌
	 * @param tbBrand
	 */
	public void update(TbBrand tbBrand);
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] ids);
	
	
	/**
	 * 品牌查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageResult findPage(TbBrand tbBrand,int pageNum,int pageSize);
	
	/**
	 * 品牌下拉框数据
	 */
	List<Map> selectOptionList();

}

package com.pinyougou.sellergoods.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pingyougou.mapper.TbBrandMapper;
import com.pingyougou.pojo.TbBrand;
import com.pingyougou.sellergoods.service.BrandService;

import entity.PageResult;
@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private TbBrandMapper brandMapper;
	
	
	public List<TbBrand> findAll() {

		return brandMapper.selectByExample(null);
	}


	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		//分页插件
		PageHelper.startPage(pageNum, pageSize);
		Page<TbBrand>page= (Page<TbBrand>) brandMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}


	@Override
	public void add(TbBrand tbBrand) {
		brandMapper.insert(tbBrand);
		
	}


}

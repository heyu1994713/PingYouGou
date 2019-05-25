package com.pinyougou.sellergoods.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.pingyougou.mapper.TbBrandMapper;
import com.pingyougou.pojo.TbBrand;
import com.pingyougou.sellergoods.service.BrandService;
@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private TbBrandMapper brandMapper;
	
	
	public List<TbBrand> findAll() {

		return brandMapper.selectByExample(null);
	}

}

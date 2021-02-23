﻿package cn.dsscm.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.dsscm.pojo.ProductCategory;


public interface ProductCategoryMapper {
	/**
	 * 根据ID查询商品分类
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public ProductCategory findById(@Param("id")long id) throws SQLException;
	/**
	 * 根据 获取 商品分类
	 * @param parentId
	 * @return
	 * @throws SQLException
	 */
	public List<ProductCategory> findProductCategories();
	
//	public List<ProductCategory> getProductCategories(@Param("name")String name,
//			@Param("parentId")Long parentId,@Param("type")Integer type) throws SQLException;
	/**
	 * 查询商品分类的根节点
	 * @return
	 * @throws SQLException
	 */
	public List<ProductCategory> getRootCategories(@Param("parentId")Long parentId) throws SQLException;
	/**
	 * 删除商品分类
	 * @param parseLong
	 * @throws SQLException
	 */
	public int delete(@Param("id")long parentId) throws SQLException;
	/**
	 * 新增商品分类
	 */
	public int save(ProductCategory productCategory) throws SQLException;
	/**
	 * 更新商品分类
	 * @param productCategory
	 * @throws SQLException
	 */
	public int update(ProductCategory productCategory) throws SQLException;
}

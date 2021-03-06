package com.demo.boot.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseProductInfo<M extends BaseProductInfo<M>> extends Model<M> implements IBean {

	public void setProductId(String productId) {
		set("product_id", productId);
	}

	public String getProductId() {
		return getStr("product_id");
	}

	public void setProductName(String productName) {
		set("product_name", productName);
	}

	public String getProductName() {
		return getStr("product_name");
	}

	public void setProductPrice(java.math.BigDecimal productPrice) {
		set("product_price", productPrice);
	}

	public java.math.BigDecimal getProductPrice() {
		return get("product_price");
	}

	public void setProductStock(Integer productStock) {
		set("product_stock", productStock);
	}

	public Integer getProductStock() {
		return getInt("product_stock");
	}

	public void setProductDescription(String productDescription) {
		set("product_description", productDescription);
	}

	public String getProductDescription() {
		return getStr("product_description");
	}

	public void setProductIcon(String productIcon) {
		set("product_icon", productIcon);
	}

	public String getProductIcon() {
		return getStr("product_icon");
	}

	public void setProductStatus(Integer productStatus) {
		set("product_status", productStatus);
	}

	public Integer getProductStatus() {
		return getInt("product_status");
	}

	public void setCategoryType(Integer categoryType) {
		set("category_type", categoryType);
	}

	public Integer getCategoryType() {
		return getInt("category_type");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}
	
	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

}

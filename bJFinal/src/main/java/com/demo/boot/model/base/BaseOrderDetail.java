package com.demo.boot.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseOrderDetail<M extends BaseOrderDetail<M>> extends Model<M> implements IBean {

	public void setDetailId(String detailId) {
		set("detail_id", detailId);
	}

	public String getDetailId() {
		return getStr("detail_id");
	}

	public void setOrderId(String orderId) {
		set("order_id", orderId);
	}

	public String getOrderId() {
		return getStr("order_id");
	}

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

	public void setProductQuantity(Integer productQuantity) {
		set("product_quantity", productQuantity);
	}

	public Integer getProductQuantity() {
		return getInt("product_quantity");
	}

	public void setProductIcon(String productIcon) {
		set("product_icon", productIcon);
	}

	public String getProductIcon() {
		return getStr("product_icon");
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

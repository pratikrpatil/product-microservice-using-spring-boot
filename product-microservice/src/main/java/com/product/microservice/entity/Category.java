package com.product.microservice.entity;

import javax.persistence.Embeddable;


@Embeddable
public class Category {
	
	private int categoryId;
	private String categoryName;
	private String categoryBrand;

	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryBrand() {
		return categoryBrand;
	}
	public void setCategoryBrand(String categoryBrand) {
		this.categoryBrand = categoryBrand;
	}

}

/**
 * 
 */
package com.fernando.market.domain;

/**
 * @author : Fernando Ambrosio
 * @since : 03/10/2020
 *
 */
public class Category {

	private long categoryId;
	
	private String category;
	
	private boolean active;

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}

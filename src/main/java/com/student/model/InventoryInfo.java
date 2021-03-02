package com.student.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class InventoryInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int inventoryInfoId;
	private int skuId;
	@ManyToMany(mappedBy = "inventoryInfo")
	@JsonBackReference
	private List<Product> productId;
	private String label;
	private int inventory;
	private boolean available;
	
	
	public int getInventoryInfoId() {
		return inventoryInfoId;
	}
	public void setInventoryInfoId(int inventoryInfoId) {
		this.inventoryInfoId = inventoryInfoId;
	}
	
	public int getSkuId() {
		return skuId;
	}
	public void setSkuId(int skuId) {
		this.skuId = skuId;
	}
	public List<Product> getProductId() {
		return productId;
	}
	public void setProductId(List<Product> productId) {
		this.productId = productId;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	
}

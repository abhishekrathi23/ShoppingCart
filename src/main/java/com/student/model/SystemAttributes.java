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
public class SystemAttributes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int SystemAttributeId;
	@ManyToMany(mappedBy = "systemAttributes")
	@JsonBackReference
	private List<Product> productId;
	private String SystemAttributeKey;
	private String SystemAttributeValue;
	
	
	public int getSystemAttributeId() {
		return SystemAttributeId;
	}
	public void setSystemAttributeId(int systemAttributeId) {
		SystemAttributeId = systemAttributeId;
	}
	public List<Product> getProductId() {
		return productId;
	}
	public void setProductId(List<Product> productId) {
		this.productId = productId;
	}
	public String getSystemAttributeKey() {
		return SystemAttributeKey;
	}
	public void setSystemAttributeKey(String systemAttributeKey) {
		SystemAttributeKey = systemAttributeKey;
	}
	public String getSystemAttributeValue() {
		return SystemAttributeValue;
	}
	public void setSystemAttributeValue(String systemAttributeValue) {
		SystemAttributeValue = systemAttributeValue;
	}
	
	

}

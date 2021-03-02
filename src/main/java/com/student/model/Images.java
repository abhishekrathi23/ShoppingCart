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
public class Images {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int imageId;
	@ManyToMany(mappedBy = "images")
	@JsonBackReference
	private List<Product> productId;
	private String view;
	private String src;
	
	
	public int getImageId() {
		return imageId;
	}
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	public List<Product> getProductId() {
		return productId;
	}
	public void setProductId(List<Product> productId) {
		this.productId = productId;
	}
	public String getView() {
		return view;
	}
	public void setView(String view) {
		this.view = view;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	
	
	
	
}

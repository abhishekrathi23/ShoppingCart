package com.student.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Filters {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int filterId;
	@ManyToMany(mappedBy = "filter") 
	@JsonBackReference
	private List<Product> productId;
	private String filterName;
	private String filterValue;
	
	
	public int getFilterId() {
		return filterId;
	}
	public void setFilterId(int filterId) {
		this.filterId = filterId;
	}
	public List<Product> getProductId() {
		return productId;
	}
	public void setProductId(List<Product> productId) {
		this.productId = productId;
	}
	public String getFilterName() {
		return filterName;
	}
	public void setFilterName(String filterName) {
		this.filterName = filterName;
	}
	public String getFilterValue() {
		return filterValue;
	}
	public void setFilterValue(String filterValue) {
		this.filterValue = filterValue;
	}
	
	
	
	
}

package com.student.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	private String landingPageUrl;
	private String product;
	private String productName;
	private float rating;
	private int ratingCount;
	private float discount;
	@ManyToMany(cascade = {CascadeType.ALL})		
	@JoinTable(
			  name = "product_filter", 
			  joinColumns = @JoinColumn(name = "productId"), 
			  inverseJoinColumns = @JoinColumn(name = "filterId"))
	private List<Filters> filter;
	private String searchImage;
	private float effectiveDiscountPercentageAfterTax;
	private float effectiveDiscountAmountAfterTax;
	@ManyToMany(cascade = {CascadeType.ALL})		
	@JoinTable(
			  name = "product_inventoryInfo", 
			  joinColumns = @JoinColumn(name = "productId"), 
			  inverseJoinColumns = @JoinColumn(name = "skuId"))
	private List<InventoryInfo> inventoryInfo;
	private String sizes;
	@ManyToMany(cascade = {CascadeType.ALL})		//add this to all the foreign keys in the product class
	@JoinTable(
			  name = "product_images", 
			  joinColumns = @JoinColumn(name = "productId"), 
			  inverseJoinColumns = @JoinColumn(name = "imageId"))
	private List<Images> images;
	private String primaryColour;
	private String discountLabel;
	private String discountDisplayLabel;
	private String additionalInfo;
	private int mrp;
	private String colorVariantAvailable;
	private String discountType;
	private String catalogDate;
	private String season;
	private int year;
	@ManyToMany(cascade = {CascadeType.ALL})		//add this to all the foreign keys in the product class
	@JoinTable(
			  name = "product_systemAttributes", 
			  joinColumns = @JoinColumn(name = "productId"), 
			  inverseJoinColumns = @JoinColumn(name = "SystemAttributeId"))
	private List<SystemAttributes> systemAttributes;
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getLandingPageUrl() {
		return landingPageUrl;
	}
	public void setLandingPageUrl(String landingPageUrl) {
		this.landingPageUrl = landingPageUrl;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public int getRatingCount() {
		return ratingCount;
	}
	public void setRatingCount(int ratingCount) {
		this.ratingCount = ratingCount;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public List<Filters> getFilter() {
		return filter;
	}
	public void setFilter(List<Filters> filter) {
		this.filter = filter;
	}
	public String getSearchImage() {
		return searchImage;
	}
	public void setSearchImage(String searchImage) {
		this.searchImage = searchImage;
	}
	public float getEffectiveDiscountPercentageAfterTax() {
		return effectiveDiscountPercentageAfterTax;
	}
	public void setEffectiveDiscountPercentageAfterTax(float effectiveDiscountPercentageAfterTax) {
		this.effectiveDiscountPercentageAfterTax = effectiveDiscountPercentageAfterTax;
	}
	public float getEffectiveDiscountAmountAfterTax() {
		return effectiveDiscountAmountAfterTax;
	}
	public void setEffectiveDiscountAmountAfterTax(float effectiveDiscountAmountAfterTax) {
		this.effectiveDiscountAmountAfterTax = effectiveDiscountAmountAfterTax;
	}
	public List<InventoryInfo> getInventoryInfo() {
		return inventoryInfo;
	}
	public void setInventoryInfo(List<InventoryInfo> inventoryInfo) {
		this.inventoryInfo = inventoryInfo;
	}
	public String getSizes() {
		return sizes;
	}
	public void setSizes(String sizes) {
		this.sizes = sizes;
	}
	public List<Images> getImages() {
		return images;
	}
	public void setImages(List<Images> images) {
		this.images = images;
	}
	public String getPrimaryColour() {
		return primaryColour;
	}
	public void setPrimaryColour(String primaryColour) {
		this.primaryColour = primaryColour;
	}
	public String getDiscountLabel() {
		return discountLabel;
	}
	public void setDiscountLabel(String discountLabel) {
		this.discountLabel = discountLabel;
	}
	public String getDiscountDisplayLabel() {
		return discountDisplayLabel;
	}
	public void setDiscountDisplayLabel(String discountDisplayLabel) {
		this.discountDisplayLabel = discountDisplayLabel;
	}
	public String getAdditionalInfo() {
		return additionalInfo;
	}
	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	public int getMrp() {
		return mrp;
	}
	public void setMrp(int mrp) {
		this.mrp = mrp;
	}
	public String getColorVariantAvailable() {
		return colorVariantAvailable;
	}
	public void setColorVariantAvailable(String colorVariantAvailable) {
		this.colorVariantAvailable = colorVariantAvailable;
	}
	public String getDiscountType() {
		return discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}
	public String getCatalogDate() {
		return catalogDate;
	}
	public void setCatalogDate(String catalogDate) {
		this.catalogDate = catalogDate;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public List<SystemAttributes> getSystemAttributes() {
		return systemAttributes;
	}
	public void setSystemAttributes(List<SystemAttributes> systemAttributes) {
		this.systemAttributes = systemAttributes;
	}
	
	
		
}

package com.casestudy.productservice.entity;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="products")
public class Product {

	 @Transient
	 public static final String SEQUENCE_NAME = "users_sequence";
	
	@Id
	private int productId;
	
	@NotBlank(message="product type shouldn't be Blank")
	private String productType;
	
	@NotBlank(message="product name shouldn't be Blank")
	private String productName;
	
	@NotBlank(message="product category shouldn't be Blank")
	private String category;
	
	private Map<Integer,Double> rating;
	private Map<Integer,String> review;
	
	@NotNull(message="product image shouldn't be null")
	private List<String> image; 
	
	@NotNull(message="product price shouldn't be null")
	private double price;
	
	@NotBlank(message="product description shouldn't be Blank")
	private String description;
	
	private String specificationKey;
	private String specificationValue;
	
	
	public Product() {
		
	}


	public Product(int productId, String productType, @NotNull String productName, String category,
			Map<Integer, Double> rating, Map<Integer, String> review, List<String> image, @NotNull double price,
			String description, String specificationKey, String specificationValue) {
		super();
		this.productId = productId;
		this.productType = productType;
		this.productName = productName;
		this.category = category;
		this.rating = rating;
		this.review = review;
		this.image = image;
		this.price = price;
		this.description = description;
		this.specificationKey = specificationKey;
		this.specificationValue = specificationValue;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductType() {
		return productType;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public Map<Integer, Double> getRating() {
		return rating;
	}


	public void setRating(Map<Integer, Double> rating) {
		this.rating = rating;
	}


	public Map<Integer, String> getReview() {
		return review;
	}


	public void setReview(Map<Integer, String> review) {
		this.review = review;
	}


	public List<String> getImage() {
		return image;
	}


	public void setImage(List<String> image) {
		this.image = image;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getSpecificationKey() {
		return specificationKey;
	}


	public void setSpecificationKey(String specificationKey) {
		this.specificationKey = specificationKey;
	}


	public String getSpecificationValue() {
		return specificationValue;
	}


	public void setSpecificationValue(String specificationValue) {
		this.specificationValue = specificationValue;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productType=" + productType + ", productName=" + productName
				+ ", category=" + category + ", rating=" + rating + ", review=" + review + ", image=" + image
				+ ", price=" + price + ", description=" + description + ", specificationKey=" + specificationKey
				+ ", specificationValue=" + specificationValue + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(category, description, image, price, productId, productName, productType, rating, review,
				specificationKey, specificationValue);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && Objects.equals(description, other.description)
				&& Objects.equals(image, other.image)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& productId == other.productId && Objects.equals(productName, other.productName)
				&& Objects.equals(productType, other.productType) && Objects.equals(rating, other.rating)
				&& Objects.equals(review, other.review) && Objects.equals(specificationKey, other.specificationKey)
				&& Objects.equals(specificationValue, other.specificationValue);
	}
	
}

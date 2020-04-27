package com.cpg.DTO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.validator.constraints.Range;


@Entity
@Table(name = "ProductDTO_GreatOutdoors")
@DynamicUpdate
public class Product {
  
	@Id
	@Column(name = "Product_Id",nullable = false)
	@Range(min=1,max=Long.MAX_VALUE,message="Product Id InValid")
	@NotNull(message="Product Id cannot be empty")
	private Long productId;
	
	@NotNull(message = "Product Price cannot be empty")
	@Column(name="Product_Price",nullable = false)
	@Range(min=1,max=Integer.MAX_VALUE,message="Product Price is InValid")
	private Integer productPrice;
	
	@NotBlank(message = "Product Colour cannot be empty")
	@Column(name="Product_Colour",nullable = false)
	private String productColour;
	
	@NotBlank(message = "Product Dimension cannot be empty")
	@Column(name="Product_Dimension",nullable = false)
	@Size(min = 2,max=20,message = "Product Dimension size not valid")
	private String productDimension;
	
	@NotBlank(message = "Product Specification cannot be empty")
	@Column(name="Product_Specification",nullable = false)
	private String productSpecification;
	
	@NotBlank(message = "Product Manufacturer cannot be empty")
	@Column(name="Product_Manufacturer",nullable = false)
	private String productManufacturer;
    
	
	@Column(name="Product_Quantity",nullable = false)
	@Range(min=1,max=Integer.MAX_VALUE,message="Product Quantity InValid")
	@NotNull(message="Product Quantity cannot be empty")
	private Integer productQuantity;
	
	@Column(name="Product_Category",nullable = false)
	@Range(min = 1,max=5,message = "Product Category InValid")
	@NotNull(message="Product Category cannot be empty")
	private Integer productCategory;
	
	@NotBlank(message = "Product Name cannot be empty")
	@Column(name="Product_Name",nullable = false)
	private String productName;
	
	@NotBlank(message = "Product Brand cannot be empty")
	@Column(name="Product_Brand",nullable = false)
	@Size(min=3,max=25,message="Product Brand Size is not valid")
	private String productBrand;
	
	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer price) {
		this.productPrice = price;
	}

	public String getProductColour() {
		return productColour;
	}

	public void setProductColour(String colour) {
		this.productColour = colour;
	}

	public String getProductDimension() {
		return productDimension;
	}

	public void setProductDimension(String dimension) {
		this.productDimension = dimension;
	}

	public String getProductSpecification() {
		return productSpecification;
	}

	public void setProductSpecification(String specification) {
		this.productSpecification = specification;
	}

	public String getProductManufacturer() {
		return productManufacturer;
	}

	public void setProductManufacturer(String manufacturer) {
		this.productManufacturer = manufacturer;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int quantity) {
		this.productQuantity = quantity;
	}

	public int getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(int productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productPrice=" + productPrice + ", productColour="
				+ productColour + ", productDimension=" + productDimension + ", productSpecification="
				+ productSpecification + ", productManufacturer=" + productManufacturer + ", productQuantity="
				+ productQuantity + ", productCategory=" + productCategory + ", productName=" + productName
				+ ", productBrand=" + productBrand + "]";
	}
	
}
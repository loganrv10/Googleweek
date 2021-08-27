package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.io.Serializable;


public class ResponseDTO implements Serializable {

	@SerializedName("website_link")
	private String websiteLink;

	@SerializedName("image_link")
	private String imageLink;

	@SerializedName("rating")
	private Object rating;

	@SerializedName("description")
	private String description;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("api_featured_image")
	private String apiFeaturedImage;

	@SerializedName("product_type")
	private String productType;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("price")
	private String price;

	@SerializedName("tag_list")
	private List<Object> tagList;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("product_colors")
	private List<Object> productColors;

	@SerializedName("brand")
	private String brand;

	@SerializedName("product_api_url")
	private String productApiUrl;

	@SerializedName("product_link")
	private String productLink;

	public void setWebsiteLink(String websiteLink){
		this.websiteLink = websiteLink;
	}

	public String getWebsiteLink(){
		return websiteLink;
	}

	public void setImageLink(String imageLink){
		this.imageLink = imageLink;
	}

	public String getImageLink(){
		return imageLink;
	}

	public void setRating(Object rating){
		this.rating = rating;
	}

	public Object getRating(){
		return rating;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setApiFeaturedImage(String apiFeaturedImage){
		this.apiFeaturedImage = apiFeaturedImage;
	}

	public String getApiFeaturedImage(){
		return apiFeaturedImage;
	}

	public void setProductType(String productType){
		this.productType = productType;
	}

	public String getProductType(){
		return productType;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setPrice(String price){
		this.price = price;
	}

	public String getPrice(){
		return price;
	}

	public void setTagList(List<Object> tagList){
		this.tagList = tagList;
	}

	public List<Object> getTagList(){
		return tagList;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setProductColors(List<Object> productColors){
		this.productColors = productColors;
	}

	public List<Object> getProductColors(){
		return productColors;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}

	public String getBrand(){
		return brand;
	}

	public void setProductApiUrl(String productApiUrl){
		this.productApiUrl = productApiUrl;
	}

	public String getProductApiUrl(){
		return productApiUrl;
	}

	public void setProductLink(String productLink){
		this.productLink = productLink;
	}

	public String getProductLink(){
		return productLink;
	}

	@Override
 	public String toString(){
		return 
			"ResponseDTO{" + 
			"website_link = '" + websiteLink + '\'' + 
			",image_link = '" + imageLink + '\'' + 
			",rating = '" + rating + '\'' + 
			",description = '" + description + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",api_featured_image = '" + apiFeaturedImage + '\'' + 
			",product_type = '" + productType + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",price = '" + price + '\'' + 
			",tag_list = '" + tagList + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",product_colors = '" + productColors + '\'' + 
			",brand = '" + brand + '\'' + 
			",product_api_url = '" + productApiUrl + '\'' + 
			",product_link = '" + productLink + '\'' + 
			"}";
		}
}
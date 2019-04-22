package com.sell.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="numberProduct")
	private int id;
	@Column
	private String name;
	@Column
	private double price;
	@Column
	private String description;
	@Column
	private double discount;
	@Column(name = "number_of_product")
	private int numberOfProduct;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	private Category category;
	@Column
	private String image;
	@Column
	private String ram;
	@Column
	private String memory;
	@Column
	private String chip;
	@Column
	private String camera;
	@OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
	private List<ListImage> listImage;

	public Product() {
		super();
	}

	public Product(String name, double price, String description, double discount, int numberOfProduct,
			Category category, String image) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.discount = discount;
		this.numberOfProduct = numberOfProduct;
		this.category = category;
		this.image = image;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getNumberOfProduct() {
		return numberOfProduct;
	}

	public void setNumberOfProduct(int numberOfProduct) {
		this.numberOfProduct = numberOfProduct;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<ListImage> getListImage() {
		return listImage;
	}

	public void setListImage(List<ListImage> listImage) {
		this.listImage = listImage;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", discount=" + discount + ", numberOfProduct=" + numberOfProduct + ", category=" + category
				+ ", image=" + image + ", listImage=" + listImage + "]";
	}

}

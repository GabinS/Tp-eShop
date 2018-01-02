package com.tact.eshop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/** Class for Product POJO of eShop project. */
@Entity
@Table(name="shop_product")
public class Product extends EntityBase {

    /** Name of Product. */
    @Column(nullable=false, unique=true, length=25)
    private String name;

    /** Description of Product. */
    @Column(length=255)
    private String description = "Description of product";

    /** Quantity of Product. */
    @Column
    private Integer quantity = 0;

    /** End Of Life of Product. */
    @Column(name="eol")
    private Boolean endOfLife = false;

    /** Unit Price of Product. */
    @Column(precision=2)
    private Float price = 100000.0F;

    /** Hidden default constructor. */
    protected Product() {}

    /**
     * Constructor of Product.
     * @param name of Product.
     */
    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s", this.name);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Boolean getEndOfLife() {
		return endOfLife;
	}

	public void setEndOfLife(Boolean endOfLife) {
		this.endOfLife = endOfLife;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
    

}

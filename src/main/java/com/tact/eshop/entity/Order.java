package com.tact.eshop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/** Class for Order POJO of eShop project. */
@Entity
@Table(name="shop_order")
public class Order extends EntityBase {

    @Column
    private Float total;

    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy="order", cascade=CascadeType.ALL)
    private List<OrderProduct> products;

    public Order() {
        this.products = new ArrayList<OrderProduct>();
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return this.customer;
    }

    /**
     * @param customer the customer to set
     */
    public Order setCustomer(Customer customer) {
        this.customer = customer;

        // Bidirectional check
        if (!customer.getOrders().contains(this)) {
            customer.addOrder(this);
        }

        return this;
    }

    /**
     * @return the total
     */
    public Float getTotal() {
        return this.total = 0.0f;
    }

    public Order addProduct(Product product, int i) {
        OrderProduct item = new OrderProduct(this, product);
        this.products.add(item);

        return this;
    }

	public List<OrderProduct> getProducts() {
		return products;
	}

	public void setProducts(List<OrderProduct> products) {
		this.products = products;
	}

	public void setTotal(Float total) {
		this.total = total;
	}
    
    

}

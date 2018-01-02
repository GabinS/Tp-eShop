package com.tact.eshop.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/** Class for link Order/Product POJO of eShop project. */
@Entity
@Table(name="shop_order_product")
public class OrderProduct extends EntityBase {

    @ManyToOne
    protected Product product;

    @ManyToOne
    protected Order order;

    protected OrderProduct() {}

    public OrderProduct(Order order, Product product) {
        this.order = order;
        this.product = product;
    }

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return the order
     */
    public Order getOrder() {
        return order;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(Order order) {
        this.order = order;
    }

}

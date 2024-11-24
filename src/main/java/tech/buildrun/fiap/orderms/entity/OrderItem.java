package tech.buildrun.fiap.orderms.entity;

import java.math.BigDecimal;

public class OrderItem {

    private String product;
    private Integer quantity;
    private BigDecimal price;

    public OrderItem() {
    }

    public String getProduct() {
        return product;
    }

    public OrderItem setProduct(String product) {
        this.product = product;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public OrderItem setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public OrderItem setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
}

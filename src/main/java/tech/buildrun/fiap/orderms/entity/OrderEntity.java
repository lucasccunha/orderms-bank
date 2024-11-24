package tech.buildrun.fiap.orderms.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;
import java.util.List;

@Document(collection = "tb_orders")
public class OrderEntity {

    @MongoId
    private Long orderId;

    private Long customerId;

    private BigDecimal total;

    private List<OrderItem> items;

    public OrderEntity() {
    }

    public Long getOrderId() {
        return orderId;
    }

    public OrderEntity setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public OrderEntity setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public OrderEntity setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public OrderEntity setItems(List<OrderItem> items) {
        this.items = items;
        return this;
    }
}

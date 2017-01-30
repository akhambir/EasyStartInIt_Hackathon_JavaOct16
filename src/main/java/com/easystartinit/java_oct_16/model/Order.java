package com.easystartinit.java_oct_16.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", nullable = false, unique = true)
    private Long order_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "username")
    private User user;

    @Column(name = "order_date", nullable = false)
    private Date date;

    @Column(name = "total_price", nullable = false)
    private Double totalPrice;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "bucket_history", joinColumns = {
            @JoinColumn(name = "order_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "id", nullable = false, updatable = false)})
    private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public User getUser_id() {
        return user;
    }

    public void setUser_id(User user_id) {
        this.user = user_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

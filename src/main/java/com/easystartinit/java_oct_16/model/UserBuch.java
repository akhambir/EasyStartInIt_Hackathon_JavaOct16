package com.easystartinit.java_oct_16.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class UserBuch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "butch")
    private Long butch;

    @Column(name = "user")
    private String name;

    @Column(name = "product")
    private Long product;

    public Long getButch() {
        return butch;
    }

    public void setButch(Long butch) {
        this.butch = butch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getProduct() {
        return product;
    }

    public void setProduct(Long product) {
        this.product = product;
    }
}

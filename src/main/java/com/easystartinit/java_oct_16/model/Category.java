package com.easystartinit.java_oct_16.model;

import java.util.HashSet;
import java.util.Set;

public class Category {

    private Long id;
    private String name;
    private String description;
    private Set<Product> products = new HashSet<Product>(0);

}

package com.geekbrains.bootstrap.Products.model;

public class Product {
    private Long id;
    private String title;
    private int cost;

    public Product(final Long id,final String title,final int cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("id - %d | title - %s | cost - %d у.е", id, title, cost);
    }
}

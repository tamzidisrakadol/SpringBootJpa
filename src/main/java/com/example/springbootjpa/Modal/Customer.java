package com.example.springbootjpa.Modal;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CustomerId")
    int id;
    @Column(name = "CustomerName")
    String name;
    @Column(name = "CustomerLocation")
    String location;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    Cart cart;

    public Customer() {
    }

    public Customer(int id, String name, String location, Cart cart) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.cart = cart;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}

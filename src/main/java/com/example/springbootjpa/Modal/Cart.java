package com.example.springbootjpa.Modal;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "CustomerCart")
public class Cart {

    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "customer_cart_amount")
    int cartAmount;

    @OneToOne(mappedBy = "cart")
    @JsonBackReference
    Customer customer;

    public Cart() {
    }

    public Cart(int id, int cartAmount, Customer customer) {
        this.id = id;
        this.cartAmount = cartAmount;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCartAmount() {
        return cartAmount;
    }

    public void setCartAmount(int cartAmount) {
        this.cartAmount = cartAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", cartAmount=" + cartAmount +
                ", customer=" + customer +
                '}';
    }
}

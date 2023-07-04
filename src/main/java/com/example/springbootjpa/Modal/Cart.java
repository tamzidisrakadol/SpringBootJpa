package com.example.springbootjpa.Modal;

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

    public Cart(int id, int cartAmount) {
        this.id = id;
        this.cartAmount = cartAmount;
    }

    public Cart() {
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


}

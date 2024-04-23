/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

/**
 *
 * @author user
 */
    
public class Order extends Cart{
    private int orderId =Math.abs((int)System.currentTimeMillis()) ;
    private float totalPrice = calculatePrice(getProducts()) ;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        if (orderId>=0) {
            this.orderId = orderId;
        }
        else {
            this.orderId =Math.abs(orderId);
        }
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        if (totalPrice>=0) {
            this.totalPrice = totalPrice;
        }
        else {
            this.totalPrice =Math.abs(totalPrice);
        }
    }
    public void printOrderInfo(){
        System.out.println("Order ID : "+getOrderId());
        placeOrder();

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

/**
 *
 * @author user
 */
    
import javax.swing.*;
public class Cart {
    protected int customerId ;
    protected int nProducts=0 ;
    protected int n ;



    protected Product[] products =new Product[n];

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        if (customerId>=0) {
            this.customerId = customerId;
        }
        else {
            this.customerId = Math.abs(customerId);
        }
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
        if (nProducts>=0) {
            this.nProducts = nProducts;
        }
        else {
            this.nProducts = Math.abs(nProducts);
        }
    }
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int addProduct(Product product){
        if(nProducts< products.length){
            products[nProducts]= product ;
            System.out.println("Product is add to the cart");
            return nProducts++;
        }
        else {
          System.out.println("Can't add the product , because the cart is full ");
            return nProducts ;
        }
    }

    public void removeProduct(Product product){
        for (int i=0 ;i<nProducts ; i++){
            if(product == products[i])
                continue;
            products[i+1]=products[i];
            break;
        }
    }
    public float calculatePrice(Product[] products){
        float sum =0 ;
        for (int i=0 ; i<nProducts ; i++){
            if ( products != null) {
                sum += products[i].getPrice();
            }
        }
        return sum ;
    }
    public void placeOrder(){
        if (nProducts ==0){
           System.out.println("Can't place order ,because  th cart is empty");
        }
        System.out.println("Order ID : "+1+"\n"
            +"Customer ID : "+getCustomerId());
        for (int i=0 ; i<n ; i++) {
           System.out.println("Product ID : "+products[i].getProductId()+"\n"
                +"Product Name : "+products[i].getName()+"\n"
                    +"Product Price : "+products[i].getPrice()+"\n"
                     +"Total Pricce : "+calculatePrice(products)+"\n\n");
        }

    }
}

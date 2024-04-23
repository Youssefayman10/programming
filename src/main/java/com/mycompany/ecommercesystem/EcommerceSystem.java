/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecommercesystem;

/**
 *
 * @author user
 */
import java.util.Scanner;
import javax.swing.*;

public class EcommerceSystem {
    public static void main(String[] args) {
        ElectronicProduct smartPhone = new ElectronicProduct(1,"Smart Phone",599.9f,"Samsung",1);
        ClothingProduct T_shirt = new ClothingProduct(2,"T_shirt",19.99f,"Medium","Cotton");
        BookProduct oop = new BookProduct(3,"OOP",39.99f,"O'Reilly","X Pubication");
        Customer c1 = new Customer();
        Cart cart1 =new Cart();
        Order o1 =new Order();

        System.out.println("Welcome to thte E_Commerce System !");
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Your ID : ");
        int id = input.nextInt();
        c1.setCustomerId(id);


        System.out.println("Please Enter Your Name : ");
        String name = input.next();
        c1.setName(name);

        System.out.println("Please Enter Your address : ");
        String address = input.next();
        c1.setAddress(address);

        System.out.println("How many products you want to add to your cart ? ");
        int n = input.nextInt();
        cart1.setN(n);

        Product[] products = new Product[cart1.getN()];
        cart1.setProducts(products);

        for (int i=1 ; i<=cart1.getN(); i++) {
            System.out.println("Which product you want to add ? \n 1- Smart Phone   2- T_shirt   3- OPP");
            int x = input.nextInt();
            switch (x) {
                case 1:cart1.addProduct(smartPhone);
                break;
                case 2:cart1.addProduct(T_shirt);
                break;
                case 3:cart1.addProduct(oop);
                break;
            }
        }
        System.out.println("Your Total Price is "+cart1.calculatePrice(cart1.getProducts()));

        System.out.println("Would you want to place the order? \n 1- Yes  2- No");
        int m = input.nextInt();
        switch (m){
            case 1: cart1.placeOrder();
        }
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetpoo;

/**
 *
 * @author figo9
 */
public class Product {

    private final String name;
    private final int barCode;
    private final float price;
    private int stock;

    public Product(String name, int barCode, float price, int stock) {
        this.name = name;
        this.barCode = barCode;
        this.price = price;
        this.stock = stock;
    }
    
    public float getPrice() {
        return price;
    }

    public int getBarCode() {
        return barCode;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
 
}

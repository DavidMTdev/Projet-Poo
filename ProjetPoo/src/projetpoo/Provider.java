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
public class Provider{

    private final String name;
    private int stock;
    private final String product;
    private float price;


    public Provider(String name, int stock, String product, float price) {
        this.name = name;
        this.stock = stock;
        this.product = product;
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public String getProduct() {
        return product;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Le fournisseur " + name + " à dans c'est stock " + stock + " de " + product + " pour " + price;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetpoo;

import java.util.ArrayList;

/**
 *
 * @author figo9
 */
public class Client {

    private String firstName;
    private String lastName;
    private ArrayList<String> listBarCode = new ArrayList<>();
    private ArrayList<String> listStock = new ArrayList<>();

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public void addProduct(String product, String stock){
        listBarCode.add(product);
        listStock.add(stock);
    }

    public ArrayList<String> getListBarCode() {
        return listBarCode;
    }

    public ArrayList<String> getListStock() {
        return listStock;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName;
    }
    
    
}

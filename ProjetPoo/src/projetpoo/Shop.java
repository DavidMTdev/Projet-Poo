/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetpoo;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Product> listProduct = new ArrayList<>();

    public void show() {

        for (int i = 0; i < listProduct.size(); i++) {

            if (i == 0) {
                System.out.println("-----------------Liste des produit du magasin------------------");
            } else {
                System.out.println("---------------------------------------------------------------");

            }
            System.out.println(listProduct.get(i).getBarCode() + " "
                    + listProduct.get(i).getName() + " "
                    + listProduct.get(i).getStock() + " "
                    + listProduct.get(i).getPrice() + " ");
        }
    }

    public int checkStock(int i, int stock) {
        if (stock > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int addCode() {
        return listProduct.size();
    }

    public ArrayList<Product> getListProduct() {
        return listProduct;
    }

}

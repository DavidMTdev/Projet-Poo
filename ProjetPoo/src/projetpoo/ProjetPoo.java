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
public class ProjetPoo {

    public static Shop shop = new Shop();
    
    public static Provider microsoft = new Provider("microsoft", 5, "pc Asus", (float) 800.99);
    public static Provider apple = new Provider("apple", 8, "iphone", (float) 499.98);
    public static Provider mrPrope = new Provider("Mr Prope", 8, "Mr Prope", (float) 20.50);

    public static Client leib = new Client("Adrien", "Leib");
    public static Client teixeira = new Client("David", "Teixeira");

    public static void main(String[] args) {

        buy(microsoft, 4);
        buy(apple, 8);
        buy(microsoft, 4);
        buy(mrPrope, 4);

        apple.setStock(12);

        shop.show();

        System.out.println("\n");
        System.out.println("Mise à jour des produit du magasin");
        System.out.println("\n");

        buy(apple, 4);
        shop.show();

        System.out.println("\n");
        System.out.println("Mise à jour des produit du magasin");
        System.out.println("\n");

        leib.addProduct("0", "2");
        leib.addProduct("2", "5");
        teixeira.addProduct("1", "5");
        teixeira.addProduct("2", "1");

        sell(leib);
        
        shop.show();
        
        System.out.println("\n");
        System.out.println("Mise à jour des produit du magasin");
        System.out.println("\n");
        
        sell(teixeira);

        shop.show();

    }

    public static void buy(Provider provider, int stock) {
        provider.setStock(provider.getStock() - stock);
        float price = (float) (provider.getPrice() + 10.00);
        int result = 0;

        for (int i = 0; i < shop.getListProduct().size(); i++) {

            if (!(shop.getListProduct().get(i).getName() == null) && provider.getProduct().equals(shop.getListProduct().get(i).getName())) {
                shop.getListProduct().get(i).setStock(shop.getListProduct().get(i).getStock() + stock);
                result = 1;
                break;
            }
        }
        Product p = new Product(provider.getProduct(), shop.addCode(), price, stock);
        shop.getListProduct().add(p);

        if (result == 1) {
            shop.getListProduct().remove(shop.getListProduct().size() - 1);
        }

    }

    public static void sell(Client client) {
        System.out.println("**************************Client*****************************");
        System.out.println(client.toString() + " a acheté :");

        for (int i = 0; i < client.getListBarCode().size(); i++) {

            for (int j = 0; j < shop.getListProduct().size(); j++) {
                String strBarCode = String.valueOf(shop.getListProduct().get(j).getBarCode());

                if (strBarCode.equals(client.getListBarCode().get(i))) {
                    int intStock = Integer.parseInt(client.getListStock().get(i));
                    int result = shop.checkStock(i, shop.getListProduct().get(j).getStock() - intStock);

                    if (result == 1) {
                        shop.getListProduct().get(j).setStock(shop.getListProduct().get(j).getStock() - intStock);
                        System.out.println(client.getListStock().get(i) + " " + shop.getListProduct().get(j).getName() + " pour " + shop.getListProduct().get(j).getPrice());
                    } else {
                        System.out.println("Le magasin n'a pas assez de stock pour le produit " + shop.getListProduct().get(j).getName());
                    }
                }
            }
        }
        System.out.println("**************************Client*****************************");
    }
}

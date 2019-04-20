/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa2_;
import com.app.Data;
import com.app.ProductFactory;
import com.observer.Order;
import com.observer.Product;
import java.util.Scanner;

/**
 *
 * @author tmt
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("***** Welcome to POS *****\n");
        System.out.println("***** Please Chose one *****\n");
        System.out.println(" 1- SEARCH \n 2- MENU \n 3- ORDER \n 4- PRODUCTS INFO \n");

        Scanner in = new Scanner(System.in);
        String key = in.nextLine();

        switch (key) {
            case "1":
                // ahmed khaled task
                System.out.println("SEARCH By ID"); // search for products form stock
                search();
                break;
            case "2":
                System.out.println("MENU"); /// Present all from stock
                break;
            case "3":
                System.out.println("ORDER"); // Make order -> invoice
                MakeOrderTransaction();
                break;
            case "4":
                System.out.println("Product Info:");
                showProductsInfo();
                break;
            default:
                System.exit(0);
                break;
        }

    }

    static public void  search(){
        // instantiating Singleton class with variable x
        Data x = Data.getInstance();
        // instantiating Singleton class with variable y
        Data y = Data.getInstance();
        System.out.println("ID # ");
        Scanner in = new Scanner(System.in);
        String key = in.nextLine();

        // System.out.println(x.products.get(1001));
        // changing variable of instance x

        x.result = (x.products.getOrDefault(key,"out of stock")).toUpperCase();
        System.out.println("Search result from x is " + x.result);
        System.out.println("Search result from y is " + y.result);

        System.out.println("\n");
        // changing variable of instance z
        y.result = (y.result).toLowerCase();
        System.out.println("Search result from x is " + x.result);
        System.out.println("Search result from y is " + y.result);
    }

    static public void MakeOrderTransaction(){

        Order order =  new Order("201");

        Product Product0 = new Product("Apple iPhone 6 Plus, GSM Unlocked");
        Product Product1 =  new Product("Google Pixel 2 XL 128 GB, Black");
        Product Product2 =  new Product("Huawei Honor 8X (64GB + 4GB RAM) 6.5\" HD 4G LTE");
        Product Product3 =  new Product("Samsung Galaxy S1 Unlocked 64GB");

        System.out.println("select all item to cart ? ");
        Scanner in = new Scanner(System.in);
        String key = in.nextLine();
        if (key.equals("yes")) { // present all subscribers
            order.add(Product0);
            order.add(Product1);
            order.add(Product2);
            order.add(Product3);
            order.setAvailability(true);
        }
        else  {
            // set time out
            order.add(Product0);
            order.add(Product1);
            order.add(Product2);
            order.add(Product3);

            for (int i = 1; i < 8; i++ ) {
                boolean available =  i % 2  == 0;
                order.setAvailability(available);
                if (i == 2) { // remove subscriber form List
                    order.remove(Product2);
                }
                try {
                    Thread.sleep(2000);
                }catch (InterruptedException e) {}
                System.out.println("----------------");
            }
        }

    }

    static public void showProductsInfo(){
        System.out.println("Please Choose One Option:");
        System.out.println(" 1- Mobiles \n 2- Laptops \n 3- Accessories \n");
        com.app.Product productObject;
        Scanner in = new Scanner(System.in);
        String key = in.nextLine();
        switch(key){
            case "1":
                productObject = ProductFactory.ProductGenerator("Mobile");
                productPrintingFormat(productObject);
                break;
            case "2":
                productObject = ProductFactory.ProductGenerator("Laptop");
                productPrintingFormat(productObject);
                break;
            case "3":
                productObject = ProductFactory.ProductGenerator("accessories");
                productPrintingFormat(productObject);
                break;
        }
    }

    static public void productPrintingFormat(com.app.Product staffObject){
        System.out.println(
                staffObject.getCurrentObjectName()    + " - " +
                        staffObject.getCurrentObjectPrice()   + " - "  +
                        staffObject.getCurrentObjectQuantity()+ "."
        );
    }

}

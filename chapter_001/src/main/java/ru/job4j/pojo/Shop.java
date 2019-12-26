package ru.job4j.pojo;
public class Shop {
    public static void main(String[] args) {
        Product products[] = new Product[5];
        products[0] = new Product("Milk", 10);
        products[2] = new Product("Bread", 4);
        products[3] = new Product("Egg", 19);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product == null) {
                    products[index] = products[0];
                    products[0] = null;
                for (index = 0; index < products.length - 1; index++) {
                    products[index] = products[index + 1];
                }
            }
        }
        System.out.println("changed list");
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}






package p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product implements Comparable<Product> {
    int id;
    String name;
    double price;

    public Product() {
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (obj instanceof Product) {
            Product p = (Product) obj;
            return this.id == p.id;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.id - o.id;
    }
}

public class Program {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(5, "Pen", 20)); //0
        productList.add(new Product(3, "Pencil", 10));//1
        productList.add(new Product(2, "Book", 50));//2
        productList.add(new Product(1, "Eraser", 8));//3
        productList.add(new Product(4, "Ruler", 12));//4

        System.out.println("Before Sorting - ");
        for (Product e : productList)
            System.out.println(e);

        // Natural Ordering
        Collections.sort(productList);
        System.out.println("After Sorting on pid- ");
        for (Product e : productList)
            System.out.println(e);

        // Sorting on product names
        class ProductNameComparator implements Comparator<Product> {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.name.compareTo(p2.name);
            }
        }
        Collections.sort(productList, new ProductNameComparator());
        System.out.println("After Sorting on product name- ");
        for (Product e : productList)
            System.out.println(e);

        // Sorting on product prices in desc
        class ProductPriceComparator implements Comparator<Product> {
            @Override
            public int compare(Product p1, Product p2) {
                return -Double.compare(p1.price, p2.price);
            }
        }
        productList.sort(new ProductPriceComparator());
        System.out.println("After Sorting on product price in desc- ");
        for (Product e : productList)
            System.out.println(e);
    }
}

package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Product {
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
}

public class Program04 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(5, "Pen", 20)); //0
        productList.add(new Product(3, "Pencil", 10));//1
        productList.add(new Product(2, "Book", 50));//2
        productList.add(new Product(1, "Eraser", 8));//3
        productList.add(new Product(4, "Ruler", 12));//4

        System.out.println("Product at index 2 - " + productList.get(2));

        Product p = new Product();
        p.id = 1;
        System.out.println("Index of product with pid:1 = " + productList.indexOf(p));

        for (Product e : productList)
            System.out.println(e);
    }
}

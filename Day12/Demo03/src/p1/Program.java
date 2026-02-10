package p1;

import java.util.ArrayList;
import java.util.Collection;

class Product {
    int pid;
    String name;
    double price;

    public Product() {
    }

    public Product(int pid, String name, double price) {
        this.pid = pid;
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
            return this.pid == p.pid;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class Program {
    public static void main(String[] args) {
        Collection<Product> products = new ArrayList<>();
        products.add(new Product(1, "Pen", 20));
        products.add(new Product(2, "Pencil", 10));
        products.add(new Product(3, "Book", 50));
        products.add(new Product(4, "Eraser", 8));
        products.add(new Product(5, "Ruler", 12));

        for (Product p : products)
            System.out.println(p);

        // is the collection contains a product with id - 3

        System.out.println("products contains product with id 3 - " + products.contains(3));

        Product p1 = new Product();
        p1.pid = 3;
        System.out.println("products contains product with id 3 - " + products.contains(p1));
        // p1.equals(e) ?? The state of an object are equal
        System.out.println("product with id 3 removed - " + products.remove(p1));

        System.out.println("Size of of products - " + products.size());


    }
}

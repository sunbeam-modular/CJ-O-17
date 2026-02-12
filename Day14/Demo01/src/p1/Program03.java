package p1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

class Product {
    int pid; // Identity of an object
    String name;
    double price;

    public Product() {
    }

    public Product(int pid, String name, double price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
    }

    // hashcode and eqauls
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return pid == product.pid;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(pid);
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

public class Program03 {
    public static void main(String[] args) {
        // Set<Product> products = new LinkedHashSet<>();
        Set<Product> products = new HashSet<>();
        products.add(new Product(4, "Pen", 20));
        products.add(new Product(2, "Pencil", 10));
        products.add(new Product(1, "Eraser", 8));
        products.add(new Product(3, "Book", 50));
        products.add(new Product(1, "Eraser", 8)); // duplicate

        System.out.println("No of products in the set - " + products.size());

        for (Product p : products)
            System.out.println(p + ", " + p.hashCode());
    }
}

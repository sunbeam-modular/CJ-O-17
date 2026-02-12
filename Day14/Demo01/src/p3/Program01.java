package p3;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

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

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class Program01 {
    public static void main(String[] args) {
        class ProductIdComparator implements Comparator<Product> {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.pid - o2.pid;
            }
        }

        Set<Product> products = new TreeSet<>(new ProductIdComparator());
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

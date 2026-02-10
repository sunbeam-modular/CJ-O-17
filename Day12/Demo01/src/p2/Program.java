package p2;

import java.util.Arrays;

// Natural Ordering of the elements
class Product implements Comparable<Product> {
    int pid;
    String name;
    double price;

    Product() {
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

    @Override
    public int compareTo(Product o) {
        int res = this.name.compareTo(o.name);
        return res;
    }
}

public class Program {
    public static void displayProducts(Product[] arr) {
        for (Product p : arr)
            System.out.println(p);
    }

    public static void main(String[] args) {
        Product arr[] = {
                new Product(5, "Pen", 100),
                new Product(1, "Pencil", 20),
                new Product(3, "Book", 150),
                new Product(2, "Eraser", 5),
                new Product(4, "Ruler", 15),
        };

        System.out.println("Before Sorting -> ");
        displayProducts(arr);

        System.out.println("After sorting on name-> ");
        Arrays.sort(arr);
        displayProducts(arr);
    }

}
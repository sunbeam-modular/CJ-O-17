package p4;

import java.util.Arrays;
import java.util.Comparator;

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
        return this.pid - o.pid;
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

        System.out.println("After sorting on Natural Ordering(pid)-> ");
        Arrays.sort(arr);
        displayProducts(arr);

        System.out.println("After sorting on name in ascending-> ");
        class NameComparator implements Comparator<Product> {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.name.compareTo(o2.name);
            }
        }
        NameComparator nameComparator = new NameComparator();
        Arrays.sort(arr, nameComparator);
        displayProducts(arr);

        System.out.println("After sorting on price in descending order-> ");
        class PriceComparator implements Comparator<Product> {
            @Override
            public int compare(Product o1, Product o2) {
                return -Double.compare(o1.price, o2.price);
            }
        }
        PriceComparator priceComparator = new PriceComparator();
        Arrays.sort(arr, priceComparator);
        displayProducts(arr);
    }

}
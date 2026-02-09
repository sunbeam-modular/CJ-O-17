package p1;

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
    public int compareTo(Product o) { // this = p1, o = p2
        if (this.price > o.price)
            return 2;
        else if (this.price < o.price)
            return -5;
        return 0;
    }
}

public class Program {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Pen", 20);
        Product p2 = new Product(2, "Pencil", 100);
        int result = p1.compareTo(p2);
        if (result > 0)
            System.out.println("product 1 is expensive");
        else if (result < 0)
            System.out.println("product 2 is expensive");
        else
            System.out.println("Both cost same");
    }
}

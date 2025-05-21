import java.util.Vector;

class Product {
    String name;
    float price;
    String category;

    Product(String name, String cateory, float price) {
        this.category = cateory;
        this.name = name;
        this.price = price;
    }
}

public class OnlineShopping {
    Vector<Product> items;

    OnlineShopping() {
        items = new Vector<Product>();
    }

    public void add(String name, String category, float price) {
        Product pro = new Product(name, category, price);
        items.add(pro);
    }

    public void remove(String name) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).name.equalsIgnoreCase(name)) {
                items.remove(i);
                break;
            }
        }
    }

    public void display() {
        for (Product pro : items) {
            System.out.println("Name: " + pro.name);
            System.out.println("Category: " + pro.category);
            System.out.println("Price: " + pro.price);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        OnlineShopping o = new OnlineShopping();

        o.add("Laptop", "Electronics", 200000);
        o.add("TV", "Electronics", 50000);

        o.display();

        o.remove("TV");

        o.display();
    }
}
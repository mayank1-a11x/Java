import java.util.ArrayList;

class Pharmacy {
    int id;
    String name;
    int quantity;
    float price;

    Pharmacy(String name, int quantity, int id, float price) {
        this.name = name;
        this.quantity = quantity;
        this.id = id;
        this.price = price;
    }
}

public class PharmacyManagement {
    ArrayList<Pharmacy> items;

    PharmacyManagement() {
        items = new ArrayList<Pharmacy>();
    }

    public void add(Pharmacy item) {
        items.add(item);
    }

    public void update(int id, int quantity, float price) {
        for (Pharmacy item : items) {
            if (item.id == id) {
                item.quantity = quantity;
                item.price = price;
                break;
            }
        }
    }

    public void remove(int id) {
        items.removeIf(item -> item.id == id);
    }

    public Pharmacy getById(int id) {
        for (Pharmacy item : items) {
            if (item.id == id) {
                return item;
            }
        }

        return null;
    }

    public void display() {
        for (Pharmacy item : items) {
            System.out.println("ID: " + item.id);
            System.out.println("Name: " + item.name);
            System.out.println("Quantity: " + item.quantity);
            System.out.println("Price: " + item.price);
            System.out.println("----");
        }
    }

    public static void main(String[] args) {
        PharmacyManagement o = new PharmacyManagement();

        o.add(new Pharmacy("Crocin", 100, 1, 35));
        o.add(new Pharmacy("Calpol", 40, 2, 100));
        o.add(new Pharmacy("Paracetamol", 10, 3, 40));

        o.display();

        o.remove(1);

        System.out.println("After deleting");
        o.display();

        System.out.println("Getting id 2");
        Pharmacy found = o.getById(2);

        if (found != null) {
            System.out.println("Found: " + found.name);
        } else {
            System.out.println("Item not found");
        }
    }

}
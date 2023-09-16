import java.util.ArrayList;
import java.util.List;

public class Manager {
    private String managerId;
    private String name;
    private List<Cashier> hiredCashiers;

    public Manager(String managerId, String name) {
        this.managerId = managerId;
        this.name = name;
        this.hiredCashiers = new ArrayList<>();
    }

    // Getters for manager attributes
    public String getManagerId() {
        return managerId;
    }

    public String getName() {
        return name;
    }

    // Method for managers to add new products to the store
    public void addProduct(Product product, int quantity) {
        product.setQuantity(product.getQuantity() + quantity);
        System.out.println(name + " added " + quantity + " " + product.getName() + "(s) to the store.");
    }
    // Method for managers to hire cashiers
    public void hireCashier(String cashierId, String name) {
        Cashier newCashier = new Cashier(cashierId, name);
        hiredCashiers.add(newCashier);
        System.out.println(this.name + " hired a new cashier: " + name);
    }
}


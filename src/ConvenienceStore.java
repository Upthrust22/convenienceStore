// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ConvenienceStore {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product(1, "Chips", 50, 50);
        Product product2 = new Product(2, "Soda", 150, 200);
        Product product3 = new Product(3, "Candy", 30, 100);

        // Create a manager, cashier, and customer
        Manager manager = new Manager("M01", "Raphael");
        Cashier cashier = new Cashier("C01", "Binta");
        Customer customer = new Customer("Cust01", "Michael", 20.0);

        // Manager adds products to the store
        manager.hireCashier("C02", "Emmanuel");
        manager.addProduct(product1, 30);
        manager.addProduct(product2, 50);
        manager.addProduct(product3, 40);

        // Customer makes a purchase
        cashier.processPurchase(customer, product1, 5);
        cashier.processPurchase(customer, product2, 2);
        cashier.processPurchase(customer, product3, 10);

        // Display updated product information
        System.out.println("\nUpdated Product Information:");
        product1.displayProduct();
        product2.displayProduct();
        product3.displayProduct();
    }
}

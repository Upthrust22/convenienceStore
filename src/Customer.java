public class Customer {
    private String customerId;
    private String name;
    private double wallet;

    public Customer(String customerId, String name, double wallet) {
        this.customerId = customerId;
        this.name = name;
        this.wallet = wallet;
    }

    // Getters and setters for customer attributes
    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    // Method for customers to make a purchase
    public boolean purchaseProduct(Product product, int quantity) {
        if (product.getQuantity() >= quantity && wallet >= product.getPrice() * quantity) {
            product.setQuantity(product.getQuantity() - quantity);
            wallet -= product.getPrice() * quantity;
            System.out.println(name + " purchased " + quantity + " " + product.getName() + "(s).");
            return true;
        } else {
            System.out.println("Insufficient quantity in stock or not enough funds.");
            return false;
        }
    }
}
public class Cashier {
        private String cashierId;
        private String name;

        public Cashier(String cashierId, String name) {
            this.cashierId = cashierId;
            this.name = name;
        }

        // Getters for cashier attributes
        public String getCashierId() {
            return cashierId;
        }

        public String getName() {
            return name;
        }

        // Method for cashiers to process customer purchases
        public void processPurchase(Customer customer, Product product, int quantity) {
            if (customer.purchaseProduct(product, quantity)) {
                double totalPrice = product.getPrice() * quantity;
                System.out.println(name + " processed the purchase for " + customer.getName() +
                        " - Total: $" + totalPrice);
            } else {
                System.out.println("Unable to process the purchase for " + customer.getName());
            }
        }
    }
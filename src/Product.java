public class Product {
        private int productId;
        private String name;
        private double price;
        private int quantity;

        public Product(int productId, String name, double price, int quantity) {
            this.productId = productId;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        // Getters and setters for product attributes
        public int getProductId() {
            return productId;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        // Method to display product information
        public void displayProduct() {
            System.out.println("Product ID: " + productId);
            System.out.println("Name: " + name);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
        }
    }
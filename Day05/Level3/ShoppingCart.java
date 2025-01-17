class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize the item name, price, and quantity
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter method for item name
    public String getItemName() {
        return itemName;
    }

    // Getter method for price
    public double getPrice() {
        return price;
    }

    // Getter method for quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter method for quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to calculate the total cost of the item
    public double getTotalCost() {
        return price * quantity;
    }

    // Override the toString method to provide a string representation of the item
    @Override
    public String toString() {
        return itemName + " - Price: $" + price + ", Quantity: " + quantity;
    }
}

// ShoppingCart.java
class ShoppingCart{
    private CartItem[] cartItems;
    private int itemCount;

    // Constructor to initialize the cart with a given capacity
    public ShoppingCart(int capacity) {
        cartItems = new CartItem[capacity];
        itemCount = 0;
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        // Check if the item already exists in the cart
        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i].getItemName().equalsIgnoreCase(itemName)) {
                // Update the quantity if the item exists
                cartItems[i].setQuantity(cartItems[i].getQuantity() + quantity);
                System.out.println("Updated quantity for " + itemName);
                return;
            }
        }

        // Add the item to the cart if it doesn't exist and there is space
        if (itemCount < cartItems.length) {
            cartItems[itemCount++] = new CartItem(itemName, price, quantity);
            System.out.println("Added " + itemName + " to the cart.");
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i].getItemName().equalsIgnoreCase(itemName)) {
                // Shift the items to fill the gap
                for (int j = i; j < itemCount - 1; j++) {
                    cartItems[j] = cartItems[j + 1];
                }
                cartItems[--itemCount] = null;
                System.out.println("Removed " + itemName + " from the cart.");
                return;
            }
        }
        System.out.println(itemName + " not found in the cart.");
    }

    // Method to display the total cost of items in the cart
    public void displayTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            totalCost += cartItems[i].getTotalCost();
        }
        System.out.println("Total cost: " + totalCost);
    }

    // Method to display all items in the cart
    public void displayCartItems() {
        if (itemCount == 0) {
            System.out.println("The cart is empty.");
            return;
        }
        System.out.println("Items in the cart:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(cartItems[i]);
        }
    }

    // Main method to test the ShoppingCart class
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(5);

        // Add items to the cart
        cart.addItem("Apple", 1.99, 3);
        cart.addItem("Banana", 0.99, 5);
        cart.displayCartItems();
        cart.displayTotalCost();

        // Update the quantity of an existing item
        cart.addItem("Apple", 1.99, 2);
        cart.displayCartItems();
        cart.displayTotalCost();

        // Remove an item from the cart
        cart.removeItem("Banana");
        cart.displayCartItems();
        cart.displayTotalCost();

        // Attempt to remove an item that is not in the cart
        cart.removeItem("Orange");
    }
}

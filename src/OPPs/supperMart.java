package OPPs;

public class supperMart {
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    public supperMart(int productId, String productName, double price, int quantity){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public supperMart(int productId, String productName){
        this. productId = 1;
        this.productName = "1";
    }

    public void updateQuantity(int quantity){
        this.quantity = quantity;
    }

    public void updateQuantity(int quantity, boolean add){
        if (add){
            this. quantity += quantity;
        }else {
            this.quantity = quantity;
        }
    }

    public void addStock(int qty){
        this.quantity = qty;
    }

    public void removeStock(int qty){
        if (qty <= quantity){
            this.quantity -= qty;
        }else {
            System.out.println("Insufficent stock to remove"+qty+"unit.");
        }
    }

    private int getDiscountPercentage() {
        if (quantity >= 6) return 15;
        else if (quantity >= 3) return 10;
        else return 5;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public double getDiscountAmount() {
        return getTotalCost() * getDiscountPercentage() / 100.0;
    }

    public double getFinalPrice() {
        return getTotalCost() - getDiscountAmount();
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printProductDetails() {
        System.out.println("Product ID     : " + productId);
        System.out.println("Product Name   : " + productName);
        System.out.println("Price per Unit : " + price);
        System.out.println("Quantity       : " + quantity);
        System.out.println("Discount      : " + getDiscountPercentage() + "%");
        System.out.println("Discount Amount: " + getDiscountAmount());
        System.out.println("Final Price    : " + getFinalPrice());

    }

    public static void main(String[] args) {
        supperMart p1 = new supperMart(101, "Saree", 800.0, 5);
        supperMart p2 = new supperMart(102, "Necklace");
        p2.setPrice(1200.0);
        p2.updateQuantity(7);

        p1.addStock(1);
        p1.removeStock(2);

        p2.addStock(2);
        p2.removeStock(1);

        p1.printProductDetails();
        p2.printProductDetails();
    }

}

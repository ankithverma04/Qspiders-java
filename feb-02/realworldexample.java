public class ShoppingCart {

    public static void main(String[] args) {

        int itemPrice = 500;
        int quantity = 3;

        int total = itemPrice * quantity;

        boolean eligibleForDiscount = total > 1000;

        if (eligibleForDiscount && quantity >= 2) {
            int discount = total * 10 / 100;
            total -= discount;
            System.out.println("Discount applied: " + discount);
        }

        System.out.println("Final Amount to Pay: " + total);
    }
}

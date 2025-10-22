public class ProductMain {
    public static void main(String[] args) {
        Product p = new Product("Laptop", 1200, 2);
        System.out.println(p);
        System.out.println("Total price: " + p.getTotalPrice());
        System.out.println("After 10% discount: " + p.getDiscountedPrice(10));
    }
}

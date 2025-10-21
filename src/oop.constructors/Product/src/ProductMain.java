public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setName("Notebook");
        p1.setPrice(12.5);
        p1.setQuantity(100);

        Product p2 = new Product("Pen", 1.2, 500);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}

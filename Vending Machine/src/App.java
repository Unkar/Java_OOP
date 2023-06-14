import Products.Product;
public class App {
    public static void main(String[] args) {
        Product product = new Product("Молоко", 0.5);
        System.out.println(product);
        product.setName("Молоко1");
        System.out.println(product);
        product.setPrice(1);
        System.out.println(product);
        System.out.println(product.getName());
        System.out.println(product.getPrice());
    }
}

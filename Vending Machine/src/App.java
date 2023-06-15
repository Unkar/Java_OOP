import Products.BottleOfWater;
import Products.Product;
import VendingMachines.VendingMachine;
public class App {
    public static void main(String[] args) throws Exception {
    VendingMachine vendingMachine = new VendingMachine();
    vendingMachine.setVolume(300);

    Product item1 = new Product("item1", 100);
    Product item2 = new Product("item2", 200);
    Product item3 = new Product("item3", 300);
    vendingMachine.addProduct(item1);
    vendingMachine.addProduct(item2);
    vendingMachine.addProduct(item3);

    vendingMachine.addProduct(new BottleOfWater("water", 50, 0.5));
        System.out.println(vendingMachine.getList().toString() );
    }
}

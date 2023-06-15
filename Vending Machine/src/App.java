import Products.BottleOfWater;
import Products.HotDrink;
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
        vendingMachine.addProduct(new HotDrink("coffee", 100, 0.2, 92));
        vendingMachine.addProduct(new HotDrink("tea", 100, 0.2, 92));
        HotDrink hotDrink1 = new HotDrink("green tea", 100, 0.2, 92);
        System.out.printf("Список продуктов в торговой машине %s\n",vendingMachine.getList().toString());
        System.out.printf("горячий зелёный чай %s\n", hotDrink1);
        hotDrink1.setTemperature(90);
        System.out.printf("горячий зелёный чай после смены температуры %s\n", hotDrink1);
        hotDrink1.setVolume(0.5);
        System.out.printf("горячий зелёный чай после смены объема %s\n", hotDrink1);
        hotDrink1.setPrice(101);
        System.out.printf("горячий зелёный чай после смены цены %s\n", hotDrink1);

    }
}

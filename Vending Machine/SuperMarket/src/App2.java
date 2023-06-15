import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;

public class App2 {
    public static void main(String[] args) {
        Market market = new Market();
        OrdinaryClient client1 = new OrdinaryClient("Boris");
        OrdinaryClient client2 = new OrdinaryClient("Ivan");
        market.acceptToMarket(client1);
        market.acceptToMarket(client2);

        SpecialClient specialClient = new SpecialClient("Ivan", 1);
        market.acceptToMarket(specialClient);

    }
}
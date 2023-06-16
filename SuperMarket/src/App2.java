import Classes.ActionClient;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Interfaces.iActorBehaviour;

public class App2 {
    public static void main(String[] args) {
//        Market market = new Market();
//        OrdinaryClient client1 = new OrdinaryClient("Boris");
//        OrdinaryClient client2 = new OrdinaryClient("Ivan");
//        market.acceptToMarket(client1);
//        market.acceptToMarket(client2);
//
//        SpecialClient specialClient = new SpecialClient("Fedor", 1);
//        market.acceptToMarket(specialClient);
//        market.update();

        Market market = new Market();
        iActorBehaviour client1 = new OrdinaryClient("Boris");
        iActorBehaviour client2 = new OrdinaryClient("Ivan");
        iActorBehaviour specialClient = new SpecialClient("Fedor", 1);
        iActorBehaviour actionClient = new ActionClient("Mark", 1,1);
        client2.getActor().setReturnOrder(true);
        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(specialClient);
        market.acceptToMarket(actionClient);
        market.update();
    }
}
package Classes;

import Interfaces.iMarketBehaviours;
import Interfaces.iQueueBehaviour;

import java.util.ArrayList;
import java.util.List;

public class Market implements iMarketBehaviours, iQueueBehaviour {
    private List<Actor> queue;
    public Market() {
        List<Actor> queue = new ArrayList<Actor>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        this.queue.add(actor);
        System.out.println(actor.getName() + " accepted to market");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor: actors) {
            this.queue.remove(actor);
            System.out.println(actor.getName() + " released from market");
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Actor actor) {

    }

    @Override
    public void releaseFromQueue() {

    }

    @Override
    public void takeOrder() {

    }

    @Override
    public void giveOrder() {
        for(Actor actor: this.queue) {
            actor.takeOrder();
        }

    }
}

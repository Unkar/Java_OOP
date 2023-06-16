package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviours;
import Interfaces.iQueueBehaviour;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс маркет с имплементацией интерфейсов поведения маркета iMarketBehaviours и очереди iQueueBehaviour
 */
public class Market implements iMarketBehaviours, iQueueBehaviour {
    //private List<Actor> queue;
    /**
     * Список объектов очереди
     */
    private List<iActorBehaviour> queue;

    /**
     * Конструктор маркета, инициализирующий список объектов очереди
     */

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    /**
     * Запускает процесс покупки заказа
     * @param actor - клиент маркета
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " accepted to market");
        takeInQueue(actor);
    }

    /**
     * Удаляет из очереди всех клиентов согласно списку
     * @param actors - список клиентов на удаление из очереди
     */
    @Override
    public void releaseFromMarket(List<iActorBehaviour> actors) {
        for (iActorBehaviour actor : actors) {
            this.queue.remove(actor);
            System.out.println(actor.getActor().getName() + " released from market");
        }
    }

    /**
     * Синтетическая функция запускает процесс
     */
    @Override
    public void update() {
        takeOrder();
        takeReturnOrder();
        giveOrder();
        returnOrder();
        releaseFromQueue();
    }

    /**
     * @param actor - объект для добавления в очередь
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " added in queue");
    }

    @Override
    public void releaseFromQueue() {
        List<iActorBehaviour> releaseActors = new ArrayList<iActorBehaviour>();
        for (iActorBehaviour actor : this.queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor);
                System.out.println(actor.getActor().getName() + " released from queue");
            }
        }
        releaseFromMarket(releaseActors);
    }


    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : this.queue) {
            if (!actor.isMakeOrder() && !actor.isReturnOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " give order");

            }
        }
    }

    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : this.queue) {
            if (!actor.isTakeOrder()  && !actor.isReturnOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " took order");

            }
        }

    }

    /**
     * Получение заявки на возврат
     */
    @Override
    public void takeReturnOrder() {
        for (iActorBehaviour actor : this.queue) {
            if (!actor.isMakeOrder()  && actor.isReturnOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " give return order");

            }
        }
    }

    /**
     * Прием заказа в возврат
     */
    @Override
    public void returnOrder() {
        for (iActorBehaviour actor : this.queue) {
            if (!actor.isTakeOrder()  && actor.isReturnOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + "'s return order done");

            }
        }

    }
}

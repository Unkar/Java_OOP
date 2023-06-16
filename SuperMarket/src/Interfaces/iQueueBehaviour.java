package Interfaces;

//import Classes.Actor;

/**
 * Интерфейс поведения очереди
 */
public interface iQueueBehaviour {
    /**
     * Добавляет в очередь
     *
     * @param actor - объект для добавления в очередь
     */
    void takeInQueue(iActorBehaviour actor);

    /**
     * Очистка очереди
     */
    void releaseFromQueue();

     /**
     * Получение заказа
     */
    void takeOrder();

    /**
     * Выдача заказа
     */
    void giveOrder();

    /**
     * Получение заявки на возврат
     */
    void takeReturnOrder();

    /**
     * Прием заказа в возврат
     */
    void returnOrder();
}

package Interfaces;

import java.util.List;

/**
 * Интерфейс поведения маркета
 */
public interface iMarketBehaviours {
    /**
     * Добавляет в очередь
     *
     * @param actor - объект для добавления в очередь
     */
    void acceptToMarket(iActorBehaviour actor);

    /**
     * Удаляет из очереди всех клиентов согласно списку
     *
     * @param actors - список клиентов на удаление из очереди
     */
    void releaseFromMarket(List<iActorBehaviour> actors);

    /**
     * Синтетическая функция запускает процесс
     */
    void update();
}

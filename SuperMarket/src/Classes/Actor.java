package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Абстрактный класс клиента который реализует поведение клиента
 */
public abstract class Actor implements iActorBehaviour, iReturnOrder {
    /**
     * Имя клиента
     */
    protected String name;
    /**
     * Статус получения заказа
     */
    protected boolean isTakeOrder;
    /**
     * Статус создания заказа
     */
    protected boolean isMakeOrder;

    protected boolean isReturnOrder;

    /**
     * Конструктор клиента
     * @param name  имя клиента
     */
    public Actor(String name, boolean isReturnOrder) {
        this.name = name;
        this.isReturnOrder = isReturnOrder;
    }

    public Actor(String name) {
        this(name, false);
    }

    /**
     * Получение имени клиента
     * @return  имя клиента
     */
    public abstract String getName();


    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        this.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        this.isTakeOrder = pickUpOrder;
    }

    @Override
    public void setReturnOrder(boolean returnOrder) {
        this.isReturnOrder = returnOrder;
    }


    @Override
    public boolean isReturnOrder() {
        return isReturnOrder;
    }
}

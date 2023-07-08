package Controller;

/**
 * Интерфейс контроллера калькулятора
 */
public interface iCalcController {
    /**
     * Запуск сессии калькулятора
     */
    public void run();

    /**
     * Запуск цикла сессий калькулятора с запросом на продолжение
     */
    public void update();
}

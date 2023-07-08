package View;

public interface iView {
    /**
     * Запрос на ввод данных
     * @param message сообщение приглашения на ввод
     * @return введённое значение типа String
     */
    String prompt(String message);

    /**
     * Фиксированное текстовое сообщение
     * @return текстовое сообщение "Повторить вычисления?"
     */
    
    String continueCalculation();

    /**
     * Фиксированное текстовое сообщение
     * @return текстовое сообщение "Введите число: "
     */
    String createExpression();

    /**
     * Фиксированное текстовое сообщение
     * @return текстовое сообщение "Выберите операцию: + - * / = "
     */
    String selectOperation();

    /**
     * Фиксированное текстовое сообщение
     * @return текстовое сообщение "Введите следующий аргумент: "
     */
    String inputNextArg();

    /**
     * Фиксированное текстовое сообщение
     * @return текстовое сообщение "Текущий результат: "
     */
    String presentResult();

    /**
     * Фиксированное текстовое сообщение об ошибке
     */
    void errorCommand();

    /**
     * Служебный декоративный метод
     * @param message
     * @return
     */
    String insertion(String message);
}

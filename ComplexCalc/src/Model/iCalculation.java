package Model;

public interface iCalculation {
    /**
     * умножение
     * @param arg множитель
     */
    void multi(String arg);

    /**
     *  сумма
     * @param arg сумматор
     */
    void sum(String arg);

    /**
     * деление
     * @param arg делитель
     */
    void div(String arg);

    /**
     * результат вычисления
     * @return
     */
    String getResult();

    /**
     * вычитание
     * @param arg вычитатель
     */
    void subtract(String arg);
}

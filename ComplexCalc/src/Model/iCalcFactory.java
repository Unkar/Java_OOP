package Model;

/**
 * Интерфейс фабричного метода
 */
public interface iCalcFactory {

    /**
     * создание объекта
     * @param primaryArg
     */
    void create(String primaryArg);

    /**
     * умножение
     * @param arg умножитель в формате String
     */
    void multi(String arg);

    /**
     * суммирование
     * @param arg сумматор в формате String
     */
    void sum(String arg);

    /**
     * деление
     * @param arg делитель в формате String
     */
    void div(String arg);

    /**
     * результат
     * @return результат в формате String
     */
    String getResult();

    /**
     * вычитание
     * @param arg вычитаемое в формате String
     */
    void subtract(String arg);
}

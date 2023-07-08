package Model;

public interface iLogger {
    /**
     * Добавление логируемого действия в буффер
     * @param message логируемое действие
     */
    void update(String message);

    /**
     * запись буффера в файл
     */
    void writeToLogFile();
}

package Products;

/**
 * Hot Drink class
 */
public class HotDrink extends Product {

    private double volume;

    private double temperature;

    /**
     * Constructor Hot Drink Class
     * @param nameOfProduct имя продукта
     * @param priceOfProduct стоимость продукта
     * @param volumeOfProduct объем продукта
     * @param temperatureOfProduct температура продукта
     */
    public HotDrink(String nameOfProduct, double priceOfProduct, double volumeOfProduct, double temperatureOfProduct) {
        super(nameOfProduct, priceOfProduct);
        this.volume = volumeOfProduct;
        this.temperature = temperatureOfProduct;
    }

    /**
     * Конструктор быстрой загрузки без цены
     * @param nameOfProduct имя продукта
     * @param volumeOfProduct объем продукта
     * @param temperatureOfProduct температура продукта
     */
    public HotDrink(String nameOfProduct, double volumeOfProduct,double temperatureOfProduct) {
        super(nameOfProduct, 0);
        this.volume = volumeOfProduct;
        this.temperature = temperatureOfProduct;
    }

    /**
     * Метод возвращает объем горячего напитка
     * @return объем горячего напитка
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Устанавливает объем горячего напитка
     * @param volume объем горячего напитка
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Возвращает температуру горячего напитка
     * @return температура горячего напитка
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * Устанавливает температуру горячего напитка
     * @param temperature температура горячего напитка
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * Вывод на печать параметров горячего напитка
     * @return Название: цена(объем, температура)
     **/
    @Override
    public String toString() {
        return super.toString() + "(об." + volume+ "л., т." + temperature+ "°C)";
    }
}

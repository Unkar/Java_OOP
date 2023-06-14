package Products;

/**
 * Базовый класс продукта
 */
public class Product {
    /**
     * Имя продукта
     */
    private String name;
    /**
     * Цена продукта
     */
    private double price;

    /**
     * Конструктор
     * конструктор продукта 2 параметра
     *
     * @param nameOfProduct  имя продукта
     * @param priceOfProduct стоимость продукта
     */
    public Product(String nameOfProduct, double priceOfProduct) {
        if (priceOfProduct < 0) {
            throw new IllegalArgumentException("Цена не может быть отрицательной");
        }
        if (nameOfProduct == null) {
            throw new IllegalStateException("Название не может быть пустым");
        }
        this.name = nameOfProduct;
        this.price = priceOfProduct;
    }

    /**
     * Конструктор только с именем
     *
     * @param nameOfProduct имя продукта
     */
    public Product(String nameOfProduct) {
        this(nameOfProduct, 0);
    }

    /** Получаем имя продукта*/
    public String getName() {
        return name;
    }
    /** Получаем стоимость продукта*/
    public double getPrice() {
        return price;
    }
    /** Устанавливаем имя продукта*/
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Цена не может быть отрицательной");
        }
        this.price = price;
    }
    /** Устанавливаем имя продукта*/
    public void setName(String name) {
        this.name = name;
    }
    /** Перегрузка вывода строки*/
    @Override
    public String toString() {
        return name + ": " + price;
    }

}

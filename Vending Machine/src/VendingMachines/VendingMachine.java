package VendingMachines;
import Products.Product;
import java.util.ArrayList;
import java.util.List;

/**
 * Торговая машина
 */
public class VendingMachine {
    /**
     * Объем загрузки
     */
    private Integer volume;
    /**
     * Список продуктов
     */
    private List<Product> list;
    /**
     * Лог использования
     */
    private List<String> log;

    public VendingMachine(Integer volumeOfVendingMachine, List<Product> listOfProducts, List<String> logOfVendingMachine) {
        this.volume = volumeOfVendingMachine;
        this.list = listOfProducts;
        this.log = logOfVendingMachine;
    }

    public VendingMachine(Integer volumeOfVendingMachine) {
        this.volume = volumeOfVendingMachine;
        this.list = new ArrayList<>();
        this.log = new ArrayList<>();
    }

    public VendingMachine() {
        this(0);
    }

    public Integer getVolume() {
        return volume;
    }

    public List<Product> getList() {
        return list;
    }

    public List<String> getLog() {
        return log;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    public void setLog(List<String> log) {
        this.log = log;
    }

    public void addProduct(Product product) {
        list.add(product);
    }

    public void addSales(Product product) {
        log.add("\nПродажа:" + product.toString());
    }

    @Override
    public String toString() {
        return "\nVendingMachine" +
                "\nОбъем загрузки: " + volume +
                "\nНаименований загружено: " + list.size() +
                "\nЗаписей в логе: " + log.size();
    }
}

package Products;

public class BottleOfWater extends Product {

    private double volume;

    public BottleOfWater(String name, double price, double volume) {
        super(name, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + "(об." + volume+ "л.)";
    }
}

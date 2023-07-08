package Model;

public class RealCalculation implements iCalculation {
    Double value;
    public RealCalculation(String primaryArg) {
        this.value = Double.parseDouble(primaryArg);
    }


    @Override
    public void multi(String arg) {
        value *= Double.parseDouble(arg);
    }

    @Override
    public void sum(String arg) {
        value += Double.parseDouble(arg);
    }

    @Override
    public void div(String arg) {
        value /= Double.parseDouble(arg);
    }

    @Override
    public String getResult() {
        return value.toString();
    }

    @Override
    public void subtract(String arg) {
        value -= Double.parseDouble(arg);
    }

}

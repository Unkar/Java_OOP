package Model;

public class ComplexCalculation implements iCalculation {
    ComplexNumber value;
    public ComplexCalculation(String primaryArg) {
        this.value = new ComplexNumber(primaryArg);

    }

    @Override
    public void multi(String arg) {
        value = value.multi(new ComplexNumber(arg));

    }

    @Override
    public void sum(String arg) {
        value = value.sum(new ComplexNumber(arg));


    }

    @Override
    public void div(String arg) {
        value = value.div(new ComplexNumber(arg));

    }

    @Override
    public String getResult() {
        return value.toString();
    }

    @Override
    public void subtract(String arg) {
        value = value.subtract(new ComplexNumber(arg));
    }
}

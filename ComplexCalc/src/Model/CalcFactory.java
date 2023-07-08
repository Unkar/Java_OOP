package Model;

public class CalcFactory implements iCalcFactory {

    private final String type;

    private iCalculation calc;

    public CalcFactory(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return calc.toString();
    }

    @Override
    public void create(String primaryArg) {
        if (type.equals("COMPLEX")) {
            calc = new ComplexCalculation(primaryArg);
        }
        if (type.equals("REAL")) {
            calc = new RealCalculation(primaryArg);
        }
    }

    @Override
    public void multi(String arg) {
        calc.multi(arg);
    }

    @Override
    public void sum(String arg) {
        calc.sum(arg);

    }

    @Override
    public void div(String arg) {
        calc.div(arg);
    }

    @Override
    public String getResult() {
        return calc.getResult();
    }

    @Override
    public void subtract(String arg) {
        calc.subtract(arg);
    }


}

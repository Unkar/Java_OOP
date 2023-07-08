package Model;

public interface iCalcFactory {


    void create(String primaryArg);

    void multi(String arg);

    void sum(String arg);

    void div(String arg);

    String getResult();

    void subtract(String arg);
}

package View;

public interface iView {

    String prompt(String message);
    
    String continueCalculation();

    String createExpression();

    String selectOperation();

    String inputNextArg();

    String presentResult();

    void errorCommand();

    String insertion(String message);
}

import Controller.CalcController;
import Controller.iCalcController;
import Model.CalcFactory;
import Model.iCalcFactory;
import View.EngView;
import View.RusView;
import View.iView;

/*
Класс по паттерну Facade
 */
public class CalcApplication {
    private iCalcController controller;
    private iView view;
    private iCalcFactory model;

    /**
     * Класс по паттерну Facade
     * @param type - тип калькулятора, доступные типы "COMPLEX" и "REAL"
     * @param language - язык интерфейса, доступные языки "RUSSIAN" и "ENGLISH"
     */
    public void run(String type,String language) {
        iCalcController controller = null;
        iView view = null;
        iCalcFactory model = null;
        switch (language) {
            case "RUSSIAN" -> view = new RusView();
            case "ENGLISH" -> view = new EngView();
        }
        switch (type) {
            case "COMPLEX" -> {
                model = new CalcFactory("COMPLEX");
                controller = new CalcController(view, model);
            }
            case "REAL" -> {
                model = new CalcFactory("REAL");
                controller = new CalcController(view, model);
            }
        }
        assert controller != null;
        controller.update();

    }
}


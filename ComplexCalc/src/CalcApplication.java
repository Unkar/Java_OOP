import Controller.ComplexCalcController;
import Controller.RealCalcController;
import Controller.iCalcController;
import Model.ComplexCalcModel;
import Model.RealCalcModel;
import Model.iModel;
import View.EngView;
import View.RusView;
import View.iView;

/*
Класс по паттерну Facade
 */
public class CalcApplication {
    private iCalcController controller;
    private iView view;
    private iModel model;


    public void run(String type,String language) {
        iCalcController controller = null;
        iView view = null;
        iModel model = null;
        switch (language) {
            case "RUSSIAN" -> view = new RusView();
            case "ENGLISH" -> view = new EngView();
        }
        switch (type) {
            case "COMPLEX" -> {
                model = new ComplexCalcModel();
                controller = new ComplexCalcController(view, model);
            }
            case "REAL" -> {
                model = new RealCalcModel();
                controller = new RealCalcController(view, model);
            }
        }
        assert controller != null;
        controller.run();

    }
}


package Controller;

import Model.iCalcFactory;
import View.iView;

public class CalcController implements iCalcController {
    private iView view;
    private iCalcFactory model;

    public CalcController(iView view, iCalcFactory model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void run() {
        String primaryArg = view.prompt(view.createExpression());
        model.create(primaryArg);
        while (true) {
            String operation = view.prompt(view.insertion(model.getResult()) + view.selectOperation());
            if (operation.equals("*")) {
                String arg = view.prompt(view.inputNextArg());
                model.multi(arg);
                continue;
            }
            if (operation.equals("+")) {
                String arg = view.prompt(view.inputNextArg());
                model.sum(arg);
                continue;
            }
            if (operation.equals("/")) {
                String arg = view.prompt(view.inputNextArg());
                model.div(arg);
                continue;
            }
            if (operation.equals("-")) {
                String arg = view.prompt(view.inputNextArg());
                model.subtract(arg);
                continue;
            }
            if (operation.equals("=")) {
                String result = model.getResult();
                view.prompt(view.presentResult() + result);
                break;
            }
        }
    }

    @Override
    public boolean continueCalculation() {
        boolean continueCalculation = false;
        boolean rightCmd = false;
        while (!rightCmd) {
            String cmd = view.prompt(view.continueCalculation());
            switch (cmd.toUpperCase()) {
                case "Y" -> {
                    continueCalculation = true;
                    rightCmd = true;
                }
                case "N" -> {
                    continueCalculation = false;
                    rightCmd = true;
                }
                default -> {
                    view.errorCommand();
                    continueCalculation = false;
                    rightCmd = false;
                }
            }
        }
        return continueCalculation;
    }

    @Override
    public void update() {
        boolean continueCalculation = true;
        while (continueCalculation) {
            run();
            continueCalculation = continueCalculation();
        }

    }
}
package Controller;

import Model.LogModule;
import Model.iLogger;
import Model.iCalcFactory;
import View.iView;

public class CalcController implements iCalcController {
    private iView view;
    private iCalcFactory model;

    private final iLogger log =  new LogModule("calclog.txt");

    public CalcController(iView view, iCalcFactory model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void run() {
        String primaryArg = view.prompt(view.createExpression());
        model.create(primaryArg);
        log.update(primaryArg);
        while (true) {
            String operation = view.prompt(view.insertion(model.getResult()) + view.selectOperation());
            log.update(operation);
            if (operation.equals("*")) {
                String arg = view.prompt(view.inputNextArg());
                model.multi(arg);
                log.update(arg);
                continue;
            }
            if (operation.equals("+")) {
                String arg = view.prompt(view.inputNextArg());
                model.sum(arg);
                log.update(arg);
                continue;
            }
            if (operation.equals("/")) {
                String arg = view.prompt(view.inputNextArg());
                model.div(arg);
                log.update(arg);
                continue;
            }
            if (operation.equals("-")) {
                String arg = view.prompt(view.inputNextArg());
                model.subtract(arg);
                log.update(arg);
                continue;
            }
            if (operation.equals("=")) {
                String result = model.getResult();
                view.prompt(view.presentResult() + result);
                log.update(result);
                log.writeToLogFile();
                break;
            }
        }
    }


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
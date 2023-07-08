package Model;

/**
 * Класс комплексных чисел
 */
public class ComplexNumber {
    /**
     * вещественная часть комплексного числа
     */
    private Double real;
    /**
     * мнимая часть комплексного числа
     */
    private Double image;

    /**
     * Конструктор комплексного числа
     * @param real вещественная часть комплексного числа
     * @param image  мнимая часть комплексного числа
     */
    public ComplexNumber(Double real, Double image) {
        this.real = real;
        this.image = image;

    }

    /**
     * Конструктор комплексного числа через строку
     * @param primaryArg строковое представление комплексного числа
     */
    public ComplexNumber(String primaryArg) {
        ComplexNumber c = parseComplex(primaryArg);
        this.real = c.real;
        this.image = c.image;
    }

    /**
     * Представление комплексного числа в виде строки (вещественная часть, мнимая часть) в виде "1+2i"
     * @return строковое представление комплексного числа
     */
    @Override
    public String toString() {
        if (image == 0) {
            return real.toString();
        } else if (image > 0) {
            return real + "+" + image + "i";
        } else {
            return real + "" + image + "i";
        }
    }

    /**
     * Парсер комплексного числа из строкового представления
     * @param arg строковое представление комплексного числа
     * @return комплексное число класса ComplexNumber
     */
    public static ComplexNumber parseComplex(String arg) {
        arg = arg.replaceAll(" ", "");
        ComplexNumber parsed = null;
        if (arg.contains("+") || (arg.contains("-") && arg.lastIndexOf('-') > 0)) {
            String re = "";
            String im = "";
            arg = arg.replaceAll("i", "");
            arg = arg.replaceAll("I", "");
            if (arg.indexOf('+') > 0) {
                re = arg.substring(0, arg.indexOf('+'));
                im = arg.substring(arg.indexOf('+') + 1, arg.length());
                parsed = new ComplexNumber(Double.parseDouble(re), Double.parseDouble(im));
            } else if (arg.lastIndexOf('-') > 0) {
                re = arg.substring(0, arg.lastIndexOf('-'));
                im = arg.substring(arg.lastIndexOf('-') + 1, arg.length());
                parsed = new ComplexNumber(Double.parseDouble(re), -Double.parseDouble(im));
            }
        } else {
            // Pure imaginary number
            if (arg.endsWith("i") || arg.endsWith("I")) {
                arg = arg.replaceAll("i", "");
                arg = arg.replaceAll("I", "");
                parsed = new ComplexNumber((double) 0, Double.parseDouble(arg));
            }
            // Pure real number
            else {
                parsed = new ComplexNumber(Double.parseDouble(arg), (double) 0);
            }
        }
        return parsed;
    }

    /**
     * Умножение комплексного числа вида z1*z2 -> z1.multi(z2)
     * @param arg комплексное число типа СomplexNumber
     * @return  комплексное число типа СomplexNumber
     */
    public ComplexNumber multi(ComplexNumber arg) {
        Double real = this.real * arg.real - this.image * arg.image;
        Double image = this.real * arg.image + this.image * arg.real;
        return new ComplexNumber(real, image);
    }

    /**
     * суммирование комплексного числа вида z1+z2 -> z1.sum(z2)
     * @param arg комплексное число типа СomplexNumber
     * @return   комплексное число типа СomplexNumber
     */
    public ComplexNumber sum(ComplexNumber arg) {
        Double real = this.real + arg.real;
        Double image = this.image + arg.image;
        return new ComplexNumber(real, image);
    }

    /**
     * Деление комплексного числа вида z1/z2 -> z1.div(z2)
     * @param arg комплексное число типа СomplexNumber
     * @return   комплексное число типа СomplexNumber
     */
    public ComplexNumber div(ComplexNumber arg) {
        ComplexNumber output = this.multi(arg.conjugate());
        double div = Math.pow(arg.mod(), 2);
        return new ComplexNumber(output.real / div, output.image / div);
    }

    /**
     * Модуль комплексного числа
     * @return модуль комплексного числа типа Double
     */
    private double mod() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(image, 2));
    }

    /**
     * конъюнкция комплексного числа
     * @return конъюнкция комплексного числа типа ComplexNumber
     */
    public ComplexNumber conjugate() {
        return new ComplexNumber(this.real, -this.image);
    }

    /**
     * вычитание комплексного числа z1-z2 -> z1.subtract(z2)
     * @param arg комплексное число типа ComplexNumber
     * @return комплексное число типа ComplexNumber
     */
    public ComplexNumber subtract(ComplexNumber arg) {
        Double real = this.real - arg.real;
        Double image = this.image - arg.image;
        return new ComplexNumber(real, image);
    }
}

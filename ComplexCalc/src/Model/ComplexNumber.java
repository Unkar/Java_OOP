package Model;


public class ComplexNumber {
    private Double real;
    private Double image;

    public ComplexNumber(Double real, Double image) {
        this.real = real;
        this.image = image;

    }

    public ComplexNumber(String primaryArg) {
        ComplexNumber c = parseComplex(primaryArg);
        this.real = c.real;
        this.image = c.image;
    }

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

    public static ComplexNumber parseComplex(String s) {
        s = s.replaceAll(" ", "");
        ComplexNumber parsed = null;
        if (s.contains("+") || (s.contains("-") && s.lastIndexOf('-') > 0)) {
            String re = "";
            String im = "";
            s = s.replaceAll("i", "");
            s = s.replaceAll("I", "");
            if (s.indexOf('+') > 0) {
                re = s.substring(0, s.indexOf('+'));
                im = s.substring(s.indexOf('+') + 1, s.length());
                parsed = new ComplexNumber(Double.parseDouble(re), Double.parseDouble(im));
            } else if (s.lastIndexOf('-') > 0) {
                re = s.substring(0, s.lastIndexOf('-'));
                im = s.substring(s.lastIndexOf('-') + 1, s.length());
                parsed = new ComplexNumber(Double.parseDouble(re), -Double.parseDouble(im));
            }
        } else {
            // Pure imaginary number
            if (s.endsWith("i") || s.endsWith("I")) {
                s = s.replaceAll("i", "");
                s = s.replaceAll("I", "");
                parsed = new ComplexNumber((double) 0, Double.parseDouble(s));
            }
            // Pure real number
            else {
                parsed = new ComplexNumber(Double.parseDouble(s), (double) 0);
            }
        }
        return parsed;
    }

    public ComplexNumber multi(ComplexNumber arg) {
        Double real = this.real * arg.real - this.image * arg.image;
        Double image = this.real * arg.image + this.image * arg.real;
        return new ComplexNumber(real, image);
    }


    public ComplexNumber sum(ComplexNumber arg) {
        Double real = this.real + arg.real;
        Double image = this.image + arg.image;
        return new ComplexNumber(real, image);
    }

    public ComplexNumber div(ComplexNumber arg) {
        ComplexNumber output = this.multi(arg.conjugate());
        double div = Math.pow(arg.mod(), 2);
        return new ComplexNumber(output.real / div, output.image / div);
    }

    private double mod() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(image, 2));
    }

    public ComplexNumber conjugate() {
        return new ComplexNumber(this.real, -this.image);
    }


    public ComplexNumber subtract(ComplexNumber arg) {
        Double real = this.real - arg.real;
        Double image = this.image - arg.image;
        return new ComplexNumber(real, image);
    }
}

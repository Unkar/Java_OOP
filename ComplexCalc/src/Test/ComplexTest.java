package Test;

import Model.ComplexNumber;

public class ComplexTest {
    public static void main(String[] args) {
        String sc1 = "1+2i";
        String sc2 = "1-2i";
        String sc3 = "-1+2i";
        String sc4 = "-1-2i";
        String sc5 = "1";
        String sc6 = "-1";
        String sc7 = "-2i";
        String sc8 = "2i";

        ComplexNumber c1 = new ComplexNumber(sc1);
        ComplexNumber c2 = new ComplexNumber(sc2);
        ComplexNumber c3 = new ComplexNumber(sc3);
        ComplexNumber c4 = new ComplexNumber(sc4);
        ComplexNumber c5 = new ComplexNumber(sc5);
        ComplexNumber c6 = new ComplexNumber(sc6);
        ComplexNumber c7 = new ComplexNumber(sc7);
        ComplexNumber c8 = new ComplexNumber(sc8);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c4.toString());
        System.out.println(c5.toString());
        System.out.println(c6.toString());
        System.out.println(c7.toString());
        System.out.println(c8.toString());
    }
}

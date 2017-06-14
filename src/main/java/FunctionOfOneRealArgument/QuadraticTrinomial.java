package FunctionOfOneRealArgument;

import java.util.ArrayList;

public class QuadraticTrinomial {
    private double a;
    private double b;
    private double c;

    public QuadraticTrinomial(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public ArrayList decisionQuadraticTrinomial() throws Exception {
        ArrayList<Double> result = new ArrayList<Double>();
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            result.add((-b + Math.sqrt(discriminant)) / (2 * a));
            result.add((-b - Math.sqrt(discriminant)) / (2 * a));
        }
        if (discriminant == 0.0) {
            result.add((-b + Math.sqrt(discriminant)) / (2 * a));
            result.add((-b - Math.sqrt(discriminant)) / (2 * a));
        }
        if (discriminant < 0) {
            throw new Exception("Дискрименант < 0");
        }
        return result;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


}

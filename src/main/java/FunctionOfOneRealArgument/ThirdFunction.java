package FunctionOfOneRealArgument;

public class ThirdFunction implements IFunction {
    private double a;
    private double b;
    private double c;
    private double d;

    private double lower;
    private double upper;

    public ThirdFunction(double a, double b, double x, double y, double z, double w) {
        this.lower = a;
        this.upper = b;
        this.a = x;
        this.b = y;
        this.c = z;
        this.d = w;
    }

    public void setLower(double lower) {this.lower = lower;}

    public void setUpper(double upper) {this.upper = upper;}

    public double getLower() {
        return lower;
    }

    public double getUpper() {
        return upper;
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

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double calculateFunctionInPoint(double x) throws FunctionEcxeption {
        double res = (this.a *x + this.b)/(this.c *x + this.d);
        if (res>= lower && res <= upper) {
            return res;
        }
        throw new FunctionEcxeption("Функция не определена");
    }
}

package FunctionOfOneRealArgument;

public class Integral implements IFunctional {

    private int pointsCount;
    private double lower;
    private double upper;

    public Integral(double lower, double upper, int pointsCount) throws IntegralException {
        if (pointsCount < 1) {throw new IntegralException("Количество разрывов < 1");}
        if (lower>upper) {throw new IntegralException("lower > upper");}
        this.lower=lower;
        this.upper=upper;
        this.pointsCount = pointsCount;
    }


    public <T extends IFunction> double  calculateFunctional (T function) throws FunctionEcxeption {
        double step = (upper - lower) / pointsCount;
        double integralValue = 0.0;

        for (double x = lower; x < upper; x=x+step) {
            integralValue += ((x+step) - x) * function.calculateFunctionInPoint(x+1);
        }
        return integralValue;
    }
}

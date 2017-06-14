package FunctionOfOneRealArgument;

public interface IFunction {
    double calculateFunctionInPoint(double x) throws FunctionEcxeption;
    double getLower();
    double getUpper();
}

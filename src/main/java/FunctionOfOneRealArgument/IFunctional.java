package FunctionOfOneRealArgument;

public interface IFunctional{
   <T extends IFunction> double calculateFunctional(T function) throws FunctionEcxeption;
}

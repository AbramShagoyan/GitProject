package FunctionOfOneRealArgument;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegralTest {
    @Test
    public void testingFourthFunction() throws IntegralException, FunctionEcxeption {
        Integral integral = new Integral(0,1, 10);
        double res = integral.calculateFunctional(new FourthFunction(1,200,3,1));
        double exc = 16.640098490506755;
        assertEquals(res,exc,0.00000000001);
    }

    @Test
    public void testingFirstFunction() throws IntegralException, FunctionEcxeption {
        Integral integral = new Integral(0,1, 10);
        double res = integral.calculateFunctional(new FirstFunction(1,20,3,4));
        double exc = 9.35;
        assertEquals(res,exc,0.00000000001);
    }

}

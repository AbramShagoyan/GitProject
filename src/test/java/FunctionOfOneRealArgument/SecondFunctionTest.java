package FunctionOfOneRealArgument;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SecondFunctionTest {
    @Test
    public void testing() throws FunctionEcxeption {
        double res = new SecondFunction(0,100,4,45).calculateFunctionInPoint(0);
        double exc = 0;
        assertEquals(res,exc,0.000000000000000001);
    }

    @Test(expected = FunctionEcxeption.class)
    public void testingError() throws FunctionEcxeption {
        double res = new SecondFunction(1,6,7,72).calculateFunctionInPoint(5);
        // res > 6.7
    }
}

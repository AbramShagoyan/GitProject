package FunctionOfOneRealArgument;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstFunctionTest {
    @Test
    public void testing() throws FunctionEcxeption {
        double res = new FirstFunction(1, 20, 3, 4).calculateFunctionInPoint(5);
        double exc = 19;
        assertEquals(res, exc, 0.000000000000000001);
    }

    @Test(expected = FunctionEcxeption.class)
    public void testingError() throws FunctionEcxeption {
        double res = new FirstFunction(1, 10, 3, 4).calculateFunctionInPoint(5);
    }
}
package FunctionOfOneRealArgument;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThirdFunctionTest {
    @Test
    public void testing() throws FunctionEcxeption {
        double res = new ThirdFunction(-10,10,2,4,1,2).calculateFunctionInPoint(3);
        double exc = 2;
        assertEquals(res,exc,0.000000000000000001);
    }

    @Test(expected = FunctionEcxeption.class)
    public void testingError() throws FunctionEcxeption {
        double res = new ThirdFunction(1,10,1,2,3,4).calculateFunctionInPoint(5);
        //res < 1
    }
}

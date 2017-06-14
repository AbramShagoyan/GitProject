package FunctionOfOneRealArgument;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FourthFunctionTest {
    @Test
    public void testing() throws FunctionEcxeption {
        double res = new FourthFunction(1,20,3,1).calculateFunctionInPoint(1);
        double exc = 9.154845485377137;
        assertEquals(res,exc,0.00000000001);
    }

    @Test(expected = FunctionEcxeption.class)
    public void testingError() throws FunctionEcxeption {
        double res = new FourthFunction(1,5,3,1).calculateFunctionInPoint(1);
    }

}

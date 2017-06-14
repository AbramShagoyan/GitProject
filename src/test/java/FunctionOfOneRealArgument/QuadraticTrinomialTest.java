package FunctionOfOneRealArgument;


import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class QuadraticTrinomialTest {
    @Test
    public void decisionQuadraticTrinomial() throws Exception {
        ArrayList<Double> result2 = new ArrayList<Double>();
        result2.add(10.0);
        result2.add(-0.4);

        QuadraticTrinomial test2 = new QuadraticTrinomial(5,-48,-20);

        assertEquals(result2, test2.decisionQuadraticTrinomial());


        ArrayList<Double> result = new ArrayList<Double>();
        result.add(-3.0);
        result.add(-3.0);

        QuadraticTrinomial test = new QuadraticTrinomial(1,6,9);

        assertEquals(result, test.decisionQuadraticTrinomial());


    }

}
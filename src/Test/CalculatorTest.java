import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void CalculateCircleRateTest(){
        Calculator cal = new Calculator();
        double CircleRate_result = cal.CircleArea_after(4);

        assertTrue(CircleRate_result == 50.24);
    }

}
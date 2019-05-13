import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void IsCorrectFactorial() {
        Calculator calculator = new Calculator();
        int result = calculator.factorial(4);
        int result_ = calculator.factorialAfter(4);

        assertTrue(result == 24);
        assertTrue(result_ == result);
    }

    @Test
    public void CalculatorPowTest() {
        Calculator cal = new Calculator();
        double result = cal.pow(4, 2);
        double result_ = cal.powAfter(4, 2);
        assertTrue(result == 16);
        assertTrue(result_ == result);
    }

    @Test
    public void CalculateCircleRateTest() {
        Calculator cal = new Calculator();
        double CircleRate_result = cal.CircleArea(4);
        double CircleRate_result_ = cal.CircleAreaAfter(4);

        assertTrue(CircleRate_result == 50.24);
        assertTrue(CircleRate_result_ == CircleRate_result);
    }

}
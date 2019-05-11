import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void IsCorrectFactorial() {
        Calculator calculator = new Calculator();
        int result_origin = calculator.factorial_origin(4);
        int result_modify = calculator.factorial_modify(4);

        assertTrue(result_origin == 24);
        assertTrue(result_modify == result_origin);


    }

}
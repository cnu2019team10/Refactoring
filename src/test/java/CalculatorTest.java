import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    @Test
    public void CalculatorPowTest() {
        Calculator cal = new Calculator();
        double result = cal.pow(4,2);
        assertTrue(result == 16);
    }

}

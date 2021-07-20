import calc.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int expected = 5; // 기대값

        assertEquals(expected, calculator.add(2,3));
    }
}

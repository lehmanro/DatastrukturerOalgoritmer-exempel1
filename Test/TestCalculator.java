import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {



        @Test
        void testCalculator2Number() {
            Calculator calculator = new Calculator();
            assertEquals(4, calculator.Multiply(2, 2) );
        }
        void testCalculator3Number() {
            Calculator calculator2 = new Calculator();
            assertEquals(4, calculator2.Multiply(2, 2, 1) );
        }
    }



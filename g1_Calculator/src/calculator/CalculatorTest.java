package calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = null;


    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown(){
        calculator = null;
    }

    @Test
    void testAdd() {
        assertTrue(calculator.add(5,3) == 8);
    }

    @Test
    void TestSubtract() {
        assertTrue(calculator.subtract(5,3) == 2);
    }
}
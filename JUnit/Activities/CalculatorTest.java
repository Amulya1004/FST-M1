
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() throws Exception{
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Simple Multiplication")
    public void testMultiply(){
        assertEquals(80, calculator.multiply(8, 10));
    }

    @Test
    @DisplayName("Simple Addition")
    public void testAddition(){
        assertEquals(100, calculator.add(80, 20));
    }
}

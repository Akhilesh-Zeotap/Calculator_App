import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest extends Assert{

    Calculator cal;
    @Before
    public void setUp() throws Exception {
        cal = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(10,cal.add(-10,20));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddBigNumbers(){
        assertEquals("Overflow",cal.add(2147483647,2147483647));
    }

    @Test
    public void testSubtract(){
        assertEquals(20,cal.subtract(-10,-30));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubtractBigNumbers(){
        assertEquals("Overflow",cal.subtract(-2147483647,2147483647));
    }

    @Test
    public void testMultiply(){
        assertEquals(-100,cal.multiply(-25,4));
    }

    @Test(expected = ArithmeticException.class)
    public void testMultiplyBigNumbers(){
        assertEquals("Overflow",cal.multiply(123456789,2147483647));
    }

    @Test
    public void testDivide(){
        assertEquals(2.5,cal.divide(5,2),.0000001); // Using error +- 10^-7
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero(){
        assertEquals("Can not divide by zero ;)",cal.divide(10,0));
    }

    @Test
    public void testSquareRoot(){
        assertEquals(1.41,cal.squareRoot(2),.01); // using error +- .01
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSquareRootOfNegativeNumber(){
        assertEquals("No real roots of negative numbers ;)",cal.squareRoot(-5));
    }

}
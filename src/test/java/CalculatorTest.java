import junit.framework.TestCase;
import org.junit.Before;
import java.lang.Math;

public class CalculatorTest extends TestCase{

    Calculator cal;
    @Before
    public void setUp() throws Exception {
        cal = new Calculator();
    }

    public void testAdd() {
        /* for(int i = -100;i<=100;i++){
            for(int j = -100;j<=100;j++){
                assertEquals(i+j,cal.add(i,j));
            }
        } */

        assertEquals(5,cal.add(3,2));
        assertEquals(10,cal.add(-15,25));
    }

    public void testSubtract() {
        for(int i = -100;i<=100;i++){
            for(int j = -100;j<=100;j++){
                assertEquals(i-j,cal.subtract(i,j));
            }
        }
    }

    public void testMultiply() {
        for(int i = -100;i<=100;i++){
            for(int j = -100;j<=100;j++){
                assertEquals(i*j,cal.multiply(i,j));
            }
        }
    }

    public void testDivide() {
        for(int i = -100;i<=100;i++){
            for(int j = -100;j<=100;j++){
                try{
                    assertEquals((double) i/j,cal.divide(i,j));
                }
                catch (Exception error){
                    assertEquals("Can not divide by zero ;)",error.getMessage());
                }
            }
        }
    }


    public void testSquareRoot() {
        for(int i = -100;i <= 100;i++){
            try{
                assertEquals(Math.sqrt(i),cal.squareRoot(i));
            }
            catch (Exception error){
                assertEquals("No real roots of negative numbers ;)",error.getMessage());
            }
        }
    }
}
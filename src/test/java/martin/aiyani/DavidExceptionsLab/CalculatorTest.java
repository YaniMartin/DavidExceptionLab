package martin.aiyani.DavidExceptionsLab;
import org.junit.Test;
import static org.junit.Assert.*;

// ヽ(ﾟДﾟ)ﾉ //

/**
 * Created by yanimartin on 2/16/16.
 */
public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void addTest() {
        int firstAddInput = 1;
        int secondAddInput = 2;
        int expected = 3;
        int actual = calculator.add(firstAddInput, secondAddInput);
        assertEquals("This will pass if inputs are added", expected, actual);
    }

    @Test
    public void subtractTest() {
        int firstSubtractInput = 2;
        int secondSubractInput = 1;
        int expected = 1;
        int actual = calculator.subtract(firstSubtractInput, secondSubractInput);
        assertEquals("This will pass if inputs are subtracted", expected, actual);
    }

    @Test
    public void multiplyTest() {
        int firstMultiplyInput = 2;
        int secondMultiplyInput = 3;
        int expected = 6;
        int actual = calculator.multiply(firstMultiplyInput, secondMultiplyInput);
        assertEquals("This will pass if inputs are multiplied", expected, actual);
    }

    @Test
    public void divideTest() throws DivisionByZeroException {
        int firstDivideInput = 4;
        int secondDivideInput = 2;
        int expected = 2;
        int actual = calculator.divide(firstDivideInput, secondDivideInput);
        assertEquals("This will pass if inputs are divided", expected, actual);
    }

    @Test(expected = DivisionByZeroException.class)
    public void exceptionDivisionTest() throws DivisionByZeroException {
        int goodNumber = 5;
        int naughtyNumber = 0;
        int actual = calculator.divide(goodNumber, naughtyNumber);
        assertEquals("This will pass if exception is thrown",actual);
    }

    @Test
    public void squareRootTest() throws ComplexNumberException {
        double numberToSquare = 4;
        double expected = 2;
        double actual = calculator.squareRoot(numberToSquare);
        assertEquals("this will pass if square root is shown", expected, actual, 0.1);
    }

    @Test(expected = ComplexNumberException.class)
    public void exceptionComplexTest() throws ComplexNumberException {
        double numberToSquare = -1;
        double actual = calculator.squareRoot(numberToSquare);
        assertEquals("This wil pass if exception is thrown",actual);
    }
}





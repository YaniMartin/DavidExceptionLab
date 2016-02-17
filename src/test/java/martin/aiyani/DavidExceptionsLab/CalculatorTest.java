package martin.aiyani.DavidExceptionsLab;
import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.Classes;

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

    @Test
    public void exceptionDivisionTest() throws DivisionByZeroException {
        int goodNumber = 5;
        int naughtyNumber = 0;
        boolean thrown = false;
        try {
            calculator.divide(goodNumber, naughtyNumber);
        } catch (DivisionByZeroException badDivision) {
            thrown = true;
        }
        assertTrue(thrown);
    }
}

        /* int goodNumber = 5;
        int naughtyNumber = 0;
        Class<DivisionByZeroException> expected = DivisionByZeroException.class;
        int actual = calculator.divide(goodNumber, naughtyNumber);
        assertEquals("This will pass if exception is thrown", expected, actual);
    }*/
  /*  @Test
    public void squareRootTest() throws ArithmeticException {
        int numberToSquare = 4;
        int expected = 2;
        int actual = calculator.squareRoot(numberToSquare);
        assertEquals("This will pass if number is squared",expected,actual);
    }
    @Test
    public void exceptionSquareRootTest() throws ArithmeticException {
        int numberToSquare = 2;
        Class<ArithmeticException> expected = ArithmeticException.class;
        int actual = calculator.squareRoot(numberToSquare);
        assertEquals("This will pass if exception is thrown",expected,actual);
    }
     boolean thrown = false;

*/




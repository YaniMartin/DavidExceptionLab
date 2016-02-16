package martin.aiyani.DavidExceptionsLab;

// ʕ•̫͡•ʕ•̫͡•ʔ•̫͡•ʔ //

/**
 * Created by yanimartin on 2/16/16.
 */
public class Calculator {

    public static int add(int firstAddInput, int secondAddInput){
        return firstAddInput + secondAddInput;
    }

    public static int subtract(int firstSubtractInput, int secondSubtractInput){
        return firstSubtractInput - secondSubtractInput;
    }

    public static int multiply(int firstMultiplyInput, int secondMultiplyInput){
        return firstMultiplyInput * secondMultiplyInput;
    }

    public static int divide(int firstDivideInput, int secondDivideInput) throws IllegalArgumentException{

        if(secondDivideInput==0){
            throw new IllegalArgumentException ("Illegal, cannot divide by 0");
        }
        return firstDivideInput/secondDivideInput;

    }
}


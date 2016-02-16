package martin.aiyani.DavidExceptionsLab;

// (∩｀-´)⊃━☆ﾟ.*･｡ﾟ //

/**
 * Created by yanimartin on 2/16/16.
 */
public class App extends Calculator {

    public static void main(String[] args) throws IllegalArgumentException{
        add(1,2);
        add(3,4);
        subtract(3,2);
        subtract(5,3);
        multiply(4,5);
        multiply(5,3);
        divide(10,2);
        divide(4,0);

     /*  try{divide(10,2);
            divide(4,0);
            }
        catch(Exception badDivision){
            badDivision.printStackTrace();
            System.out.println("Illegal action, cannot divide by 0.");
        }*/
    }
}

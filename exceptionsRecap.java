import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static boolean checkIfAgeIsLegal(int age) throws ArithmeticException, InputMismatchException {
        if (age < 18) {
            throw new ArithmeticException("This is my custom error message");
        } else {
            throw new InputMismatchException("another exception");
//            return true;
        }
    }


    public static void main(String[] args) {

        boolean isLegaAge;
        try {
            isLegaAge = checkIfAgeIsLegal(20);
        } catch (InputMismatchException ime) {
            isLegaAge = false;
//            System.out.println(e);
        } catch (ArithmeticException ae){

        }
//        System.out.println("isLegaAge: " + isLegaAge);


//        Scanner s = new Scanner(System.in);
//            try {
//                int y = 5/0;
//                int x = s.nextInt();
//                System.out.println(x);
//            } catch (Exception e){
//                System.out.println(e);
//            }



    }
}

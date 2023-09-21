package exception.test;

/**
 * This main can throw an ArithmeticException!!!
 * @param args
 */

public class Main {
    public static void main(String[] args) {


        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        }catch(Exception e) {
            System.out.println("Can't divide by '0' ");
        }finally {
            System.out.println("End try-catch-finally");
        }




    }
}
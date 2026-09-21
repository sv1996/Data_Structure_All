package  Exception;

public class ThrowExceptionExample {
    private static Object Throw;

    public static void main(String[] args) throws ArithmeticException {
        int a = 10;
        int b =0;
        try {
            int c = a/b;

          //  throw  new ArithmeticException();
        }
        catch (ArithmeticException e )
        {
           e.printStackTrace();
        } finally {
            System.out.println("This will always executed");
        }
    }
}

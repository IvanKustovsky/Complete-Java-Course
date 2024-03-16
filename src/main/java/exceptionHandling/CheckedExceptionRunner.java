package exceptionHandling;

public class CheckedExceptionRunner {
    public static void main(String[] args) {
        /*try {
            someOtherMethod();
            Thread.sleep(1000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }*/
        someOtherMethod2();

    }

    private static void someOtherMethod() throws InterruptedException{
        Thread.sleep(1000);
    }

    private static void someOtherMethod2() throws RuntimeException{

    }

}

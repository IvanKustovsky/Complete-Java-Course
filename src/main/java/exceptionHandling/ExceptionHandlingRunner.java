package exceptionHandling;

public class ExceptionHandlingRunner {
    public static void main(String[] args) {
        method2();
        System.out.println("Main ended");
    }

    public static void method1(){
        String str = null;
        str.length();
        System.out.println("Method1 ended");
    }

    public static void method2(){
        method1();
        System.out.println("Method2 ended");
    }
}

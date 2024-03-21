package javaNewFeatures.stringNewApi;

public class StringNewApiRunner {
    public static void main(String[] args) {
        System.out.println(" ".isBlank());
        System.out.println(" LR ".strip().replace(" ","@"));
        System.out.println(" LR ".stripLeading().replace(" ","@"));
        System.out.println(" LR ".stripTrailing().replace(" ","@"));
        "Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);

        String strTransform = "UPPER".transform(s -> s.substring(2));
        System.out.println(strTransform);

        System.out.println("My name is %s. My age is %d".formatted("Ivan", 20));

    }
}

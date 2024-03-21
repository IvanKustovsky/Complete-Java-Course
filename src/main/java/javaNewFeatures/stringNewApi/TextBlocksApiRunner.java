package javaNewFeatures.stringNewApi;

public class TextBlocksApiRunner {
    public static void main(String[] args) {
        String str = "First Line\nSecond Line\nThird Line";
        String textBlockStr = """
                First Line
                  Second Line
                    Third Line
                Fourth Line""";
        //System.out.println(str);
        System.out.println(textBlockStr);

        String textBlockStrFormatted = """
                First Line: %s
                  Second Line: %s
                    Third Line
                Fourth Line""".formatted("111", "222");
        System.out.println(textBlockStrFormatted);
    }
}

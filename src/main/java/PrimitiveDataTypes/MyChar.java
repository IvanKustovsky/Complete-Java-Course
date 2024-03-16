package PrimitiveDataTypes;

public class MyChar {
    private final char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }

    public boolean isVowel() {
        String vowels = "aeiou";
        return vowels.contains(Character.toString(ch).toLowerCase());
    }

    public boolean isConsonant() {
        return !isVowel() && isAlphabet();
    }

    public boolean isNumber() {
        return Character.isDigit(ch);
    }

    public boolean isAlphabet() {
        return Character.isAlphabetic(ch);
    }

    public static void printLowerCaseAlphabets() {
        StringBuilder str = new StringBuilder();
        for (char i = 'a'; i <= 'z'; i++) {
            str.append(i);
        }
        System.out.println(str);
    }

    public static void printUpperCaseAlphabets() {
        StringBuilder str = new StringBuilder();
        for (char i = 'A'; i <= 'Z'; i++) {
            str.append(i);
        }
        System.out.println(str);
    }
}

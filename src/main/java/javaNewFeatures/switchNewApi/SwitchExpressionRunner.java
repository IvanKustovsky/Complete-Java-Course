package javaNewFeatures.switchNewApi;

public class SwitchExpressionRunner {
    public static void main(String[] args) {

    }

    public static String findDayOfTheWeekWithSwitchExpression(int day) {
        return switch (day) {
            case 1 -> {
                System.out.println("Do some logic");
                yield "Sunday";  // returns value
            }
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> throw new IllegalArgumentException("Invalid option " + day);
        };
    }
    public static String findDayOfTheWeek(int day) {
        String dayOfWeek = "";
        switch (day) {
            case 1: dayOfWeek = "Sunday"; break;
            case 2: dayOfWeek = "Monday"; break;
            case 3: dayOfWeek = "Tuesday"; break;
            case 4: dayOfWeek = "Wednesday"; break;
            case 5: dayOfWeek = "Thursday"; break;
            case 6: dayOfWeek = "Friday"; break;
            case 7: dayOfWeek = "Saturday"; break;
            default: throw new IllegalArgumentException("Invalid option " + day);
        }
        return dayOfWeek;
    }
}

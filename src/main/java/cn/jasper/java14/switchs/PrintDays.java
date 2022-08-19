package cn.jasper.java14.switchs;

public class PrintDays {

    public static void main(String[] args) {

        System.out.println(getNumberOfDay(Day.WEDNESDAY));
    }

    static int getNumberOfDay2(Day day) {
        return switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
            default -> throw new IllegalStateException("Invalid day: " + day);
        };
    }

    static int getNumberOfDay(Day day) {
        int numLetters = 0;
        switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                numLetters = 6;
                break;
            case TUESDAY:
                numLetters = 7;
                break;
            case THURSDAY:
            case SATURDAY:
                numLetters = 8;
                break;
            case WEDNESDAY:
                numLetters = 9;
                break;
            default:
                throw new IllegalStateException("Invalid day: " + day);
        }

        return numLetters;
    }
}

public class Main {
    public static void main(String[] args) {
        var dayOfTheWeek = WeekDays.WED;
        String restOrWork = switch (dayOfTheWeek) {
            case MON, TUE, WED, THU, FRI -> "work";
            case SAT, SUN -> "rest";
            default -> "Sorry! There is no such day in this part of space.";
        };

        System.out.println(restOrWork);

    }
}
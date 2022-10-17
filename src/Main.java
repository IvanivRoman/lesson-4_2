public class Main {
    public static void main(String[] args) {
        var dayOfTheWeek = WeekDays.WED;
        String restOrWork = switch (dayOfTheWeek) {
            case MON, TUE, WED, THU, FRI -> "work";
            case SAT, SUN -> "rest";
        };

        System.out.println(restOrWork);

    }
}
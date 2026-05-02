enum Week {
    MON, TUE, WED, THU, FRI, SAT, SUN;

    // enum values are constants. So, values should be uppercase as a convention. Same for constant variable names. lowercase won't give errors.
}

// enum is a type which contains a group of constants in same group



public class LaunchEnum1 {

    public static void main(String[] args) {

        Week week = Week.THU;

        System.out.println(week);

        System.out.println(Week.THU.ordinal());

        Week []weekDays = Week.values();

        for(Week w:weekDays)
        {
            System.out.println("Day :" + w + " Ordinal :" + w.ordinal());
        }
    }
}

package uzb.aminasaidakhmedova.first_spring_project;

public enum WeekDay {
    MONDAY("понедельник"),
    TUESDAY("вторник"),
    WEDNESDAY("среда"),
    THURSDAY("четверг"),
    FRIDAY("пятница"),
    SATURDAY("суббота"),
    SUNDAY("воскресение");

    private final String russianDay;
    WeekDay(String russianDay) {
        this.russianDay = russianDay;
    }

    public String getRussianDay() {
        return russianDay;
    }
}

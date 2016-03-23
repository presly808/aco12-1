package ua.land.student.model;

public class MyDate {

    private int birthDay;
    private int birthMonth;
    private int birthYear;

    public MyDate(int birthYear, int birthMonth, int birthDay) {
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
    }

    public static MyDate init(int birthYear, int birthMonth, int birthDay) {
        if ((birthDay < 1) | (birthDay > 31)) {
            return null;
        }
        if ((birthMonth < 1) | (birthMonth > 12)) {
            return null;
        }

        if ((birthYear < 1950) | (birthDay > (2016-20))) {
            return null;
        }

        return new MyDate(birthYear, birthMonth, birthDay);
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return String.format("\nMydate Day-Month-Year: %s-%s-%s",
                getBirthDay(), getBirthMonth(), getBirthYear() );
    }
}

import java.util.Scanner;

public class Time {

    private int day;
    private int month;
    private int year;
    private int second;
    private int minute;
    private int hour;

    Scanner sc = new Scanner(System.in);

    public Time() {
        second = 0;
        minute = 0;
        hour = 0;
        day = 0;
        month = 0;
        year = 0;
    }

    public Time(int day, int month, int year) {
        second = 0;
        minute = 0;
        hour = 0;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Time(int second, int minute, int hour, int day, int month, int year) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setYear() {
        System.out.println("nhap nam : ");
        year = sc.nextInt();
    }

    public void setDay() {
        do {
            System.out.println("nhap ngay : ");
            day = sc.nextInt();
        } while (day > 30 || day < 1);
    }

    public void setMonth() {
        do {
            System.out.println("nhap thang : ");
            month = sc.nextInt();
        } while (month > 30 || month < 1);
    }

    public void setHour() {
        do {
            System.out.println("nhap thang : ");
            hour = sc.nextInt();
        } while (hour > 24 || hour < 0);
    }

    public void setMinute() {
        do {
            System.out.println("nhap phut : ");
            minute = sc.nextInt();
        } while (minute > 60 || hour < 0);
    }

    public void setSecond() {
        do {
            System.out.println("nhap giay : ");
            second = sc.nextInt();
        } while (second > 60 || hour < 0);
    }

    public void setAllTime() {
        setYear();
        setMonth();
        setDay();
        setHour();
        setMinute();
        setSecond();
    }

    public void setAllTimeWithoutSetHourAndSoOn() {
        setYear();
        setMonth();
        setDay();
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year + "   " + (hour >= 10 ? hour : ("0" + hour)) + ":"
                + (minute >= 10 ? minute : ("0" + minute)) + ":" + (second >= 10 ? second : ("0" + second));
    }

}

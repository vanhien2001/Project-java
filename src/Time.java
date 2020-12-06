import java.util.Scanner;

public class Time {

    private int day;
    private int month;
    private int year;

    Scanner sc = new Scanner(System.in);

    public Time() {
        day = 0;
        month = 0;
        year = 0;
    }

    public Time(int day, int month, int year) {
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

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setYear() {
        System.out.print("Nam : ");
        year = sc.nextInt();
    }

    public void setDay() {
        do {
            System.out.print("Ngay : ");
            day = sc.nextInt();
        } while (day > 30 || day < 1);
    }

    public void setMonth() {
        do {
            System.out.print("Thang : ");
            month = sc.nextInt();
        } while (month > 12 || month < 1);
    }

    public void setTime() {
        setDay();
        setMonth();
        setYear();
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

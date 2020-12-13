import java.io.Serializable;
import java.util.Scanner;

public class Time implements Serializable {

    private int day;
    private int month;
    private int year;

    transient Scanner sc = new Scanner(System.in);

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
        while (true) {
            try {
                System.out.print("Nam : ");
                year = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.out.println("Cu phap ko chinh xac moi ban nhap lai !!! ");
            }
        }
    }

    public void setDay() {
        while (true) {
            try {
                do {
                    System.out.print("Ngay : ");
                    day = Integer.parseInt(sc.nextLine());
                } while (day > 30 || day < 1);
                break;
            } catch (Exception ex) {
                System.out.println("Cu phap ko chinh xac moi ban nhap lai !!! ");
            }
        }
    }

    public void setMonth() {
        while (true) {
            try {
                do {
                    System.out.print("Thang : ");
                    month = Integer.parseInt(sc.nextLine());
                } while (month > 12 || month < 1);
                break;
            } catch (Exception ex) {
                System.out.println("Cu phap ko chinh xac moi ban nhap lai !!! ");
            }
        }
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

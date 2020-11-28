public class Time {
    int day,month,year,second,minute,hour;
    public Time(int second,int minute,int hour,int day,int month,int year){
        this.second=second;
        this.minute=minute;
        this.hour=hour;
        this.day=day;
        this.month=month;
        this.year=year;
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
}

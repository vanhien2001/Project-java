import java.util.Scanner;

public class Manager extends Person {
    transient Scanner sc = new Scanner(System.in);

    public Manager() {
        id = null;
        name = null;
        dayBegin = new Time();
        pass = "123";
    }

    public Manager(String id, String name, String pass, Time dayBegin, int salary) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.dayBegin = dayBegin;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDayBegin(Time dayBegin) {
        this.dayBegin = dayBegin;
    }

    public Time getDayBegin() {
        return dayBegin;
    }

    public void setId() {
        while (true) {
            System.out.print("Id : ");
            String input = sc.nextLine();
            double inputValue = 0;
            try {
                inputValue = Double.parseDouble(input);
                id = Double.toString(inputValue);
                break;
            } catch (NumberFormatException e) {
                System.out.println("ban nhap sai cu phap xin moi ban nhap lai");
            }
        }
    }

    public void setName() {
        System.out.print("Ho va ten : ");
        name = sc.nextLine();
    }

    public void setDayBegin() {
        System.out.println("Thoi diem bat dau lam viec : ");
        dayBegin.setTime();
    }

    public void setSalary() {
        while (true) {
            try {
                System.out.print("Luong : ");
                salary = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.out.println("Cu phap ko chinh xac moi ban nhap lai !!! \n");
            }
        }
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setPass() {
        while (true) {
            System.out.print("Nhap mat khau : ");
            String a = sc.nextLine();
            if (pass.equals(a)) {
                System.out.print("Nhap mat khau moi : ");
                String b = sc.nextLine();
                this.pass = b;
                break;
            } else if (!pass.equals(a) && !a.isEmpty()) {
                System.out.println("Mat khau khong chinh xac !!!");
            } else {
                break;
            }
        }
    }

    public void Nhapthongtin() {
        setId();
        setName();
        setDayBegin();
        setSalary();
    }

    @Override
    public void Xuat_thong_tin() {
        System.out.printf("| %-15s%-15s%-25s%-25s%-15s%15d000d |\n", "Quan ly", id, name, "Quan ly khach san", dayBegin,
                salary);
    }
}

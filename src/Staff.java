import java.util.Scanner;

public class Staff extends Person {
    String id, chucvu, posision;
    String pass;
    Time dayBegin;
    int salary;
    boolean manager = false;
    transient Scanner sc = new Scanner(System.in);

    public Staff(String name, String sdt, String cmnd, String so_nha, String duong, String phuong, String quan,
            String tinh, String id, String pass, Time dayBegin, int salary, String posision) {
        super(name, sdt, cmnd, so_nha, duong, phuong, quan, tinh);
        this.id = id;
        this.pass = pass;
        this.dayBegin = dayBegin;
        this.salary = salary;
        this.posision = posision;
    }

    public Staff() {
        super();
        id = null;
        pass = null;
        posision = null;
        salary = 0;
        dayBegin = new Time();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public void setDayBegin(Time dayBegin) {
        this.dayBegin = dayBegin;
    }

    public Time getDayBegin() {
        return dayBegin;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
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
                System.out.println("ban nhap sai cu phap xin moi ban nhap lai!");
            }
        }
    }

    public void setDayBegin() {
        System.out.println("Thoi diem bat dau lam viec : ");
        dayBegin.setTime();
    }

    public void setPass() {
        System.out.println("Mat khau : ");
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

    public void resetPass() {
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
        nhap_thontin();
        setId();
        setName();
        setDayBegin();
        setSalary();
    }

    public void Xuat_thong_tin() {
    };
}

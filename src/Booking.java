import java.util.Scanner;
public class Booking{
    Scanner sc=new Scanner(System.in);
    private String id,description;
    private Room room;
    private Time startDate,endDate;
    private float price;
    private double datcoc;
    public Booking(){
        id=null;
        description=null;
        startDate= new Time();
        endDate= new Time();
        room =new Room();
        price=0;
        datcoc=0;
    }
    public Booking(String id,String description,Room room,Customer account,Time startDate,Time endDate,float price,double datcoc){
        this.id=id;
        this.description=description;
        this.startDate= startDate;
        this.endDate= endDate;
        this.room =room;
        this.price=price;
        this.datcoc=datcoc;
    }
    public String getid(){
        return id;
    }
    public void setid(String id){
        this.id=id;
    }
    public String description(){
        return description;
    }
    public void setdescription(String description){
        this.description=description;
    }
    public Room getroom(){
        return room;
    }
    public void setroom(Room room){
        this.room=room;
    }
    public Time getstartDate(){
        return startDate;
    }
    public void setstartDate(Time startDate){
        this.startDate=startDate;
    }
    public Time getendDate(){
        return endDate;
    }
    public void setendDate(Time endDate){
        this.endDate=endDate;
    }
    public float getprice(){
        return price;
    }
    public void setprice(float price){
        this.price=price;
    }
    public double getdatcoc(){
        return datcoc;
    }
    public void setdatcoc(double datcoc){
        this.datcoc=datcoc;
    }
    public void setid(){
        System.out.println("nhap id: ");
        this.id=sc.next();
    }
    public void setdescription(){
        System.out.println("nhap description: ");
        this.description=sc.next();
    }
    public float setprice(){
        System.out.println("nhap gia: ");
        this.price=sc.nextFloat();
        return this.price;
    }
    public double setdatcoc(){
        System.out.println("tien dat coc la: ");
        this.datcoc=sc.nextDouble();
        return this.datcoc;
    }
    public void datphong(){
        setid();
        setdescription();
        setprice();
        setdatcoc();
    }
}
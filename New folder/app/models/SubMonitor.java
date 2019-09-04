package models;

/**
 * Created by USER on 7/21/2019.
 */
public class SubMonitor extends Monitor {
   private int Number; //จำนวนปุ่ม
   private String Category; //ประเภทจอ ips,Led
   private String Connect; //การเชื่อมต่อ htmi,vga
   private String Contact; // การสัมผัส  Button,touchscreen
    private String Mode; //โหมดจอ


    public SubMonitor() {
    }

    public SubMonitor(String brand, String version, int codescreen, boolean colormonitor, double weight, int number, String category, String connect, String contact, String mode) {
        super(brand, version, codescreen, colormonitor, weight);
        Number = number;
        Category = category;
        Connect = connect;
        Contact = contact;
        Mode = mode;
    }



    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getConnect() {
        return Connect;
    }

    public void setConnect(String connect) {
        Connect = connect;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getMode() {
        return Mode;
    }

    public void setMode(String mode) {
        Mode = mode;
    }


}


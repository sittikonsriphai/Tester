package models;

/**
 * Created by USER on 7/21/2019.
 */
public class Monitor {
    private  String Brand ; //ชื่อยี่่ห้อ
    private  String Version ; //ชื่อรุ่น
    private  int  Codescreen  ; //รหัสจอ
    private boolean Colormonitor ; //สีบอดี้
    private double  Weight  ; //น้ำหนัก

    public Monitor() {
    }

    public Monitor(String brand, String version, int codescreen, boolean colormonitor, double weight) {
        Brand = brand;
        Version = version;
        Codescreen = codescreen;
        Colormonitor = colormonitor;
        Weight = weight;
    }

          public String getColormonitor() {
              if (Colormonitor==true) {
                  return "Black";
              } else {
                  return "White";
              }
          }
    public void setColormonitor(boolean Colormonitor) {
        this.Colormonitor = Colormonitor;
    }

    public String getBrand() {
        return Brand;
    }


    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public int getCodescreen() {
        return Codescreen;
    }

    public void setCodescreen(int codescreen) {
        Codescreen = codescreen;
    }



    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }
}

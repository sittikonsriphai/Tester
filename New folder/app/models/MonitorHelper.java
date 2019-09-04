package models;

/**
 * Created by USER on 8/22/2019.
 */
public class MonitorHelper {


    private   String brand, version, category, connect, contact, mode,screen, strC;
    private boolean colormonitor;
    private double weight;
    private int codescreen, number;

    public MonitorHelper() {

    }

    public MonitorHelper(String screen) {
        this.screen = screen;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public MonitorHelper(String brand, String version, String category, String connect, String contact, String mode, String strC, boolean colormonitor, double weight, int codescreen, int number) {
        this.brand = brand;
        this.version = version;
        this.category = category;
        this.connect = connect;
        this.contact = contact;
        this.mode = mode;
        this.strC = strC;
        this.colormonitor = colormonitor;
        this.weight = weight;
        this.codescreen = codescreen;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getConnect() {
        return connect;
    }

    public void setConnect(String connect) {
        this.connect = connect;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getStrC() {
        return strC;
    }

    public void setStrC(String strC) {
        this.strC = strC;
    }

    public boolean isColormonitor() {
        return colormonitor;
    }

    public void setColormonitor(boolean colormonitor) {
        this.colormonitor = colormonitor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCodescreen() {
        return codescreen;
    }

    public void setCodescreen(int codescreen) {
        this.codescreen = codescreen;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

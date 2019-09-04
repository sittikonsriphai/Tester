package controllers;

import com.sun.org.apache.bcel.internal.classfile.Code;
import models.*;
import models.MonitorHelper;
import play.api.templates.Html;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;

import views.html.*;
import views.html.Monitor;
//import views.html.Monitor;

import java.util.ArrayList;
import java.util.List;

import static javafx.scene.input.KeyCode.L;

public class Application extends Controller {

    public static MonitorHelper mymonitor;
    public static Form<MonitorHelper> MonitorForm =Form.form(MonitorHelper.class);

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result xDeathxTH() {
        return Showmain(xDeathxTH.render());
    }

    public static Result xDeathxTH2() {
        return Showmain(xDeathxTH2.render());
    }

    public static Result Myprofile() {
        return Showmain(Myprofile.render());
    }

    public static Result education() {
        return Showmain(education.render());
    }

    public static Result T1() {
        return Showmain(T1.render());
    }

    public static Result T2() {
        return Showmain(T2.render());
    }

    public static Result T3() {
        return Showmain(T3.render());
    }

    public static Result Home() {
        return Showmain(Home.render());
    }

    public static Result Header() {return Showmain(Header.render());}

    public static Result Test() {return Showmain(Test.render());}

    public static Result CreateMonitor() {return Showmain(CreateMonitor.render());}

    public static Result Footter() {
        return Showmain(Footter.render());
    }

    public static Result Menu() {
        return Showmain(Menu.render());
    }

    public static Result Showmain(Html content) {
        return ok(Showmain.render(content));
    }

    public static Result BK() {
        return ok(BK.render());
    }

    public static Result Interested() {return Showmain(Interested.render());}

    public static Result goal() {return Showmain(goal.render());}


    public static Result SubMonitor() {
        SubMonitor person = new SubMonitor();

        person.setBrand("ACER");
        person.setVersion("TUFGAMING");
        person.setCodescreen(1111);
        person.setColormonitor(false);
        person.setWeight(4.7);

        person.setNumber(111);
        person.setCategory("IPS");
        person.setConnect("HDMI");
        person.setMode("MOVIE");
        person.setContact("TOUCHSCREEN");


        return Showmain(Monitor.render(person));
    }

    public static Result ShowMonitorList() {

        List<SubMonitor> monitor2 = new ArrayList<SubMonitor>();
        SubMonitor monitor1 = new SubMonitor();
        monitor1.setBrand("ASUS");
        monitor1.setVersion("OCULUX NXG252");
        monitor1.setCodescreen(2222);
        monitor1.setColormonitor(true);
        monitor1.setWeight(5.5);

        monitor1.setNumber(222);
        monitor1.setCategory("LED");
        monitor1.setConnect("HDMI,VGA");
        monitor1.setMode("Gaming");
        monitor1.setContact("BUTTON");


        monitor2.add(monitor1);
        monitor2.add(new SubMonitor("DELL", "ORIGINAL", 32154, true, 3.5, 333, "IPS", "HDMI", "BUTTON", "Gaming"));
        monitor2.add(new SubMonitor("AOC", "22E1H", 45489, true, 3.5, 444, "TN", "HDMI", "BUTTON", "Gaming"));
        monitor2.add(new SubMonitor("BENQ", "GL2580H", 53674, true, 4.5, 555, "TN", "HDMI,VGA", "BUTTON", "Work"));
        monitor2.add(new SubMonitor("LENOVO", "L27I-28 FREESYNC", 65941, true, 4.5, 666, "IPS", "HDMI,VGA", "TOUCHSCREEN", "Gaming"));
        monitor2.add(new SubMonitor("HP", "AVILION GAMING", 79416, true, 5.5, 777, "IPS", "HDMI,VGA", "BUTTON", "Work"));
        return Showmain(ShowMonitorListView.render(monitor2));

    }
        //  (String brand, String version, int codescreen, String colormonitor, double weight, int number, String category, String connect, String contact, String mode) {


    public static Result NewMonitor() {
        SubMonitor newmonitor = new SubMonitor();
        DynamicForm MyFrom = Form.form().bindFromRequest();
        String brand, version, category, connect, contact, mode, strC;
        boolean colormonitor;
        double weight;
        int codescreen, number;

        brand = MyFrom.get("brand");
        version = MyFrom.get("version");
        category = MyFrom.get("category");
        connect = MyFrom.get("connect");
        contact = MyFrom.get("contact");
        mode = MyFrom.get("mode");
        number = Integer.parseInt(MyFrom.get("number"));
        weight = Double.parseDouble(MyFrom.get("weigth"));
        codescreen = Integer.parseInt(MyFrom.get("codescreen"));



        strC = MyFrom.get("colormonitor");
        if (strC.equals("Black"))
            colormonitor = true;
        else
            colormonitor = false;
        mymonitor.setBrand(brand);
        mymonitor.setVersion(version);
        mymonitor.setCategory(category);
        mymonitor.setConnect(connect);
        mymonitor.setContact(contact);
        mymonitor.setMode(mode);
        mymonitor.setNumber(number);
        mymonitor.setWeight(weight);
        mymonitor.setColormonitor(colormonitor);
        mymonitor.setCodescreen(codescreen);



        newmonitor.setBrand(brand);
        newmonitor.setVersion(version);
        newmonitor.setCategory(category);
        newmonitor.setConnect(connect);
        newmonitor.setContact(contact);
        newmonitor.setMode(mode);
        newmonitor.setNumber(number);
        newmonitor.setWeight(weight);
        newmonitor.setCodescreen(codescreen);
        newmonitor.setColormonitor(colormonitor);



        return Showmain(ShowCreateMonitor.render(mymonitor));
    }

    public static Result MonitorFormHelper(){
        MonitorForm=Form.form(MonitorHelper.class);
        return Showmain(MyMonitorFormHelper.render(MonitorForm));
    }

    public  static  Result PostMonitorHelper(){
        Form<MonitorHelper> newForm =MonitorForm.bindFromRequest();
        if (newForm.hasErrors()){
            return Showmain(MyMonitorFormHelper.render(newForm));
        }
        else {
            mymonitor=newForm.get();
            return Showmain(ShowCreateMonitor.render(mymonitor));
        }

    }

}







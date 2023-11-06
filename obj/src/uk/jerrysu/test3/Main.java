package uk.jerrysu.test3;

import uk.jerrysu.test.Car;
import java.util.Date;
//import java.util.*;//会降低编译速度
public class Main {
    public static void main(String[] args) {
        java.lang.String str="";
        String str2="";
        uk.jerrysu.test2.Car car=new uk.jerrysu.test2.Car();
        car.run();
        Date d=new Date();
        System.out.println(d);
    }
}

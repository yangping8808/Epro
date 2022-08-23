package Base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Person {

    private String name;      //姓名
    private String location;  //地址

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Person:" + name + "," + location;
    }





    /**
     * 使用lambda后的
     */
    public static void runSomeThingByLambda(){
        new Thread(() -> System.out.println("I am running")).start();
    }

}






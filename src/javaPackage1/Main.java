package javaPackage1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1.创建helloWorld对象
//        HelloWorld helloworld = new HelloWorld();
//        //2.为name属性赋值
//        helloworld.setName("World");
//        //3.调用sayHello方法
//        helloworld.sayHello();
        List<Course> courses=new ArrayList<Course>();
        courses=DatabaseOperation.findCouInfo();
        for(Course c:courses){
            System.out.println(c);
        }
    }
}

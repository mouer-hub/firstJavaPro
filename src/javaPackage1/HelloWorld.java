package javaPackage1;

public class HelloWorld {
    String name;
    public void setName(String name)
    {
        this.name = name;
    }
    public void sayHello() {
        System.out.println("Hello "+name);
    }
}

package ex3;
import java.util.List;
import java.util.ArrayList;
class Person {
    private String name;
    private int age;
    private String position;

    public Person(String name, int age, String position){
        this.name= name;
        this.age = age;
        this.position = position;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getPosition(){
        return  position;
    }
    @Override
    public String toString(){
        return "name= " + name  + ", age= " + age + ", position= " + position;
    }
}

package practice01;

import com.google.common.base.Strings;

public class Person {
//    写一个Person类，要有name，age属性，要有一个introduce方法，
//    introduce方法返回一个字符串形如：

    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String introduce(){
        return ("My name is " + name + ". I am " + age + " years old.");
    }

}

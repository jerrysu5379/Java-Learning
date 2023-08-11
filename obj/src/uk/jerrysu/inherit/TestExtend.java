package uk.jerrysu.inherit;

public class TestExtend {
    public static void main(String[] args) {
        Student stu1=new Student("Jerry Su",184,"java");
        stu1.rest();
        stu1.study();
        System.out.println(stu1.name);
        //判断对象是否是这个类的实例
        System.out.println(stu1 instanceof Student);
        System.out.println(stu1 instanceof Person);
    }
}

class Person{
    String name;
    int height;

    public void rest(){
        System.out.println("Have a rest!");
    }
}

class Student extends Person{
    String major;

    public void study(){
        System.out.println("Student.study");
    }
    public Student(String name,int height,String major){
        this.name=name;
        this.height=height;
        this.major=major;
    }
}
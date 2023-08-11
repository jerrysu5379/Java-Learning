public class Person {
    String name;
    int age;

    public void show(){
        System.out.println("姓名："+name+"\t年龄："+age);
    }

    Person(String _name,int _age){
        name=_name;
        age=_age;
    }

    Person(){}

    public static void main(String[] args) {
        Person p1=new Person("张三",24);
        p1.show();
        Person p2=new Person();
        p2.name="李四";
        p2.age=30;
        p2.show();
    }
}

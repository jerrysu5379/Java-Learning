public class Students {
    int id;
    String sname;
    int age;
    Computer computer;

    void study(){
        System.out.printf("我正在学习，我使用"+computer.brand);
    }

    public static void main(String[] args) {
        Computer c1=new Computer();
        c1.brand="Apple";
        c1.price=160000;

        Computer c2=new Computer();
        c2.brand="Asus";
        c2.price=6000;

        Students stu1=new Students();
        stu1.id=1;
        stu1.sname="Jerry Su";
        stu1.age=18;
        stu1.computer=c1;

        stu1.study();
    }
}

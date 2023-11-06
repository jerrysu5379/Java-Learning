package uk.jerrysu.inherit;

public class TestComposition {
    public static void main(String[] args) {
        Stu stu=new Stu("Jerry Su",184,"java");
        stu.person.rest();
        System.out.println(stu.person.name);
        System.out.println(stu.person.height);
        System.out.println(stu.major);

    }
}
class Stu{
    Person person=new Person();
    String major;
    public void study(){
        System.out.println("Stu.study");
    }

    public Stu(String name,int height,String major){
        this.person.name=name;
        this.person.height=height;
        this.major=major;
    }
}

class CPU{
    void caculate(){
        System.out.println("CPU.caculate");
    }
}
class Memory{
    void store(){
        System.out.println("Memory.store");
    }
}
class computer{
    CPU cpu=new CPU();
    Memory memory=new Memory();
}
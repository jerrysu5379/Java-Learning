public class Student {
    int id;
    String name;
    int score;
    int age;

    public void study(){
        System.out.println("正在学习"+name);
    }

    public static void main(String[] args) {
        Student stu01 = new Student();
        stu01.id=1;
        stu01.name="Jerry Su";
        stu01.score=90;
        stu01.age=18;

        stu01.study();

        Student stu02 = new Student();
        stu02.id=2;
        stu02.name="Tom Xun";
        stu02.score=90;
        stu02.age=16;

        stu02.study();

        Student stu03 = new Student();
    }
}

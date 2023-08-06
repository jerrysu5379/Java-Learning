public class TestIf {
    public static void main(String[] args) {
        System.out.println(Math.random());
        int r=(int)(Math.random()*10);
        System.out.println(r);
        if(r<5) System.out.println("随机数"+r+"比较小");
        else System.out.println("随机数"+r+"比较大");
        int age=(int)(Math.random()*100);
        if(age<15) System.out.println("儿童");
        else if (age<25) System.out.println("青年");
        else if (age<45) System.out.println("中年");
        else if (age<65) System.out.println("中老年");
        else if (age<85) System.out.println("老年");
        else System.out.println("寿星");
    }
}

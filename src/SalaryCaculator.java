import java.util.Scanner;

public class SalaryCaculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("请输入月薪:");
            int monSal=scanner.nextInt();
            System.out.println("输入一个年多少个月薪资:");
            int month=scanner.nextInt();
            int sal=monSal*month;
            System.out.println("年薪"+sal);
            if(sal>20*10000) System.out.println("超过98%的国人");
            else if (sal>10*10000) System.out.println("超过90%的国人");
            System.out.println("输入88来[退出],输入其他任意字符来继续");
            if(scanner.nextInt()==88) break;
        }
    }
}

import java.util.Scanner;

public class TestSystemIn {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("输入内容");
        String str= scanner.nextLine();
        System.out.println("输入年龄");
        int age= scanner.nextInt();
        System.out.println("输入小数");
        double aDouble= scanner.nextDouble();
        System.out.println("输入内容为\n"+str+"\n"+age+"\n"+aDouble);

    }
}

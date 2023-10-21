import java.io.IOException;
import java.util.Scanner;

public class TestSystemIn {
    public static void main(String[] args) throws IOException {
        Scanner scanner =new Scanner(System.in);
        System.out.println("输入内容");
        String str= scanner.nextLine();
        char c=(char)System.in.read();
        System.out.println("输入年龄");
        int age= scanner.nextInt();
        System.out.println("输入小数");
        double aDouble= scanner.nextDouble();
        System.out.println("输入内容为\n"+str+"\n"+age+"\n"+aDouble);

    }
}

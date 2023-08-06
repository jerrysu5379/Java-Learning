import java.util.Scanner;

public class TestWhile2 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print("\t"+j);
            }
            System.out.println();
        }
        for(int m=0;m<5;m++){
            for(int n=0;n<5;n++){
                if(n%2==0) System.out.print("\t"+'O');
                else System.out.print("\t"+'X');
            }
            System.out.println();
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入行数");
        int cow= scanner.nextInt();
        for (int k=0;k<cow;k++){
            for (int h=0;h<=k;h++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int k=0;k<=cow;k++){
            for (int h=cow;h>=k;h--){
                System.out.print("*\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int i=0;i<cow;i++){
            for(int j=0;j<=cow*2;j++){
                if(j>=cow-i&&j<=cow+i) System.out.print("*\t");
                else System.out.print('\t');
            }
            System.out.println();
        }
    }
}

public class TestMethod {
    public static void main(String[] args) {
//        int a1=add(100,200);
//        int a2=add(300,500);
//        int a3=add(300,500);
        int num1=10,num2=20;
        int sum=add(num1,num2);
        System.out.println(sum);
        printInfo();
        printInfo();
        printInfo();
    }
    public static int add(int n1,int n2){
        int sum=n1+n2;
        return sum;
    }
    public static void printInfo(){
        System.out.println("JerrySu5379");
    }
}

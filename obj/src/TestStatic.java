public class TestStatic {
    int id;
    static String brand="Jerry Su";

    static int bid=0;

    static{
        System.out.println("类被初始化调用");
        bid=1122;
    }
    static void printBrand(){
        System.out.println(brand);
        //System.out.println(this); static不能使用非static成员
    }
    void login(){
        System.out.println("登录");
    }

    public static void main(String[] args) {
        TestStatic.printBrand();
        TestStatic t1=new TestStatic();
        t1.login();
        TestStatic t2=new TestStatic();
        t2.login();
    }
}

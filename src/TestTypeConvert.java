public class TestTypeConvert {
    public static void main(String[] avgs){
        //自动转换
        long a1=3456;
        float a2=a1;
        System.out.println(a2);
        //整型常量直接赋值给byte/short/char转换
        byte b1=121;
        //byte b2=200;错误
        //算术运算符，两个操作数都是整型，有一个是long，结果为long，否则均为int
        long c1=1234;
        int c2=123;
        long c3=c1+c2;
        System.out.println(c3);
        //算术运算符，有一个是double，其余均为double
        double d1=3.14;
        int d2=3;
        double d3=d1+d2;
        System.out.println(d3);
        //强制转型
        double m1=3.98;
        int m2=(int)m1;
        System.out.println(m2);
        int m3=(int)(m1+0.5);
        System.out.println(m3);
        System.out.println();
        //char
        char a3='c';
        int m4=a3+3;
        char m5=(char)m4;
        System.out.println(m5);
        //截断
        int n1=300;
        byte n2=(byte)n1;
        System.out.println(n2);
        System.out.println();
        //留意溢出
        int salary=1000000000;
        int years=30;
        int total01=salary*years;
        long total02=(long)salary*years;
        long total03=1L*salary*years;
        System.out.println(total01);
        System.out.println(total02);
        System.out.println(total03);
    }
}

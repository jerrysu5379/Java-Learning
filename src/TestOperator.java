public class TestOperator {
    public static void main(String[] args){
        //算术运算符
        int a=3;
        int b=4;
        int c=(a+b)*4;
        System.out.println(c);
        int d=15/4;
        System.out.println(d);
        int d2=5%3;
        System.out.println(d2);
        a=10;
        b=a++;
        c=++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(c==b);
        b=--a;
        c=a--;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(c==b);
        System.out.println();
        //扩展运算符
        a=20;
        b=30;
        a+=b;
        System.out.println(a);
        System.out.println(b);
        System.out.println();
        //关系运算符
        a=20;
        b=30;
        boolean result=a<b;
        System.out.println(result);
        System.out.println();
        //逻辑运算符
        boolean b1=true&false;
        System.out.println(b1);
        boolean b2=true|false;
        System.out.println(b2);
        boolean b3=!b2;
        System.out.println(b3);
        boolean b4=true^true;
        System.out.println(b4);
        System.out.println();
        //短路与、或
        boolean b5=(3<4)||(4<0);
        System.out.println(b5);
        System.out.println();
        //位运算符
        int m=3;
        int n=7;
        int p1=m&n;
        int p2=m|n;
        int p3=m^n;
        int p4=~m;
        int p5=~n;
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        int m2=3<<3;
        int m3=12>>2;
        System.out.println(m2);
        System.out.println(m3);
        System.out.println();
        //字符串连接符
        int r1=3;
        int r2=4;
        System.out.println(r1+r2);
        System.out.println("注意引号"+r1+r2);
        System.out.println();
        //条件运算符
        int y1=30;
        int y2=40;
        int minY=y1<y2?y1:y2;
        System.out.println("结果小的是"+minY);
        y1=y2;
        y2=20;
        minY=y1<y2?y1:y2;
        System.out.println("重新赋值后结果小的是"+minY);
    }
}

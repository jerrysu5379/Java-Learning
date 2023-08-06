public class TestIntDouble {
    public static void main(String[] args){
        byte age=18;
        short salary=25000;
        int salary2=50000;
        int PopulationOfBeijing=30000000;
        long Population=70000000000L; //整型常量默认int
        /*不可用int Population=70000000000L;
        不可用byte age2=140;*/
        //关于进制
        int t1=65;
        int t2=065;
        int t3=0x65;
        int t4=0b01000001;
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        //double
        double d1=3.14;
        float f1= 3.14F; //浮点常量默认double
        double d2=314E-2; //科学记数法
        System.out.println(d2);
        //浮点数不精确，用于比较要小心
        //推荐将浮点数放大为整形比较，如果要进行精确的运算，使用BigDecimal类
        float f3=0.1F;
        double d3=0.1;
        System.out.println(f3);
        System.out.println(d3);
        System.out.println(f3==d3);
    }
}

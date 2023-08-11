package uk.jerrysu.inherit;

public class TestFinal {
    public static void main(String[] args) {
        final int MAX_SPEED=120;//只能赋值一次
    }
    //final修饰方法不能被子类重写
    //final修饰类则类不能被继承
}

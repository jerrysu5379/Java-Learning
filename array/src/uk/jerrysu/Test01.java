package uk.jerrysu;

public class Test01 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int b[] = new int[3];
        int[] c = {100,200,300,400};
        //数字0，布尔false，字符'\u0000'，引用null
        System.out.println(a[0]);

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        for(int i=0;i<a.length;i++){
            a[i]=10+i*10;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        for(int i:c){
            System.out.println(i);
        }
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
}

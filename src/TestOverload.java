public class TestOverload {
    public static void main(String[] args) {

    }
    public static int add(int n1,int n2){
        return n1+n2;
    }

    public static double add(double n1,int n2){
        double sum = n1 + n2;
        return sum;
    }

    public static int add(int n1,int n2,int n3){
        int sum=n1+n2+n3;
        return sum;
    }

    public static double add(int n1,double n2){
        double sum = n1 + n2;
        return sum;
    }

//    public static void add(int n1,double n2){
//        double sum = n1 + n2;
//    }

//    public static double add(int m1,double m2){
//        double sum = m1 + m2;
//        return sum;
//    }
}

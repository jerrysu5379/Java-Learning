public class TestWhile {
    public static void main(String[] args) {
        int i=1;
        while(i<101){
            System.out.println(i++);
        }
        int j=0;
        int sum=0;
        while(j<101){
            sum+=j;
            j++;
        }
        System.out.println(sum);
    }
}

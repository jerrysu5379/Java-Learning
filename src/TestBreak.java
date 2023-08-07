public class TestBreak {
    public static void main(String[] args) {
        int count=0;
        while (true){
            int m=(int)(Math.random()*100);
            System.out.println(m);
            count++;
            if(m==88) break;
        }
        System.out.println(count+"次");
    }
}

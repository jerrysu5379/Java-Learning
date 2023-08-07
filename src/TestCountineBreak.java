public class TestCountineBreak {
    public static void main(String[] args) {
        int count=0;
        for(;;){
            int num=(int)(Math.random()*6);
            String animal="";
            switch (num){
                case 0:
                    animal="Tiger";
                    break;
                case 1:
                    animal="Eagle";
                    break;
                case 2:
                    animal="Cat";
                    break;
                case 3:
                    animal="Dog";
                    break;
                case 4:
                    animal="Bird";
                    break;
                default:
                    animal="Unknown";
                    break;
            }
            if(num==0){
                System.out.println("Run!!");
                break;
            }
            if(num==1){
                System.out.println("Wait!!");
                continue;
            }
            count++;
            System.out.println("Caught "+animal+"!!");
        }
        System.out.println("Total:"+count);
    }
}

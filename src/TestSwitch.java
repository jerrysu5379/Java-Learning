public class TestSwitch {
    public static void main(String[] args) {
        int grade=(int)(Math.random()*4);
        switch (grade){
            case 1:
                System.out.println("一年级");
                break;
            case 2:
                System.out.println("二年级");
                break;
            case 3:
                System.out.println("三年级");
                break;
            default:
                System.out.println("四年级");
                break;
        }
        int month=(int)(Math.random()*12);
        switch (month){
            case 1:
            case 2:
            case 3:{
                System.out.println("春季");
                break;
            }
            case 4:
            case 5:
            case 6:{
                System.out.println("夏季");
                break;
            }
            case 7:
            case 8:
            case 9:{
                System.out.println("秋季");
                break;
            }
            case 10:
            case 11:
            case 12:{
                System.out.println("冬季");
                break;
            }
        }
        String car1="宝马";
        String car2="奔驰";
        String car3="奥迪";
        String car4="大众";
        int car=(int)(Math.random()*4);
        switch (car){
            case 1:
                System.out.println(car1);
                break;
            case 2:
                System.out.println(car2);
                break;
            case 3:
                System.out.println(car3);
                break;
            default:
                System.out.println(car4);
                break;
        }
    }
}

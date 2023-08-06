public class TestBool {
    public static void main(String[] args){
        boolean flag=true;
        if(flag){
            System.out.println("flag为真");
            flag=false;
        }
        if(!flag){
            System.out.println("flag已被赋值为假");
        }
        //可以不写成(flag==true)或(flag!=true)
    }
}

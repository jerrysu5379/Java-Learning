import javax.jws.soap.SOAPBinding;

public class User2 {
    int id;
    String name;
    String pwd;

    public User2(){}

    public User2(int id,String name){
        System.out.println("正在初始化的对象"+this);
        this.id=id;
        this.name=name;
    }

    public User2(int id,String name,String pwd){
        this(id,name);//必须位于第一行
        this.pwd=pwd;
    }
    public void login(){
        System.out.println("登录"+this.name+"密码"+this.pwd);
    }

    public static void main(String[] args) {
        User2 u=new User2(1,"Jerry Su");
        u.login();
        User2 u3=new User2(2,"Tom Xun","123456");
        u3.login();
    }
}

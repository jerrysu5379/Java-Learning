public class User {
    int id;
    String uname;
    String pwd;

    User(){}

    public User(int _id){
        id=_id;
    }

    public User(int _id, String _uname, String _pwd){
        id=_id;
        uname=_uname;
        pwd=_pwd;
    }

    public static void main(String[] args) {
        User u1=new User();
        User u2=new User(1);
        User u3=new User(2,"Jerry Su","123456");
    }
}

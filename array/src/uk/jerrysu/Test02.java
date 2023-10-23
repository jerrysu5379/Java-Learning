package uk.jerrysu;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        User[] users = new User[3];
        User user2[] = {
                new User(1001, "Jerry"),
                new User(1002, "Tom"),
                new User(1003, "Jack")
        };
        users[0] = new User(1001, "Jerry");
        users[1] = new User(1002, "Tom");
        users[2] = new User(1003, "Jack");

        for(int i=0;i<users.length;i++){
            System.out.println(users[i]);
        }
        for(User user:user2){
            System.out.println(user);
        }
        System.out.println(Arrays.toString(users));
    }
}

class User{
    private int id;
    private String name;

    public User(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
package Libraries.hashmap;

import java.util.HashMap;
import java.util.Map;

public class userList {
    Map<Integer, Integer> user;
    userList(){
        user = new HashMap<>();
    }
    void set(Integer userID, Integer Balance){
        user.put(userID,Balance);
    }
    int get(Integer userID){
        if (user.get(userID)!=null){
            return user.get(userID);
        }
        else {
            return -1;
        }
    }
}

class main{
    public static void main(String arg[]){
        userList users = new userList();
        users.set(1,100);
        users.set(3,500);
        System.out.println(users.get(2));
        System.out.println(users.get(1));
        users.set(1,25);
        System.out.println(users.get(1));
    }
}

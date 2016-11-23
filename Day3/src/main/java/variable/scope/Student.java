package variable.scope;

/**
 * Created by desair4 on 11/21/2016.
 */
public class Student {
    String name;
    Friend friend = new Friend();

    void talkWithFriend() {
//        System.out.println(friend.password);
    }
}

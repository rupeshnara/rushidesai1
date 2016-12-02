package inheritance.parent;

/**
 * Created by desair4 on 11/30/2016.
 */
public class Dummy {

    public Dummy() {
        BaseAccount baseAccount = new BaseAccount(12);
        baseAccount.accountKey = 13;    //I am able to access even if no inheritance

    }
}

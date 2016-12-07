package client;

import api.interfaces.IPredicate;

/**
 * Created by desair4 on 12/2/2016.
 */
public class PrintEven implements IPredicate {
    public boolean doPrint(int i) {
        if (i % 2 == 0)
            return true;

        return false;
    }
}

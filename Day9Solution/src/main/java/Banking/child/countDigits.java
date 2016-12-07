package Banking.child;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by bhumi on 12/5/2016.
 */
public class countDigits {

    static Integer accountNumber;

    static List<Integer> allAccountNumbersArray = new ArrayList<Integer>();
    //static String accountNumberString;
    static boolean isDuplicateAccountNumber(Integer accountNumber) {

        for (int i = 0; i < allAccountNumbersArray.size(); i++){

            if (allAccountNumbersArray.get(i) == accountNumber) {
                return false;
            }
        }
        return true;

    }

    static Integer generateAccountNumber() {

        Random r = new Random();
        accountNumber = 10000000 + r.nextInt(90000000);
        allAccountNumbersArray.add(accountNumber);


        return accountNumber;
    }

    public static void main(String[] args) {

        System.out.println(generateAccountNumber());
        System.out.println(isDuplicateAccountNumber(13455678));
        System.out.println(allAccountNumbersArray);

    }
}

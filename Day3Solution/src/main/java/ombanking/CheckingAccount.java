package ombanking;

/**
 * Created by Paul on 12/3/2016.
 */
public class CheckingAccount {

    int initialBalance;
    public int feecharged = 5 ;

    public int getFeecharged() {
        return feecharged;
    }

    public void setFeecharged(int feecharged) {
        this.feecharged = feecharged;
    }



    public int getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(int initialBalance) {
        this.initialBalance = initialBalance;
    }
    //validation
    public CheckingAccount(int initialBalance) {
        this.initialBalance = initialBalance;

        if(initialBalance<=0){
                System.out.println("balance cannot be negative");
            }

    }

    //ammount credited in the account
    public void credit(int ammount){

        if(ammount > 0){

            initialBalance = ammount + initialBalance;
            System.out.println("new balance available in the :" +initialBalance );

        }else{

            System.out.println("Please ensure the amount to be deposited is not negative:");
        }
    }
    //ammount debited in the account by taking fee charged under consederation
    public void debit(int ammount) {

        if (ammount <= initialBalance) {

            initialBalance = (initialBalance - ammount) - feecharged;
            System.out.println("Avalaible ammount :" + initialBalance  +  "\n feecharged for transaction: " +feecharged);



        } else {

            initialBalance = initialBalance;
            System.out.println("ammount insufficient");

        }
    }


}

public class CheckingAccount {

    double initialBalance = 0.0;
    final int fee = 5;


    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public void credit(double amount) {
        if (amount > 0 && amount != 0) {
            System.out.println("CheckingAccount initial balance is          " + (initialBalance = initialBalance + amount));
        } else {
            System.out.println("Please ensure the amount to be deposited is not negative: ");
        }
    }

    public void debit(double amount) {
        if (amount > 0) {
            System.out.println("with draw money fee $5 each transcition");
            System.out.println("initial balance is" + (initialBalance = initialBalance - amount - fee));
            System.out.println("withdrwan balance is" + (amount + fee));
            System.out.println("avilabale money is" + (initialBalance));
        } else {
            System.out.println("You are not elegible to with draw amount ");
        }

    }
}

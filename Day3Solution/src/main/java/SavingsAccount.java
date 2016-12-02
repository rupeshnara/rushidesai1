public class SavingsAccount {

    private double initialBalance = 0.0;
    private double interst = 0.0;

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public void credit(double amount) {
        if (amount > 0 && amount != 0) {

            System.out.println(initialBalance = (initialBalance + amount));

        } else {
            System.out.println("Please ensure the amount to be deposited is not negative: ");
        }
    }

    public void debit(double amount) {
        if (amount == initialBalance || amount <= initialBalance) {

            System.out.println(initialBalance = initialBalance - amount);
        } else {
            System.out.println("You are not elegible to with draw amount ");
        }

    }

    public void calculateInterest() {
        double insd = 0.0;
        if (initialBalance > 250 && initialBalance <= 500) {
            insd = 0.10;
            System.out.println("Iitial balance is" + initialBalance);
            System.out.println("interst rate is 0.10%");
            System.out.println(initialBalance = initialBalance + initialBalance * insd);
        }

        if (initialBalance > 500 && initialBalance > 750) {
            insd = 0.25;
            System.out.println("Iitial balance is" + initialBalance);
            System.out.println("interst rate is 0.25%");
            System.out.println(initialBalance = initialBalance + initialBalance * insd);

            //balance = balance + balance * interest;
        }


    }


}



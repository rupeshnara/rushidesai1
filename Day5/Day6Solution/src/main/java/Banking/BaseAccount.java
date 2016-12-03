package Banking;



public class BaseAccount {
    public double initialBalance;
    protected int accountnumber;

    private String accountHash;

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }


    public double getInitialBalance() {
        return initialBalance;
    }


    public void setInitialBalance(double initialBalance) {

        if (initialBalance <= 0) {
            System.out.println("Balance cannot be negative or zero.");
        } else {
            this.initialBalance = initialBalance;
        }
    }
    public void credit(double amount) {
        if (amount < 0) {
        } else {
            this.initialBalance = this.initialBalance + amount;
        }
    }


   /*public getCurrentDate() {


    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();
System.out.println(dateFormat.format(date));
}*/
  /* Calendar currentDate = Calendar.getInstance(); //Get the current date
    SimpleDateFormat formatter= new SimpleDateFormat("yyyy/MMM/dd HH:mm:ss"); //format it as per your requirement
    String dateNow = formatter.format(currentDate.getTime());
System.out.println("Now the date is :=>  " + dateNow);*/
    @Override
    public String toString() {
        return "BaseAccount{" +
                "initialBalance=" + initialBalance +
                ", accountNumber=" + accountnumber +
                ", accountHash='" + accountnumber+
                '}';
    }


}
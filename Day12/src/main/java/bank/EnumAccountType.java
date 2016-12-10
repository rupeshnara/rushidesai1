package bank;

/**
 * Created by desair4 on 12/9/2016.
 */
public enum EnumAccountType {
    SAVINGS("Savings"), //Creating an instance of EnumAccountType
    CHECKING("Checking"), //Creating an instance of EnumAccountType
    CHECKING_ACCOUNT_DROPDOWN("Checking Account", "CheckingAccount");

    public String value;
    public String name;

    EnumAccountType(String v) {
        value = v;
    }

    EnumAccountType(String displayName, String serverSideValue) {
        value = serverSideValue;
        name = displayName;
    }

}

#####Assignments are for you. 
Please be honest with yourself. If you don't understand please ask questions and try to 
understand the concept

__Assignment1:__
1. Copy the classes which you wrote in Assignment1 of Day6 and put it under 'banking' package.
2. You will modify these classes for this assignment.
3. We want to make sure that any one who extends class BaseAccount, has a method
    **_public void debit(double amount)_** in all sub classes and they also implement in the subclass.
    To do this create an interface 'IAccount' and add the above method to that interface. Implement the interface in BaseAccount
4. We have now two different types of Account classes: SavingAccount and CheckingAccount, now write a new class 'AccountHelper' with a method 'debitMoney' which can work with both types of accounts i.e. if client passes SavingAccount object then it should call savingAccount's debit method and if passed in Object is CheckingAccount then call it's debit method.
5. Create new 'checked' exceptions:
    InitialBalanceNotValidException
    AccountNumberLengthNotValidException
    DuplicateAccountNumberException
   Wherever you are throwing RuntimeException, make changes so that you now throw specific exceptions.   
 
#####Assignments are for you. 
Please be honest with yourself. If you don't understand please ask questions and try to 
understand the concept


__Assignment1:__

1.a Create an array of Integers with 100 elements. 
1.b Populate values of 1 - 100 in that array.
1.c Write a function with following signature:
    >void printAll(int[] a)
     
   that prints all values.
1.d Write a function with following signature:
    >void printOdd(int[] a)
     
   that prints all odd values.

1.e Write a function with following signature:
    >void printEven(int[] a)
     
   that prints all even values.

1.d Write a function with following signature:
    >void printCond(int[] a,boolean condition)
     
   that prints 
   a. even values if 'condition' is 'true'
   b. odd values if 'condition' is 'false'
   
__Assignment2:__ 

Given a number 'n'. Say 'n = 2'. Write a code to print this

```
   **
   **
   
   //2 * 2 stars
```

if 'n = 3', then 
```   
   ***
   ***
   ***
   
   //3 * 3 stars
```
   
   i.e. 'n * n' stars
   
   (n can be changed by me, so don't code for a specific n).
   Also make sure you code is written inside a function. No inside 'main'
   
__Assignment3:__ 

For same input now draw this:   

say n = 2
```   
   
   *
   **
```   

say n = 3
```
   
   *
   **
   ***
```  
  etc.  

__Assignment4:__ Banking Application:

Create classes that a bank may use to represent customer 's bank accounts (Checking and Savings).
All the bank customers can deposit (Credit) money into their account and/or withdraw (debit) money from their account.
Create necessary classes.
    * Savings Accounts - earn interest on the money in the account.
    * Checking accounts - charges a fixed fee for each transaction the customer makes.

1.  __SavingsAccount__:
    Contains the following fields and methods:
    * initialBalance
    * getter/setters	
    * validation for initialBalance: Balance cannot be negative or zero.
    * credit() - make sure  input is positive and greater than 0 and credit the account. If input does not pass validation, then printout "Please ensure the amount to be deposited is not negative: "
    * debit() - make sure there is enough money, otherwise it should left unchanged
    * additional property called interestRate (percentage assigned to account)
    * method calculateInterest() that returns the amount of interest. (Based on ‘interestRate’ property)

2. __CheckingAccount__:
    Contains the following fields and methods
    * initialBalance
    * getter/setters
    * validation for initialBalance: Balance cannot be negative or zero.
    * credit() - make input is correct and positive (if not, then do nothing) and credit the account.
    * debit() - make sure there is enough money, otherwise it should be left unchanged and to take under consideration the fee charged
    * additional instance variable for fee charged per transaction. Fee is $5 per transaction.

3. __Driver class:__ (name : BankApplicationDriver)
    * Now create a driver class that creates objects of each class and invokes each method.
Add interest to the savingsAccount object by first invoking its caculateInterest () method, then pass the returned interest amount to the object's credit() method.
    * Create an array of 2 savings account and another array of 2 checking account. And populate with some values.

Next,
For each checking account in the array, withdraw 5% of balance from the account using method debit() and deposit 2% of remaining amount into the account using the method deposit().
Again, go through checking account array and for each account print all details in form of 
nameOfField1 = valueOfField1 : nameOfField2 = valueOfField2 

Next,
For SavingsAccount array iterate through array, calculate the amount of interest owed to the Account using method calculateInterest(), then add the interest to the account balance using method credit().
After processing an Account, print the updated balance obtained by using the getBalance().
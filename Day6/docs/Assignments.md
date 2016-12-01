#####Assignments are for you. 
Please be honest with yourself. If you don't understand please ask questions and try to 
understand the concept

__Assignment1:__
1. Copy the classes which you wrote in Assignment4 of Day3 and put it under 'banking' package.
2. You will modify these classes for this assignment.
3. Scan both SavingAccount and CheckingAccount to and duplicated variables. Extract those common variables in a common 
    base class called BaseAccount and extend both CheckingAccount and SavingsAccount classes with the BaseAccount.
    Make sure you change appropriately getter's and setter's a nd to string methods.
4. Reason what fields should be private, public and protected in each class. Also see if there are any common methods in 
    CheckingAccount and SavingAccount class, and if you find any then push it to baseAccount parent class.
5. Create a field 'accountHash' in base account class. This field is private and has no getters and setters. Any child 
    that extends BaseAccount needs to provide account hash when creating object. Make sure this requirement is satisfied. 
    To create value for accountHash, take accountNumber and today's Date and form a string concatenating both and then 
    encode it with base 64. This also means that inorder to create any account : 
    1. 'initialBalance' : needs to be provided by client.
    2. 'accountNumber' : either client provides it or you need to generate one. 
    
    (NOTE: these both are previous requirements which still need to be satisfied)
7. 
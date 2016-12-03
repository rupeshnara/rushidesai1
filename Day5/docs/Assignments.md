#####Assignments are for you. 
Please be honest with yourself. If you don't understand please ask questions and try to 
understand the concept


__Assignment1:__
                                                                   1. Copy the classes which you wrote in Assignment4 of Day3 and put it under 'banking' package.
                                                                   2. You will modify these classes for this assignment.
                                                                   3. Modify checkingAccount and savingAccount class to force the client to only create instances if 'initialBalance' constraints are met.
                                                                       3.1 Client can only create object if he provides initialBalance.
                                                                       3.2 Object will only be created if initialBalance > 0
                                                                   4. Count instances of checkingAccount class and savingsAccount class separately. The count should be full proof i.e. No matter how client 
                                                                       creates instances of either classes, count should be correct.
                                                                   5. Add a property called 'accountNumber' to both classes. Client can give you a 8 digit accountNumber while creating a
                                                                       new account. 
                                                                       1. If he doesn't give you a new accountNumber, then you need to generate a new 8 digit account number, make 
                                                                           sure the new accountNumber you created isn't a duplicate.
                                                                       2. If client gives you a accountNumber then check the following:
                                                                           1. The accountNumber has 8 digits.
                                                                           2. The accountNumber isnt a duplicate.
                                                                           In both cases throw an exception with appropriate messages.
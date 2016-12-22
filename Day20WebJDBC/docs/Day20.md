##JDBC:

>JDBC allows us to access database. 

###DataBases:
1. RDMS : Relational Database systems (Training purpose, this is what we will cover.)
2. NoSql : Usually for big data.
3. Columnar :
 
###RDMS: SQL (Structured query language)
1. Information is stored in form of tables:
2. Primary key serves as ID's of rows.
    1. Primary keys have to be unique and non null.
    2. Table is required to have at-least one primary key
    
    
User -> Each user has few accounts -> Each account has checking, saving or both, credit cards etc. etc.
    -> User has friend

####User table (BAD : Putting all information in one table makes duplication happen)
UserName Password Name SavingAccountNumber CheckingAccountNumber ccNumber   friend      interestRate   transactionFee
rk        1234     rk    12345671               12345678            23232     hk
rk        1234     rk    12345671               12345678            23232     anitha
rk        1234     rk    12345671               12345678            23232     rupesh
rk        1234     rk    12345671               12345678            23232     sujana
rk        1234     rk    12345671               12345679            23232     sujana
rk        1234     rk    12345671               12345679            23232     rupesh
rk        1234     rk    12345671               12345679            23232     hk
rk        1234     rk    12345671               12345679            23232     anitha

####User Table (Better)
UserName(PrimaryKey)    Password    Name
    rk                      1234     rk 
    hk                      1234     hk 
    anitha                  1234     anitha
    sujana                  1234     sujana
    rupesh                  1234     rupesh
    sai                     1234     sai   

####SavingsAccount table
SavingsAccountNumber(PrimaryKey)    interestRate   UserName(ForeignKey is PrimaryKey of some other table) 
    12345671                            12          rk  

#####CheckingAccount table
CheckingAccountNumber    transactionFee   UserName
12345678                    2               rk
12345679                    3               rk

#####Friend
friendID    Username
    hk          rk
    anitha      rk
    sujana      rk
    rupesh      rk



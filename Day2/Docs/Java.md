##Popular Languages:
1. Vb.net
2. C#
3. Python
4. Perl
5. C/C++
6. Java

#####How java is special :
> Write once run everywhere !!

Almost all big companies eventually turn into Java workshops. Big data today runs on Java. Hadoop, spark, hive etc all these tools written in Java or a jvm language. 
https://www.wired.com/2013/09/the-second-coming-of-java/

1. C -> Test.c -> Compiler Windows -> hex (binary) Windows : Can only run on the OS on which it was compiled !
               -> Compiler Mac -> hex Mac
               
2. Java -> Test.java -> Compiler Windows -> .class ->  JRE (Java Runtime Environment)-> Hex (Binary) Windows->
                                            .class -> JRE mac -> Hex (Binary)  
                                            
JRE -> Runtime env for java

JDK -> Java development Kit -> Library and Compiler and Lot's of other things.

Java performance and c performance are almost the same.
----------------------------------

######Other big differences
Java : 1. Statically typed language
       2. OOP's 
        
1. Data-types : 
       Say, we want to get marks for math of 100 students , add and print it: 
            stud1 = 10
            stud2 = 12
            stud3 = "name"
            stud100 = 12 
           
            total = studrepresentationud3   //+ is not defined on string(stud3) 
            println (total)
   This tells us that during program we need to have          
   1. How much memory to reserve:
        stud1
   2. What operations are allowed on that variable:
   
   int stud1;                                           | Memory : 16 bits 
   
    
#####Primary data-types: Data types that come in built with java.
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
    1. Integer : -1,1,2,3,4                                | Memory: 16 bits
    2. Float : -1.2, 1.2, 1, 2                             | Memory : 32 bits
    Range is 'n' (Memory occupied) : range will be: -2^n  : 2^n - 1
    3. char = 'c'
    String s = "temp"
    Answer : What type of data will you store in that variable.
 
 
###Variables: 
We need a way to store data temporarily when program is running. Variables is how we do that
OOP's : Object oriented programming: It is everything about how to better organize the variables in more logical and consistent manner

1. How do you organize your code: You organize your code as concepts that you see in physical world
2. How do we better organize our variables.


###Evolution of data types:

Program to Collect all the marks for all students in a class. And then give total, or avg etc.

Started with
1. Primary Data-types :

	int 
	char
	boolean
	String -> Array[char]

	int -> few operation defined -> +  -

    **Issues:** 
    1. Tedious to create to many variables. For eg. I want to store names of 100 Students. 
        I need to write 100 lines of code just to create those variables
    2. Complex to manage in larger programs.
     
```
    String student1Name = "Sai"         //3 bytes
    String student2Name = "hARI"        //3 bytes
    int student1MathMarks = 10          //2 bytes
    int student2MathMarks = 12          //2 bytes
    
    total = student1MathMarks + student2MathMarks
``` 

2. Arrays -> Allows us to define multiple variables of SAME TYPE with one line of code

    1. Need contagious memory location.
            Contrast with LinkedList

``` 
    Integer[] i = new Integer[3]; //Creates 3 int variables in one line of code
    /**
     * Memory representation :
     * 1000 int i[0]  
     * 1001 int i[1]
     * 1002 int i[2]
     */
```

Example: Code snippet to store marks (of three subject) for 10 students and calculate % of all students

```
	int[10] marksMath	// markMath[1] = 12, markmath[2] = 12
	int[10] marksEnglish //marksEnglish[1]
	int[10] marksSci     //marksSci[1]
	String[10] name     //name[1]

	for(i = 1 to 100){
	 	int totalMarks = marksMath[i] + marksSci[i] + marksEnglish[i] ;
		System.out.println name[i] : totalMarks/3*100 
	}
```

**Issues : If multiple variables 'belong' to same entity; as in above example marks of three subject belong to same student; in such scenarios we need to correlate by using index of arrays**

Expected Output:
	srikar : 91%


3. Custom Data types : 

Only exist in C/C++. Java doesnt have it.
structure: It is the next step to array : Allows us to create more variables with one line code of Same or DIFFERENT DataTypes. 
            We provide 'Template' of how variable should look in memory.

Pseudo code to achieve same task as we achieved by arrays via struct.
```
    struct Student {
        int marksMath;        //1 unit
        int marksEnglish;    //1 unit
        int marksSocial;
        int marksMusic;
        //Student s:int marstudentsArrayksSci        //1 unit
        String name;            //1 unit
        //1 var of student = 4 units
    }

       int       i          =  10;
       int[]     arrayI     =  10;
    Student[] studentsArray = new Student[10];    //40


    /*-----------Diversion to for loop----------
    for(i = 1 to 100){
        //i = 1
        //i = 2
        //i = 3
        Student s = studentsArray[i]
    ..
    ...
    }
    -------End diversion--------------*/
    
    public static void main() {
        for (Student s : studentsArray) {
            //s = studentsArray[1]
            //s = studentsArray[2]
            int totalMarks = calculateTotal(s);
            System.out.println(s.name+":"+totalmarks)
        }
    }

    int caculateTotal(Student s){
        int totalMakes = s.marksMath +s.marksEnglish + s.marksSci + s.music + s.social
        int temp var
    
        return totalMarks
    }

    int calcualteMathSci(Student s){
        int totalMathSci = s.marksMath+ s.marksSci
        return totalMathSci
    }

    int calculateExcludemathSci(Student s){
        int total = s.marksMusic + s.marksEnglish + s.marksSocial
        return total
    }
```

How arrays of structs looks in memory:

studentsArray[1]
studentsArray[2]
studentsArray[3]
//.marksEnglish



4. Class: Class is next step evolution to structs: They have data (variables of DIFFERENT data-type) just like struct but also allow us to define behaviours

```java
    class Student{
        //State
        int marksMath;		//1 unit
        int marksEnglish;	//1 unit
        int marksSocial;    //1 unit
        int marksMusic;     //1 unit
        int marksSci;
        String name;		//1 unit
        //1 var of student = 5 units
    
    
        //Behaviour
        int calculateTotal(){
            int totalMakes = marksMath + marksEnglish + marksSocial + marksMusic + marksSci;
            int temp_var;
    
            return totalMarks;
        }
    
        int calculateMathSci(){
            int totalMathSci = marksMath + marksSci;
            return totalMathSci;
        }
    
        int calculateExcludeMathSci(){
            int total = marksEnglish + marksSocial + marksMusic;
            return total;
        }
    }


    //How to user above defined custom data dataype? : Look at below code snippet. 
    class Main{
        public static void main(String[] args){
        
            Student studentsFormClass1 = new Student();       //Memory : 500 units 
            Student studentsFormClass2 = new Student();       //Memory : 500 units 
            
            int totalForClass1 = studentsFormClass1.calculateTotal();       
            int totalForClass2 = studentsFormClass2.calculateTotal();

            for(Student s : studentsArray){     //
                //s = studentsArray[1]
                //s = studentsArray[2]
                System.out.println(s.name +":"+ s.calcualteMathSci());
        
                s.calcualteTotal();
            }
        }
    }
    
    //Student studentsFormClass1 = new Student();
    //Student studentsFormClass2 = new Student();
/**
  * Memory representation: 
  *  
  *   ----------------------------------memory space for studentsFormClass1---------------
  *      name[100]
  *      mathMarks[100]
  *   
  *      sum(){
  *      }
  *   --------------------------------------------------------------------
  *   
  *   
  *   ----------------------------------memory space for studentsFormClass2---------------
  *        name[100]
  *        mathMarks[100]
  *      
  *        sum(){
  *        }
  *   --------------------------------------------------------------------
  */   
```
Here we moved the methods which earlier were outside structure Student and moved it inside the Class Student itself. This is because all the methods work on the data of the class Student itself.

######The difference between struct and class is that class allows methods(functions) to be declared inside the custom data-type. 

How is this helpful?
It is assumed that any function defined inside the class can access all the data declared inside that class. 
This simplifies developers life by not having him pass all the data to the function.


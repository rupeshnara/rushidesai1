##Java
http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
http://docs.oracle.com/javase/tutorial/java/concepts/

##IDE
https://www.jetbrains.com/idea/download/#section=windows

Problem : How do we share code?
##Version Control systems: (Share code)
####Subversion
####CVS
####Mecurial
###Git
https://desktop.github.com/

####Workflow: How VCS stores code and retrieves it.

1. Repository: Server to store all your source code.
2. Commit: You tell 'git' to save you current changes.
3. Branches: Where you save your code, with each version
4. Checkout/Clone: Get code from 'repo'
5. Push: Push changes from your local 'branch1' to server 'branch1'
6. Pull: Get code from server 'branch1' to local 'branch1'
7. Merge: Get code from server 'branch1' to local 'branch2'

####Git branching models
http://nvie.com/posts/a-successful-git-branching-model/

####Problem statement: I want to reuse code written by someone else
1. Someone needs to write and package it and put it somewhere where I can access (Shared place : repository)
2. I need to access it :) -> Automate !!
    ----Digress
        Jar -> Zip of files which java understands. (Library)
        War ->
        Ear ->
    -----

###Build System
####Maven
1. Dependency: Library which our project uses (hence needs it!!)
2. Transitive Dependencies: Indirect dependencies for our project

How maven works:
1. pom.xml -> 


Parent-
        |
        |-Day1
        |
        |-Day2
        |
        |-Day3
        |
        |
        
        
        |-Day60


Packaged into one artifact

War -> Collection of jars
       1. UI jar -> Collection of .class files 
       2. DB Jar
       3. Day1 jar
       4. Day2 jar


Test.jar -> 1. Test.class
            2. TestChild.class
            






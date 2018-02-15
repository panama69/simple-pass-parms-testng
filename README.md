# Instructions
This simple LeanFT/TestNG test is to demonstrate different ways to pass data to a test.

In this script it shows:

1. Passing/setting values from within the pom.xml file for use in the script
1. Passing values via the @Parameters annotation
1. Passing values using the @DataProvider annotation
1. Passing values from a maven command line

The first 3 are shown inside the script and the results can be seen by executing the 'mvn test' command.

To pass an argument from the maven command line, us the following:
```
mvn clean test -Dcorndog="Yum Yum"
```

The above will display a value of "Yum Yum" rather than "GOOD" when the test is executed

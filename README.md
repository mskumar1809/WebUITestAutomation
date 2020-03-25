# ZulhkeTestAutomation

***Requirements of the Assignment****
```
1. Automate the UI tests for http://automationpractice.com/ using Selenium and Cucumber 
2. Java must be used as the programming language. Use JUnit as the test runner
3. Test the “Sign In” flow and basic “Add to cart” functionality
4. The tests should run on “Chrome” browser

```



***Tech Stack used in the project***
```
1. Programming Language : Java
2. Design Pattern: Page Object Model with Page Factory
3. BDD layer: Cucumber
4. Unit Testing framework: JUnit
5. Dependency Management: Maven
6. Remote Cross browser/Responsive Testing: Browserstack
7. Continuous Integration: CircleCI
8. Reporting: Extent Reporting
9. Source code Management: Github
```
***Pre-requisites to run the Project***
```
1. Java to be installed > 1.8
2. Maven to be installed to run the tests locally from the terminal
3. Any IDE (Jetbeans/Eclipse) -Good to have but not mandatory`
```

***Set up & Execution Instructions***
```
1. Set Up Instructions
  a. Clone the repo into local using the command
     `git clone https://github.com/mskumar1809/ZulhkeTestAutomation.git`
  b. Change directory into the root of the project
     `cd ZulhkeTestAutomation`  
2. Execution Instructions
  a. Local Mode ( Executes in the local machine)
     run the command 
     `mvn test`    
  b. Remote Mode (Executes in Browser stack)
     run the command 
     `mvn test -Dexecution_mode=BS`
```

***Video Logs***
```
 1. Local Mode Execution
    Below is the video of the local execution
 ```
   https://drive.google.com/open?id=1lpeEve4pYI-YUW5xbVpJqTckHMu-5x6K
 

***Reporting***
```
The HTML reports are automatically stored in the Extent Reports folder under Target folder in the rpoject after every execution
``` 

***ContinousIntegration***
```
Used the Circles CI to integrate the project for CI, which would run all the tests and certify the build before any code is committed and merged.
Below is the Document which shows the Circles CI integration and the builds status for every commit into master

https://xyz
```



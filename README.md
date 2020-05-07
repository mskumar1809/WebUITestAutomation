# WebUITestAutomation

***Objectives of the Assignment****
```
1. Automate the UI tests for http://automationpractice.com/ using Selenium and Cucumber 
2. Java must be used as the programming language. Use JUnit as the test runner
3. The tests should run on “Chrome” browser

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

***Video Explaination***
```
 The Below video explains the 
 1. High level technical aspects of the project 
 2. Project Structure
 3. Test Cases
 4. Execution Details
 5. Reporting structure and reports
 6. Circles CI integration with current project 
 
 ```
   https://drive.google.com/open?id=1fw1IoYlS3Raa-YVeE6eMfKvvi79cTHMp
 
***Reporting***
```
The HTML reports are automatically stored in the Extent Reports folder under Target folder in the project after every execution

``` 

***ContinousIntegration***
```
Used the Circles CI to integrate the project for CI, which would run all the tests and certify the build before any code is committed and merged.
Below is the Circles-CI dashboard which shows the Circles CI integration and the builds status for every commit into master

https://app.circleci.com/pipelines/github/mskumar1809/ZulhkeTestAutomation/
```



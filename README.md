# BDD_UsingCucumberAndPOM
Behavioral Driven Development (BDD) using cucmber,Design approach Page Object Model(POM) using Selenium with Java, JUnit framework and Maven AUT-tripadvisor  

Behavioral Driven Development (BDD) using cucmber,Design approach Page Object Model(POM) using Selenium with Java, JUnit framework and Maven AUT-tripadvisor  

The given project demonstrate the way of creating Page Object Model(POM) design pattern using Cucumber BDD and selenium
Application Under Test: Tripadvisor.com (You can find manual Test cases under folder /ManualTestCases

Technologies Used:
1)	Selenium WebDriver 4.4 (opensource)
2)	JDK 1.8 (Java Development Kit)
3)	Eclipse (Java Editor)
4)	Cucumber 7.x JVM library
5)	JUnit 4 (Test Unit Framework)
6)	Maven (Build Automation Tool)
7)	Log4j (logging API)
8)	Browser - Google Chrome

Automation Framework Architecture: 
1)	 POM (Page Object Model) 
2)	 Maven (Build Automation Tool) 
3)	 Test Libraries for different UI Pages 
4)	 Report – cucumber web report, cucumber html report, junit report, json report
5)	 GITHub Repository (Code Versioning Tool)

The steps taken to create framework
1)	Created feature files under src/test/resources for HomePage and Login Page Test Scenarios 
2)	Created cucumber hooks under src/test/java inside com.TripAdvisor.WebApp.Base package in which @Before annotated method initialize WebDriver instance to the browser specified in configuration file and opened the base URL of the application
3)	Created different page classes for Home Page as well Login Page according to POM
4)	Written a glue code src/test/java inside com.TripAdvisor.WebApp.StepDefinationFiles package and called action methods of page class 
5)	Under cucumber Hooks @After(order=1) annotated method takes the screenshot of failed scenarios and save to the screenshot folder as well attach it to report.
This Project is still in building stage    

The best Practices following to design:
1)	Every Test Scenario has single responsibility 
2)	Each page has separate page class
3)	Step definition methods do not call any WebDriver methods they can have assertions only.
4)	A page object represents meaningful elements of a page and not necessarily a complete page
5)	 When navigate to another page, the initial page object should return another page object for the new page 
6)	A page object is not have any assertions
7)	Followed Object Oriented Programming Concepts
i)	Encapsulation:  In every page class made all the locators private and  action methods as public
ii)	Abstraction: created Page class as a abstract class which has abstract methods like getPageTitle(), getWebElement(By locator)
iii)	Inheritance: BasePage class which has common methods which is been extended by all Page classes
iv)	Polymorphism:  will use method overloading and logged in to the application with different set of parameters  
v)	Reduced code duplicacy
8)	Increased code reusability
9)	Left no hardcoded data in source code
10)	Will Use Extensive logging- everything which is part of source code get analyzed from logs without looking at the source code
11)	Generated and saved failure proofs outside the src code screenshots/
12)	Using as many assertions as possible
13)	Used explicite wait on each webelement to get loaded
14)	Handeled Exceptions with try catch block.

//------------------ROLES AND RESPONSIBILITIES--------------------------------------

//As an automation tester, my role begins as soon as we receive the SRS or FRS from the product team. While manual testers focus on 
//exploratory scenarios and high-level test planning, I analyze the requirements to identify stable, repetitive, and high-priority test cases suitable for automation.

//I work on a Selenium + Java automation framework using TestNG, and we follow the Page Object Model (POM) design pattern 
//for better maintainability and scalability.

//Once the application becomes stable, I start automating test cases in parallel with manual execution, which helps speed up feedback 
//during the sprint cycle.

//I also contribute to code reviews, maintain the regression suite, and collaborate closely with both manual testers and developers to 
//ensure proper coverage and early bug detection.

//In my current project, we follow a Shift Left Testing approach with a parallel QA process, where both manual and automation testers 
//are involved right from the requirement phase.



//------------------------------FRAMEWORK EXPLANATION--------------------------------------

//We've built a hybrid automation framework using Maven and TestNG, following the Page Object Model (POM) design pattern. It combines 
//data-driven testing (using Excel and property files), modular reusable utilities, and integrates with ExtentReports and Log4j2 for 
//reporting and logging. The framework is designed to be scalable, maintainable, and CI-ready with Jenkins integration.


//At the project root level, we keep the pom.xml file for managing dependencies and the other testng.xml files for configuring test suites, 
//grouping, and execution control.

//-----------------------------src/main/java – which contains Core Logic & Components----------------------------

//1.abstractcomponents package
//Contains reusable generic methods for browser interaction and waiting, like explicit waits, JavaScript executor utilities, 
//and common browser actions.

//2.pageobjects package
//Each class represents a web page using the Page Object Model.
//These classes have Web element locators and Corresponding methods to interact with those elements

//3. utilities package has Reusable helper classes like:(This is where file handling logic lives)
//Holds reusable helper classes such as the Excel utility (for reading test data), property file reader (for config values), 
//and logging utility using Log4j2.

//4.listeners package
//Contains TestNG listener classes implementing  ITestListener.
//These handle actions like capturing screenshots on test failure, sending logs to console and reports, 
//and integrating with ExtentReports.

//5. resources package- This is just the data/config files, not the code
//Stores all configuration and test data files like config.properties (browser, base URL, timeouts), testdata.xlsx (Excel test data), 
//and log4j2.xml (logging configurations).

//----------------------------src/test/java – Test Execution Layer-------------------------------
//Contains the BaseTest.java class that reads configurations, initializes WebDriver, and sets up the browser 
//(Chrome, Firefox, Headless, etc.)


//2. tests package which contains Actual test classes 
//Contains actual test classes (e.g., LoginTest.java, UserRegistrationTest.java) written with TestNG annotations like @Test and 
//@DataProvider. These tests pull data from Excel or property files and Extends BaseTest to inherit driver setup and teardown logic

//The entire project is Maven-based for dependency management, Git for version control, and is Jenkins-integrated for continuous integration and scheduled test runs

//----------------------------------------------------------

//Below answer can be given for these questions
//Did you build the framework from scratch?
//What challenges did you face while working on the framework?
//Tell me about a time you improved something in your project or framework

//-----------------------------------------------------

//While I didn’t build the entire framework from scratch, I played a key role in transforming a basic setup into a more stable 
//and scalable automation framework.
//When I joined, the framework had several limitations — there were many hardcoded values, Thread.sleep() was used extensively, 
//and the locators were basic (causing frequent failures). 
//Reporting was also limited to default TestNG reports, and execution was done manually on local machines.
//I worked on improving this by:

//Replacing Thread.sleep() with explicit waits

//Rewriting unreliable locators using  XPath functions like contains(), starts-with()

//Adding data-driven testing using Excel with Apache POI

//Integrating Extent Reports for better visibility and detailed HTML logs

//Scheduling nightly builds via Jenkins, which helped us automate regression runs

//-------------------------

//----No need to answer until unless they specifically ask this(Have you worked in a product-based or service-based company?)----------
//In my previous company, which was product-based, I worked on an already well-structured framework.
//But in my current startup (service-based with a few products as well), I got the opportunity to redesign and restructure the framework 
//end-to-end based on project needs,
//which gave me hands-on exposure to real-time framework-level decisions.




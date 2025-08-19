//----------------------------Test Cases for Automation-------------

//Stable Functionality: If the functionality is  stable and won't change frequently, it is a good candidate for automation.
//Regression and Sanity Testing: If you need to run the test case repeatedly, especially with every new build or release, automation will save time.
//Future Reusability: If the test case can be reused across different projects, releases, or configurations, it’s a good candidate for automation.
//If we need to test with multiple sets of data can do with excel or dataprovider etc - best for automation
// Scenarios Requiring Cross-Browser Testing
//High-Risk and Critical Functionality-automated tests can quickly detect issues in crucial functionality, reducing the chances of a major failure in production.

//--------------------------Test Cases not for Automation----------------------

//Exploratory Testing: Manual testing is best for uncovering unexpected issues or evaluating a feature’s usability, as humans can think creatively.
//Short-Term or One-Time Tests: For features that are developed and only tested once (such as a one-off change), the investment in automation may not be worth the effort.
//High-Degree of Uncertainty: If the functionality is rapidly changing or unstable, automation scripts will need constant updates, making manual testing a better choice.
//Visual/UI Testing: Automated tools can struggle with visual differences that require human judgment, so UI testing often needs manual intervention.
//New Features: In the early stages of development, where requirements and functionality are constantly changing, manual testing is more flexible. You can then automate once the feature stabilizes.

//----------------------------------psvm--------------------------------

//1. Yes, the main method must have a specific signature for the JVM to recognize it as the starting point of a Java application.
//2. public: So the JVM can access it from outside the class.
//3. static: So it can be called without creating an object.
//4. void: It returns nothing.
//5. main: The name must be exactly main.
//6. String[] args: An array of String arguments passed from the command line.

//------------------------what can be changed in psvm--------------------------

//String[] args → String[] input- No issue. The parameter name is just a variable name.
//String... args- No issue. String... is valid syntax and equivalent to String[].

//If the signature misses which is provided by JVM, will compile just fine but it will throw runTimeError, in eclipse it doesnt even shown run as java application.

//-------------------System.out.println()------------------------
//It’s a Java statement used to print text/output to the console.

//1. System- The System is a class that provides essential utilities like standard input, output, and error streams. 
//It cannot be instantiated as system constructor is marked as private.-- System class is an example of encapsulation
//2. out- Represents the standard output stream (usually the console) and ready to accept output when your program runs.
//3. Prints whatever you pass to it (like text or numbers) to the console.
//Then adds a line break at the end so the next output starts on a new line.

//----------------Selenium WebDriver hierarchy ----------------
//RemoteWebDriver implements interfaces like WebDriver,TakesScreenshot, JavascriptExecutor others

//ChromeDriver extends ChromiumDriver extends RemoteWebDriver

//FirefoxDriver extends  RemoteWebDriver directly

//EdgeDriver extends ChromiumDriver extends RemoteWebDriver

//SafariDriver extends RemoteWebDriver directly

//-------------------Selenium WebDriver architecture----------------------
//1. Our test scripts, written in languages like Java or Python 
//2. Selenium client libraries, translate high-level commands (e.g., getText()) into standardized HTTP requests 
//following the W3C WebDriver protocol.
//3. These requests are then sent to a specific browser driver executable (like chromedriver.exe or geckodriver.exe), 
//which acts as a crucial proxy or translator
//4. This driver receives the W3C HTTP requests and translates them into the browser's native, internal automation commands.
//5. The browser then performs the requested actions (e.g., navigating, clicking, retrieving text) and sends its response back to the driver
//6. Finally, the driver translates this native browser response back into a W3C-compliant HTTP format, 
//which the Selenium client library understands and delivers as the result.


//--------------------------Selenium waits hiearchy-------------------------

//Wait (Interface) Top-level interface
//FluentWait (Class) –  Implements Wait
//WebDriverWait (Class) extends FluentWait
//Implicit Wait – Not part of Wait hierarchy ,It's a built-in timeout mechanism configured via WebDriver directly.

//-------------------------Differences Between Abstract Class and Interface---------------

//Abstract Class: Can have both abstract methods (without body) and concrete methods (with implementation).
//Interface: Before Java 8, all methods were abstract (no body). 
//Since Java 8, interfaces can have default and static methods with implementation and private also after java 9.

//Abstract Class: Java allows extending only one abstract class (single inheritance).
//Interface: A class can implement multiple interfaces (multiple inheritance of type).

//Abstract Class: Can have constructors.
//Interface: Cannot have constructors.

//Abstract Class: May or may not implement all methods of an interface it implements.
//Concrete Class: Must implement all interface methods it declares to implement.

//Abstract Class: Cannot be instantiated directly.(We can create instances for subclasses which extends abstract classes)
//Interface: Cannot be instantiated directly.


//If a class implements an interface but doesn't implement all methods, it must be declared abstract.

//If a class extends an abstract class but doesn't implement all abstract methods, it must also be abstract.







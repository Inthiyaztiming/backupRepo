//---------How to handle an alert which is popping up sporadically and no one knows when its getting occured-------------------

//Step 1: Create handleUnexpectedAlert() method
//Use explicit wait like ExpectedConditions.alertIsPresent() to wait briefly for any alert.
//Use alert.accept() to click OK if alert is found.
//Wrap all this in a try-catch to avoid crashes if no alert appears.

//Step 2: Create "Safe" Helper Methods
//Create static methods like safeSendKeys() and safeClick()
//These methods:
//Do the Selenium action (e.g., sendKeys, click)
//Call handleUnexpectedAlert() after the action (and sometimes before too)

//Step 3: Use Safe Methods Instead of Raw driver.findElement()
//Use safeSendKeys(driver, By.id("field1"), "value1");- parameters are WebDriver driver, by locator, String value
//Use safeClick(driver, By.id("submit"));- parameters are WebDriver driver, by locator
//That way:
//You don’t have to manually check for alerts each time.
//The script won’t break even if an alert randomly pops up.


//From selenium 4.27 getattribute was deprecated in favor of more explicit alternatives like getDomAttribute()but in latest version 4.33 it was reverted back and getattribute() will be supported


//------------------------------Exceptions hiearchy in java---------------------

//In Java, the Throwable class is the superclass of all errors and exceptions. It has two direct subclasses: Error and Exception.
//Error represents serious issues that are generally not meant to be caught by applications — things like OutOfMemoryError or StackOverflowError.
//Exception is used for conditions that an application might want to catch and handle. It has two main categories:
//Checked exceptions, which are checked at compile time — like IOException or SQLException. These must be either handled with a try-catch block or declared with a throws clause.
//Unchecked exceptions, which are subclasses of RuntimeException — like NullPointerException or ArrayIndexOutOfBoundsException. These are not checked at compile time and don't need to be explicitly handled.
//So yes, both checked and unchecked exceptions are subclasses of Exception, not of Error.

//-----------------------------------Selenium Exceptions------------------

//All Selenium exceptions are unchecked(RunTimeExceptions)
//RuntimeException — parent class for all runtime (unchecked) exceptions in Java.
//WebDriverException — child of RuntimeException and parent of all Selenium exceptions.

//-------------------------WebDriver driver = new ChromeDriver();----------------------------

//1.WebDriver driver = new ChromeDriver(); is an example of runtime polymorphism in Java. 
//2.The reference type is WebDriver, so I can only access the methods defined in that interface. 
//3.This helps in making my test scripts browser-independent. 
//4.I can switch to FirefoxDriver or EdgeDriver without changing the rest of the code, because all drivers implement WebDriver
//5.driver is the same reference variable (of type WebDriver)
//6.But it points to different objects at runtime- This is runtime polymorphism

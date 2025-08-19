//--------------------------------OOP Concepts Used in My Automation Framework (Simplified Answer)-----------------------------
//Encapsulation
//Each web page in the project is represented by a separate class (using the Page Object Model).
//Each class contains private locators and public methods to interact with them.
//These classes contain locators and related methods to interact with elements like buttons or input fields.
//This hides the internal details of how the interaction is done, and only exposes what the test needs to use — that’s encapsulation.

//Inheritance
//I have a BaseTest class that handles common setup tasks — like reading config files, launching browsers (Chrome, Firefox, Headless, etc.), and initializing WebDriver.
//All test classes extend this base class to reuse its functionality — this is inheritance.

//Polymorphism (Runtime Polymorphism)
//We declare the  reference type as WebDriver(not a specific browser class).
//At runtime, based on the our choice, we assign it to different browsers ChromeDriver, FirefoxDriver, etc.
//This lets us use the same WebDriver methods regardless of the browser — that’s runtime polymorphism.


//Errors (human mistakes) in coding or design cause defects-> Example:-Using == instead of != in the age validation condition

//Defects (flaws in the product/code), which then lead to bugs - Example:- A flaw or issue in the product/code (caused by an error).

//Bugs (issues/problems seen during testing or use)- The issue or failure observed during testing or by users.



//-------------------------------StaleElementReferenceException in Selenium-----------------------------
// Why does it happen?
//A StaleElementReferenceException occurs when the WebElement you previously found is no longer attached to the current DOM. 

//Common causes include:
//The page was reloaded or navigated away after locating the element but before interacting with it.
//The DOM was dynamically updated (e.g., the element was removed and re-added or replaced).

//How to handle it:
//Use a try-catch block to catch the exception and retry finding the element.
//Use ExpectedConditions.refreshed() to automatically re-fetch the element if it becomes stale during an explicit wait.
//Example: wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
//This combines waiting for visibility with automatic retry on staleness.

//Alternative approach: wait for the old element to become stale, then find it again
//wait.until(ExpectedConditions.stalenessOf(oldElement));//Wait until the old element is detached from the DOM
//WebElement newElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("aaa")));//Then find the new instance of the element



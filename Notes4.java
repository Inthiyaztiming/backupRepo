//Toplevel classes in normal class- package-private (default) if no access modifier is mentioned
//Allowed-->public, default ,final, abstract
//Not allowed-->private, protected , static 

//Members(variables and methods) in normal class- default if no access modifier is mentioned
//Allowed-->public, default ,final, private, protected, static, abstract(No body)
//Not allowed--> Mostly all common modifiers allowed

//Toplevel classes in abstract class- default if no access modifier is mentioned
//Allowed-->public, default ,abstract
//Not allowed-->private, final, protected, static

//Members(variables and methods) in abstract class-  default if no access modifier is mentioned
//Allowed-->Same as normal class members
//Not allowed--> Almost all standard modifiers allowed

//Toplevel interface- If no access modifier specified, interface is package-private (default), NOT public!
//Allowed-->public, default (package-private)
//Not allowed-->private, final, protected, static

//Members(variables and methods) in interface- Methods are public abstract by default if no body
//Allowed-->public, default(methods with body only), private(methods with body only), static(methods with body only), abstract(methods with body only)
//Not allowed--> final,protected

//Constructors in Normal Classes- default if no access modifier is mentioned
//Allowed-->public, protected,default (package-private),private
//Not allowed--> static,final,abstract

//Constructors in Abstract Classes-same as normal class

//Constructors in Interfaces-Interfaces do not have constructors.(cannot be instantiated)

//-----------------------------waits--------------------------------------
//Implicit Wait
// Applied to the entire WebDriver reference (driver).

//Affects only findElement and findElements methods.

// Selenium will wait up to the given time for elements to appear before throwing NoSuchElementException.

// It does not wait for other conditions (like visibility, clickability, etc.).

// Applies globally, so it can cause hidden delays in all element lookups.


// Explicit Wait
// Targets specific conditions (visibility, presence, clickability, etc.).

// Used with WebDriverWait + ExpectedConditions.
// More flexible and precise than implicit waits.

//Fluent Wait
// A type of explicit wait that lets you define:

//Maximum wait time

//Polling frequency

//Exception types to ignore
//it's basically a more customizable explicit wait.

// If an explicit wait condition like EC.visibility_of_element_located(python) uses findElement() inside, the implicit wait can interfere, causing longer wait times.

//If you do not use findElement or findElements inside your explicit wait, then implicit wait will not interfere — even if it's set globally.

//Because implicit wait only affects findElement and findElements calls.
//It has no effect on other types of condition checks.


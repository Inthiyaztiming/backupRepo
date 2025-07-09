//---------------------Platform independence in java------------------------

// A .java file(java source file) contains the raw source code written by the programmer. 
// When you run the javac (Java compiler) command, it compiles this source code and converts it into a .class file, which contains bytecode. 
// Bytecode is a platform-independent, intermediate code that is not tied to any specific hardware or operating system, making it portable across platforms. 
// This bytecode is then loaded into the Java Virtual Machine (JVM) at runtime, 
// where the JVM interprets or compiles it into machine-specific code for execution on the current platform, 
// allowing the same Java program to run on different systems without modification. 
// This concept is known as "write once, run anywhere" and sets Java apart from languages like C/C++, 
// which compile directly to platform-specific machine code. 
// Think of Java bytecode as a universal script written in a language that every JVM understands, 
// allowing it to run on any platform that has a JVM installed.


//-----------------Managing password in local(This appraoch is used only for local test runs )--------------------
//Creating a config.properties file under src/test/resources/ with key-value pairs- app.username=testuser- app.password=supersecret123
// we will read these values in base test which is extended by other test and java classes
//We will create a .gitignore file and add src/test/resources/config.properties to our .gitignore file so Git does not track or push it
//This will prevent Git from tracking or pushing this file to remote repositories.


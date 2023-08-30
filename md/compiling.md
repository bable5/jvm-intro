# Tooling



## Install the JDK
Note: Talk about JDK and JRE



Lots of options

* OpenJDK
* Amazon Corretto
* Many other groups who repackage OpenJDK as well



## Java Version Managers

* [SDKMAN](https://sdkman.io/install)
* [JENV](https://www.jenv.be/)
* Your favorite Linux package manager
* Intellij



## JAVA_HOME

* An environment variable
* Lots of tools look for this environment variable
* Used find the classes from the JRE
* May have to set it manually depending on your Java installation method
    * Version managers like SDKMAN and JENV should take care of this for you



# Compiling



## Invoke `javac` on the command line

Note: `javac` is the Java Compiler.
It's ultimately what will be invoked by any tool that compiles Java to bytecode.



```sh
javac MyClass.java
``` 

This produces another file called `MyClass.class`



## ByteCode

* The JVM (Java Virtual Machine) executes bytecode
* bytecode is the relatively highlevel assembly language for the jvm
* `javac` coverts Java sourcecode into bytecode

Note: HelloWorld bytecode on the next slide



`HelloWorld.class` disassembled with `javap`

```
public class MyClass {
  public MyClass();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #13                 // String Hello, World!
       5: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
```



# Running




`java MyClass`



# Classpath



* 'Paths' to search for classes on
* Comprised of paths to folders and Jars that store either Java source code or class files.
* Set with `-cp` flag
    * Has to be set to be set for each invocation of `javac` or `java`

Note: Do an example of 'old school' download jar and use it as a dependency



# Dependency and Build tools



* Downloading Jars and manually setting the classpath is hard
* `mvn` and `gradle` vastly simplify these problems
* They also know how to performance tasks like running tests, packaging artifacts, and publishing artifacts
* Both `mvn` and `gradle`are extensible through plugins



# Jar Files



<u>J</u>ava <u>Ar</u>chive

It is a zip file with a `META-INF` and `META-INF/MANIFEST.MF`




# Runnable Jar Files



* The MANIFEST may contain a `Main-Class` entry
* Needs to specify the class with the `static main` method
* `java -jar Runnable.jar` will run the program
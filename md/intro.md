# An Incantation



```java
public class MyClass {
    public static void main(String[] args){
        System.out.println("Hello, World!");
    }
}
```

Note: Classes, static vs. instance, default package



## Slightly more complicated




```java
public class MyClass {
    public static void main(String[] args){
        new MyClass().sayHello();
    }

    void sayHello() {
        System.out.println("Hello, World!");
    }
}
```

Note: This is often how a SpringBoot application will initialize itself.



## Spring Boot




```java
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
```



# Goals for this talk

* Build vocabulary for the underlying pieces of Java
* Be a reference for the underlying tools to build and a run a Java program
* Follow the questions the audience has
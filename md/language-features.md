# Java 8 Features


* Lambda Expressions
* Functional interfaces
* Streams api
* Try with resources
* A better Time Api
* New Http client



# Java 9 Features



* Project Jigsaw
  - 'Modularizes' the JDK
  - In practice it just means you have to do extra work to load things like JDBC drivers
* JShell

Note: Not much to say about these. They exist. I don't have experience with them.



# Java 10 Features


* Adds `var` keyword and type inference for variables
* 'Container Aware' JVM
  - JVM can tell how much memory is allocated to a container and set it's max heap accordingly 
* Changed to the release cadence to every 6 months, instead of when a particular set of features is complete. (See also Java 9 struggles and the death of Sun Microsystems)



# Java 13 Features



* switch expressions and a `yield` keyword
* text blocks



# Java 14 Features



* Records
  - automatically add a constructor, getters, equals, hashCode and toString 

Note: plublic record User(int id, String password){}



# Java 17



* Introduced the LTS model.
  - Current LTS release are 8, 11, 17
Creating a simple server to launch on EC2 Instance.

Here are the steps to generated executable jar file for the **Spring Boot Project** <br/>
* Insert the following code in <pre>\<build>
  \<plugins>
  \<plugin>
  \<groupId>org.springframework.boot\</groupId>
  \<artifactId>spring-boot-maven-plugin\</artifactId>
  \</plugin>
  \</plugins>
  \</build></pre>  in pom.xml file.
* Build the Project.
* Run <pre>mvn package</pre> commaind.
* It will generate files in <code> out</code> directory
* The maven package command may be used to generate the spring boot application executable jar. The maven package command compiles the source code, runs all of the test cases, and then creates the non-executable jar file. By include all of the required jar files, Maven will create the executable jar from the non-executable jar.

The executable and non-executable jars will be created in the target folder of the spring boot project.
* The executable jar file SpringBootExecutableJar-0.0.1-SNAPSHOT.jar and the non-executable jar file SpringBootExecutableJar-0.0.1-SNAPSHOT.jar.original are created in the target folder in the spring boot project directory.
<pre>
project_directory/target/SpringBootExecutableJar-0.0.1-SNAPSHOT.jar
project_directory/target/SpringBootExecutableJar-0.0.1-SNAPSHOT.jar.original
</pre>

Just look at the pom.xml file.
To generate files you can also use <code>mvn clean package </code> command.

One thing <java.version>8<java.version> 

Another thing, java version in environment path variable should be the same as the one with which you have build your project.
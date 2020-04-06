# Page Object Model and Page Factory example
Using Page Object Model and Page Factory in a Simple UI Test project 

### Project Automation Setup
1. Download `geckodriver.exe` and edit the system variable `Path`
1. Create Maven Project and Add Selenium and TestNG dependencies into `pom.xml`
```
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>3.141.59</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>6.14.3</version>
    <scope>test</scope>
</dependency>
```

### First Test without POM yet
1. Create a `LoginPageTest` class at `src/test/java`
1. Create a Driver Factory, as simple as you can imagine
1. Interact with Elements to do Login successfully
1. Pass the test


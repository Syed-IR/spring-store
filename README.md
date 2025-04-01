# The Ultimate Spring Boot Course
* pom = Project Object Model (heart of maven project)
* src > resources folder contains all the non-java files such as html, javascript, static assets
* Following dependencies are required for a web application in Java
  * tomcat is embedded webserver
  * web amd webmvc for web-requests, apis, routing
  * jackson for json
  * logging for logs
  * To install all of the above we can use ```spring-boot-starter-web```
* ```command + n``` in pom.xml to open dependencies installer menu
* ```./mvnw spring-boot:run``` command is used to run project using maven
* ```shift + cmd + o``` to open project navigation
* ```<optional>true</optional>``` in pom.xml tells the compiler that the said dependency is only part of development and will not be packaged with the production package
* YAML stands for "Yet Another Markup Language"
* application.yaml and application.properties can sit next to each other but it will require extra effort to maintain both files so better to delete one.

# Open Closed Principle
A class should be open for extension but closed for modification.
Meaning you should be able to add new functionality to a class without changing its existing code.
``` Example is programming against interfaces such as PaymentService or TaxService```

It is a guideline, not a rule. Implement when it makes sense.

## Inversion of Control (IoC Container)
* This is springs core, this container manages our objects in JAVA.
* These managed objects are referred to as *Bean*
* ``SpringApplication.run(StoreApplication.class, args)`` returns an object of type ``ApplicationContext ``. Where ApplicationContext is IoC Container, it's a storage for our objects
* Inorder to tell the Spring to manage objects of a certain class, add ``@Component`` annotation to that class
* There are multiple type of Spring annotations.
  * ``@Component`` is generic type, used for utility classes
  * ``@Service`` used for classes that has business logic
  * ``@Controller`` used for classes that handles web requests 
  * ``@Repository`` for classes that interacts with the Databases
* ``@Autowired`` is an annotation used in old versions of JAVA (don't know the exact) it tells the Spring autowire a Constructor
  * Do note that even in current version of JAVA if there are more than one constructor of a class you must mark one constructor with ``@Autowired`` annotation.
  * In newer JAVA if there is a default constructor present ``public OrderService(){}`` and no ``@Autowired`` annotation attached on other constructor then Spring will use the default one

## Controlling Bean Selection
* ``@Primary`` is used to mark default Bean (Adding ``@service`` on multiple classes that are using same interface (PayPal & Stripe class for e.g))
* ``@Qualifier`` is used when we want to use a specific implementation.
* ``@Value()`` is used to extract data from application.properties (env)
  * ``@Value("${stripe.apiPort:8090}")`` the value after the `:` is default value in case the extracted key is not present
* There are two types of Bean Initialization.
  * Early/Eager: Spring will initialize every bean mentioned in the code at the time of project initialization even if they are not used
  * Lazy: It is an optimization technique that creates objects when needed (Only use when a bean is very memory intensive)


```sh
git clone https://github.com/mosh-hamedani/spring-store

cd spring-store
```

I've added tags at the beginning of each section. If you want to start from a particular section, you can check out the corresponding tag.

```sh
git checkout part1-section3-start
```

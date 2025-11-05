# Java-Design
Repo to store Java Design Patterns


SOLID Design Principles

1.) S- Single Responsibility Principle

There should be no more than one reason for a class to change.

If a class has more than responsibility that can change in future you need to break up each responsibility to a different class.


2.) O - Open Close Principle

Software Entities (Classes, Modules, Methods) should be open for extension but closed for modification

Meaning extend through classes and method overriding but the intial method should not be modified.

3.) L - Liskov Substitution Principle

Whenever a class we need to substitute with child class as needed but that should not alter the behavior of the parent class that was intitially intended.

Ex: Square is a Rectangle but passing a square reference to a rectangle case would fail when it expects height and width to different causing behavior to break.

4.) I - Interface Segregation Principle


Clients should not be force to depend on interfaces they dont use.

That is dont make interfaces bigger by adding unrelated methods and keep having methods with unsupported method implementations or return null

So separate interfaces or have methods for only those particular classes.

5.) D- Dependency Inversion Principle

a) High Level modules should not depend on low level modules both should depend on abstractions.

b) Abstractions should not depend on details and details should depend on abstractions

Means to avoid tight coupling. Lets say a formatter code exists to format json and when we want to format via html
the code needs to be updated instead use pass an interface of format which formats and depending on requirement we pass the type of formatter we need.


# Design Patterns

1.) Creational - How objects/classes are created.

2.) Structuaral - How objects/classes are composed are related to each other.

3.) Behavioral - How objects/classes communicated with each other.


# Builder Pattern

1.) Solves the problem for immutable classes where there are lot of properties that need to be assigned through constructor.

2.) Use when you need multiple parts to construct that object. And various steps involved in creating that.



The builder pattern has 4 main componets to it.

1.) The product class- The final product we are building.

2.) Interface Builder - Consists of all methods to implement to build the pdroduct

3.) Concrete Builder - The implementation of builder interface where logic resides to build.

4.) Director class- The main class which knows the instruction/order in which way to build objects Main class/ Or client input

To make the class immuatable ie to have set methods private. We can have builder as an public static inner class that could acess the private methods to set object values while outside classes cannot and a static method for the product class to return builder.

# Drawbacks

Builder could go bad if there are lot new fields being added and lot of code change and refactoring is required.



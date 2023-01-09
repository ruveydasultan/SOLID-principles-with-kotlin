# SOLID principles in Kotlin
Examples of SOLID principles in Kotlin

## Single Responsibility
* Entities should only have one reason to change
* The Single responsibility Principle states that every class should have one and only one responsibility. In other words, If there is a need to change the class for more than one reason then that defies the single responsibility principle.

[View example](src/1-single-responsibility.kt)

## Open Closed Principle
* Entities should be open for extension, but closed for modification
* This principle has two meanings.
* Open: This means that we can add new features to our classes. When there is a new requirement, we should be able to add new features to our class easily.
* Close: This means that the base features of the class should not be changed.

[View example](src/2-open-closed-principle.kt)

## Liskov Substitution Principle
* Derived classes must be substitutable for their base classes
* 

[View example](src/3-liskov-substitution-principle.kt)

## Interface Segregation Principle
* Clients should not be forced to program against interfaces they do not use
* In simple words, the child class must be substitutable for the parent class.
  Since child classes extended from the parent classes, they inherit their behavior.

[View example](src/4-interface-segregation-principle.kt)

## Dependency Inversion Principle
* Program to an interface, not an implementation
* This principle states that once an interface becomes too fat, it needs to be split into smaller interfaces so that client of the interface will only know about the methods that pertain to them.

[View example](src/5-dependency-inversion-principle.kt)
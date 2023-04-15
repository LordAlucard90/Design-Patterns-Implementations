# Abstract Factory

## Scope

Provides an interface for the creation of families of correlated or dependent objects without specify the concrete
classes.

![Class Diagram](abstract_factory.png)

## Participants

- **AbstractFactory**
    - Declares an interface for the operations of creation of abstract product objects.
- **ConcreteFactory**
    - Implements the creation of concrete product objects.
- **AbstractProduct**
    - Declares an interface for a product object type.
- **ConcreteProduct**
    - Defines a product object that will be created by the correspondent ConcreteFactory.
    - Implements the abstract product interfaces.
- **Client**
    - Uses the interfaces of AbstractFactory and AbstractProduct.

## Collaborations

- Will be used only one instance of ConcreteFactory during the execution, this ConcreteFactory will manage the creation
  of a specific family of concrete products.
- The AbstractFactory delegates the creation of product object to his ConcreteFactories.





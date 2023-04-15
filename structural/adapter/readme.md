# Adapter

## Scope

Converts the interface of a class in a interface required by the client.
The Adapter permits to different classes to work together when this could not be possible for the incompatible
interfaces.

![Class Diagram](adapter_inheritance.png)

![Class Diagram](adapter_composition.png)

## Participants

- **Target**
    - Defines the domain's specific interface used by the Client.
- **Client**
    - Works with objects similar to Target.
- **Adaptee**
    - Has a specific interface who must be adapted.
- **Adapter**
    - Adapts the Adaptee's interface to the Target one.

## Collaborations

- The Client calls the operations on the Adapter.
- The Adapter forward the calls the matching operations on the Adaptee.

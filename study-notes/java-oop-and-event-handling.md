# Java OOP and Event Handling

## 1. Inheritance

**Inheritance** allows one Java class to extend another class.

The class being extended is the **parent class**, while the class that extends it is the **child class**.

Example:

```java
class Apple {
}

class SweetApple extends Apple {
}
```
Here:

Apple is the parent class.
SweetApple is the child class.
SweetApple inherits from Apple.

Inheritance allows code to be reused and extended without rewriting everything from the parent class.

## 2. Extending a Class

The extends keyword is used to create inheritance:
```
class Child extends Parent {
}
```
The child class can:

Reuse properties and methods of the parent.
Add new properties and methods.
Override existing methods when necessary.

## 3. Anonymous Inner Classes

An anonymous inner class is a class without a separate class name.

It is useful when a small amount of behaviour is needed only once.

Example:
```
JPanel panel = new JPanel() {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawRect(50, 50, 100, 100);
    }
};
```
Here, the JPanel is being extended directly without creating a separate named class.

Anonymous inner classes are useful in GUI programming because event handling and custom behaviour often require only a small amount of code.

## 4. Method Overriding

A child class can provide its own implementation of a method inherited from the parent class.

For example:
```
@Override
protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    // custom drawing
}
```

The @Override annotation indicates that the method is overriding a method from the parent class.

## 5. Event Handling

GUI applications need to respond to user actions such as:

Mouse clicks
Mouse movement
Keyboard input
Button presses

Java uses an event-driven programming model to handle these interactions.

The general process is:

User Action
    ↓
Event Generated
    ↓
Listener Receives Event
    ↓
Program Responds

## 6. Event Listeners

An event listener is responsible for responding to a particular type of event.

For example, a mouse listener can respond when the user interacts with the mouse.

This allows graphical applications to become interactive rather than remaining static.

## 7. Static and Instance Fields

Java fields can be either static or instance-level.

Static Field

A static field belongs to the class itself and is shared by all objects.
```
static int count;
```
Instance Field

An instance field belongs to an individual object.
```
int x;
```
Each object can have its own value for an instance field.

## Comparison

| Static Field | Instance Field |
|---|---|
| Belongs to the class | Belongs to an object |
| Shared between objects | Separate for each object |
| Declared using `static` | Does not require `static` |
| One shared value | Each object can have its own value |

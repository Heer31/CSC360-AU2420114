# Maven and JavaFX — Study Notes

## What is Maven?

Maven is a build automation and dependency management tool used for Java projects.

It helps developers:
- Manage external libraries and dependencies
- Compile Java source code
- Build Java projects
- Run tests
- Package applications
- Maintain a standard project structure

Instead of manually downloading `.jar` files and configuring them, Maven can download and manage the required dependencies automatically.

## Why Do We Need Maven?

When a Java project uses external libraries such as JavaFX, managing the required files manually can become difficult.

Maven simplifies this process by managing dependencies and providing a standard way to build and run Java projects.

## Maven Dependencies

A dependency is an external library that a project needs in order to compile or run.

For a JavaFX project, Maven can manage libraries such as:

- JavaFX Controls
- JavaFX Graphics
- JavaFX Base

The required libraries are specified in the Maven project configuration.

## pom.xml

The `pom.xml` file is the main configuration file of a Maven project.

POM stands for **Project Object Model**.

It contains information such as:

- Project details
- Dependencies
- Plugins
- Build configuration
- Java version

## What is JavaFX?

JavaFX is a Java framework used to create graphical user interfaces and 2D/3D graphical applications.

It provides components for:

- Windows
- Buttons
- Labels
- Text fields
- Shapes
- Colours
- Layouts
- Events
- Animations

## Basic JavaFX Application Structure

A JavaFX application generally contains:

1. An Application class
2. A Stage
3. A Scene
4. UI components or shapes

### Stage

The `Stage` represents the main application window.

### Scene

The `Scene` contains the content displayed inside the application window.

### Node

JavaFX UI elements and shapes are represented as nodes.

Examples include:

- Rectangle
- Circle
- Button
- Label
- Text

The basic structure can be represented as:

Stage
→ Scene
→ Root Node
→ Shapes or UI Components

# JavaFX Shapes

## Creating a Rectangle

A square can be created using the JavaFX `Rectangle` class.

```java
Rectangle square = new Rectangle();

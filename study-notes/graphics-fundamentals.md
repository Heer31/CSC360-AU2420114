# Graphics Fundamentals

## Computer Graphics

Computer Graphics is the process of creating, generating, and displaying visual content using a computer.

It focuses on producing images, shapes, animations, and other visual elements.

## Image Processing

Image Processing works with an existing digital image.

It involves acquiring an image and applying algorithms to analyse, enhance, modify, or extract information from it.

### Computer Graphics vs Image Processing

| Computer Graphics                         | Image Processing                             |
| ----------------------------------------- | -------------------------------------------- |
| Creates or generates visual content       | Processes an existing image                  |
| Focuses on drawing and producing graphics | Focuses on analysis and enhancement          |
| Can generate objects and scenes           | Extracts or modifies information from images |

## Geometric Primitives

Geometric primitives are the basic building blocks used to create graphical objects.

Common primitives include:

* Points
* Lines
* Curves
* Polygons
* Areas
* Circles
* Other basic shapes

Complex objects can be created by combining these simpler primitives.

## Curves and Calculus

Curves are closely related to calculus because calculus provides mathematical tools for describing and working with smooth and continuous curves.

### Differentiation

Differentiation can be used to determine:

* Slope of a curve
* Rate of change
* Direction of change

### Integration

Integration can be used to calculate:

* Area under a curve
* Area between curves

In computer graphics, calculus is useful for defining and drawing smooth curves.

## Digital Images

A digital image can be represented as a **2D matrix**.

Each cell of the matrix represents a pixel.

A pixel can store information such as:

* A grayscale value
* An RGB color value
* Other color information

The value stored in a pixel determines its appearance.

### Example

For a grayscale image:

```text
Low value  → Dark pixel
High value → Bright pixel
```

Therefore, an image can be thought of as a matrix where every position contains information about the appearance of that part of the image.

## Pixels

A pixel, or **Picture Element**, is the smallest display unit of a digital image.

An image contains many pixels arranged in rows and columns.

The collection of these pixels forms the complete image.

## Static Graphics

Static graphics are graphics that remain unchanged after being drawn unless they are manually redrawn.

Example:

A simple image displayed on a screen without responding to user input.

## Interactive Graphics

Interactive graphics respond to user actions.

Possible user interactions include:

* Mouse movement
* Mouse clicks
* Keyboard input
* Other events

The system detects the event and updates or repaints the graphics accordingly.

### Example

A triangle that follows the position of the mouse cursor is an example of interactive graphics.

## Static vs Interactive Graphics

| Static Graphics                              | Interactive Graphics                   |
| -------------------------------------------- | -------------------------------------- |
| Remain unchanged                             | Respond to user actions                |
| Do not normally respond to input             | Respond to mouse/keyboard events       |
| Usually require manual redrawing for changes | Can automatically repaint after events |
| Example: static image                        | Example: mouse-controlled object       |

## Drawing Lines

When drawing a line on a pixel-based display, the computer must determine which pixels best represent the desired line.

The resulting collection of pixels gives the visual appearance of the line.

## Important Concepts

```text
Computer Graphics
        ↓
Creating visual content

Image Processing
        ↓
Processing existing images

Digital Image
        ↓
2D matrix
        ↓
Pixels
        ↓
Color / intensity values
```

## Revision Points

* Understand the difference between computer graphics and image processing.
* Revise geometric primitives.
* Understand how digital images are represented using pixels.
* Revise the relationship between pixels, rows, columns, and image resolution.
* Understand static and interactive graphics.
* Revise the relationship between calculus and curves.
* Understand how lines are represented on pixel-based displays.

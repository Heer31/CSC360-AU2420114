# Lecture 03 — Aug 15, 2026

## Reflection

### Drawing a Centered Square

* [ ] Understand that the basic unit of length in 2D computer graphics is the **pixel**.
* [ ] Understand how the **canvas width and height** are used to find its center.
* [ ] Understand how to calculate the four corners of a square using its center point and side length.
* [ ] Understand the difference between the **top-left, top-right, bottom-left, and bottom-right** coordinates.
* [ ] Practice writing pseudocode to draw a square centered on a canvas.
* [ ] Understand the standard Maven project directory structure used in Java projects.
* [ ] Understand the role of `JFrame` in Java Swing as a top-level window container.
* [ ] Understand the difference between **static (class-level)** and **instance (object-level)** fields.

### Key Learning

The main concept I learned in this lecture was how to position a square at the center of a 2D canvas using coordinate calculations. Since computer screen coordinates start from the top-left corner, the X-coordinate increases towards the right and the Y-coordinate increases downwards.

To center a square, I first need to find the center of the canvas:

- `cx = W / 2`
- `cy = H / 2`

If the side length of the square is `L`, the four corners can then be calculated by adding or subtracting `L / 2` from the center coordinates.

The four corner coordinates are:

- Top-Left: `(cx - L/2, cy - L/2)`
- Top-Right: `(cx + L/2, cy - L/2)`
- Bottom-Left: `(cx - L/2, cy + L/2)`
- Bottom-Right: `(cx + L/2, cy + L/2)`

I also learned about the standard structure of a Maven Java project, including `pom.xml`, `src/main/java`, and `src/main/resources`. This helped me understand how Java projects are organized and how Maven manages the project structure and dependencies.

Another concept covered was `JFrame` in Java Swing. A `JFrame` acts as the main window or top-level container of a Swing application.

Finally, I revised the difference between static and instance fields. A static field belongs to the class and is shared among objects, whereas an instance field belongs to each individual object.

### Reflection

This lecture helped me connect mathematical coordinate calculations with actual computer graphics programming. I found the process of deriving the square's four corners from its center particularly useful because it shows how simple mathematical formulas can be directly applied to drawing shapes on a screen.

I also understood that the coordinate system used by computers is different from the usual mathematical coordinate system because the origin is generally at the top-left and the Y-axis increases downwards. Understanding this is important for correctly positioning objects in computer graphics.

The Maven project structure and Java Swing concepts also helped me understand how a Java graphics project is organized and how the application window is created. Overall, the lecture gave me a better understanding of how coordinates, Java project structure, and basic Java concepts work together when developing graphics programs.

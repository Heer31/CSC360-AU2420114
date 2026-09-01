# Java Swing and Custom Drawing

## 1. What is Java Swing?

**Java Swing** is a Java GUI toolkit used to create desktop graphical applications.

It provides components such as:

- `JFrame`
- `JPanel`
- Buttons
- Labels
- Text fields
- Menus

Swing applications are built by combining these components into a graphical interface.

## 2. JFrame and JPanel

A basic Swing graphics application commonly follows this structure:

```text
JFrame
   |
   └── JPanel
```
JFrame

``` JFrame ``` acts as the main application window.

It provides the outer container in which other Swing components are placed.

JPanel

``` JPanel ``` is a component that can be placed inside a``` JFrame ```.

It can also be used as a custom drawing surface for graphics applications.

The relationship is:
JFrame → outer window
JPanel → drawing area inside the window

## 3. Custom Drawing with paintComponent()

When creating custom graphics using a JPanel, drawing is normally performed by overriding:

```
protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    // drawing code
}
```

The call:
```
super.paintComponent(g);
```

is important because it allows Swing to perform its normal painting operations before the custom drawing takes place.

## 4. Drawing with Graphics

The Graphics object provides methods for drawing shapes.

Common methods include:
```
g.drawRect(x, y, width, height);
g.fillRect(x, y, width, height);
g.drawOval(x, y, width, height);
g.fillOval(x, y, width, height);
g.drawLine(x1, y1, x2, y2);
```

The coordinates determine where the shape appears on the panel.

## 5. JFrame and JPanel Example

A simple structure can look like:
```
import javax.swing.*;
import java.awt.*;

public class GraphicsExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Graphics");

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawRect(50, 50, 100, 100);
            }
        };

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

## 6. Repainting

When the appearance or position of a graphical object needs to change, the component can be repainted.
```
repaint();
```
This requests that Swing redraw the component.

This is especially important in interactive graphics where objects may move in response to user input.

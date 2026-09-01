# 2D Coordinates and Geometry

## 1. Coordinate System in Computer Graphics

Computer graphics uses a **2D coordinate system** to determine the position of objects on the screen.

Unlike the traditional mathematical coordinate system, the origin `(0, 0)` is usually located at the **top-left corner** of the screen.

- The X-coordinate increases from **left to right**.
- The Y-coordinate increases from **top to bottom**.
- Each position on the screen can be represented as `(x, y)`.
- The basic unit of measurement is the **pixel**.

Example:

```text
(0,0) --------------------> X
  |
  |
  |
  |
  v
  Y
```

## 2. Finding the Centre of a Canvas

If the canvas has width W and height H, its centre can be calculated using:

cx = W / 2
cy = H / 2

Where:

cx → X-coordinate of the centre
cy → Y-coordinate of the centre
W → canvas width
H → canvas height

## 3. Drawing a Centred Square

If a square has side length L, its four corners can be calculated using the centre (cx, cy).

Top-Left     = (cx - L/2, cy - L/2)
Top-Right    = (cx + L/2, cy - L/2)
Bottom-Left  = (cx - L/2, cy + L/2)
Bottom-Right = (cx + L/2, cy + L/2)

This allows the square to remain centred even when its size changes.

## 4. Rectangle from Two Points

A rectangle can be constructed when two diagonal points are known.

For points (x1, y1) and (x2, y2):

x      = min(x1, x2)
y      = min(y1, y2)
width  = |x2 - x1|
height = |y2 - y1|
min() determines the correct top-left position.
Absolute value keeps width and height positive.
The calculation works regardless of which diagonal point is given first.

## 5. Triangle Coordinates

A triangle requires three points:

(x1, y1)
(x2, y2)
(x3, y3)

The three points must not be collinear. If all three points lie on the same straight line, they will not form a proper triangle.


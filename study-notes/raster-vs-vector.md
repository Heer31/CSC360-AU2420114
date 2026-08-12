# Raster vs Vector Graphics

## Raster Graphics

Raster graphics are images made up of a **2D matrix or grid of pixels**.

Each pixel stores a colour or intensity value.

### Key Characteristics

* Made up of individual pixels.
* Image quality depends on the **resolution**.
* Higher resolution generally means more pixels.
* More pixels can result in a larger file size.
* Enlarging a raster image can make the individual pixels visible.
* Excessive enlargement can cause the image to appear **blurry or pixelated**.

### Examples

Common examples of raster images include:

* Photographs
* Digital paintings
* Screenshots
* JPEG images
* PNG images

---

## Resolution

Resolution refers to the number of pixels used to represent an image.

For example:

```text
1920 × 1080
```

means the image contains:

```text
1920 pixels horizontally
×
1080 pixels vertically
```

A higher-resolution image generally contains more information and can appear sharper at an appropriate display size.

---

# Vector Graphics

Vector graphics are **not made up of individual pixels**.

Instead, they use mathematical descriptions and drawing instructions to represent graphical objects.

These descriptions can define:

* Lines
* Curves
* Polygons
* Shapes
* Paths

The computer uses this information to redraw the object according to the required dimensions.

## Key Characteristics

* Not dependent on a fixed pixel grid.
* Uses mathematical descriptions of shapes.
* Can be scaled to different sizes without losing sharpness.
* Suitable for graphics that need to be resized frequently.
* Commonly used for logos, icons, illustrations, and diagrams.

### Examples

* Adobe Illustrator files
* SVG graphics
* Vector-based PDFs
* Logos and icons

---

# Raster vs Vector

| Feature                   | Raster Graphics            | Vector Graphics                     |
| ------------------------- | -------------------------- | ----------------------------------- |
| Basic representation      | Pixels                     | Mathematical descriptions           |
| Resolution                | Resolution-dependent       | Resolution-independent              |
| Enlarging                 | Can become pixelated       | Maintains sharpness                 |
| Best suited for           | Photos and detailed images | Logos, icons, shapes, illustrations |
| Main building block       | Pixel                      | Shape/path                          |
| Image quality when scaled | Can decrease               | Generally maintained                |

## Simple Comparison

```text
Raster
  ↓
Pixels
  ↓
Resolution-dependent
  ↓
May pixelate when enlarged


Vector
  ↓
Mathematical drawing logic
  ↓
Resolution-independent
  ↓
Can be enlarged without pixelation
```

---

# Why Does Raster Graphics Pixelate?

A raster image contains a fixed number of pixels.

When the image is enlarged beyond its original resolution, the existing pixels have to cover a larger area.

This makes individual pixels more visible and reduces the apparent sharpness of the image.

```text
Original

■ ■ ■
■ ■ ■
■ ■ ■


Enlarged

■■  ■■  ■■
■■  ■■  ■■
■■  ■■  ■■
```

The enlarged pixels become visible, producing a pixelated appearance.

---

# Why Don't Vector Graphics Pixelate?

Vector graphics store information about **how an object should be drawn**, rather than storing a fixed collection of pixels.

When the object is enlarged, the computer recalculates the shape using its mathematical description.

Therefore, the edges remain smooth at different sizes.

```text
Vector description
       ↓
Computer redraws shape
       ↓
Small size / Large size
       ↓
Smooth edges
```

---

# Applications

## Raster Graphics

Raster graphics are useful for:

* Photographs
* Textures
* Digital artwork
* Screenshots
* Realistic images

## Vector Graphics

Vector graphics are useful for:

* Logos
* Icons
* Diagrams
* Typography
* Illustrations
* Graphics that need to be resized

---

# 2D Geometric Transformations

Geometric transformations change the position, size, or orientation of graphical objects.

Two transformations discussed were **translation** and **scaling**.

## Translation

Translation moves an object from one position to another without changing its size or shape.

For a point:

```text
(x, y) → (x + Tx, y + Ty)
```

where:

* `Tx` = horizontal translation
* `Ty` = vertical translation

### Example

```text
Original triangle
       ↓
   Translation
       ↓
Moved triangle
```

---

## Scaling

Scaling changes the size of an object.

For a point:

```text
(x, y) → (Sx × x, Sy × y)
```

where:

* `Sx` = horizontal scaling factor
* `Sy` = vertical scaling factor

### Scaling Examples

If:

```text
Sx = Sy = 2
```

the object becomes twice as large.

If:

```text
Sx = Sy = 0.5
```

the object becomes half its original size.

Scaling can therefore be used to implement **zoom-in and zoom-out** effects.

---

# Triangle Transformation Example

A triangle can be represented using three vertices:

```text
      A
     / \
    /   \
   B-----C
```

Translation moves all three vertices by the same amount.

Scaling changes the coordinates of the vertices relative to the scaling origin.

These transformations allow a graphical object to move and change size while maintaining its geometric structure.

---

# Key Revision Points

* Understand the difference between raster and vector graphics.
* Revise how pixels represent raster images.
* Understand resolution and its effect on raster image quality.
* Understand why raster images pixelate when enlarged.
* Understand how vectors use mathematical descriptions.
* Revise why vector graphics are resolution-independent.
* Know examples and applications of both formats.
* Revise translation and scaling.
* Understand how scaling can be used for zooming.
* Practise applying transformations to a triangle.

# aurora-cesium
This is a Java library to writer CZML, which based on [czml-writer](https://github.com/AnalyticalGraphicsInc/czml-writer), and this is more simple to generate czml.

## License
[Apache 2.0](https://www.apache.org/licenses/LICENSE-2.0.html). aurora-cesium is free for both commercial and non-commercial use.

## Get Started
1. Everything in aurora-cesium is `property` or `graphics`.
2. Every `property` or `graphics` has an `interface`.
3. Every `interface` has a method called `newBuilder()`, which to build property or graphics.
4. Many interfaces have method like `from()/fromXXX()/default()/defaultXXX()`, these methods are shortcuts to `newBuilder()`.
5. Finally, you can use `CzmlGenerator` to generate czml.
6. Example  
6.1 to create a position, a position is a property, and the interface called `PositionProperty`, we can build position with cartesian(`CartesianProperty`)/cartographicDegrees(`CartographicDegreesProperty`)/cartographicRadians(`CartographicRadiansProperty`)  

```
// first create a cartesian
CartesianProperty cartesianProperty;
// use builder
cartesianProperty = CartesianProperty.newBuilder().withValue(new Cartesian(0, 0, 0)).build();
// or use shortcut
cartesianProperty = CartesianProperty.from(new Cartesian(0, 0, 0));

// or create a cartographicDegrees/cartographicRadians
CartographicDegreesProperty cartographicDegreesProperty;
// use builder
cartographicDegreesProperty = CartographicDegreesProperty.newBuilder().withValue(new Cartographic(114, 30, 0)).build();
// or use shortcut
cartographicDegreesProperty = CartographicDegreesProperty.from(new Cartographic(114, 30, 0));

// let's create postition
PositionProperty positionProperty;
positionProperty = PositionProperty.newBuilder().withCartesian(CartesianProperty.from(new Cartesian(0, 0, 0))).build();
// or use shortcut
positionProperty = PositionProperty.from(cartesianProperty);
// or use shortcut
positionProperty = PositionProperty.fromCartesian(new Cartesian(0, 0, 0));

```
6.2 to create a point(`PointGraphics`)  
```
PointGraphics pointGraphics = PointGraphics.newBuilder()
    .withColor(ColorProperty.fromRgba(new Color(255, 255, 255, 255)))
    .withPixelSize(DoubleProperty.from(20D))
    .withShow(BooleanProperty.from(true))
    .build();
```
6.3 to create an Entity(`Entity`)
```
Entity entity = Entity.newBuilder()
    .withId("Entity")
    .withName("Entity")
    .withPosition(positionProperty)
    .withPoint(pointGraphics)
    .build();

```
6.4 to creat a czml(`Czml`)
```
Czml czml = Czml.create();
czml.setDocument(Document.defaultDocument("CZML"));
czml.push(entity);
```
6.5 generate it
```
String result = CzmlGenerator.on(true).generate(czml, new StringWriter()).toString();
```
6.6 print it
```
System.out.println(result);
```
```json
[
  {
    "id":"document",
    "name":"CZML",
    "version":"1.0"
  },
  {
    "id":"Entity",
    "name":"Entity",
    "position":{
      "cartesian":[
        0,0,0
      ]
    },
    "point":{
      "color":{
        "rgba":[
          255,255,255,255
        ]
      },
      "pixelSize":20,
      "show":true
    }
  }
]

```

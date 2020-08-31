package aurora.cesium.element.graphics;

import aurora.cesium.Czml;
import aurora.cesium.CzmlGenerator;
import aurora.cesium.element.Entity;
import aurora.cesium.element.StartElement;
import aurora.cesium.element.property.*;
import aurora.cesium.language.writer.Cartographic;
import aurora.cesium.language.writer.CesiumHeightReference;
import org.junit.Test;

import java.awt.*;
import java.io.StringWriter;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public class TestCreateEllipse {

    @Test
    public void testCreateEllipse() {
        Czml czml = Czml.create();
        czml.setStartElement(StartElement.defaultStartElement());
        czml.push(
            Entity.newBuilder()
                .withId("Cesium/Ellipse")
                .withName("Cesium/Ellipse")
                .withPosition(PositionProperty.fromCartographicDegrees(new Cartographic(114, 30, 100)))
                .withEllipse(
                    EllipseGraphics.newBuilder()
                        .withFill(BooleanProperty.from(true))
                        .withHeight(DoubleProperty.from(50D))
                        .withHeightReference(HeightReferenceProperty.from(CesiumHeightReference.NONE))
                        .withSemiMajorAxis(DoubleProperty.from(30D))
                        .withSemiMinorAxis(DoubleProperty.from(10D))
                        .withMaterial(MaterialProperty.from(
                            StripeMaterialProperty.newBuilder()
                                .withEvenColor(ColorProperty.fromRgba(Color.CYAN))
                                .withOddColor(ColorProperty.fromRgba(Color.MAGENTA))
                                .build()
                        ))
                        .withRotation(DoubleProperty.from(Math.PI))
                        .withStRotation(DoubleProperty.from(Math.PI / 2))
                        .withExtrudedHeight(DoubleProperty.from(20D))
                        .build()
                )
                .build()
        );
        System.out.println(CzmlGenerator.on(true).generate(czml, new StringWriter()).toString());
    }
}

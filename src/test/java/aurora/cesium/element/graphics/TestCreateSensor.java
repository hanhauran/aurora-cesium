package aurora.cesium.element.graphics;

import aurora.cesium.Czml;
import aurora.cesium.CzmlGenerator;
import aurora.cesium.element.Entity;
import aurora.cesium.element.StartElement;
import aurora.cesium.element.property.*;
import aurora.cesium.language.writer.CesiumSensorVolumePortionToDisplay;
import org.junit.Test;

import java.awt.*;
import java.io.StringWriter;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public class TestCreateSensor {

    @Test
    public void testCreateSensor() {
        Czml czml = Czml.create();
        czml.setStartElement(StartElement.defaultStartElement());
        czml.push(
            Entity.newBuilder()
                .withId("ConicSensor")
                .withName("ConicSensor")
                .withConicSensor(
                    ConicSensorGraphics.newBuilder()
                        .withInnerHalfAngle(DoubleProperty.from(0D))
                        .withOuterHalfAngle(DoubleProperty.from(0.7853981633974483))
                        .withMinimumClockAngle(DoubleProperty.from(0D))
                        .withMaximumClockAngle(DoubleProperty.from(6.283185307179586))
                        .withRadius(DoubleProperty.from(50000000D))
                        .withShow(BooleanProperty.from(true))
                        .withShowIntersection(BooleanProperty.from(true))
                        .withIntersectionColor(ColorProperty.fromRgba(new Color(255, 255, 255, 255)))
                        .withIntersectionWidth(DoubleProperty.from(1D))
                        .withPortionToDisplay(SensorVolumePortionToDisplayProperty.from(CesiumSensorVolumePortionToDisplay.COMPLETE))
                        .withEllipsoidSurfaceMaterial(MaterialProperty.from(SolidColorMaterialProperty.from(ColorProperty.fromRgba(new Color(255, 255, 255, 0)))))
                        .withEllipsoidHorizonSurfaceMaterial(MaterialProperty.from(SolidColorMaterialProperty.from(ColorProperty.fromRgba(new Color(255, 255, 255, 153)))))
                        .withLateralSurfaceMaterial(MaterialProperty.from(SolidColorMaterialProperty.from(ColorProperty.fromRgba(new Color(255, 255, 255, 153)))))
                        .withDomeSurfaceMaterial(MaterialProperty.from(SolidColorMaterialProperty.from(ColorProperty.fromRgba(new Color(255, 255, 255, 0)))))
                        .build()
                )
                .build()
        );
        System.out.println(CzmlGenerator.on(true).generate(czml, new StringWriter()).toString());
    }
}

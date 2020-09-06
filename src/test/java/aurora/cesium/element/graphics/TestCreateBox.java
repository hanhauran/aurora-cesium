package aurora.cesium.element.graphics;

import aurora.cesium.Czml;
import aurora.cesium.CzmlGenerator;
import aurora.cesium.element.Entity;
import aurora.cesium.element.Document;
import aurora.cesium.element.property.*;
import cesiumlanguagewriter.Cartesian;
import cesiumlanguagewriter.Cartographic;
import org.junit.Test;

import java.awt.*;
import java.io.StringWriter;

/**
 * @author hanhaoran
 * @date 2020/8/30
 */
public class TestCreateBox {

    @Test
    public void testCreateBox() {
        Czml czml = Czml.create();
        czml.setDocument(Document.defaultDocument());
        czml.push(
            Entity.newBuilder()
                .withId("Box/Shape1")
                .withName("Blue box")
                .withPosition(PositionProperty.fromCartographicDegrees(new Cartographic(-114.0, 40.0, 300000.0)))
                .withBox(
                    BoxGraphics.newBuilder()
                        .withDimensions(BoxDimensionsProperty.from(new Cartesian(400000.0, 300000.0, 500000.0)))
                        .withMaterial(MaterialProperty.from(SolidColorMaterialProperty.from(ColorProperty.fromRgba(new Color(0, 0, 255, 255)))))
                        .build()
                )
                .build()
        );
        System.out.println(CzmlGenerator.on(true).generate(czml, new StringWriter()).toString());
    }
}

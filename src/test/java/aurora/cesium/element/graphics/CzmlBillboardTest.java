package aurora.cesium.element.graphics;

import aurora.cesium.Czml;
import aurora.cesium.CzmlGenerator;
import aurora.cesium.element.Entity;
import aurora.cesium.element.Document;
import aurora.cesium.element.property.*;
import aurora.cesium.utils.Times;
import cesiumlanguagewriter.*;
import org.junit.Test;

import java.awt.*;
import java.io.StringWriter;
import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public class CzmlBillboardTest {

    @Test
    public void testSimplify() {
        Czml czml = Czml.create();
        czml.setDocument(Document.defaultDocument());
        czml.push(
            Entity.newBuilder()
                .withId("Cesium/Billboard").withName("Billboard").withDescription(StringProperty.from("<p><a href='www.baidu.com' target='_blank'>Baidu</a> Billboard </p>"))
                .withPosition(PositionProperty.fromCartographicDegrees(new Cartographic(114, 30, 1000)))
                .withBillboard(
                    BillboardGraphics.newBuilder()
                        .withInterval(new TimeInterval(Times.trans2JulianDate(LocalDateTime.now()), Times.trans2JulianDate(LocalDateTime.now().plusHours(2))))
                        .withAlignedAxis(
                            AlignedAxisProperty.newBuilder()
                                .withUnitCartesian(
                                    UnitCartesianProperty.newBuilder()
                                        .withValues(
                                            Arrays.asList(
                                                Times.trans2JulianDate(LocalDateTime.now()),
                                                Times.trans2JulianDate(LocalDateTime.now().plusHours(1)),
                                                Times.trans2JulianDate(LocalDateTime.now().plusHours(2))
                                            ),
                                            Arrays.asList(
                                                UnitCartesian.getUnitX(),
                                                UnitCartesian.getUnitY(),
                                                UnitCartesian.getUnitZ()
                                            )
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .withColor(
                            ColorProperty.newRgbaBuilder()
                                .withIntervals(
                                    Arrays.asList(
                                        ColorProperty.newRgbaBuilder()
                                            .withValue(Color.BLUE)
                                            .withInterval(new TimeInterval(Times.trans2JulianDate(LocalDateTime.now()),
                                                Times.trans2JulianDate(LocalDateTime.now().plusHours(1))))
                                            .build(),
                                        ColorProperty.newRgbafBuilder()
                                            .withValue(new Color(0.3F, 0.3F, 0.3F, 0.8F))
                                            .withInterval(new TimeInterval(Times.trans2JulianDate(LocalDateTime.now().plusHours(1)),
                                                Times.trans2JulianDate(LocalDateTime.now().plusHours(2))))
                                            .build()
                                    )
                                )
                                .build()
                        )
                        .withDisabledDepthTestDistance(DoubleProperty.from(Double.POSITIVE_INFINITY))
                        .withEyeOffset(EyeOffsetProperty.from(Cartesian.getZero()))
                        .withHeight(DoubleProperty.from(20D))
                        .withHeightReference(HeightReferenceProperty.from(CesiumHeightReference.NONE))
                        .withHorizontalOrigin(HorizontalOriginProperty.from(CesiumHorizontalOrigin.LEFT))
                        .withImage(UriProperty.from(new CesiumResource("http://localhost:9000/subject/op_4-08-03-02" +
                            ".jpg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=root%2F20200828%2F%2Fs3%2Faws4_request&X-Amz-Date" +
                            "=20200828T080704Z&X-Amz-Expires=432000&X-Amz-SignedHeaders=host&X-Amz-Signature" +
                            "=8d12f330b43c73aeaee8a0668a9ba92fc0739c3311c2269236269ed35e96ccfe", CesiumResourceBehavior.LINK_TO)))
                        .withScaleByDistance(NearFarScalarProperty.from(new NearFarScalar(10D, 5D, 1000000D, 0.1D)))
                        .withSizeInMeters(BooleanProperty.from(false))
                        .withWidth(DoubleProperty.from(15D))
                        .build()
                )
                .build()
        );
        System.out.println(CzmlGenerator.on(true).generate(czml, new StringWriter()).toString());
    }

    @Test
    public void test() {
        Czml czml = Czml.create();
        czml.setDocument(Document.defaultDocument());
        czml.push(
            Entity.newBuilder()
                .withId("Cesium/Billboard")
                .withName("Billboard")
                .withDescription(StringProperty.newBuilder().withValue("<p><a href='www.baidu.com' target='_blank'>Baidu</a> Billboard </p>").build())
                .withPosition(
                    PositionProperty.newBuilder()
                        .withCartographicDegrees(
                            CartographicDegreesProperty.newBuilder()
                                .withValue(new Cartographic(114, 30, 1000))
                                .build()
                        )
                        .build()
                )
                .withBillboard(
                    BillboardGraphics.newBuilder()
                        .withInterval(new TimeInterval(Times.trans2JulianDate(LocalDateTime.now()), Times.trans2JulianDate(LocalDateTime.now().plusHours(2))))
                        .withAlignedAxis(
                            AlignedAxisProperty.newBuilder()
                                .withUnitCartesian(
                                    UnitCartesianProperty.newBuilder()
                                        .withValues(
                                            Arrays.asList(
                                                Times.trans2JulianDate(LocalDateTime.now()),
                                                Times.trans2JulianDate(LocalDateTime.now().plusHours(1)),
                                                Times.trans2JulianDate(LocalDateTime.now().plusHours(2))
                                            ),
                                            Arrays.asList(
                                                UnitCartesian.getUnitX(),
                                                UnitCartesian.getUnitY(),
                                                UnitCartesian.getUnitZ()
                                            )
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .withColor(
                            ColorProperty.newRgbaBuilder()
                                .withIntervals(
                                    Arrays.asList(
                                        ColorProperty.newRgbaBuilder()
                                            .withValue(Color.BLUE)
                                            .withInterval(new TimeInterval(Times.trans2JulianDate(LocalDateTime.now()),
                                                Times.trans2JulianDate(LocalDateTime.now().plusHours(1))))
                                            .build(),
                                        ColorProperty.newRgbafBuilder()
                                            .withValue(new Color(0.3F, 0.3F, 0.3F, 0.8F))
                                            .withInterval(new TimeInterval(Times.trans2JulianDate(LocalDateTime.now().plusHours(1)),
                                                Times.trans2JulianDate(LocalDateTime.now().plusHours(2))))
                                            .build()
                                    )
                                )
                                .build()
                        )
                        .withDisabledDepthTestDistance(DoubleProperty.newBuilder().withValue(Double.POSITIVE_INFINITY).build())
                        .withEyeOffset(
                            EyeOffsetProperty.newBuilder()
                                .withCartesian(
                                    CartesianProperty.newBuilder().withValue(Cartesian.getZero()).build()
                                )
                                .build()
                        )
                        .withHeight(DoubleProperty.newBuilder().withValue(20D).build())
                        .withHeightReference(HeightReferenceProperty.newBuilder().withValue(CesiumHeightReference.NONE).build())
                        .withHorizontalOrigin(HorizontalOriginProperty.newBuilder().withValue(CesiumHorizontalOrigin.LEFT).build())
                        .withImage(UriProperty.newBuilder().withValue(new CesiumResource("http://localhost:9000/subject/op_4-08-03-02" +
                            ".jpg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=root%2F20200828%2F%2Fs3%2Faws4_request&X-Amz-Date" +
                            "=20200828T080704Z&X-Amz-Expires=432000&X-Amz-SignedHeaders=host&X-Amz-Signature" +
                            "=8d12f330b43c73aeaee8a0668a9ba92fc0739c3311c2269236269ed35e96ccfe", CesiumResourceBehavior.LINK_TO)).build())
                        .withScaleByDistance(NearFarScalarProperty.newBuilder().withValue(new NearFarScalar(10D, 5D, 1000000D, 0.1D)).build())
                        .withSizeInMeters(BooleanProperty.newBuilder().withValue(false).build())
                        .withWidth(DoubleProperty.newBuilder().withValue(15D).build())
                        .build()
                )
                .build()
        );
        System.out.println(CzmlGenerator.on(true).generate(czml, new StringWriter()).toString());
    }


}

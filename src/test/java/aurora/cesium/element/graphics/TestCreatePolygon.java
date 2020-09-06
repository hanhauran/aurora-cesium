package aurora.cesium.element.graphics;

import aurora.cesium.Czml;
import aurora.cesium.CzmlGenerator;
import aurora.cesium.element.Entity;
import aurora.cesium.element.Document;
import aurora.cesium.element.property.*;
import aurora.cesium.utils.Times;
import cesiumlanguagewriter.Cartographic;
import cesiumlanguagewriter.CesiumHeightReference;
import cesiumlanguagewriter.TimeInterval;
import org.junit.Test;

import java.awt.*;
import java.io.StringWriter;
import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * @author hanhaoran
 * @date 2020/8/30
 */
public class TestCreatePolygon {

    @Test
    public void testIntervalsAndJulianDates() {
        Czml czml = Czml.create();
        czml.setDocument(
            Document.newBuilder()
                .withId("document")
                .withName("TestCreatePolygon.testIntervalsAndJulianDates")
                .withVersion("1.0")
                .withClock(
                    ClockProperty.newBuilder()
                        .withInterval(new TimeInterval(
                            Times.trans2JulianDate(LocalDateTime.of(1970, 1, 1, 0, 0)),
                            Times.trans2JulianDate(LocalDateTime.of(2010, 1, 1, 0, 0))
                        ))
                        .withCurrentTime(Times.trans2JulianDate(LocalDateTime.of(1970, 1, 1, 0, 0)))
                        .withMultiplier(500000000D)
                        .build()
                )
                .build()
        );
        czml.push(
            Entity.newBuilder()
                .withId("Polygon/Intervals")
                .withName("Polygon/Intervals")
                .withPolygon(
                    PolygonGraphics.newBuilder()
                        .withPositions(PositionListProperty.fromCartographicDegrees(Arrays.asList(
                            new Cartographic(-109.03, 41, 0),
                            new Cartographic(-102.03, 41, 0),
                            new Cartographic(-102.03, 37, 0),
                            new Cartographic(-109.03, 37, 0)
                        )))
                        .withMaterial(MaterialProperty.from(SolidColorMaterialProperty.from(ColorProperty.fromRgba(new Color(0, 255, 0, 150)))))
                        .withHeight(DoubleProperty.from(0D))
                        .withHeightReference(HeightReferenceProperty.from(CesiumHeightReference.NONE))
                        .withExtrudedHeight(
                            DoubleProperty.newBuilder()
                                .withIntervals(Arrays.asList(
                                    DoubleProperty.newBuilder()
                                        .withValue(2209600D / 50)
                                        .withInterval(new TimeInterval(
                                            Times.trans2JulianDate(LocalDateTime.of(1970, 1, 1, 0, 0)),
                                            Times.trans2JulianDate(LocalDateTime.of(1980, 1, 1, 0, 0))
                                        ))
                                        .build(),
                                    DoubleProperty.newBuilder()
                                        .withValue(2889700D / 50)
                                        .withInterval(new TimeInterval(
                                            Times.trans2JulianDate(LocalDateTime.of(1980, 1, 1, 0, 0)),
                                            Times.trans2JulianDate(LocalDateTime.of(1990, 1, 1, 0, 0))
                                        )).build(),
                                    DoubleProperty.newBuilder()
                                        .withValue(3307600D / 50)
                                        .withInterval(new TimeInterval(
                                            Times.trans2JulianDate(LocalDateTime.of(1990, 1, 1, 0, 0)),
                                            Times.trans2JulianDate(LocalDateTime.of(2000, 1, 1, 0, 0))
                                        )).build(),
                                    DoubleProperty.newBuilder()
                                        .withValue(4326900D / 50)
                                        .withInterval(new TimeInterval(
                                            Times.trans2JulianDate(LocalDateTime.of(2000, 1, 1, 0, 0)),
                                            Times.trans2JulianDate(LocalDateTime.of(2010, 1, 1, 0, 0))
                                        )).build()
                                ))
                                .build()
                        )
                        .build()
                )
                .build()
        );

        czml.push(
            Entity.newBuilder()
                .withId("Polygon/JulianDates")
                .withName("Polygon/JulianDates")
                .withPolygon(
                    PolygonGraphics.newBuilder()
                        .withPositions(PositionListProperty.fromCartographicDegrees(Arrays.asList(
                            new Cartographic(-117.03, 41, 0),
                            new Cartographic(-110.03, 41, 0),
                            new Cartographic(-110.03, 37, 0),
                            new Cartographic(-117.03, 37, 0)
                        )))
                        .withMaterial(MaterialProperty.from(
                            CheckerboardMaterialProperty.newBuilder()
                                .withEvenColor(ColorProperty.fromRgba(Color.MAGENTA))
                                .withOddColor(ColorProperty.fromRgba(Color.YELLOW))
                                .build()
                        ))
                        .withHeight(DoubleProperty.from(0D))
                        .withHeightReference(HeightReferenceProperty.from(CesiumHeightReference.NONE))
                        .withExtrudedHeight(
                            DoubleProperty.newBuilder()
                                .withValues(
                                    Arrays.asList(
                                        Times.trans2JulianDate(LocalDateTime.of(1970, 1, 1, 0, 0)),
                                        Times.trans2JulianDate(LocalDateTime.of(1980, 1, 1, 0, 0)),
                                        Times.trans2JulianDate(LocalDateTime.of(1990, 1, 1, 0, 0)),
                                        Times.trans2JulianDate(LocalDateTime.of(2000, 1, 1, 0, 0)),
                                        Times.trans2JulianDate(LocalDateTime.of(2010, 1, 1, 0, 0))
                                    ),
                                    Arrays.asList(
                                        2209600.0 / 50,
                                        2889700.0 / 50,
                                        3307600.0 / 50,
                                        4326900.0 / 50,
                                        5049100.0 / 50
                                    )
                                )
                                .build()
                        )
                        .build()
                )
                .build()
        );

        System.out.println(CzmlGenerator.on(true).generate(czml, new StringWriter()).toString());
    }
}

package aurora.cesium;

import aurora.cesium.element.StartElement;
import aurora.cesium.element.property.DefaultClockProperty;
import aurora.cesium.language.writer.ClockRange;
import aurora.cesium.language.writer.ClockStep;
import aurora.cesium.language.writer.JulianDate;
import org.junit.Test;

import java.io.StringWriter;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public class CzmlTest {

    @Test
    public void test() {
        Czml czml = Czml.newBuilder()
                .withStartElement(
                        StartElement.newBuilder().withId("document").withName("DOCUMENT").withVersion("1.0")
                        .withClock(new DefaultClockProperty(JulianDate.getNow(), 100D, ClockRange.LOOP_STOP, ClockStep.SYSTEM_CLOCK_MULTIPLIER)).build()
                ).build();

        System.out.println(CzmlGenerator.on(true).generate(czml, new StringWriter()).toString());
    }
}

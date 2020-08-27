package aurora.cesium.element.property;

import aurora.cesium.language.writer.BackgroundPaddingCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public class DefaultBackgroundPaddingProperty extends SinglePropertyAdapter<RectangularProperty, BackgroundPaddingProperty> implements BackgroundPaddingProperty {

    public DefaultBackgroundPaddingProperty(RectangularProperty instance) {
        super(instance);
    }

    public DefaultBackgroundPaddingProperty(RectangularProperty instance, TimeInterval interval) {
        super(instance, interval);
    }

    public DefaultBackgroundPaddingProperty(List<BackgroundPaddingProperty> intervals) {
        super(intervals);
    }

    public DefaultBackgroundPaddingProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(BackgroundPaddingCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getRectangular()).ifPresent(rectangularProperty -> rectangularProperty.dispatchRectangular(writer));
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
            dispatchReference(writer);
        }
    }

    @Override
    public RectangularProperty getRectangular() {
        return instance;
    }

    public void setRectangular(RectangularProperty rectangular) {
        this.instance = rectangular;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<BackgroundPaddingProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<BackgroundPaddingProperty> intervals) {
        this.intervals = intervals;
    }

    @Override
    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }
}

package aurora.cesium.element.property;

import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.RepeatCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public class DefaultRepeatProperty extends PropertyAdapter<RepeatProperty> implements RepeatProperty {

    private RectangularProperty rectangular;

    public DefaultRepeatProperty() {
        super();
    }

    public DefaultRepeatProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(RepeatCesiumWriter writer) {
        try (writer) {
            doDispatch(writer, this);
            dispatchReference(writer);
            dispatchIntervals(writer::openMultipleIntervals, ((itemWriter, property) -> {
                try (itemWriter) {
                    doDispatch(itemWriter, property);
                }
            }));
        }
    }

    private void doDispatch(RepeatCesiumWriter writer, RepeatProperty property) {
        Optional.ofNullable(property.getRectangular()).ifPresent(rectangularProperty -> rectangularProperty.dispatchRectangular(writer));
        dispatchInterpolations(writer, property);
        dispatchInterval(writer, property);
        dispatchReference(writer, property);
    }

    @Override
    public RectangularProperty getRectangular() {
        return rectangular;
    }

    public void setRectangular(RectangularProperty rectangular) {
        this.rectangular = rectangular;
    }

    @Override
    public Interpolations getInterpolations() {
        return interpolations;
    }

    public void setInterpolations(Interpolations interpolations) {
        this.interpolations = interpolations;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<RepeatProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<RepeatProperty> intervals) {
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

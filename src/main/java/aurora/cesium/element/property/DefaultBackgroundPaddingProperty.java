package aurora.cesium.element.property;

import aurora.cesium.language.writer.BackgroundPaddingCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public class DefaultBackgroundPaddingProperty extends PropertyAdapter<BackgroundPaddingProperty> implements BackgroundPaddingProperty {

    private RectangularProperty rectangular;

    public DefaultBackgroundPaddingProperty() {
        super();
    }

    public DefaultBackgroundPaddingProperty(RectangularProperty rectangular) {
        this(rectangular, null);
    }

    public DefaultBackgroundPaddingProperty(RectangularProperty rectangular, TimeInterval interval) {
        this.rectangular = rectangular;
        this.interval = interval;
    }

    public DefaultBackgroundPaddingProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatch(BackgroundPaddingCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getRectangular()).ifPresent(rectangularProperty -> rectangularProperty.dispatchRectangular(writer));
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    @Override
    public RectangularProperty getRectangular() {
        return rectangular;
    }

    public void setRectangular(RectangularProperty rectangular) {
        this.rectangular = rectangular;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }
}

package aurora.cesium.element.property;

import aurora.cesium.language.writer.CheckerboardMaterialCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public class DefaultCheckerboardMaterialProperty extends PropertyAdapter<CheckerboardMaterialProperty> implements CheckerboardMaterialProperty {

    private ColorProperty evenColor;

    private ColorProperty oddColor;

    private RepeatProperty repeat;

    @Override
    public void dispatch(CheckerboardMaterialCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getEvenColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer.openEvenColorProperty()));
            Optional.ofNullable(getOddColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer.openOddColorProperty()));
            Optional.ofNullable(getRepeat()).ifPresent(repeatProperty -> repeatProperty.dispatch(writer.openRepeatProperty()));
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
        }
    }

    @Override
    public ColorProperty getEvenColor() {
        return evenColor;
    }

    public void setEvenColor(ColorProperty evenColor) {
        this.evenColor = evenColor;
    }

    @Override
    public ColorProperty getOddColor() {
        return oddColor;
    }

    public void setOddColor(ColorProperty oddColor) {
        this.oddColor = oddColor;
    }

    @Override
    public RepeatProperty getRepeat() {
        return repeat;
    }

    public void setRepeat(RepeatProperty repeat) {
        this.repeat = repeat;
    }

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
    public List<CheckerboardMaterialProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<CheckerboardMaterialProperty> intervals) {
        this.intervals = intervals;
    }
}

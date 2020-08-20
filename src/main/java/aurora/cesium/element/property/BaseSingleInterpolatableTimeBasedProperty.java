package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumExtrapolationType;
import aurora.cesium.language.writer.CesiumInterpolationAlgorithm;
import aurora.cesium.language.writer.Duration;
import aurora.cesium.language.writer.JulianDate;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
abstract class BaseSingleInterpolatableTimeBasedProperty<T> extends BaseSingleTimeBasedProperty<T> implements Property, InterpolatableProperty {

    protected Duration backwardExtrapolationDuration;

    protected CesiumExtrapolationType backwardExtrapolationType;

    protected Duration forwardExtrapolationDuration;

    protected CesiumExtrapolationType forwardExtrapolationType;

    protected CesiumInterpolationAlgorithm interpolationAlgorithm;

    protected Integer interpolationDegree;

    public BaseSingleInterpolatableTimeBasedProperty() {
        super();
    }

    public BaseSingleInterpolatableTimeBasedProperty(List<JulianDate> dates, List<T> instance) {
        super(dates, instance);
    }

    public BaseSingleInterpolatableTimeBasedProperty(List<JulianDate> dates, List<T> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    @Override
    public Duration getBackwardExtrapolationDuration() {
        return backwardExtrapolationDuration;
    }

    public void setBackwardExtrapolationDuration(Duration backwardExtrapolationDuration) {
        this.backwardExtrapolationDuration = backwardExtrapolationDuration;
    }

    @Override
    public CesiumExtrapolationType getBackwardExtrapolationType() {
        return backwardExtrapolationType;
    }

    public void setBackwardExtrapolationType(CesiumExtrapolationType backwardExtrapolationType) {
        this.backwardExtrapolationType = backwardExtrapolationType;
    }

    @Override
    public Duration getForwardExtrapolationDuration() {
        return forwardExtrapolationDuration;
    }

    public void setForwardExtrapolationDuration(Duration forwardExtrapolationDuration) {
        this.forwardExtrapolationDuration = forwardExtrapolationDuration;
    }

    @Override
    public CesiumExtrapolationType getForwardExtrapolationType() {
        return forwardExtrapolationType;
    }

    public void setForwardExtrapolationType(CesiumExtrapolationType forwardExtrapolationType) {
        this.forwardExtrapolationType = forwardExtrapolationType;
    }

    @Override
    public CesiumInterpolationAlgorithm getInterpolationAlgorithm() {
        return interpolationAlgorithm;
    }

    public void setInterpolationAlgorithm(CesiumInterpolationAlgorithm interpolationAlgorithm) {
        this.interpolationAlgorithm = interpolationAlgorithm;
    }

    @Override
    public Integer getInterpolationDegree() {
        return interpolationDegree;
    }

    public void setInterpolationDegree(Integer interpolationDegree) {
        this.interpolationDegree = interpolationDegree;
    }
}

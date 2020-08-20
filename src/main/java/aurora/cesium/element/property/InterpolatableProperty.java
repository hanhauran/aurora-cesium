package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumExtrapolationType;
import aurora.cesium.language.writer.CesiumInterpolationAlgorithm;
import aurora.cesium.language.writer.Duration;
import aurora.cesium.language.writer.advanced.ICesiumInterpolatablePropertyWriter;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface InterpolatableProperty extends Property {

    Duration getBackwardExtrapolationDuration();

    CesiumExtrapolationType getBackwardExtrapolationType();

    Duration getForwardExtrapolationDuration();

    CesiumExtrapolationType getForwardExtrapolationType();

    CesiumInterpolationAlgorithm getInterpolationAlgorithm();

    Integer getInterpolationDegree();

    default void dispatchInterpolatableProperty(ICesiumInterpolatablePropertyWriter writer) {
        Optional.ofNullable(getBackwardExtrapolationDuration()).ifPresent(writer::writeBackwardExtrapolationDuration);
        Optional.ofNullable(getBackwardExtrapolationType()).ifPresent(writer::writeBackwardExtrapolationType);
        Optional.ofNullable(getForwardExtrapolationDuration()).ifPresent(writer::writeForwardExtrapolationDuration);
        Optional.ofNullable(getForwardExtrapolationType()).ifPresent(writer::writeForwardExtrapolationType);
        Optional.ofNullable(getInterpolationAlgorithm()).ifPresent(writer::writeInterpolationAlgorithm);
        Optional.ofNullable(getInterpolationDegree()).ifPresent(writer::writeInterpolationDegree);
    }
}

package aurora.cesium.element.property;

import cesiumlanguagewriter.advanced.ICesiumInterpolatablePropertyWriter;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface Interpolatable {

    Interpolations getInterpolations();

    default void dispatchInterpolations(ICesiumInterpolatablePropertyWriter writer) {
        Optional.ofNullable(getInterpolations()).ifPresent(interpolations -> {
            Optional.ofNullable(interpolations.getBackwardExtrapolationDuration()).ifPresent(writer::writeBackwardExtrapolationDuration);
            Optional.ofNullable(interpolations.getBackwardExtrapolationType()).ifPresent(writer::writeBackwardExtrapolationType);
            Optional.ofNullable(interpolations.getForwardExtrapolationDuration()).ifPresent(writer::writeForwardExtrapolationDuration);
            Optional.ofNullable(interpolations.getForwardExtrapolationType()).ifPresent(writer::writeForwardExtrapolationType);
            Optional.ofNullable(interpolations.getInterpolationAlgorithm()).ifPresent(writer::writeInterpolationAlgorithm);
            Optional.ofNullable(interpolations.getInterpolationDegree()).ifPresent(writer::writeInterpolationDegree);
        });
    }
}

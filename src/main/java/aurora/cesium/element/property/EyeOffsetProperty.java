package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumExtrapolationType;
import aurora.cesium.language.writer.CesiumInterpolationAlgorithm;
import aurora.cesium.language.writer.Duration;
import aurora.cesium.language.writer.EyeOffsetCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface EyeOffsetProperty extends IntervalProperty, InterpolatableProperty {

    @Override
    Duration getBackwardExtrapolationDuration();

    @Override
    CesiumExtrapolationType getBackwardExtrapolationType();

    @Override
    Duration getForwardExtrapolationDuration();

    @Override
    CesiumExtrapolationType getForwardExtrapolationType();

    @Override
    CesiumInterpolationAlgorithm getInterpolationAlgorithm();

    @Override
    Integer getInterpolationDegree();

    void dispatchEyeOffset(EyeOffsetCesiumWriter writer);
}

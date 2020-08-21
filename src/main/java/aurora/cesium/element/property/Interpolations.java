package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumExtrapolationType;
import aurora.cesium.language.writer.CesiumInterpolationAlgorithm;
import aurora.cesium.language.writer.Duration;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
class Interpolations {

    private Duration backwardExtrapolationDuration;

    private CesiumExtrapolationType backwardExtrapolationType;

    private Duration forwardExtrapolationDuration;

    private CesiumExtrapolationType forwardExtrapolationType;

    private CesiumInterpolationAlgorithm interpolationAlgorithm;

    private Integer interpolationDegree;

    public Duration getBackwardExtrapolationDuration() {
        return backwardExtrapolationDuration;
    }

    public void setBackwardExtrapolationDuration(Duration backwardExtrapolationDuration) {
        this.backwardExtrapolationDuration = backwardExtrapolationDuration;
    }

    public CesiumExtrapolationType getBackwardExtrapolationType() {
        return backwardExtrapolationType;
    }

    public void setBackwardExtrapolationType(CesiumExtrapolationType backwardExtrapolationType) {
        this.backwardExtrapolationType = backwardExtrapolationType;
    }

    public Duration getForwardExtrapolationDuration() {
        return forwardExtrapolationDuration;
    }

    public void setForwardExtrapolationDuration(Duration forwardExtrapolationDuration) {
        this.forwardExtrapolationDuration = forwardExtrapolationDuration;
    }

    public CesiumExtrapolationType getForwardExtrapolationType() {
        return forwardExtrapolationType;
    }

    public void setForwardExtrapolationType(CesiumExtrapolationType forwardExtrapolationType) {
        this.forwardExtrapolationType = forwardExtrapolationType;
    }

    public CesiumInterpolationAlgorithm getInterpolationAlgorithm() {
        return interpolationAlgorithm;
    }

    public void setInterpolationAlgorithm(CesiumInterpolationAlgorithm interpolationAlgorithm) {
        this.interpolationAlgorithm = interpolationAlgorithm;
    }

    public Integer getInterpolationDegree() {
        return interpolationDegree;
    }

    public void setInterpolationDegree(Integer interpolationDegree) {
        this.interpolationDegree = interpolationDegree;
    }
}

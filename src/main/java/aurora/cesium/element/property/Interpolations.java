package aurora.cesium.element.property;

import cesiumlanguagewriter.CesiumExtrapolationType;
import cesiumlanguagewriter.CesiumInterpolationAlgorithm;
import cesiumlanguagewriter.Duration;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public class Interpolations {

    public static Builder newBuilder() {
        return Builder.newBuilder();
    }

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


    public static final class Builder {
        private Duration backwardExtrapolationDuration;
        private CesiumExtrapolationType backwardExtrapolationType;
        private Duration forwardExtrapolationDuration;
        private CesiumExtrapolationType forwardExtrapolationType;
        private CesiumInterpolationAlgorithm interpolationAlgorithm;
        private Integer interpolationDegree;

        private Builder() {
        }

        static Builder newBuilder() {
            return new Builder();
        }

        public Builder withBackwardExtrapolationDuration(Duration backwardExtrapolationDuration) {
            this.backwardExtrapolationDuration = backwardExtrapolationDuration;
            return this;
        }

        public Builder withBackwardExtrapolationType(CesiumExtrapolationType backwardExtrapolationType) {
            this.backwardExtrapolationType = backwardExtrapolationType;
            return this;
        }

        public Builder withForwardExtrapolationDuration(Duration forwardExtrapolationDuration) {
            this.forwardExtrapolationDuration = forwardExtrapolationDuration;
            return this;
        }

        public Builder withForwardExtrapolationType(CesiumExtrapolationType forwardExtrapolationType) {
            this.forwardExtrapolationType = forwardExtrapolationType;
            return this;
        }

        public Builder withInterpolationAlgorithm(CesiumInterpolationAlgorithm interpolationAlgorithm) {
            this.interpolationAlgorithm = interpolationAlgorithm;
            return this;
        }

        public Builder withInterpolationDegree(Integer interpolationDegree) {
            this.interpolationDegree = interpolationDegree;
            return this;
        }

        public Interpolations build() {
            Interpolations interpolations = new Interpolations();
            interpolations.setBackwardExtrapolationDuration(backwardExtrapolationDuration);
            interpolations.setBackwardExtrapolationType(backwardExtrapolationType);
            interpolations.setForwardExtrapolationDuration(forwardExtrapolationDuration);
            interpolations.setForwardExtrapolationType(forwardExtrapolationType);
            interpolations.setInterpolationAlgorithm(interpolationAlgorithm);
            interpolations.setInterpolationDegree(interpolationDegree);
            return interpolations;
        }
    }
}

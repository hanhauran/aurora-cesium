package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.element.property.DoubleProperty;
import aurora.cesium.element.property.UriProperty;
import cesiumlanguagewriter.TilesetCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
class TilesetGraphicsAdapter extends GraphicsAdapter<TilesetGraphics, TilesetCesiumWriter> implements TilesetGraphics {

    private DoubleProperty maximumScreenSpaceError;

    private UriProperty uri;

    @Override
    public void dispatch(Supplier<TilesetCesiumWriter> supplier) {
        try (TilesetCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getMaximumScreenSpaceError()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openMaximumScreenSpaceErrorProperty));
            Optional.ofNullable(getShow()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer::openShowProperty));
            Optional.ofNullable(getUri()).ifPresent(uriProperty -> uriProperty.dispatch(writer::openUriProperty));
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
        }
    }

    @Override
    public DoubleProperty getMaximumScreenSpaceError() {
        return maximumScreenSpaceError;
    }

    public void setMaximumScreenSpaceError(DoubleProperty maximumScreenSpaceError) {
        this.maximumScreenSpaceError = maximumScreenSpaceError;
    }

    @Override
    public UriProperty getUri() {
        return uri;
    }

    public void setUri(UriProperty uri) {
        this.uri = uri;
    }

    public static final class Builder {
        protected BooleanProperty show;
        private DoubleProperty maximumScreenSpaceError;
        private UriProperty uri;

        private TimeInterval interval;
        private List<TilesetGraphics> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withMaximumScreenSpaceError(DoubleProperty maximumScreenSpaceError) {
            this.maximumScreenSpaceError = maximumScreenSpaceError;
            return this;
        }

        public Builder withUri(UriProperty uri) {
            this.uri = uri;
            return this;
        }

        public Builder withShow(BooleanProperty show) {
            this.show = show;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<TilesetGraphics> intervals) {
            this.intervals = intervals;
            return this;
        }

        public TilesetGraphicsAdapter build() {
            TilesetGraphicsAdapter tilesetGraphicsAdapter = new TilesetGraphicsAdapter();
            tilesetGraphicsAdapter.setMaximumScreenSpaceError(maximumScreenSpaceError);
            tilesetGraphicsAdapter.setUri(uri);
            tilesetGraphicsAdapter.setShow(show);
            tilesetGraphicsAdapter.setInterval(interval);
            tilesetGraphicsAdapter.setIntervals(intervals);
            return tilesetGraphicsAdapter;
        }
    }
}

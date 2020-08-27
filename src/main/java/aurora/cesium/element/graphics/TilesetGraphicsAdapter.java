package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.element.property.DoubleProperty;
import aurora.cesium.element.property.UriProperty;
import aurora.cesium.language.writer.TilesetCesiumWriter;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public class TilesetGraphicsAdapter extends GraphicsAdapter<TilesetCesiumWriter> implements TilesetGraphics {

    private DoubleProperty maximumScreenSpaceError;

    private UriProperty uri;

    @Override
    public void dispatch(TilesetCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getMaximumScreenSpaceError()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer.openMaximumScreenSpaceErrorProperty()));
            Optional.ofNullable(getShow()).ifPresent(booleanProperty -> booleanProperty.dispatch(writer.openShowProperty()));
            Optional.ofNullable(getUri()).ifPresent(uriProperty -> uriProperty.dispatchUri(writer.openUriProperty()));
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

        public TilesetGraphicsAdapter build() {
            TilesetGraphicsAdapter tilesetGraphicsAdapter = new TilesetGraphicsAdapter();
            tilesetGraphicsAdapter.setMaximumScreenSpaceError(maximumScreenSpaceError);
            tilesetGraphicsAdapter.setUri(uri);
            tilesetGraphicsAdapter.setShow(show);
            return tilesetGraphicsAdapter;
        }
    }
}

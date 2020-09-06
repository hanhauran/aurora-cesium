package aurora.cesium.element.property;

import cesiumlanguagewriter.CesiumResource;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;
import cesiumlanguagewriter.UriCesiumWriter;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
class UriPropertyImpl extends SinglePropertyAdapter<CesiumResource, UriProperty> implements UriProperty {

    @Override
    public void dispatch(Supplier<UriCesiumWriter> supplier) {
        try (UriCesiumWriter writer = supplier.get()) {
            dispatchConsumer(writer::writeUri);

            dispatchDelete(writer);
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
            dispatchReference(writer);
        }
    }

    @Override
    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<UriProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<UriProperty> intervals) {
        this.intervals = intervals;
    }

    @Override
    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }

    public static final class Builder {
        private CesiumResource value;

        private Boolean delete;
        private TimeInterval interval;
        private List<UriProperty> intervals;
        private Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withValue(CesiumResource value) {
            this.value = value;
            return this;
        }

        public Builder withDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<UriProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public UriPropertyImpl build() {
            UriPropertyImpl uriPropertyImpl = new UriPropertyImpl();
            uriPropertyImpl.setValue(value);
            uriPropertyImpl.setDelete(delete);
            uriPropertyImpl.setInterval(interval);
            uriPropertyImpl.setIntervals(intervals);
            uriPropertyImpl.setReference(reference);
            return uriPropertyImpl;
        }
    }
}

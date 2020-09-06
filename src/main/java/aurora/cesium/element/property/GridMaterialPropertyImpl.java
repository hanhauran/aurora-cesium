package aurora.cesium.element.property;

import cesiumlanguagewriter.GridMaterialCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
class GridMaterialPropertyImpl extends PropertyAdapter<GridMaterialProperty> implements GridMaterialProperty {

    private DoubleProperty cellAlpha;

    private ColorProperty color;

    private LineCountProperty lineCount;

    private LineOffsetProperty lineOffset;

    private LineThicknessProperty lineThickness;

    @Override
    public void dispatch(Supplier<GridMaterialCesiumWriter> supplier) {
        try (GridMaterialCesiumWriter writer = supplier.get()) {
            Optional.ofNullable(getCellAlpha()).ifPresent(doubleProperty -> doubleProperty.dispatch(writer::openCellAlphaProperty));
            Optional.ofNullable(getColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer::openColorProperty));
            Optional.ofNullable(getLineCount()).ifPresent(lineCountProperty -> lineCountProperty.dispatch(writer::openLineCountProperty));
            Optional.ofNullable(getLineOffset()).ifPresent(lineOffsetProperty -> lineOffsetProperty.dispatch(writer::openLineOffsetProperty));
            Optional.ofNullable(getLineThickness()).ifPresent(lineThicknessProperty -> lineThicknessProperty.dispatch(writer::openLineThicknessProperty));
            dispatchInterval(writer, (intervalWriterSupplier, property) -> property.dispatch(intervalWriterSupplier));
        }
    }

    @Override
    public DoubleProperty getCellAlpha() {
        return cellAlpha;
    }

    public void setCellAlpha(DoubleProperty cellAlpha) {
        this.cellAlpha = cellAlpha;
    }

    @Override
    public ColorProperty getColor() {
        return color;
    }

    public void setColor(ColorProperty color) {
        this.color = color;
    }

    @Override
    public LineCountProperty getLineCount() {
        return lineCount;
    }

    public void setLineCount(LineCountProperty lineCount) {
        this.lineCount = lineCount;
    }

    @Override
    public LineOffsetProperty getLineOffset() {
        return lineOffset;
    }

    public void setLineOffset(LineOffsetProperty lineOffset) {
        this.lineOffset = lineOffset;
    }

    @Override
    public LineThicknessProperty getLineThickness() {
        return lineThickness;
    }

    public void setLineThickness(LineThicknessProperty lineThickness) {
        this.lineThickness = lineThickness;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<GridMaterialProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<GridMaterialProperty> intervals) {
        this.intervals = intervals;
    }

    public static final class Builder {
        private DoubleProperty cellAlpha;
        private ColorProperty color;
        private LineCountProperty lineCount;
        private LineOffsetProperty lineOffset;
        private LineThicknessProperty lineThickness;

        protected TimeInterval interval;
        protected List<GridMaterialProperty> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withCellAlpha(DoubleProperty cellAlpha) {
            this.cellAlpha = cellAlpha;
            return this;
        }

        public Builder withColor(ColorProperty color) {
            this.color = color;
            return this;
        }

        public Builder withLineCount(LineCountProperty lineCount) {
            this.lineCount = lineCount;
            return this;
        }

        public Builder withLineOffset(LineOffsetProperty lineOffset) {
            this.lineOffset = lineOffset;
            return this;
        }

        public Builder withLineThickness(LineThicknessProperty lineThickness) {
            this.lineThickness = lineThickness;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<GridMaterialProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public GridMaterialPropertyImpl build() {
            GridMaterialPropertyImpl gridMaterialPropertyImpl = new GridMaterialPropertyImpl();
            gridMaterialPropertyImpl.setCellAlpha(cellAlpha);
            gridMaterialPropertyImpl.setColor(color);
            gridMaterialPropertyImpl.setLineCount(lineCount);
            gridMaterialPropertyImpl.setLineOffset(lineOffset);
            gridMaterialPropertyImpl.setLineThickness(lineThickness);
            gridMaterialPropertyImpl.setInterval(interval);
            gridMaterialPropertyImpl.setIntervals(intervals);
            return gridMaterialPropertyImpl;
        }
    }
}

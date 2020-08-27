package aurora.cesium.element.property;

import aurora.cesium.language.writer.CartographicExtent;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.RectangleCoordinatesCesiumWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public class TimeBasedCartographicExtentProperty implements CartographicExtentProperty, TimeBasedProperty<CartographicExtent> {

    private List<JulianDate> dates;

    private List<CartographicExtent> extents;

    private Integer startIndex;

    private Integer length;

    public TimeBasedCartographicExtentProperty(List<JulianDate> dates, List<CartographicExtent> extents) {
        this(dates, extents, null, null);
    }

    public TimeBasedCartographicExtentProperty(List<JulianDate> dates, List<CartographicExtent> extents, Integer startIndex, Integer length) {
        this.dates = dates;
        this.extents = extents;
        this.startIndex = startIndex;
        this.length = length;
    }

    @Override
    public void dispatchWsen(RectangleCoordinatesCesiumWriter writer) {
        Helper.dispatchTimeBasedProperty(this, extents, writer::writeWsen, writer::writeWsen);
    }

    @Override
    public void dispatchWsenDegrees(RectangleCoordinatesCesiumWriter writer) {
        Helper.dispatchTimeBasedProperty(this, extents, writer::writeWsenDegrees, writer::writeWsenDegrees);
    }

    public List<JulianDate> getDates() {
        return dates;
    }

    public void setDates(List<JulianDate> dates) {
        this.dates = dates;
    }

    public List<CartographicExtent> getExtents() {
        return extents;
    }

    public void setExtents(List<CartographicExtent> extents) {
        this.extents = extents;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
}

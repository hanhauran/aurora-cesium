package aurora.cesium.element.property;

import aurora.cesium.language.writer.JulianDate;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
interface TimeBasedProperty<T> {

    List<JulianDate> getDates();

    Integer getStartIndex();

    Integer getLength();
}

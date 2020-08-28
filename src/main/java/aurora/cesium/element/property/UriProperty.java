package aurora.cesium.element.property;

import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.UriCesiumWriter;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface UriProperty extends IntervalProperty<UriProperty>, ReferenceProperty {

    static DefaultUriProperty.Builder newBuilder() {
        return DefaultUriProperty.Builder.newBuilder();
    }

    @Override
    TimeInterval getInterval();

    @Override
    List<UriProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatchUri(UriCesiumWriter writer);
}

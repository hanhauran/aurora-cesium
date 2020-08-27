package aurora.cesium.element.property;

import aurora.cesium.language.writer.ArcTypeCesiumWriter;
import aurora.cesium.language.writer.CesiumArcType;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public interface ArcTypeProperty extends MultiIntervalProperty<ArcTypeCesiumWriter, ArcTypeProperty>, ReferenceProperty {

    CesiumArcType getArcType();

    @Override
    TimeInterval getInterval();

    @Override
    List<ArcTypeProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(ArcTypeCesiumWriter writer);
}

package aurora.cesium.element.property;

import aurora.cesium.language.writer.NodeTransformationCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface NodeTransformationProperty extends IntervalProperty<NodeTransformationProperty> {

    static NodeTransformationPropertyImpl.Builder newBuilder(String name) {
        return NodeTransformationPropertyImpl.Builder.newBuilder(name);
    }

    String getName();

    RotationProperty getRotation();

    ScaleProperty getScale();

    TranslationProperty getTranslation();

    @Override
    TimeInterval getInterval();

    @Override
    List<NodeTransformationProperty> getIntervals();

    void dispatch(NodeTransformationCesiumWriter writer);
}

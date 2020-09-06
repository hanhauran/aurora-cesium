package aurora.cesium.element.property;

import cesiumlanguagewriter.NodeTransformationCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface NodeTransformationProperty extends Property<NodeTransformationCesiumWriter>, Intervalable<NodeTransformationProperty> {

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

    @Override
    void dispatch(Supplier<NodeTransformationCesiumWriter> supplier);
}

package aurora.cesium.element.property;

import cesiumlanguagewriter.NodeTransformationsCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface NodeTransformationsProperty extends Property<NodeTransformationsCesiumWriter>, Intervalable<NodeTransformationsProperty> {

    static NodeTransformationsProperty from(List<NodeTransformationProperty> transformations) {
        return newBuilder().withNodeTransformations(transformations).build();
    }

    static NodeTransformationsPropertyImpl.Builder newBuilder() {
        return NodeTransformationsPropertyImpl.Builder.newBuilder();
    }

    List<NodeTransformationProperty> getNodeTransformations();

    @Override
    TimeInterval getInterval();

    @Override
    List<NodeTransformationsProperty> getIntervals();

    void dispatch(Supplier<NodeTransformationsCesiumWriter> supplier);
}

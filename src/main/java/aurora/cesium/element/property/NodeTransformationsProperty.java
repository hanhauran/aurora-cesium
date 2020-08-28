package aurora.cesium.element.property;

import aurora.cesium.language.writer.NodeTransformationsCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface NodeTransformationsProperty extends IntervalProperty<NodeTransformationsProperty> {

    static DefaultNodeTransformationsProperty.Builder newBuilder() {
        return DefaultNodeTransformationsProperty.Builder.newBuilder();
    }

    List<NodeTransformationProperty> getNodeTransformations();

    @Override
    TimeInterval getInterval();

    @Override
    List<NodeTransformationsProperty> getIntervals();

    void dispatch(NodeTransformationsCesiumWriter writer);
}

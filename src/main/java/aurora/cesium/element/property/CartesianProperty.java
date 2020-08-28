package aurora.cesium.element.property;

import aurora.cesium.language.writer.advanced.ICesiumCartesian3ValuePropertyWriter;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface CartesianProperty extends Property {

    static DefaultCartesianProperty.Builder newBuilder() {
        return DefaultCartesianProperty.Builder.newBuilder();
    }

    void dispatchCartesian(ICesiumCartesian3ValuePropertyWriter writer);
}

package aurora.cesium.element.property;

import aurora.cesium.language.writer.advanced.ICesiumCartesian2ValuePropertyWriter;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface RectangularProperty extends Property {

    static DefaultRectangularProperty.Builder newBuilder() {
        return DefaultRectangularProperty.Builder.newBuilder();
    }

    void dispatchWithoutClose(ICesiumCartesian2ValuePropertyWriter writer);
}

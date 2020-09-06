package aurora.cesium.element.property;

import cesiumlanguagewriter.advanced.ICesiumDeletablePropertyWriter;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/9/1
 */
public interface Deletable {

    Boolean getDelete();

    default void dispatchDelete(ICesiumDeletablePropertyWriter writer) {
        Optional.ofNullable(getDelete()).ifPresent(writer::writeDelete);
    }

}

package aurora.cesium.element.property;

import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.advanced.ICesiumReferenceValuePropertyWriter;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface Referenceable {

    Reference getReference();

    default void dispatchReference(ICesiumReferenceValuePropertyWriter writer) {
        Optional.ofNullable(getReference()).ifPresent(writer::writeReference);
    }
}

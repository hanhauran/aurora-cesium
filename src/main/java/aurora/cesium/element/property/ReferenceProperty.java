package aurora.cesium.element.property;

import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.advanced.ICesiumReferenceValuePropertyWriter;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface ReferenceProperty extends Property {

    Reference getReference();

    default void dispatchReference(ICesiumReferenceValuePropertyWriter writer) {
        dispatchReference(writer, this);
    }

    default void dispatchReference(ICesiumReferenceValuePropertyWriter writer, ReferenceProperty property) {
        Optional.ofNullable(property.getReference()).ifPresent(writer::writeReference);
    }
}

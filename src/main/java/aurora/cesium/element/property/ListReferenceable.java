package aurora.cesium.element.property;

import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.advanced.ICesiumReferenceListValuePropertyWriter;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public interface ListReferenceable {

    Iterable<Reference> getReferences();

    default void dispatchReferences(ICesiumReferenceListValuePropertyWriter writer) {
        Optional.ofNullable(getReferences()).ifPresent(writer::writeReferences);
    }
}

package aurora.cesium.element.property;

import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.advanced.ICesiumReferenceListOfListsValuePropertyWriter;

import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/31
 */
public interface ListOfListsReferenceable {

    Iterable<? extends Iterable<? extends Reference>> getReferences();

    default void dispatchReferenceListOfLists(ICesiumReferenceListOfListsValuePropertyWriter writer) {
        Optional.ofNullable(getReferences()).ifPresent(writer::writeReferences);
    }
}

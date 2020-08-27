package aurora.cesium.element.property;

import aurora.cesium.language.writer.Reference;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public interface ReferencesProperty extends Property {

    Iterable<Reference> getReferences();
}

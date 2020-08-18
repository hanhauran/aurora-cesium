package aurora.cesium.element.property;

import aurora.cesium.writer.Reference;

public interface HasReference {

    default Reference getReference() {
        return null;
    }
}

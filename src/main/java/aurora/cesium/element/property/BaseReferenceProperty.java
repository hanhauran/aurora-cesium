package aurora.cesium.element.property;

import aurora.cesium.writer.Reference;

public abstract class BaseReferenceProperty implements HasReference {

    protected Reference reference;

    @Override
    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }
}

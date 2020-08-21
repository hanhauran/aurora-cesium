package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
abstract class PropertyAdapter {

    protected Interpolations interpolations;

    protected TimeInterval interval;

    protected Reference reference;

    public PropertyAdapter() {}

    public PropertyAdapter(Reference reference) {
        this.reference = reference;
    }
}

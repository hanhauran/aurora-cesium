package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
abstract class PropertyAdapter<P extends Property> {

    protected Interpolations interpolations;

    protected TimeInterval interval;

    protected List<P> intervals;

    protected Reference reference;

    protected Iterable<Reference> references;

    public PropertyAdapter() {}

    public PropertyAdapter(List<P> intervals) {
        this.intervals = intervals;
    }

    public PropertyAdapter(Reference reference) {
        this.reference = reference;
    }
}

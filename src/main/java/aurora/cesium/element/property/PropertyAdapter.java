package aurora.cesium.element.property;

import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
abstract class PropertyAdapter<P extends Property<?>> {

    protected Boolean delete;

    protected Interpolations interpolations;

    protected TimeInterval interval;

    protected List<P> intervals;

    protected Reference reference;

    protected Iterable<Reference> referenceList;

    protected Iterable<? extends Iterable<? extends Reference>> referenceListOfLists;

    public PropertyAdapter() {}

    public PropertyAdapter(List<P> intervals) {
        this.intervals = intervals;
    }

    public PropertyAdapter(Reference reference) {
        this.reference = reference;
    }
}

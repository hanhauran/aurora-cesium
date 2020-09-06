package aurora.cesium.element.property;

import cesiumlanguagewriter.CesiumClassificationType;
import cesiumlanguagewriter.ClassificationTypeCesiumWriter;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface ClassificationTypeProperty extends Property<ClassificationTypeCesiumWriter>, Deletable, Intervalable<ClassificationTypeProperty>, Referenceable {

    static ClassificationTypeProperty from(CesiumClassificationType type) {
        return newBuilder().withValue(type).build();
    }

    static ClassificationTypeProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static ClassificationTypePropertyImpl.Builder newBuilder() {
        return ClassificationTypePropertyImpl.Builder.newBuilder();
    }

    CesiumClassificationType getClassificationType();

    @Override
    Boolean getDelete();

    @Override
    TimeInterval getInterval();

    @Override
    List<ClassificationTypeProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(Supplier<ClassificationTypeCesiumWriter> supplier);
}

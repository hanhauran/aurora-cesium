package aurora.cesium.element.property;

import cesiumlanguagewriter.MaterialCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface MaterialProperty extends Property<MaterialCesiumWriter>, Intervalable<MaterialProperty> {

    static MaterialProperty from(CheckerboardMaterialProperty checkerboardMaterialProperty) {
        return newBuilder().withCheckerboardMaterial(checkerboardMaterialProperty).build();
    }

    static MaterialProperty from(GridMaterialProperty gridMaterialProperty) {
        return newBuilder().withGridMaterial(gridMaterialProperty).build();
    }

    static MaterialProperty from(ImageMaterialProperty imageMaterialProperty) {
        return newBuilder().withImageMaterial(imageMaterialProperty).build();
    }

    static MaterialProperty from(SolidColorMaterialProperty solidColorMaterialProperty) {
        return newBuilder().withSolidColorMaterial(solidColorMaterialProperty).build();
    }

    static MaterialProperty from(StripeMaterialProperty stripeMaterialProperty) {
        return newBuilder().withStripeMaterial(stripeMaterialProperty).build();
    }

    static MaterialPropertyImpl.Builder newBuilder() {
        return MaterialPropertyImpl.Builder.newBuilder();
    }

    CheckerboardMaterialProperty getCheckerboardMaterial();

    GridMaterialProperty getGridMaterial();

    ImageMaterialProperty getImageMaterial();

    SolidColorMaterialProperty getSolidColorMaterial();

    StripeMaterialProperty getStripeMaterial();

    @Override
    TimeInterval getInterval();

    @Override
    List<MaterialProperty> getIntervals();

    @Override
    void dispatch(Supplier<MaterialCesiumWriter> supplier);
}

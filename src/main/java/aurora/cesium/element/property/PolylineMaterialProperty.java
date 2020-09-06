package aurora.cesium.element.property;

import cesiumlanguagewriter.PolylineMaterialCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PolylineMaterialProperty extends Property<PolylineMaterialCesiumWriter>, Intervalable<PolylineMaterialProperty> {

    static PolylineMaterialPropertyImpl.Builder newBuilder() {
        return PolylineMaterialPropertyImpl.Builder.newBuilder();
    }

    CheckerboardMaterialProperty getCheckerboardMaterial();

    GridMaterialProperty getGridMaterial();

    ImageMaterialProperty getImageMaterial();

    PolylineArrowMaterialProperty getPolylineArrowMaterial();

    PolylineDashMaterialProperty getPolylineDashMaterial();

    PolylineGlowMaterialProperty getPolylineGlowMaterial();

    PolylineOutlineMaterialProperty getPolylineOutlineMaterial();

    SolidColorMaterialProperty getSolidColorMaterial();

    StripeMaterialProperty getStripeMaterial();

    @Override
    TimeInterval getInterval();

    @Override
    List<PolylineMaterialProperty> getIntervals();

    @Override
    void dispatch(Supplier<PolylineMaterialCesiumWriter> supplier);
}

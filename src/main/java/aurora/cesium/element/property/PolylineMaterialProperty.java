package aurora.cesium.element.property;

import aurora.cesium.language.writer.PolylineMaterialCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PolylineMaterialProperty extends IntervalProperty<PolylineMaterialProperty> {

    static DefaultPolylineMaterialProperty.Builder newBuilder() {
        return DefaultPolylineMaterialProperty.Builder.newBuilder();
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

    void dispatch(PolylineMaterialCesiumWriter writer);
}

package aurora.cesium.element.property;

import cesiumlanguagewriter.ImageMaterialCesiumWriter;
import cesiumlanguagewriter.TimeInterval;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface ImageMaterialProperty extends Property<ImageMaterialCesiumWriter>, Intervalable<ImageMaterialProperty> {

    static ImageMaterialPropertyImpl.Builder newBuilder() {
        return ImageMaterialPropertyImpl.Builder.newBuilder();
    }

    ColorProperty getColor();

    UriProperty getImage();

    RepeatProperty getRepeat();

    BooleanProperty getTransparent();

    @Override
    TimeInterval getInterval();

    @Override
    List<ImageMaterialProperty> getIntervals();

    @Override
    void dispatch(Supplier<ImageMaterialCesiumWriter> supplier);
}

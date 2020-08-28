package aurora.cesium.element.property;

import aurora.cesium.language.writer.ImageMaterialCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface ImageMaterialProperty extends IntervalProperty<ImageMaterialProperty> {

    ColorProperty getColor();

    UriProperty getImage();

    RepeatProperty getRepeat();

    BooleanProperty getTransparent();

    @Override
    TimeInterval getInterval();

    @Override
    List<ImageMaterialProperty> getIntervals();

    void dispatch(ImageMaterialCesiumWriter writer);
}

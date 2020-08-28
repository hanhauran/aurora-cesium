package aurora.cesium.element.property;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface StripeMaterialProperty extends IntervalProperty<StripeMaterialProperty> {

    ColorProperty getEvenColor();

    ColorProperty getOddColor();

    DoubleProperty getOffset();

    DoubleProperty getRepeat();
}

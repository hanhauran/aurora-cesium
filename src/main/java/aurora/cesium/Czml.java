package aurora.cesium;

import aurora.cesium.element.Entity;
import aurora.cesium.element.StartElement;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface Czml {

    StartElement getStartElement();

    List<Entity> getEntities();
}

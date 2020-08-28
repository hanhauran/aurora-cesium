package aurora.cesium;

import aurora.cesium.element.Entity;
import aurora.cesium.element.StartElement;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface Czml {

    static Czml create() {
        return new CzmlAdapter();
    }

    static Czml create(int initialCapacity) {
        return new CzmlAdapter(initialCapacity);
    }

    Czml push(Entity entity);

    StartElement getStartElement();

    Czml setStartElement(StartElement startElement);

    List<Entity> getEntities();
}

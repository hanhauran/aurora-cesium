package aurora.cesium;

import aurora.cesium.element.Document;
import aurora.cesium.element.Entity;

import java.util.Collection;

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

    Document getDocument();

    Document setDocument(Document document);

    Collection<Entity> getEntities();

    Entity getEntity(String id);

    Entity push(Entity entity);
}

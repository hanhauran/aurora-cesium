package aurora.cesium;

import aurora.cesium.element.Entity;
import aurora.cesium.element.StartElement;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public class CzmlAdapter implements Czml {

    private StartElement startElement;

    private final List<Entity> entities;

    public CzmlAdapter() {
        this.entities = new ArrayList<>();
    }

    public CzmlAdapter(int initialCapacity) {
        this.entities = new ArrayList<>(initialCapacity);
    }

    @Override
    public Czml push(Entity entity) {
        entities.add(entity);
        return this;
    }

    @Override
    public StartElement getStartElement() {
        return startElement;
    }

    @Override
    public Czml setStartElement(StartElement startElement) {
        this.startElement = startElement;
        return this;
    }

    @Override
    public List<Entity> getEntities() {
        return entities;
    }
}

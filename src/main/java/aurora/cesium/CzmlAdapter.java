package aurora.cesium;

import aurora.cesium.element.Document;
import aurora.cesium.element.Entity;

import java.util.*;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
class CzmlAdapter implements Czml {

    private final List<Entity> entities;
    private final Map<String, Entity> entityMap;
    private Document document;

    public CzmlAdapter() {
        this.entities = new LinkedList<>();
        this.entityMap = new HashMap<>();
    }

    public CzmlAdapter(int initialCapacity) {
        this.entities = new ArrayList<>(initialCapacity);
        this.entityMap = new HashMap<>();
    }

    @Override
    public Document getDocument() {
        return document;
    }

    @Override
    public Document setDocument(Document document) {
        this.document = document;
        return document;
    }

    @Override
    public Collection<Entity> getEntities() {
        return entities;
    }

    @Override
    public Entity getEntity(String id) {
        return entityMap.get(id);
    }

    @Override
    public Entity push(Entity entity) {
        entities.add(entity);
        Optional.ofNullable(entity.getId()).ifPresent(id -> entityMap.put(id, entity));
        return entity;
    }
}

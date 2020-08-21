package aurora.cesium;

import aurora.cesium.element.Entity;
import aurora.cesium.element.StartElement;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public class CzmlAdapter implements Czml {

    private StartElement startElement;

    private List<Entity> entities;

    @Override
    public StartElement getStartElement() {
        return startElement;
    }

    public void setStartElement(StartElement startElement) {
        this.startElement = startElement;
    }

    @Override
    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }
}

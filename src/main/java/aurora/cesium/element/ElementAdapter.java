package aurora.cesium.element;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
abstract class ElementAdapter implements Element {

    protected String id;

    protected String name;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

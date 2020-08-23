package aurora.cesium.element.property;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface TripleConsumer<A, B, C> {

    void accept(A a, B b, C c);
}

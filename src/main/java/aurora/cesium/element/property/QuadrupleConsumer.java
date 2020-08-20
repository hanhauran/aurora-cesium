package aurora.cesium.element.property;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
@FunctionalInterface
interface QuadrupleConsumer<A, B, C, D> {
    void accept(A a, B b, C c, D d);
}

package aurora.cesium.writer.advanced;


import aurora.cesium.writer.UnitSpherical;

/**
 * A writer that can write a value as a list of unit spherical values.
 */
@SuppressWarnings( {
        "unused",
        "deprecation",
        "serial"
})
public interface ICesiumUnitSphericalListValuePropertyWriter extends ICesiumPropertyWriter {
    /**
    * Writes the value as a list of unit spherical values.
    * @param values The values.
    */
    void writeUnitSpherical(Iterable<UnitSpherical> values);
}

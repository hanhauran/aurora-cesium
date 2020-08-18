package aurora.cesium.writer.advanced;


import aurora.cesium.writer.Spherical;

/**
 * A writer that can write a value as a list of spherical values.
 */
@SuppressWarnings( {
        "unused",
        "deprecation",
        "serial"
})
public interface ICesiumSphericalListValuePropertyWriter extends ICesiumPropertyWriter {
    /**
    * Writes the value as a list of spherical values.
    * @param values The values.
    */
    void writeSpherical(Iterable<Spherical> values);
}

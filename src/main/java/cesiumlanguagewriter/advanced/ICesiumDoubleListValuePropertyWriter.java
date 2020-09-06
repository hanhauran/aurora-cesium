package cesiumlanguagewriter.advanced;


/**
 * A writer that can write a value as a list of double values.
 */
@SuppressWarnings( {
        "unused",
        "deprecation",
        "serial"
})
public interface ICesiumDoubleListValuePropertyWriter extends ICesiumPropertyWriter {
    /**
    * Writes the value as a list of double values.
    * @param values The values.
    */
    void writeArray(Iterable<Double> values);
}

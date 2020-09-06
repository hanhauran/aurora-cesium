package cesiumlanguagewriter.advanced;


/**
 * A writer that can write a value as a boolean.
 */
@SuppressWarnings( {
        "unused",
        "deprecation",
        "serial"
})
public interface ICesiumBooleanValuePropertyWriter extends ICesiumPropertyWriter {
    /**
    * Writes the value expressed as a boolean value.
    * @param value The value.
    */
    void writeBoolean(boolean value);
}

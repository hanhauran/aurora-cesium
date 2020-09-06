package cesiumlanguagewriter.advanced;


/**
 * A writer that can write a value as a string.
 */
@SuppressWarnings( {
        "unused",
        "deprecation",
        "serial"
})
public interface ICesiumStringValuePropertyWriter extends ICesiumPropertyWriter {
    /**
    * Writes the value expressed as a string value.
    * @param value The value.
    */
    void writeString(String value);
}

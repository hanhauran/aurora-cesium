package aurora.cesium.writer.advanced;


import aurora.cesium.writer.CesiumVerticalOrigin;

import javax.annotation.Nonnull;

/**
 * A writer that can write a value as a vertical origin.
 */
@SuppressWarnings( {
        "unused",
        "deprecation",
        "serial"
})
public interface ICesiumVerticalOriginValuePropertyWriter extends ICesiumPropertyWriter {
    /**
    * Writes the value as a vertical origin.
    * @param value The vertical origin.
    */
    void writeVerticalOrigin(@Nonnull CesiumVerticalOrigin value);
}

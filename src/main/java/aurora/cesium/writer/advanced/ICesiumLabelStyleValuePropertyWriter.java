package aurora.cesium.writer.advanced;


import aurora.cesium.writer.CesiumLabelStyle;

import javax.annotation.Nonnull;

/**
 * A writer that can write a value as a label style.
 */
@SuppressWarnings( {
        "unused",
        "deprecation",
        "serial"
})
public interface ICesiumLabelStyleValuePropertyWriter extends ICesiumPropertyWriter {
    /**
    * Writes the value as a label style.
    * @param value The label style.
    */
    void writeLabelStyle(@Nonnull CesiumLabelStyle value);
}

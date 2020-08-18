package aurora.cesium.writer.advanced;


import aurora.cesium.writer.CesiumShadowMode;

import javax.annotation.Nonnull;

/**
 * A writer that can write a value as a shadow mode.
 */
@SuppressWarnings( {
        "unused",
        "deprecation",
        "serial"
})
public interface ICesiumShadowModeValuePropertyWriter extends ICesiumPropertyWriter {
    /**
    * Writes the value as a shadow mode.
    * @param value The shadow mode.
    */
    void writeShadowMode(@Nonnull CesiumShadowMode value);
}

package aurora.cesium.agi.foundation.compatibility;

import aurora.cesium.agi.foundation.compatibility.annotations.Internal;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Writer;

/**
 * Helper methods related to TextWriter.
 *
 * @deprecated Internal use only.
 */
@Internal
@Deprecated
public final class TextWriterHelper {
    private TextWriterHelper() {}

    public static void write(@Nonnull Writer writer, char value) {
        ArgumentNullException.assertNonNull(writer, "writer");

        try {
            writer.write(value);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static void write(@Nonnull Writer writer, @Nonnull char[] buffer, int index, int count) {
        ArgumentNullException.assertNonNull(writer, "writer");
        ArgumentNullException.assertNonNull(buffer, "buffer");

        try {
            writer.write(buffer, index, count);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static void write(@Nonnull Writer writer, @Nullable String value) {
        ArgumentNullException.assertNonNull(writer, "writer");

        if (value == null)
            return;

        try {
            writer.write(value);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static void writeLine(@Nonnull Writer writer, @Nullable String value) {
        write(writer, value);
        writeLine(writer);
    }

    public static void writeLine(@Nonnull Writer writer) {
        write(writer, getNewLine());
    }

    /**
     * Gets the line terminator string.
     *
     * @return The line terminator string.
     */
    public static String getNewLine() {
        return System.getProperty("line.separator");
    }
}

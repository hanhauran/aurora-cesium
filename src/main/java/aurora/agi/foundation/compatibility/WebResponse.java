package aurora.agi.foundation.compatibility;

import aurora.agi.foundation.compatibility.annotations.Internal;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.net.URLConnection;

/**
 * @deprecated Internal use only.
 */
@Internal
@Deprecated
public class WebResponse implements IDisposable {
    @Nonnull
    protected final URLConnection connection;
    @Nullable
    private InputStream inputStream;

    WebResponse(@Nonnull URLConnection connection) {
        this.connection = connection;
    }

    @Nonnull
    public InputStream getResponseStream() {
        if (inputStream != null) {
            return inputStream;
        }

        try {
            inputStream = connection.getInputStream();
            return inputStream;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String getContentType() {
        return connection.getContentType();
    }

    @Override
    public void dispose() {
        DisposeHelper.dispose(inputStream);
    }
}

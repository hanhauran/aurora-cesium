package aurora.agi.foundation.compatibility;

import aurora.agi.foundation.compatibility.annotations.Internal;

import javax.annotation.Nonnull;
import java.net.URL;
import java.net.URLConnection;

/**
 * @deprecated Internal use only.
 */
@Internal
@Deprecated
public class FileWebRequest extends WebRequest {
    FileWebRequest(@Nonnull URL url) {
        super(url);
    }

    @Override
    protected void configureConnection(URLConnection connection) {}
}

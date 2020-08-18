package aurora.cesium.agi.foundation.compatibility;

import aurora.cesium.agi.foundation.compatibility.annotations.Internal;

import javax.annotation.Nonnull;
import java.net.URL;
import java.net.URLConnection;

/**
 * @deprecated Internal use only.
 */
@Internal
@Deprecated
public class FtpWebRequest extends WebRequest {
    FtpWebRequest(@Nonnull URL url) {
        super(url);
    }

    @Override
    protected void configureConnection(URLConnection connection) {}
}

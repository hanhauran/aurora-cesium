package aurora.cesium.agi.foundation.compatibility;

import aurora.cesium.agi.foundation.compatibility.annotations.Internal;

import javax.annotation.Nonnull;
import java.util.ResourceBundle;

/**
 * @deprecated Internal use only.
 */
@Internal
@Deprecated
public final class ResourceBundleHelper {
    private ResourceBundleHelper() {}

    public static ResourceBundle getBundle(@Nonnull String baseName) {
        ArgumentNullException.assertNonNull(baseName, "baseName");

        int dotIndex = baseName.lastIndexOf(".");
        String packageName = StringHelper.toLowerInvariant(baseName.substring(0, dotIndex));
        String className = baseName.substring(dotIndex);
        return ResourceBundle.getBundle(packageName + className);
    }
}

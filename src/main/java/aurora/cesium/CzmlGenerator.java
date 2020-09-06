package aurora.cesium;

import aurora.cesium.element.Entity;
import aurora.cesium.element.Document;
import cesiumlanguagewriter.CesiumOutputStream;
import cesiumlanguagewriter.CesiumStreamWriter;

import java.io.Writer;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/17
 */
public final class CzmlGenerator {

    public static CzmlGenerator on(boolean pretty) {
        return new CzmlGenerator(pretty);
    }

    private final boolean pretty;

    private CzmlGenerator(boolean pretty) {
        this.pretty = pretty;
    }

    public <T extends Writer> T generate(Czml czml, T worker) {
        if (czml == null) {
            throw new NullPointerException("Czml should not be null.");
        }

        if (worker == null) {
            throw new NullPointerException("Worker should not be null.");
        }

        CesiumOutputStream cos = new CesiumOutputStream(worker, pretty);
        CesiumStreamWriter csw = new CesiumStreamWriter();

        cos.writeStartSequence();
        writeStartElement(cos, csw, czml.getDocument());
        Optional.ofNullable(czml.getEntities()).ifPresent(entities -> entities.forEach(entity -> writeEntity(cos, csw, entity)));
        cos.writeEndSequence();

        return worker;
    }

    private void writeEntity(CesiumOutputStream cos, CesiumStreamWriter csw, Entity entity) {
        Optional.ofNullable(entity).ifPresent(et -> et.dispatch(() -> csw.openPacket(cos)));
    }

    private void writeStartElement(CesiumOutputStream cos, CesiumStreamWriter csw, Document document) {
        Optional.ofNullable(document).ifPresent(se -> se.dispatch(() -> csw.openPacket(cos)));
    }
}

package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bfi */
/* compiled from: IMASDK */
public abstract class bfi<T> {
    public final T fromJson(Reader reader) throws IOException {
        return read(new biw(reader));
    }

    public final T fromJsonTree(bey bey) {
        try {
            return read(new bgv(bey));
        } catch (IOException e) {
            throw new bez((Throwable) e);
        }
    }

    public final bfi<T> nullSafe() {
        return new bfh(this);
    }

    public abstract T read(biw biw) throws IOException;

    public final void toJson(Writer writer, T t) throws IOException {
        write(new biy(writer), t);
    }

    public final bey toJsonTree(T t) {
        try {
            bgx bgx = new bgx();
            write(bgx, t);
            return bgx.mo15106a();
        } catch (IOException e) {
            throw new bez((Throwable) e);
        }
    }

    public abstract void write(biy biy, T t) throws IOException;

    public final T fromJson(String str) throws IOException {
        return fromJson((Reader) new StringReader(str));
    }

    public final String toJson(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}

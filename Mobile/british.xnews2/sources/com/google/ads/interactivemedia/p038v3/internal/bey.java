package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bey */
/* compiled from: IMASDK */
public class bey {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            biy biy = new biy(stringWriter);
            biy.mo15142m(true);
            aru.m14639e(this, biy);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}

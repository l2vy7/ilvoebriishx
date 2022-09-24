package com.google.ads.interactivemedia.p038v3.internal;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ys */
/* compiled from: IMASDK */
public final class C4512ys {

    /* renamed from: a */
    private final ByteArrayOutputStream f19698a;

    /* renamed from: b */
    private final DataOutputStream f19699b;

    public C4512ys() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f19698a = byteArrayOutputStream;
        this.f19699b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: b */
    private static void m19611b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: c */
    private static void m19612c(DataOutputStream dataOutputStream, long j) throws IOException {
        dataOutputStream.writeByte(((int) (j >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j) & 255);
    }

    /* renamed from: a */
    public final byte[] mo16850a(C4510yq yqVar) {
        this.f19698a.reset();
        try {
            m19611b(this.f19699b, yqVar.f19692a);
            String str = yqVar.f19693b;
            if (str == null) {
                str = "";
            }
            m19611b(this.f19699b, str);
            m19612c(this.f19699b, yqVar.f19694c);
            m19612c(this.f19699b, yqVar.f19695d);
            this.f19699b.write(yqVar.f19696e);
            this.f19699b.flush();
            return this.f19698a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

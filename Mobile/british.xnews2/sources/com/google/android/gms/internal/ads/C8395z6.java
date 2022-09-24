package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.z6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8395z6 extends ByteArrayOutputStream {

    /* renamed from: b */
    private final C7930m6 f42329b;

    public C8395z6(C7930m6 m6Var, int i) {
        this.f42329b = m6Var;
        this.buf = m6Var.mo33495b(Math.max(i, 256));
    }

    /* renamed from: c */
    private final void m40179c(int i) {
        int i2 = this.count;
        if (i2 + i > this.buf.length) {
            int i3 = i2 + i;
            byte[] b = this.f42329b.mo33495b(i3 + i3);
            System.arraycopy(this.buf, 0, b, 0, this.count);
            this.f42329b.mo33494a(this.buf);
            this.buf = b;
        }
    }

    public final void close() throws IOException {
        this.f42329b.mo33494a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f42329b.mo33494a(this.buf);
    }

    public final synchronized void write(int i) {
        m40179c(1);
        super.write(i);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        m40179c(i2);
        super.write(bArr, i, i2);
    }
}

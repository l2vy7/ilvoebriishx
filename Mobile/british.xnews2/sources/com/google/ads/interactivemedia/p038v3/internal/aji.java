package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aji */
/* compiled from: IMASDK */
public final class aji extends InputStream {

    /* renamed from: a */
    private final ajg f15043a;

    /* renamed from: b */
    private final ajk f15044b;

    /* renamed from: c */
    private final byte[] f15045c;

    /* renamed from: d */
    private boolean f15046d = false;

    /* renamed from: e */
    private boolean f15047e = false;

    /* renamed from: f */
    private long f15048f;

    public aji(ajg ajg, ajk ajk) {
        this.f15043a = ajg;
        this.f15044b = ajk;
        this.f15045c = new byte[1];
    }

    /* renamed from: b */
    private final void m13843b() throws IOException {
        if (!this.f15046d) {
            this.f15043a.mo13296c(this.f15044b);
            this.f15046d = true;
        }
    }

    /* renamed from: a */
    public final void mo13801a() throws IOException {
        m13843b();
    }

    public final void close() throws IOException {
        if (!this.f15047e) {
            this.f15043a.mo13299f();
            this.f15047e = true;
        }
    }

    public final int read() throws IOException {
        if (read(this.f15045c) == -1) {
            return -1;
        }
        return this.f15045c[0] & 255;
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        aup.m14887r(!this.f15047e);
        m13843b();
        int a = this.f15043a.mo13294a(bArr, i, i2);
        if (a == -1) {
            return -1;
        }
        this.f15048f += (long) a;
        return a;
    }
}

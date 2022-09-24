package com.google.ads.interactivemedia.p039v3.internal;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ra */
/* compiled from: IMASDK */
public final class C4305ra implements C4327rw {

    /* renamed from: a */
    private final byte[] f18502a = new byte[4096];

    /* renamed from: a */
    public final void mo13403a(C4120ke keVar) {
    }

    /* renamed from: b */
    public final void mo13404b(long j, int i, int i2, int i3, C4326rv rvVar) {
    }

    /* renamed from: c */
    public final int mo13405c(ajd ajd, int i, boolean z) throws IOException {
        return ajq.m13892f(this, ajd, i, z);
    }

    /* renamed from: d */
    public final void mo13406d(alw alw, int i) {
        ajq.m13893g(this, alw, i);
    }

    /* renamed from: e */
    public final int mo13407e(ajd ajd, int i, boolean z) throws IOException {
        int a = ajd.mo13294a(this.f18502a, 0, Math.min(4096, i));
        if (a != -1) {
            return a;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: f */
    public final void mo13408f(alw alw, int i) {
        alw.mo13954l(i);
    }
}

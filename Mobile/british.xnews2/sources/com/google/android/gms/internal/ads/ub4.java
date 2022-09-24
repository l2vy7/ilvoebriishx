package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ub4 implements ad4 {

    /* renamed from: a */
    private final byte[] f39821a = new byte[4096];

    /* renamed from: a */
    public final void mo30354a(C8281w wVar) {
    }

    /* renamed from: b */
    public final /* synthetic */ int mo30355b(wb1 wb1, int i, boolean z) {
        return yc4.m39856a(this, wb1, i, true);
    }

    /* renamed from: c */
    public final int mo30356c(wb1 wb1, int i, boolean z, int i2) throws IOException {
        int b = wb1.mo30477b(this.f39821a, 0, Math.min(4096, i));
        if (b != -1) {
            return b;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: d */
    public final /* synthetic */ void mo30357d(uq2 uq2, int i) {
        yc4.m39857b(this, uq2, i);
    }

    /* renamed from: e */
    public final void mo30358e(long j, int i, int i2, int i3, zc4 zc4) {
    }

    /* renamed from: f */
    public final void mo30359f(uq2 uq2, int i, int i2) {
        uq2.mo35237g(i);
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.p039ts.PsExtractor;

/* renamed from: com.google.android.gms.internal.ads.p0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8033p0 implements C7924m0 {

    /* renamed from: a */
    private final uq2 f36826a;

    /* renamed from: b */
    private final int f36827b;

    /* renamed from: c */
    private final int f36828c;

    /* renamed from: d */
    private int f36829d;

    /* renamed from: e */
    private int f36830e;

    public C8033p0(C7814j0 j0Var) {
        uq2 uq2 = j0Var.f33686b;
        this.f36826a = uq2;
        uq2.mo35236f(12);
        this.f36828c = uq2.mo35252v() & 255;
        this.f36827b = uq2.mo35252v();
    }

    public final int zza() {
        return -1;
    }

    public final int zzb() {
        return this.f36827b;
    }

    public final int zzc() {
        int i = this.f36828c;
        if (i == 8) {
            return this.f36826a.mo35249s();
        }
        if (i == 16) {
            return this.f36826a.mo35253w();
        }
        int i2 = this.f36829d;
        this.f36829d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f36830e & 15;
        }
        int s = this.f36826a.mo35249s();
        this.f36830e = s;
        return (s & PsExtractor.VIDEO_STREAM_MASK) >> 4;
    }
}

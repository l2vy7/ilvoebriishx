package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qg */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8085qg implements C8405zg {

    /* renamed from: a */
    public final int[] f38032a;

    /* renamed from: b */
    public final long[] f38033b;

    /* renamed from: c */
    public final long[] f38034c;

    /* renamed from: d */
    public final long[] f38035d;

    /* renamed from: e */
    private final long f38036e;

    public C8085qg(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f38032a = iArr;
        this.f38033b = jArr;
        this.f38034c = jArr2;
        this.f38035d = jArr3;
        int length = iArr.length;
        if (length > 0) {
            int i = length - 1;
            this.f38036e = jArr2[i] + jArr3[i];
            return;
        }
        this.f38036e = 0;
    }

    /* renamed from: a */
    public final long mo32130a(long j) {
        return this.f38033b[C7836jm.m33641c(this.f38035d, j, true, true)];
    }

    public final long zza() {
        return this.f38036e;
    }

    public final boolean zzc() {
        return true;
    }
}

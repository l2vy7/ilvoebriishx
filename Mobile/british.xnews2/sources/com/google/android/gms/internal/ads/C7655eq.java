package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.eq */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7655eq {

    /* renamed from: a */
    private final InputStream f31459a;

    /* renamed from: b */
    private final boolean f31460b;

    /* renamed from: c */
    private final boolean f31461c;

    /* renamed from: d */
    private final long f31462d;

    /* renamed from: e */
    private final boolean f31463e;

    private C7655eq(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        this.f31459a = inputStream;
        this.f31460b = z;
        this.f31461c = z2;
        this.f31462d = j;
        this.f31463e = z3;
    }

    /* renamed from: b */
    public static C7655eq m31908b(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        return new C7655eq(inputStream, z, z2, j, z3);
    }

    /* renamed from: a */
    public final long mo31637a() {
        return this.f31462d;
    }

    /* renamed from: c */
    public final InputStream mo31638c() {
        return this.f31459a;
    }

    /* renamed from: d */
    public final boolean mo31639d() {
        return this.f31460b;
    }

    /* renamed from: e */
    public final boolean mo31640e() {
        return this.f31463e;
    }

    /* renamed from: f */
    public final boolean mo31641f() {
        return this.f31461c;
    }
}

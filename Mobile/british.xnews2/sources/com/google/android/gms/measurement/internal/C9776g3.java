package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4604n;
import java.util.Map;
import p255u5.C11032g;

/* renamed from: com.google.android.gms.measurement.internal.g3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9776g3 implements Runnable {

    /* renamed from: b */
    private final C9765f3 f46284b;

    /* renamed from: c */
    private final int f46285c;

    /* renamed from: d */
    private final Throwable f46286d;

    /* renamed from: e */
    private final byte[] f46287e;

    /* renamed from: f */
    private final String f46288f;

    /* renamed from: g */
    private final Map f46289g;

    /* synthetic */ C9776g3(String str, C9765f3 f3Var, int i, Throwable th, byte[] bArr, Map map, C11032g gVar) {
        C4604n.m20098k(f3Var);
        this.f46284b = f3Var;
        this.f46285c = i;
        this.f46286d = th;
        this.f46287e = bArr;
        this.f46288f = str;
        this.f46289g = map;
    }

    public final void run() {
        this.f46284b.mo38902a(this.f46288f, this.f46285c, this.f46286d, this.f46287e, this.f46289g);
    }
}

package com.google.android.gms.measurement.internal;

import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.h6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final /* synthetic */ class C9789h6 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C9800i6 f46327b;

    /* renamed from: c */
    public final /* synthetic */ int f46328c;

    /* renamed from: d */
    public final /* synthetic */ Exception f46329d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f46330e;

    /* renamed from: f */
    public final /* synthetic */ Map f46331f;

    public /* synthetic */ C9789h6(C9800i6 i6Var, int i, Exception exc, byte[] bArr, Map map) {
        this.f46327b = i6Var;
        this.f46328c = i;
        this.f46329d = exc;
        this.f46330e = bArr;
        this.f46331f = map;
    }

    public final void run() {
        this.f46327b.mo39020a(this.f46328c, this.f46329d, this.f46330e, this.f46331f);
    }
}

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C9458zd;

/* renamed from: com.google.android.gms.measurement.internal.z4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9974z4 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ String f46915b;

    /* renamed from: c */
    final /* synthetic */ String f46916c;

    /* renamed from: d */
    final /* synthetic */ String f46917d;

    /* renamed from: e */
    final /* synthetic */ long f46918e;

    /* renamed from: f */
    final /* synthetic */ C9716a5 f46919f;

    C9974z4(C9716a5 a5Var, String str, String str2, String str3, long j) {
        this.f46919f = a5Var;
        this.f46915b = str;
        this.f46916c = str2;
        this.f46917d = str3;
        this.f46918e = j;
    }

    public final void run() {
        C9458zd.m44022b();
        if (this.f46919f.f46149b.mo39278T().mo19337B((String) null, C9903s2.f46719v0)) {
            String str = this.f46915b;
            if (str == null) {
                this.f46919f.f46149b.mo39309v(this.f46916c, (C9844m6) null);
                return;
            }
            this.f46919f.f46149b.mo39309v(this.f46916c, new C9844m6(this.f46917d, str, this.f46918e));
            return;
        }
        String str2 = this.f46915b;
        if (str2 == null) {
            this.f46919f.f46149b.mo39287b0().mo19369K().mo39200G(this.f46916c, (C9844m6) null);
            return;
        }
        this.f46919f.f46149b.mo39287b0().mo19369K().mo39200G(this.f46916c, new C9844m6(this.f46917d, str2, this.f46918e));
    }
}

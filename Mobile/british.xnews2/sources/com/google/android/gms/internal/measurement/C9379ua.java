package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.ua */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9379ua extends C9199j {

    /* renamed from: d */
    final /* synthetic */ C9412wc f45492d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9379ua(C9396vb vbVar, String str, C9412wc wcVar) {
        super("getValue");
        this.f45492d = wcVar;
    }

    /* renamed from: d */
    public final C9306q mo37655d(C9326r4 r4Var, List list) {
        C9343s5.m43611h("getValue", 2, list);
        C9306q b = r4Var.mo37977b((C9306q) list.get(0));
        C9306q b2 = r4Var.mo37977b((C9306q) list.get(1));
        String zza = this.f45492d.zza(b.zzi());
        return zza != null ? new C9369u(zza) : b2;
    }
}

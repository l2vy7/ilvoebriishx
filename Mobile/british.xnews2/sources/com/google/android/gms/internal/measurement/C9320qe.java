package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.qe */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9320qe extends C9199j {

    /* renamed from: d */
    final boolean f45402d;

    /* renamed from: e */
    final boolean f45403e;

    /* renamed from: f */
    final /* synthetic */ C9336re f45404f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9320qe(C9336re reVar, boolean z, boolean z2) {
        super("log");
        this.f45404f = reVar;
        this.f45402d = z;
        this.f45403e = z2;
    }

    /* renamed from: d */
    public final C9306q mo37655d(C9326r4 r4Var, List list) {
        C9343s5.m43612i("log", 1, list);
        if (list.size() == 1) {
            this.f45404f.f45435d.mo37951a(3, r4Var.mo37977b((C9306q) list.get(0)).zzi(), Collections.emptyList(), this.f45402d, this.f45403e);
            return C9306q.f45372d0;
        }
        int b = C9343s5.m43605b(r4Var.mo37977b((C9306q) list.get(0)).zzh().doubleValue());
        int i = b != 2 ? b != 3 ? b != 5 ? b != 6 ? 3 : 2 : 5 : 1 : 4;
        String zzi = r4Var.mo37977b((C9306q) list.get(1)).zzi();
        if (list.size() == 2) {
            this.f45404f.f45435d.mo37951a(i, zzi, Collections.emptyList(), this.f45402d, this.f45403e);
            return C9306q.f45372d0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 2; i2 < Math.min(list.size(), 5); i2++) {
            arrayList.add(r4Var.mo37977b((C9306q) list.get(i2)).zzi());
        }
        this.f45404f.f45435d.mo37951a(i, zzi, arrayList, this.f45402d, this.f45403e);
        return C9306q.f45372d0;
    }
}

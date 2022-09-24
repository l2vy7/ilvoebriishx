package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9193i9 extends C9208j9 {
    /* synthetic */ C9193i9(C9163g9 g9Var) {
        super((C9163g9) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37617a(Object obj, long j) {
        ((C9438y8) C9165gb.m42955k(obj, j)).zzb();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo37618b(Object obj, Object obj2, long j) {
        C9438y8 y8Var = (C9438y8) C9165gb.m42955k(obj, j);
        C9438y8 y8Var2 = (C9438y8) C9165gb.m42955k(obj2, j);
        int size = y8Var.size();
        int size2 = y8Var2.size();
        if (size > 0 && size2 > 0) {
            if (!y8Var.zzc()) {
                y8Var = y8Var.mo37416s(size2 + size);
            }
            y8Var.addAll(y8Var2);
        }
        if (size > 0) {
            y8Var2 = y8Var;
        }
        C9165gb.m42968x(obj, j, y8Var2);
    }
}

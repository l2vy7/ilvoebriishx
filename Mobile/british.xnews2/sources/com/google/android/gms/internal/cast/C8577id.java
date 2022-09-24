package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.id */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8577id extends C8593jd {
    /* synthetic */ C8577id(C8543gd gdVar) {
        super((C8543gd) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36551a(Object obj, long j) {
        ((C8843zc) C8545gf.m40965s(obj, j)).zzb();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final <E> void mo36552b(Object obj, Object obj2, long j) {
        C8843zc zcVar = (C8843zc) C8545gf.m40965s(obj, j);
        C8843zc zcVar2 = (C8843zc) C8545gf.m40965s(obj2, j);
        int size = zcVar.size();
        int size2 = zcVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zcVar.zza()) {
                zcVar = zcVar.mo36467p(size2 + size);
            }
            zcVar.addAll(zcVar2);
        }
        if (size > 0) {
            zcVar2 = zcVar;
        }
        C8545gf.m40966t(obj, j, zcVar2);
    }
}

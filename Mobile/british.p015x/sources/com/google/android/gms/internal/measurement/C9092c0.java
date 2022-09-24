package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.c0 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9092c0 implements Comparator {

    /* renamed from: b */
    final /* synthetic */ C9199j f44911b;

    /* renamed from: c */
    final /* synthetic */ C9326r4 f44912c;

    C9092c0(C9199j jVar, C9326r4 r4Var) {
        this.f44911b = jVar;
        this.f44912c = r4Var;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C9306q qVar = (C9306q) obj;
        C9306q qVar2 = (C9306q) obj2;
        C9199j jVar = this.f44911b;
        C9326r4 r4Var = this.f44912c;
        if (qVar instanceof C9384v) {
            return !(qVar2 instanceof C9384v) ? 1 : 0;
        }
        if (qVar2 instanceof C9384v) {
            return -1;
        }
        if (jVar == null) {
            return qVar.zzi().compareTo(qVar2.zzi());
        }
        return (int) C9343s5.m43604a(jVar.mo37655d(r4Var, Arrays.asList(new C9306q[]{qVar, qVar2})).zzh().doubleValue());
    }
}

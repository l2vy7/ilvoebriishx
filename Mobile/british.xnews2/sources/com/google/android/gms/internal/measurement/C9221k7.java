package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.k7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9221k7 implements Comparator {
    C9221k7() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C9329r7 r7Var = (C9329r7) obj;
        C9329r7 r7Var2 = (C9329r7) obj2;
        C9191i7 i7Var = new C9191i7(r7Var);
        C9191i7 i7Var2 = new C9191i7(r7Var2);
        while (i7Var.hasNext() && i7Var2.hasNext()) {
            int a = C9206j7.m43077a(i7Var.zza() & 255, i7Var2.zza() & 255);
            if (a != 0) {
                return a;
            }
        }
        return C9206j7.m43077a(r7Var.mo37731c(), r7Var2.mo37731c());
    }
}

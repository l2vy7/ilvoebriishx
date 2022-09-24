package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9178h9 extends C9208j9 {

    /* renamed from: c */
    private static final Class f45070c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ C9178h9(C9163g9 g9Var) {
        super((C9163g9) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37617a(Object obj, long j) {
        Object obj2;
        List list = (List) C9165gb.m42955k(obj, j);
        if (list instanceof C9148f9) {
            obj2 = ((C9148f9) list).zze();
        } else if (!f45070c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C9118da) || !(list instanceof C9438y8)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C9438y8 y8Var = (C9438y8) list;
                if (y8Var.zzc()) {
                    y8Var.zzb();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C9165gb.m42968x(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.internal.measurement.e9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.google.android.gms.internal.measurement.e9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.gms.internal.measurement.e9} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37618b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C9148f9
            if (r2 == 0) goto L_0x0020
            com.google.android.gms.internal.measurement.e9 r1 = new com.google.android.gms.internal.measurement.e9
            r1.<init>((int) r0)
            goto L_0x0035
        L_0x0020:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C9118da
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C9438y8
            if (r2 == 0) goto L_0x0030
            com.google.android.gms.internal.measurement.y8 r1 = (com.google.android.gms.internal.measurement.C9438y8) r1
            com.google.android.gms.internal.measurement.y8 r0 = r1.mo37416s(r0)
            r1 = r0
            goto L_0x0035
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0035:
            com.google.android.gms.internal.measurement.C9165gb.m42968x(r5, r7, r1)
            goto L_0x008f
        L_0x0039:
            java.lang.Class r2 = f45070c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0057
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            com.google.android.gms.internal.measurement.C9165gb.m42968x(r5, r7, r2)
        L_0x0055:
            r1 = r2
            goto L_0x008f
        L_0x0057:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C9087bb
            if (r2 == 0) goto L_0x0072
            com.google.android.gms.internal.measurement.e9 r2 = new com.google.android.gms.internal.measurement.e9
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            com.google.android.gms.internal.measurement.bb r1 = (com.google.android.gms.internal.measurement.C9087bb) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            com.google.android.gms.internal.measurement.C9165gb.m42968x(r5, r7, r2)
            goto L_0x0055
        L_0x0072:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C9118da
            if (r2 == 0) goto L_0x008f
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C9438y8
            if (r2 == 0) goto L_0x008f
            r2 = r1
            com.google.android.gms.internal.measurement.y8 r2 = (com.google.android.gms.internal.measurement.C9438y8) r2
            boolean r3 = r2.zzc()
            if (r3 != 0) goto L_0x008f
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.measurement.y8 r1 = r2.mo37416s(r1)
            com.google.android.gms.internal.measurement.C9165gb.m42968x(r5, r7, r1)
        L_0x008f:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x009e
            if (r2 <= 0) goto L_0x009e
            r1.addAll(r6)
        L_0x009e:
            if (r0 > 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r6 = r1
        L_0x00a2:
            com.google.android.gms.internal.measurement.C9165gb.m42968x(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C9178h9.mo37618b(java.lang.Object, java.lang.Object, long):void");
    }
}

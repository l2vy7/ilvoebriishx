package com.google.android.gms.internal.cast;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.cast.hd */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8560hd extends C8593jd {

    /* renamed from: c */
    private static final Class<?> f43523c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ C8560hd(C8543gd gdVar) {
        super((C8543gd) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36551a(Object obj, long j) {
        Object obj2;
        List list = (List) C8545gf.m40965s(obj, j);
        if (list instanceof C8527fd) {
            obj2 = ((C8527fd) list).zzg();
        } else if (!f43523c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C8495de) || !(list instanceof C8843zc)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C8843zc zcVar = (C8843zc) list;
                if (zcVar.zza()) {
                    zcVar.zzb();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C8545gf.m40966t(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.internal.cast.ed} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.google.android.gms.internal.cast.ed} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.gms.internal.cast.ed} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E> void mo36552b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = com.google.android.gms.internal.cast.C8545gf.m40965s(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = com.google.android.gms.internal.cast.C8545gf.m40965s(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r1 instanceof com.google.android.gms.internal.cast.C8527fd
            if (r2 == 0) goto L_0x0020
            com.google.android.gms.internal.cast.ed r1 = new com.google.android.gms.internal.cast.ed
            r1.<init>((int) r0)
            goto L_0x0035
        L_0x0020:
            boolean r2 = r1 instanceof com.google.android.gms.internal.cast.C8495de
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof com.google.android.gms.internal.cast.C8843zc
            if (r2 == 0) goto L_0x0030
            com.google.android.gms.internal.cast.zc r1 = (com.google.android.gms.internal.cast.C8843zc) r1
            com.google.android.gms.internal.cast.zc r0 = r1.mo36467p(r0)
            r1 = r0
            goto L_0x0035
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0035:
            com.google.android.gms.internal.cast.C8545gf.m40966t(r5, r7, r1)
            goto L_0x008f
        L_0x0039:
            java.lang.Class<?> r2 = f43523c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0057
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            com.google.android.gms.internal.cast.C8545gf.m40966t(r5, r7, r2)
        L_0x0055:
            r1 = r2
            goto L_0x008f
        L_0x0057:
            boolean r2 = r1 instanceof com.google.android.gms.internal.cast.C8462bf
            if (r2 == 0) goto L_0x0072
            com.google.android.gms.internal.cast.ed r2 = new com.google.android.gms.internal.cast.ed
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            com.google.android.gms.internal.cast.bf r1 = (com.google.android.gms.internal.cast.C8462bf) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            com.google.android.gms.internal.cast.C8545gf.m40966t(r5, r7, r2)
            goto L_0x0055
        L_0x0072:
            boolean r2 = r1 instanceof com.google.android.gms.internal.cast.C8495de
            if (r2 == 0) goto L_0x008f
            boolean r2 = r1 instanceof com.google.android.gms.internal.cast.C8843zc
            if (r2 == 0) goto L_0x008f
            r2 = r1
            com.google.android.gms.internal.cast.zc r2 = (com.google.android.gms.internal.cast.C8843zc) r2
            boolean r3 = r2.zza()
            if (r3 != 0) goto L_0x008f
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.cast.zc r1 = r2.mo36467p(r1)
            com.google.android.gms.internal.cast.C8545gf.m40966t(r5, r7, r1)
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
            com.google.android.gms.internal.cast.C8545gf.m40966t(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C8560hd.mo36552b(java.lang.Object, java.lang.Object, long):void");
    }
}

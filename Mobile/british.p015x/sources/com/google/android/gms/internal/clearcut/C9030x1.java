package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.clearcut.x1 */
final class C9030x1 extends C9016v1 {

    /* renamed from: c */
    private static final Class<?> f44792c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C9030x1() {
        super();
    }

    /* renamed from: e */
    private static <E> List<E> m42485e(Object obj, long j) {
        return (List) C8859b4.m41552M(obj, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37190a(Object obj, long j) {
        Object obj2;
        List list = (List) C8859b4.m41552M(obj, j);
        if (list instanceof C9009u1) {
            obj2 = ((C9009u1) list).mo37168t0();
        } else if (!f44792c.isAssignableFrom(list.getClass())) {
            obj2 = Collections.unmodifiableList(list);
        } else {
            return;
        }
        C8859b4.m41569i(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.google.android.gms.internal.clearcut.t1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: com.google.android.gms.internal.clearcut.t1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: com.google.android.gms.internal.clearcut.t1} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E> void mo37191b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.util.List r6 = m42485e(r6, r7)
            int r0 = r6.size()
            java.util.List r1 = m42485e(r5, r7)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0025
            boolean r1 = r1 instanceof com.google.android.gms.internal.clearcut.C9009u1
            if (r1 == 0) goto L_0x001c
            com.google.android.gms.internal.clearcut.t1 r1 = new com.google.android.gms.internal.clearcut.t1
            r1.<init>((int) r0)
            goto L_0x0021
        L_0x001c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0021:
            com.google.android.gms.internal.clearcut.C8859b4.m41569i(r5, r7, r1)
            goto L_0x0057
        L_0x0025:
            java.lang.Class<?> r2 = f44792c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0043
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L_0x003e:
            com.google.android.gms.internal.clearcut.C8859b4.m41569i(r5, r7, r2)
            r1 = r2
            goto L_0x0057
        L_0x0043:
            boolean r2 = r1 instanceof com.google.android.gms.internal.clearcut.C9039y3
            if (r2 == 0) goto L_0x0057
            com.google.android.gms.internal.clearcut.t1 r2 = new com.google.android.gms.internal.clearcut.t1
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            com.google.android.gms.internal.clearcut.y3 r1 = (com.google.android.gms.internal.clearcut.C9039y3) r1
            r2.addAll(r1)
            goto L_0x003e
        L_0x0057:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x0066
            if (r2 <= 0) goto L_0x0066
            r1.addAll(r6)
        L_0x0066:
            if (r0 <= 0) goto L_0x0069
            r6 = r1
        L_0x0069:
            com.google.android.gms.internal.clearcut.C8859b4.m41569i(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C9030x1.mo37191b(java.lang.Object, java.lang.Object, long):void");
    }
}

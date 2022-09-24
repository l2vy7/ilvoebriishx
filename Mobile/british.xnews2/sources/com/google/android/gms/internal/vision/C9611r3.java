package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.vision.r3 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9611r3 extends C9594p3 {

    /* renamed from: c */
    private static final Class<?> f45845c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C9611r3() {
        super();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.vision.n3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.gms.internal.vision.n3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.gms.internal.vision.n3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> m44565e(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = m44566f(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof com.google.android.gms.internal.vision.C9570m3
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.internal.vision.n3 r0 = new com.google.android.gms.internal.vision.n3
            r0.<init>((int) r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof com.google.android.gms.internal.vision.C9612r4
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof com.google.android.gms.internal.vision.C9485c3
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.internal.vision.c3 r0 = (com.google.android.gms.internal.vision.C9485c3) r0
            com.google.android.gms.internal.vision.c3 r6 = r0.mo38300w(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            com.google.android.gms.internal.vision.C9652v5.m44684f(r3, r4, r0)
            goto L_0x007f
        L_0x002d:
            java.lang.Class<?> r1 = f45845c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.vision.C9652v5.m44684f(r3, r4, r1)
        L_0x0049:
            r0 = r1
            goto L_0x007f
        L_0x004b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.vision.C9596p5
            if (r1 == 0) goto L_0x0062
            com.google.android.gms.internal.vision.n3 r1 = new com.google.android.gms.internal.vision.n3
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.android.gms.internal.vision.p5 r0 = (com.google.android.gms.internal.vision.C9596p5) r0
            r1.addAll(r0)
            com.google.android.gms.internal.vision.C9652v5.m44684f(r3, r4, r1)
            goto L_0x0049
        L_0x0062:
            boolean r1 = r0 instanceof com.google.android.gms.internal.vision.C9612r4
            if (r1 == 0) goto L_0x007f
            boolean r1 = r0 instanceof com.google.android.gms.internal.vision.C9485c3
            if (r1 == 0) goto L_0x007f
            r1 = r0
            com.google.android.gms.internal.vision.c3 r1 = (com.google.android.gms.internal.vision.C9485c3) r1
            boolean r2 = r1.mo38298C()
            if (r2 != 0) goto L_0x007f
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.vision.c3 r0 = r1.mo38300w(r0)
            com.google.android.gms.internal.vision.C9652v5.m44684f(r3, r4, r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C9611r3.m44565e(java.lang.Object, long, int):java.util.List");
    }

    /* renamed from: f */
    private static <E> List<E> m44566f(Object obj, long j) {
        return (List) C9652v5.m44670G(obj, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <E> void mo38543a(Object obj, Object obj2, long j) {
        List f = m44566f(obj2, j);
        List e = m44565e(obj, j, f.size());
        int size = e.size();
        int size2 = f.size();
        if (size > 0 && size2 > 0) {
            e.addAll(f);
        }
        if (size > 0) {
            f = e;
        }
        C9652v5.m44684f(obj, j, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo38544b(Object obj, long j) {
        Object obj2;
        List list = (List) C9652v5.m44670G(obj, j);
        if (list instanceof C9570m3) {
            obj2 = ((C9570m3) list).mo38501R();
        } else if (!f45845c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C9612r4) || !(list instanceof C9485c3)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C9485c3 c3Var = (C9485c3) list;
                if (c3Var.mo38298C()) {
                    c3Var.mo38299T();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C9652v5.m44684f(obj, j, obj2);
    }
}

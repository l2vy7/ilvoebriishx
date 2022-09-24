package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bkz */
/* compiled from: IMASDK */
final class bkz extends blb {

    /* renamed from: a */
    private static final Class<?> f16617a = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private bkz() {
    }

    /* synthetic */ bkz(byte[] bArr) {
    }

    /* renamed from: d */
    static <E> List<E> m16371d(Object obj, long j) {
        return (List) bmv.m16740n(obj, j);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.ads.interactivemedia.v3.internal.bkx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.ads.interactivemedia.v3.internal.bkx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.ads.interactivemedia.v3.internal.bkx} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> m16372g(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = m16371d(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof com.google.ads.interactivemedia.p039v3.internal.bky
            if (r1 == 0) goto L_0x0014
            com.google.ads.interactivemedia.v3.internal.bkx r0 = new com.google.ads.interactivemedia.v3.internal.bkx
            r0.<init>((int) r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof com.google.ads.interactivemedia.p039v3.internal.blt
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof com.google.ads.interactivemedia.p039v3.internal.bkq
            if (r1 == 0) goto L_0x0024
            com.google.ads.interactivemedia.v3.internal.bkq r0 = (com.google.ads.interactivemedia.p039v3.internal.bkq) r0
            com.google.ads.interactivemedia.v3.internal.bkq r6 = r0.mo15190e(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r3, r4, r0)
            goto L_0x0081
        L_0x002d:
            java.lang.Class<?> r1 = f16617a
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r3, r4, r1)
        L_0x0049:
            r0 = r1
            goto L_0x0081
        L_0x004b:
            boolean r1 = r0 instanceof com.google.ads.interactivemedia.p039v3.internal.bmq
            if (r1 == 0) goto L_0x0062
            com.google.ads.interactivemedia.v3.internal.bkx r1 = new com.google.ads.interactivemedia.v3.internal.bkx
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.ads.interactivemedia.v3.internal.bmq r0 = (com.google.ads.interactivemedia.p039v3.internal.bmq) r0
            r1.addAll(r0)
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r3, r4, r1)
            goto L_0x0049
        L_0x0062:
            boolean r1 = r0 instanceof com.google.ads.interactivemedia.p039v3.internal.blt
            if (r1 == 0) goto L_0x0081
            boolean r1 = r0 instanceof com.google.ads.interactivemedia.p039v3.internal.bkq
            if (r1 == 0) goto L_0x0081
            r1 = r0
            com.google.ads.interactivemedia.v3.internal.bkq r1 = (com.google.ads.interactivemedia.p039v3.internal.bkq) r1
            boolean r2 = r1.mo15173a()
            if (r2 == 0) goto L_0x0074
            goto L_0x0081
        L_0x0074:
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.ads.interactivemedia.v3.internal.bkq r6 = r1.mo15190e(r0)
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r3, r4, r6)
            return r6
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.bkz.m16372g(java.lang.Object, long, int):java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <L> List<L> mo15419a(Object obj, long j) {
        return m16372g(obj, j, 10);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo15420b(Object obj, long j) {
        Object obj2;
        List list = (List) bmv.m16740n(obj, j);
        if (list instanceof bky) {
            obj2 = ((bky) list).mo15417i();
        } else if (!f16617a.isAssignableFrom(list.getClass())) {
            if (!(list instanceof blt) || !(list instanceof bkq)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                bkq bkq = (bkq) list;
                if (bkq.mo15173a()) {
                    bkq.mo15178b();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        bmv.m16741o(obj, j, obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final <E> void mo15421c(Object obj, Object obj2, long j) {
        List d = m16371d(obj2, j);
        List g = m16372g(obj, j, d.size());
        int size = g.size();
        int size2 = d.size();
        if (size > 0 && size2 > 0) {
            g.addAll(d);
        }
        if (size > 0) {
            d = g;
        }
        bmv.m16741o(obj, j, d);
    }
}

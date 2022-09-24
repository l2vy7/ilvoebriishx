package com.google.ads.interactivemedia.p039v3.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bnh */
/* compiled from: IMASDK */
public final class bnh {

    /* renamed from: a */
    private static final ThreadLocal<Set<bnn<bnl, bnl>>> f16758a = new ThreadLocal<>();

    /* renamed from: b */
    private boolean f16759b = true;

    /* renamed from: c */
    private final List<Class<?>> f16760c;

    /* renamed from: d */
    private String[] f16761d = null;

    public bnh() {
        ArrayList arrayList = new ArrayList();
        this.f16760c = arrayList;
        arrayList.add(String.class);
    }

    /* renamed from: a */
    static Set<bnn<bnl, bnl>> m16830a() {
        return f16758a.get();
    }

    /* renamed from: b */
    static bnn<bnl, bnl> m16831b(Object obj, Object obj2) {
        return bnn.m16847c(new bnl(obj), new bnl(obj2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r2.isInstance(r5) == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (r7.isInstance(r6) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r3 = r2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m16832c(java.lang.Object r5, java.lang.Object r6, java.lang.String... r7) {
        /*
            r0 = 0
            if (r5 != r6) goto L_0x0006
            r0 = 1
            goto L_0x0073
        L_0x0006:
            if (r6 != 0) goto L_0x000a
            goto L_0x0073
        L_0x000a:
            com.google.ads.interactivemedia.v3.internal.bnh r1 = new com.google.ads.interactivemedia.v3.internal.bnh
            r1.<init>()
            r1.f16761d = r7
            boolean r7 = r1.f16759b
            if (r7 != 0) goto L_0x0016
            goto L_0x0071
        L_0x0016:
            if (r5 == r6) goto L_0x0071
            java.lang.Class r7 = r5.getClass()
            java.lang.Class r2 = r6.getClass()
            boolean r3 = r7.isInstance(r6)
            if (r3 == 0) goto L_0x002d
            boolean r3 = r2.isInstance(r5)
            if (r3 != 0) goto L_0x0039
            goto L_0x003b
        L_0x002d:
            boolean r3 = r2.isInstance(r5)
            if (r3 == 0) goto L_0x006f
            boolean r3 = r7.isInstance(r6)
            if (r3 != 0) goto L_0x003b
        L_0x0039:
            r3 = r7
            goto L_0x003c
        L_0x003b:
            r3 = r2
        L_0x003c:
            boolean r4 = r3.isArray()     // Catch:{ IllegalArgumentException -> 0x006f }
            if (r4 == 0) goto L_0x0046
            r1.mo15561f(r5, r6)     // Catch:{ IllegalArgumentException -> 0x006f }
            goto L_0x0071
        L_0x0046:
            java.util.List<java.lang.Class<?>> r4 = r1.f16760c     // Catch:{ IllegalArgumentException -> 0x006f }
            boolean r7 = r4.contains(r7)     // Catch:{ IllegalArgumentException -> 0x006f }
            if (r7 != 0) goto L_0x0068
            java.util.List<java.lang.Class<?>> r7 = r1.f16760c     // Catch:{ IllegalArgumentException -> 0x006f }
            boolean r7 = r7.contains(r2)     // Catch:{ IllegalArgumentException -> 0x006f }
            if (r7 == 0) goto L_0x0057
            goto L_0x0068
        L_0x0057:
            r1.m16834i(r5, r6, r3)     // Catch:{ IllegalArgumentException -> 0x006f }
        L_0x005a:
            java.lang.Class r7 = r3.getSuperclass()     // Catch:{ IllegalArgumentException -> 0x006f }
            if (r7 == 0) goto L_0x0071
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ IllegalArgumentException -> 0x006f }
            r1.m16834i(r5, r6, r3)     // Catch:{ IllegalArgumentException -> 0x006f }
            goto L_0x005a
        L_0x0068:
            boolean r5 = r5.equals(r6)     // Catch:{ IllegalArgumentException -> 0x006f }
            r1.f16759b = r5     // Catch:{ IllegalArgumentException -> 0x006f }
            goto L_0x0071
        L_0x006f:
            r1.f16759b = r0
        L_0x0071:
            boolean r0 = r1.f16759b
        L_0x0073:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.bnh.m16832c(java.lang.Object, java.lang.Object, java.lang.String[]):boolean");
    }

    /* renamed from: h */
    private static void m16833h(Object obj, Object obj2) {
        Set<bnn<bnl, bnl>> a = m16830a();
        if (a != null) {
            a.remove(m16831b(obj, obj2));
            if (a.isEmpty()) {
                f16758a.remove();
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x008c */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m16834i(java.lang.Object r5, java.lang.Object r6, java.lang.Class<?> r7) {
        /*
            r4 = this;
            java.util.Set r0 = m16830a()
            com.google.ads.interactivemedia.v3.internal.bnn r1 = m16831b(r5, r6)
            r2 = r1
            com.google.ads.interactivemedia.v3.internal.bnm r2 = (com.google.ads.interactivemedia.p039v3.internal.bnm) r2
            R r3 = r2.f16767b
            L r2 = r2.f16766a
            com.google.ads.interactivemedia.v3.internal.bnn r2 = com.google.ads.interactivemedia.p039v3.internal.bnn.m16847c(r3, r2)
            if (r0 == 0) goto L_0x0023
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0022
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            return
        L_0x0023:
            java.util.Set r0 = m16830a()     // Catch:{ all -> 0x009b }
            if (r0 != 0) goto L_0x0033
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x009b }
            r0.<init>()     // Catch:{ all -> 0x009b }
            java.lang.ThreadLocal<java.util.Set<com.google.ads.interactivemedia.v3.internal.bnn<com.google.ads.interactivemedia.v3.internal.bnl, com.google.ads.interactivemedia.v3.internal.bnl>>> r1 = f16758a     // Catch:{ all -> 0x009b }
            r1.set(r0)     // Catch:{ all -> 0x009b }
        L_0x0033:
            com.google.ads.interactivemedia.v3.internal.bnn r1 = m16831b(r5, r6)     // Catch:{ all -> 0x009b }
            r0.add(r1)     // Catch:{ all -> 0x009b }
            java.lang.reflect.Field[] r7 = r7.getDeclaredFields()     // Catch:{ all -> 0x009b }
            r0 = 1
            java.lang.reflect.AccessibleObject.setAccessible(r7, r0)     // Catch:{ all -> 0x009b }
            r0 = 0
        L_0x0043:
            int r1 = r7.length     // Catch:{ all -> 0x009b }
            if (r0 >= r1) goto L_0x0097
            boolean r1 = r4.f16759b     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x0097
            r1 = r7[r0]     // Catch:{ all -> 0x009b }
            java.lang.String[] r2 = r4.f16761d     // Catch:{ all -> 0x009b }
            java.lang.String r3 = r1.getName()     // Catch:{ all -> 0x009b }
            boolean r2 = com.google.ads.interactivemedia.p039v3.internal.awa.m14992d(r2, r3)     // Catch:{ all -> 0x009b }
            if (r2 != 0) goto L_0x0094
            java.lang.String r2 = r1.getName()     // Catch:{ all -> 0x009b }
            java.lang.String r3 = "$"
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x009b }
            if (r2 != 0) goto L_0x0094
            int r2 = r1.getModifiers()     // Catch:{ all -> 0x009b }
            boolean r2 = java.lang.reflect.Modifier.isTransient(r2)     // Catch:{ all -> 0x009b }
            if (r2 != 0) goto L_0x0094
            int r2 = r1.getModifiers()     // Catch:{ all -> 0x009b }
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)     // Catch:{ all -> 0x009b }
            if (r2 != 0) goto L_0x0094
            java.lang.Class<com.google.ads.interactivemedia.v3.internal.bni> r2 = com.google.ads.interactivemedia.p039v3.internal.bni.class
            boolean r2 = r1.isAnnotationPresent(r2)     // Catch:{ all -> 0x009b }
            if (r2 != 0) goto L_0x0094
            java.lang.Object r2 = r1.get(r5)     // Catch:{ IllegalAccessException -> 0x008c }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ IllegalAccessException -> 0x008c }
            r4.mo15561f(r2, r1)     // Catch:{ IllegalAccessException -> 0x008c }
            goto L_0x0094
        L_0x008c:
            java.lang.InternalError r7 = new java.lang.InternalError     // Catch:{ all -> 0x009b }
            java.lang.String r0 = "Unexpected IllegalAccessException"
            r7.<init>(r0)     // Catch:{ all -> 0x009b }
            throw r7     // Catch:{ all -> 0x009b }
        L_0x0094:
            int r0 = r0 + 1
            goto L_0x0043
        L_0x0097:
            m16833h(r5, r6)
            return
        L_0x009b:
            r7 = move-exception
            m16833h(r5, r6)
            goto L_0x00a1
        L_0x00a0:
            throw r7
        L_0x00a1:
            goto L_0x00a0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.bnh.m16834i(java.lang.Object, java.lang.Object, java.lang.Class):void");
    }

    /* renamed from: d */
    public final void mo15559d(int i, int i2) {
        if (this.f16759b) {
            this.f16759b = i == i2;
        }
    }

    /* renamed from: e */
    public final void mo15560e(long j, long j2) {
        if (this.f16759b) {
            this.f16759b = j == j2;
        }
    }

    /* renamed from: f */
    public final void mo15561f(Object obj, Object obj2) {
        if (!this.f16759b || obj == obj2) {
            return;
        }
        if (obj == null || obj2 == null) {
            mo15562g();
        } else if (!obj.getClass().isArray()) {
            this.f16759b = obj.equals(obj2);
        } else if (obj.getClass() != obj2.getClass()) {
            mo15562g();
        } else {
            int i = 0;
            if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                if (!this.f16759b || jArr == jArr2) {
                    return;
                }
                if (jArr.length == jArr2.length) {
                    while (i < jArr.length && this.f16759b) {
                        mo15560e(jArr[i], jArr2[i]);
                        i++;
                    }
                    return;
                }
                mo15562g();
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                if (this.f16759b && iArr != iArr2) {
                    if (iArr.length == iArr2.length) {
                        while (i < iArr.length && this.f16759b) {
                            mo15559d(iArr[i], iArr2[i]);
                            i++;
                        }
                        return;
                    }
                    mo15562g();
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                short[] sArr2 = (short[]) obj2;
                if (this.f16759b && sArr != sArr2) {
                    if (sArr.length == sArr2.length) {
                        for (int i2 = 0; i2 < sArr.length && this.f16759b; i2++) {
                            this.f16759b = sArr[i2] == sArr2[i2];
                        }
                        return;
                    }
                    mo15562g();
                }
            } else if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                char[] cArr2 = (char[]) obj2;
                if (this.f16759b && cArr != cArr2) {
                    if (cArr.length == cArr2.length) {
                        for (int i3 = 0; i3 < cArr.length && this.f16759b; i3++) {
                            this.f16759b = cArr[i3] == cArr2[i3];
                        }
                        return;
                    }
                    mo15562g();
                }
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (this.f16759b && bArr != bArr2) {
                    if (bArr.length == bArr2.length) {
                        for (int i4 = 0; i4 < bArr.length && this.f16759b; i4++) {
                            this.f16759b = bArr[i4] == bArr2[i4];
                        }
                        return;
                    }
                    mo15562g();
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                if (this.f16759b && dArr != dArr2) {
                    if (dArr.length == dArr2.length) {
                        while (i < dArr.length && this.f16759b) {
                            mo15560e(Double.doubleToLongBits(dArr[i]), Double.doubleToLongBits(dArr2[i]));
                            i++;
                        }
                        return;
                    }
                    mo15562g();
                }
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                float[] fArr2 = (float[]) obj2;
                if (this.f16759b && fArr != fArr2) {
                    if (fArr.length == fArr2.length) {
                        while (i < fArr.length && this.f16759b) {
                            mo15559d(Float.floatToIntBits(fArr[i]), Float.floatToIntBits(fArr2[i]));
                            i++;
                        }
                        return;
                    }
                    mo15562g();
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                if (this.f16759b && zArr != zArr2) {
                    if (zArr.length == zArr2.length) {
                        for (int i5 = 0; i5 < zArr.length && this.f16759b; i5++) {
                            this.f16759b = zArr[i5] == zArr2[i5];
                        }
                        return;
                    }
                    mo15562g();
                }
            } else {
                Object[] objArr = (Object[]) obj;
                Object[] objArr2 = (Object[]) obj2;
                if (this.f16759b && objArr != objArr2) {
                    if (objArr.length == objArr2.length) {
                        while (i < objArr.length && this.f16759b) {
                            mo15561f(objArr[i], objArr2[i]);
                            i++;
                        }
                        return;
                    }
                    mo15562g();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo15562g() {
        this.f16759b = false;
    }
}

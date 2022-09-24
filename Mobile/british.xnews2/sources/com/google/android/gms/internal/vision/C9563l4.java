package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.l4 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9563l4<T> implements C9664w4<T> {

    /* renamed from: a */
    private final C9522g4 f45735a;

    /* renamed from: b */
    private final C9588o5<?, ?> f45736b;

    /* renamed from: c */
    private final boolean f45737c;

    /* renamed from: d */
    private final C9528h2<?> f45738d;

    private C9563l4(C9588o5<?, ?> o5Var, C9528h2<?> h2Var, C9522g4 g4Var) {
        this.f45736b = o5Var;
        this.f45737c = h2Var.mo38416d(g4Var);
        this.f45738d = h2Var;
        this.f45735a = g4Var;
    }

    /* renamed from: j */
    static <T> C9563l4<T> m44448j(C9588o5<?, ?> o5Var, C9528h2<?> h2Var, C9522g4 g4Var) {
        return new C9563l4<>(o5Var, h2Var, g4Var);
    }

    /* renamed from: a */
    public final boolean mo38442a(T t, T t2) {
        if (!this.f45736b.mo38539l(t).equals(this.f45736b.mo38539l(t2))) {
            return false;
        }
        if (this.f45737c) {
            return this.f45738d.mo38417e(t).equals(this.f45738d.mo38417e(t2));
        }
        return true;
    }

    /* renamed from: b */
    public final void mo38443b(T t) {
        this.f45736b.mo38536i(t);
        this.f45738d.mo38419g(t);
    }

    /* renamed from: c */
    public final T mo38444c() {
        return this.f45735a.mo38401a().mo38390t();
    }

    /* renamed from: d */
    public final boolean mo38445d(T t) {
        return this.f45738d.mo38417e(t).mo38471c();
    }

    /* renamed from: e */
    public final void mo38446e(T t, T t2) {
        C9683y4.m44880h(this.f45736b, t, t2);
        if (this.f45737c) {
            C9683y4.m44878f(this.f45738d, t, t2);
        }
    }

    /* renamed from: f */
    public final int mo38447f(T t) {
        int hashCode = this.f45736b.mo38539l(t).hashCode();
        return this.f45737c ? (hashCode * 53) + this.f45738d.mo38417e(t).hashCode() : hashCode;
    }

    /* renamed from: g */
    public final int mo38448g(T t) {
        C9588o5<?, ?> o5Var = this.f45736b;
        int d = o5Var.mo38531d(o5Var.mo38539l(t)) + 0;
        return this.f45737c ? d + this.f45738d.mo38417e(t).mo38481r() : d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.google.android.gms.internal.vision.v2$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38449h(T r11, byte[] r12, int r13, int r14, com.google.android.gms.internal.vision.C9527h1 r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.google.android.gms.internal.vision.v2 r0 = (com.google.android.gms.internal.vision.C9643v2) r0
            com.google.android.gms.internal.vision.n5 r1 = r0.zzxz
            com.google.android.gms.internal.vision.n5 r2 = com.google.android.gms.internal.vision.C9580n5.m44487i()
            if (r1 != r2) goto L_0x0011
            com.google.android.gms.internal.vision.n5 r1 = com.google.android.gms.internal.vision.C9580n5.m44488j()
            r0.zzxz = r1
        L_0x0011:
            com.google.android.gms.internal.vision.v2$d r11 = (com.google.android.gms.internal.vision.C9643v2.C9647d) r11
            com.google.android.gms.internal.vision.k2 r11 = r11.mo38619s()
            r0 = 0
            r2 = r0
        L_0x0019:
            if (r13 >= r14) goto L_0x00c9
            int r4 = com.google.android.gms.internal.vision.C9510f1.m44243i(r12, r13, r15)
            int r13 = r15.f45653a
            r3 = 11
            r5 = 2
            if (r13 == r3) goto L_0x0065
            r3 = r13 & 7
            if (r3 != r5) goto L_0x0060
            com.google.android.gms.internal.vision.h2<?> r2 = r10.f45738d
            com.google.android.gms.internal.vision.f2 r3 = r15.f45656d
            com.google.android.gms.internal.vision.g4 r5 = r10.f45735a
            int r6 = r13 >>> 3
            java.lang.Object r2 = r2.mo38414b(r3, r5, r6)
            r8 = r2
            com.google.android.gms.internal.vision.v2$f r8 = (com.google.android.gms.internal.vision.C9643v2.C9649f) r8
            if (r8 == 0) goto L_0x0055
            com.google.android.gms.internal.vision.t4 r13 = com.google.android.gms.internal.vision.C9628t4.m44591b()
            com.google.android.gms.internal.vision.g4 r2 = r8.f45921a
            java.lang.Class r2 = r2.getClass()
            com.google.android.gms.internal.vision.w4 r13 = r13.mo38580a(r2)
            int r13 = com.google.android.gms.internal.vision.C9510f1.m44241g(r13, r12, r4, r14, r15)
            com.google.android.gms.internal.vision.v2$c r2 = r8.f45922b
            java.lang.Object r3 = r15.f45655c
            r11.mo38477h(r2, r3)
            goto L_0x005e
        L_0x0055:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.android.gms.internal.vision.C9510f1.m44237c(r2, r3, r4, r5, r6, r7)
        L_0x005e:
            r2 = r8
            goto L_0x0019
        L_0x0060:
            int r13 = com.google.android.gms.internal.vision.C9510f1.m44235a(r13, r12, r4, r14, r15)
            goto L_0x0019
        L_0x0065:
            r13 = 0
            r3 = r0
        L_0x0067:
            if (r4 >= r14) goto L_0x00be
            int r4 = com.google.android.gms.internal.vision.C9510f1.m44243i(r12, r4, r15)
            int r6 = r15.f45653a
            int r7 = r6 >>> 3
            r8 = r6 & 7
            if (r7 == r5) goto L_0x00a0
            r9 = 3
            if (r7 == r9) goto L_0x0079
            goto L_0x00b5
        L_0x0079:
            if (r2 == 0) goto L_0x0095
            com.google.android.gms.internal.vision.t4 r6 = com.google.android.gms.internal.vision.C9628t4.m44591b()
            com.google.android.gms.internal.vision.g4 r7 = r2.f45921a
            java.lang.Class r7 = r7.getClass()
            com.google.android.gms.internal.vision.w4 r6 = r6.mo38580a(r7)
            int r4 = com.google.android.gms.internal.vision.C9510f1.m44241g(r6, r12, r4, r14, r15)
            com.google.android.gms.internal.vision.v2$c r6 = r2.f45922b
            java.lang.Object r7 = r15.f45655c
            r11.mo38477h(r6, r7)
            goto L_0x0067
        L_0x0095:
            if (r8 != r5) goto L_0x00b5
            int r4 = com.google.android.gms.internal.vision.C9510f1.m44251q(r12, r4, r15)
            java.lang.Object r3 = r15.f45655c
            com.google.android.gms.internal.vision.k1 r3 = (com.google.android.gms.internal.vision.C9552k1) r3
            goto L_0x0067
        L_0x00a0:
            if (r8 != 0) goto L_0x00b5
            int r4 = com.google.android.gms.internal.vision.C9510f1.m44243i(r12, r4, r15)
            int r13 = r15.f45653a
            com.google.android.gms.internal.vision.h2<?> r2 = r10.f45738d
            com.google.android.gms.internal.vision.f2 r6 = r15.f45656d
            com.google.android.gms.internal.vision.g4 r7 = r10.f45735a
            java.lang.Object r2 = r2.mo38414b(r6, r7, r13)
            com.google.android.gms.internal.vision.v2$f r2 = (com.google.android.gms.internal.vision.C9643v2.C9649f) r2
            goto L_0x0067
        L_0x00b5:
            r7 = 12
            if (r6 == r7) goto L_0x00be
            int r4 = com.google.android.gms.internal.vision.C9510f1.m44235a(r6, r12, r4, r14, r15)
            goto L_0x0067
        L_0x00be:
            if (r3 == 0) goto L_0x00c6
            int r13 = r13 << 3
            r13 = r13 | r5
            r1.mo38515d(r13, r3)
        L_0x00c6:
            r13 = r4
            goto L_0x0019
        L_0x00c9:
            if (r13 != r14) goto L_0x00cc
            return
        L_0x00cc:
            com.google.android.gms.internal.vision.f3 r11 = com.google.android.gms.internal.vision.C9513f3.m44259e()
            goto L_0x00d2
        L_0x00d1:
            throw r11
        L_0x00d2:
            goto L_0x00d1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C9563l4.mo38449h(java.lang.Object, byte[], int, int, com.google.android.gms.internal.vision.h1):void");
    }

    /* renamed from: i */
    public final void mo38450i(T t, C9540i6 i6Var) throws IOException {
        Iterator<Map.Entry<?, Object>> d = this.f45738d.mo38417e(t).mo38473d();
        while (d.hasNext()) {
            Map.Entry next = d.next();
            C9569m2 m2Var = (C9569m2) next.getKey();
            if (m2Var.mo38500m0() != C9548j6.MESSAGE || m2Var.mo38494Q() || m2Var.mo38495X()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof C9537i3) {
                i6Var.mo38360j(m2Var.mo38496e(), ((C9537i3) next).mo38421a().mo38482a());
            } else {
                i6Var.mo38360j(m2Var.mo38496e(), next.getValue());
            }
        }
        C9588o5<?, ?> o5Var = this.f45736b;
        o5Var.mo38532e(o5Var.mo38539l(t), i6Var);
    }
}

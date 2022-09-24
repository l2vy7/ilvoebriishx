package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class fx3 extends t23 {

    /* renamed from: e */
    private final int f32025e;

    /* renamed from: f */
    private final int f32026f;

    /* renamed from: g */
    private final int[] f32027g;

    /* renamed from: h */
    private final int[] f32028h;

    /* renamed from: i */
    private final gi0[] f32029i;

    /* renamed from: j */
    private final Object[] f32030j;

    /* renamed from: k */
    private final HashMap<Object, Integer> f32031k = new HashMap<>();

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.Collection<? extends com.google.android.gms.internal.ads.tw3>, com.google.android.gms.internal.ads.u64] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fx3(java.util.Collection r5, java.util.Collection<? extends com.google.android.gms.internal.ads.tw3> r6, com.google.android.gms.internal.ads.u64 r7) {
        /*
            r4 = this;
            r7 = 0
            r0 = 0
            r4.<init>(r7, r6, r0)
            int r6 = r5.size()
            int[] r0 = new int[r6]
            r4.f32027g = r0
            int[] r0 = new int[r6]
            r4.f32028h = r0
            com.google.android.gms.internal.ads.gi0[] r0 = new com.google.android.gms.internal.ads.gi0[r6]
            r4.f32029i = r0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r4.f32030j = r6
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r4.f32031k = r6
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
            r0 = 0
        L_0x0026:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x006d
            java.lang.Object r1 = r5.next()
            com.google.android.gms.internal.ads.tw3 r1 = (com.google.android.gms.internal.ads.tw3) r1
            com.google.android.gms.internal.ads.gi0[] r2 = r4.f32029i
            com.google.android.gms.internal.ads.gi0 r3 = r1.zza()
            r2[r0] = r3
            int[] r2 = r4.f32028h
            r2[r0] = r7
            int[] r2 = r4.f32027g
            r2[r0] = r6
            com.google.android.gms.internal.ads.gi0[] r2 = r4.f32029i
            r2 = r2[r0]
            int r2 = r2.mo31951c()
            int r7 = r7 + r2
            com.google.android.gms.internal.ads.gi0[] r2 = r4.f32029i
            r2 = r2[r0]
            int r2 = r2.mo31950b()
            int r6 = r6 + r2
            java.lang.Object[] r2 = r4.f32030j
            java.lang.Object r1 = r1.zzb()
            r2[r0] = r1
            int r1 = r0 + 1
            java.util.HashMap<java.lang.Object, java.lang.Integer> r2 = r4.f32031k
            java.lang.Object[] r3 = r4.f32030j
            r3 = r3[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r3, r0)
            r0 = r1
            goto L_0x0026
        L_0x006d:
            r4.f32025e = r7
            r4.f32026f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fx3.<init>(java.util.Collection, com.google.android.gms.internal.ads.u64, byte[]):void");
    }

    /* renamed from: b */
    public final int mo31950b() {
        return this.f32026f;
    }

    /* renamed from: c */
    public final int mo31951c() {
        return this.f32025e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo31952p(Object obj) {
        Integer num = this.f32031k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final int mo31953q(int i) {
        return d13.m20278I(this.f32027g, i + 1, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final int mo31954r(int i) {
        return d13.m20278I(this.f32028h, i + 1, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final int mo31955s(int i) {
        return this.f32027g[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final int mo31956t(int i) {
        return this.f32028h[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final gi0 mo31957u(int i) {
        return this.f32029i[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo31958v(int i) {
        return this.f32030j[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final List<gi0> mo31959y() {
        return Arrays.asList(this.f32029i);
    }
}

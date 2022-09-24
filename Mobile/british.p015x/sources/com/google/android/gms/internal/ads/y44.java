package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class y44 extends n44<Void> {

    /* renamed from: j */
    private final f54 f20998j;

    /* renamed from: k */
    private final boolean f20999k;

    /* renamed from: l */
    private final gh0 f21000l;

    /* renamed from: m */
    private final gf0 f21001m;

    /* renamed from: n */
    private w44 f21002n;

    /* renamed from: o */
    private v44 f21003o;

    /* renamed from: p */
    private boolean f21004p;

    /* renamed from: q */
    private boolean f21005q;

    /* renamed from: r */
    private boolean f21006r;

    public y44(f54 f54, boolean z) {
        boolean z2;
        this.f20998j = f54;
        if (z) {
            f54.zzt();
            z2 = true;
        } else {
            z2 = false;
        }
        this.f20999k = z2;
        this.f21000l = new gh0();
        this.f21001m = new gf0();
        f54.mo31755b();
        this.f21002n = w44.m39033q(f54.mo18986d());
    }

    /* renamed from: B */
    private final Object m21177B(Object obj) {
        return (this.f21002n.f40700e == null || !obj.equals(w44.f40698f)) ? obj : this.f21002n.f40700e;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    /* renamed from: C */
    private final void m21178C(long j) {
        v44 v44 = this.f21003o;
        int a = this.f21002n.mo32133a(v44.f40300b.f34474a);
        if (a != -1) {
            w44 w44 = this.f21002n;
            gf0 gf0 = this.f21001m;
            w44.mo31484d(a, gf0, false);
            long j2 = gf0.f32287d;
            if (j2 != C6540C.TIME_UNSET && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            v44.mo35371m(j);
        }
    }

    /* renamed from: A */
    public final v44 mo18988k(c54 c54, o84 o84, long j) {
        v44 v44 = new v44(c54, o84, j, (byte[]) null);
        v44.mo35373o(this.f20998j);
        if (this.f21005q) {
            v44.mo35370l(c54.mo30857c(m21177B(c54.f34474a)));
        } else {
            this.f21003o = v44;
            if (!this.f21004p) {
                this.f21004p = true;
                mo33631z(null, this.f20998j);
            }
        }
        return v44;
    }

    /* renamed from: D */
    public final gi0 mo18985D() {
        return this.f21002n;
    }

    /* renamed from: d */
    public final C7764ho mo18986d() {
        return this.f20998j.mo18986d();
    }

    /* renamed from: g */
    public final void mo18987g(b54 b54) {
        ((v44) b54).mo35372n();
        if (b54 == this.f21003o) {
            this.f21003o = null;
        }
    }

    /* renamed from: t */
    public final void mo18989t(mt1 mt1) {
        super.mo18989t(mt1);
        if (!this.f20999k) {
            this.f21004p = true;
            mo33631z(null, this.f20998j);
        }
    }

    /* renamed from: v */
    public final void mo18990v() {
        this.f21005q = false;
        this.f21004p = false;
        super.mo18990v();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* bridge */ /* synthetic */ c54 mo18991x(Object obj, c54 c54) {
        Void voidR = (Void) obj;
        Object obj2 = c54.f34474a;
        if (this.f21002n.f40700e != null && this.f21002n.f40700e.equals(obj2)) {
            obj2 = w44.f40698f;
        }
        return c54.mo30857c(obj2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo18992y(java.lang.Object r12, com.google.android.gms.internal.ads.f54 r13, com.google.android.gms.internal.ads.gi0 r14) {
        /*
            r11 = this;
            java.lang.Void r12 = (java.lang.Void) r12
            boolean r12 = r11.f21005q
            r13 = 0
            if (r12 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.w44 r12 = r11.f21002n
            com.google.android.gms.internal.ads.w44 r12 = r12.mo35557p(r14)
            r11.f21002n = r12
            com.google.android.gms.internal.ads.v44 r12 = r11.f21003o
            if (r12 == 0) goto L_0x009f
            long r0 = r12.mo35368h()
            r11.m21178C(r0)
            goto L_0x009f
        L_0x001c:
            boolean r12 = r14.mo32145o()
            if (r12 == 0) goto L_0x0038
            boolean r12 = r11.f21006r
            if (r12 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.w44 r12 = r11.f21002n
            com.google.android.gms.internal.ads.w44 r12 = r12.mo35557p(r14)
            goto L_0x0035
        L_0x002d:
            java.lang.Object r12 = com.google.android.gms.internal.ads.gh0.f32305o
            java.lang.Object r0 = com.google.android.gms.internal.ads.w44.f40698f
            com.google.android.gms.internal.ads.w44 r12 = com.google.android.gms.internal.ads.w44.m39034r(r14, r12, r0)
        L_0x0035:
            r11.f21002n = r12
            goto L_0x009f
        L_0x0038:
            com.google.android.gms.internal.ads.gh0 r12 = r11.f21000l
            r0 = 0
            r1 = 0
            r14.mo31485e(r0, r12, r1)
            com.google.android.gms.internal.ads.gh0 r12 = r11.f21000l
            java.lang.Object r12 = r12.f32309a
            com.google.android.gms.internal.ads.v44 r3 = r11.f21003o
            if (r3 == 0) goto L_0x0066
            long r3 = r3.mo35369j()
            com.google.android.gms.internal.ads.w44 r5 = r11.f21002n
            com.google.android.gms.internal.ads.v44 r6 = r11.f21003o
            com.google.android.gms.internal.ads.c54 r6 = r6.f40300b
            java.lang.Object r6 = r6.f34474a
            com.google.android.gms.internal.ads.gf0 r7 = r11.f21001m
            r5.mo32144n(r6, r7)
            com.google.android.gms.internal.ads.w44 r5 = r11.f21002n
            com.google.android.gms.internal.ads.gh0 r6 = r11.f21000l
            r5.mo31485e(r0, r6, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0066
            r9 = r3
            goto L_0x0067
        L_0x0066:
            r9 = r1
        L_0x0067:
            com.google.android.gms.internal.ads.gh0 r6 = r11.f21000l
            com.google.android.gms.internal.ads.gf0 r7 = r11.f21001m
            r8 = 0
            r5 = r14
            android.util.Pair r0 = r5.mo32142l(r6, r7, r8, r9)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r11.f21006r
            if (r0 == 0) goto L_0x0086
            com.google.android.gms.internal.ads.w44 r12 = r11.f21002n
            com.google.android.gms.internal.ads.w44 r12 = r12.mo35557p(r14)
            goto L_0x008a
        L_0x0086:
            com.google.android.gms.internal.ads.w44 r12 = com.google.android.gms.internal.ads.w44.m39034r(r14, r12, r1)
        L_0x008a:
            r11.f21002n = r12
            com.google.android.gms.internal.ads.v44 r12 = r11.f21003o
            if (r12 == 0) goto L_0x009f
            r11.m21178C(r2)
            com.google.android.gms.internal.ads.c54 r12 = r12.f40300b
            java.lang.Object r13 = r12.f34474a
            java.lang.Object r13 = r11.m21177B(r13)
            com.google.android.gms.internal.ads.c54 r13 = r12.mo30857c(r13)
        L_0x009f:
            r12 = 1
            r11.f21006r = r12
            r11.f21005q = r12
            com.google.android.gms.internal.ads.w44 r12 = r11.f21002n
            r11.mo31769u(r12)
            if (r13 == 0) goto L_0x00b3
            com.google.android.gms.internal.ads.v44 r12 = r11.f21003o
            java.util.Objects.requireNonNull(r12)
            r12.mo35370l(r13)
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.y44.mo18992y(java.lang.Object, com.google.android.gms.internal.ads.f54, com.google.android.gms.internal.ads.gi0):void");
    }

    public final void zzv() {
    }
}

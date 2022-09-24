package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C9188i3;

/* renamed from: com.google.android.gms.measurement.internal.o9 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9869o9 extends C9858n9 {

    /* renamed from: g */
    private final C9188i3 f46561g;

    /* renamed from: h */
    final /* synthetic */ C9880p9 f46562h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9869o9(C9880p9 p9Var, String str, int i, C9188i3 i3Var) {
        super(str, i);
        this.f46562h = p9Var;
        this.f46561g = i3Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo39069a() {
        return this.f46561g.mo37631z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo39070b() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo39071c() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v18, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo39093k(java.lang.Long r11, java.lang.Long r12, com.google.android.gms.internal.measurement.C9449z4 r13, boolean r14) {
        /*
            r10 = this;
            com.google.android.gms.internal.measurement.C9427xc.m43850b()
            com.google.android.gms.measurement.internal.p9 r0 = r10.f46562h
            com.google.android.gms.measurement.internal.h4 r0 = r0.f21269a
            com.google.android.gms.measurement.internal.f r0 = r0.mo19392z()
            java.lang.String r1 = r10.f46519a
            com.google.android.gms.measurement.internal.r2 r2 = com.google.android.gms.measurement.internal.C9903s2.f46672W
            boolean r0 = r0.mo19337B(r1, r2)
            com.google.android.gms.internal.measurement.i3 r1 = r10.f46561g
            boolean r1 = r1.mo37626G()
            com.google.android.gms.internal.measurement.i3 r2 = r10.f46561g
            boolean r2 = r2.mo37627H()
            com.google.android.gms.internal.measurement.i3 r3 = r10.f46561g
            boolean r3 = r3.mo37628I()
            r4 = 0
            r5 = 1
            if (r1 != 0) goto L_0x0030
            if (r2 != 0) goto L_0x0030
            if (r3 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r1 = 0
            goto L_0x0031
        L_0x0030:
            r1 = 1
        L_0x0031:
            r2 = 0
            if (r14 == 0) goto L_0x0060
            if (r1 != 0) goto L_0x0060
            com.google.android.gms.measurement.internal.p9 r11 = r10.f46562h
            com.google.android.gms.measurement.internal.h4 r11 = r11.f21269a
            com.google.android.gms.measurement.internal.d3 r11 = r11.mo19276j()
            com.google.android.gms.measurement.internal.b3 r11 = r11.mo19286v()
            int r12 = r10.f46520b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            com.google.android.gms.internal.measurement.i3 r13 = r10.f46561g
            boolean r13 = r13.mo37629J()
            if (r13 == 0) goto L_0x005a
            com.google.android.gms.internal.measurement.i3 r13 = r10.f46561g
            int r13 = r13.mo37631z()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
        L_0x005a:
            java.lang.String r13 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.mo38858c(r13, r12, r2)
            return r5
        L_0x0060:
            com.google.android.gms.internal.measurement.i3 r6 = r10.f46561g
            com.google.android.gms.internal.measurement.b3 r6 = r6.mo37624A()
            boolean r7 = r6.mo37388G()
            boolean r8 = r13.mo38215Q()
            if (r8 == 0) goto L_0x00ab
            boolean r8 = r6.mo37390I()
            if (r8 != 0) goto L_0x0099
            com.google.android.gms.measurement.internal.p9 r6 = r10.f46562h
            com.google.android.gms.measurement.internal.h4 r6 = r6.f21269a
            com.google.android.gms.measurement.internal.d3 r6 = r6.mo19276j()
            com.google.android.gms.measurement.internal.b3 r6 = r6.mo19287w()
            com.google.android.gms.measurement.internal.p9 r7 = r10.f46562h
            com.google.android.gms.measurement.internal.h4 r7 = r7.f21269a
            com.google.android.gms.measurement.internal.y2 r7 = r7.mo19363D()
            java.lang.String r8 = r13.mo38212F()
            java.lang.String r7 = r7.mo39322f(r8)
            java.lang.String r8 = "No number filter for long property. property"
            r6.mo38857b(r8, r7)
            goto L_0x019c
        L_0x0099:
            long r8 = r13.mo38210A()
            com.google.android.gms.internal.measurement.g3 r2 = r6.mo37385B()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C9858n9.m45242h(r8, r2)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C9858n9.m45244j(r2, r7)
            goto L_0x019c
        L_0x00ab:
            boolean r8 = r13.mo38214P()
            if (r8 == 0) goto L_0x00ec
            boolean r8 = r6.mo37390I()
            if (r8 != 0) goto L_0x00da
            com.google.android.gms.measurement.internal.p9 r6 = r10.f46562h
            com.google.android.gms.measurement.internal.h4 r6 = r6.f21269a
            com.google.android.gms.measurement.internal.d3 r6 = r6.mo19276j()
            com.google.android.gms.measurement.internal.b3 r6 = r6.mo19287w()
            com.google.android.gms.measurement.internal.p9 r7 = r10.f46562h
            com.google.android.gms.measurement.internal.h4 r7 = r7.f21269a
            com.google.android.gms.measurement.internal.y2 r7 = r7.mo19363D()
            java.lang.String r8 = r13.mo38212F()
            java.lang.String r7 = r7.mo39322f(r8)
            java.lang.String r8 = "No number filter for double property. property"
            r6.mo38857b(r8, r7)
            goto L_0x019c
        L_0x00da:
            double r8 = r13.mo38218z()
            com.google.android.gms.internal.measurement.g3 r2 = r6.mo37385B()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C9858n9.m45241g(r8, r2)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C9858n9.m45244j(r2, r7)
            goto L_0x019c
        L_0x00ec:
            boolean r8 = r13.mo38217S()
            if (r8 == 0) goto L_0x017b
            boolean r8 = r6.mo37392K()
            if (r8 != 0) goto L_0x0162
            boolean r8 = r6.mo37390I()
            if (r8 != 0) goto L_0x0121
            com.google.android.gms.measurement.internal.p9 r6 = r10.f46562h
            com.google.android.gms.measurement.internal.h4 r6 = r6.f21269a
            com.google.android.gms.measurement.internal.d3 r6 = r6.mo19276j()
            com.google.android.gms.measurement.internal.b3 r6 = r6.mo19287w()
            com.google.android.gms.measurement.internal.p9 r7 = r10.f46562h
            com.google.android.gms.measurement.internal.h4 r7 = r7.f21269a
            com.google.android.gms.measurement.internal.y2 r7 = r7.mo19363D()
            java.lang.String r8 = r13.mo38212F()
            java.lang.String r7 = r7.mo39322f(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            r6.mo38857b(r8, r7)
            goto L_0x019c
        L_0x0121:
            java.lang.String r8 = r13.mo38213G()
            boolean r8 = com.google.android.gms.measurement.internal.C9978z8.m45538N(r8)
            if (r8 == 0) goto L_0x013c
            java.lang.String r2 = r13.mo38213G()
            com.google.android.gms.internal.measurement.g3 r6 = r6.mo37385B()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C9858n9.m45243i(r2, r6)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C9858n9.m45244j(r2, r7)
            goto L_0x019c
        L_0x013c:
            com.google.android.gms.measurement.internal.p9 r6 = r10.f46562h
            com.google.android.gms.measurement.internal.h4 r6 = r6.f21269a
            com.google.android.gms.measurement.internal.d3 r6 = r6.mo19276j()
            com.google.android.gms.measurement.internal.b3 r6 = r6.mo19287w()
            com.google.android.gms.measurement.internal.p9 r7 = r10.f46562h
            com.google.android.gms.measurement.internal.h4 r7 = r7.f21269a
            com.google.android.gms.measurement.internal.y2 r7 = r7.mo19363D()
            java.lang.String r8 = r13.mo38212F()
            java.lang.String r7 = r7.mo39322f(r8)
            java.lang.String r8 = r13.mo38213G()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.mo38858c(r9, r7, r8)
            goto L_0x019c
        L_0x0162:
            java.lang.String r2 = r13.mo38213G()
            com.google.android.gms.internal.measurement.n3 r6 = r6.mo37386C()
            com.google.android.gms.measurement.internal.p9 r8 = r10.f46562h
            com.google.android.gms.measurement.internal.h4 r8 = r8.f21269a
            com.google.android.gms.measurement.internal.d3 r8 = r8.mo19276j()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C9858n9.m45240f(r2, r6, r8)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C9858n9.m45244j(r2, r7)
            goto L_0x019c
        L_0x017b:
            com.google.android.gms.measurement.internal.p9 r6 = r10.f46562h
            com.google.android.gms.measurement.internal.h4 r6 = r6.f21269a
            com.google.android.gms.measurement.internal.d3 r6 = r6.mo19276j()
            com.google.android.gms.measurement.internal.b3 r6 = r6.mo19287w()
            com.google.android.gms.measurement.internal.p9 r7 = r10.f46562h
            com.google.android.gms.measurement.internal.h4 r7 = r7.f21269a
            com.google.android.gms.measurement.internal.y2 r7 = r7.mo19363D()
            java.lang.String r8 = r13.mo38212F()
            java.lang.String r7 = r7.mo39322f(r8)
            java.lang.String r8 = "User property has no value, property"
            r6.mo38857b(r8, r7)
        L_0x019c:
            com.google.android.gms.measurement.internal.p9 r6 = r10.f46562h
            com.google.android.gms.measurement.internal.h4 r6 = r6.f21269a
            com.google.android.gms.measurement.internal.d3 r6 = r6.mo19276j()
            com.google.android.gms.measurement.internal.b3 r6 = r6.mo19286v()
            if (r2 != 0) goto L_0x01ad
            java.lang.String r7 = "null"
            goto L_0x01ae
        L_0x01ad:
            r7 = r2
        L_0x01ae:
            java.lang.String r8 = "Property filter result"
            r6.mo38857b(r8, r7)
            if (r2 != 0) goto L_0x01b6
            return r4
        L_0x01b6:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r10.f46521c = r4
            if (r3 == 0) goto L_0x01c4
            boolean r3 = r2.booleanValue()
            if (r3 == 0) goto L_0x01c3
            goto L_0x01c4
        L_0x01c3:
            return r5
        L_0x01c4:
            if (r14 == 0) goto L_0x01ce
            com.google.android.gms.internal.measurement.i3 r14 = r10.f46561g
            boolean r14 = r14.mo37626G()
            if (r14 == 0) goto L_0x01d0
        L_0x01ce:
            r10.f46522d = r2
        L_0x01d0:
            boolean r14 = r2.booleanValue()
            if (r14 == 0) goto L_0x0215
            if (r1 == 0) goto L_0x0215
            boolean r14 = r13.mo38216R()
            if (r14 == 0) goto L_0x0215
            long r13 = r13.mo38211B()
            if (r11 == 0) goto L_0x01e8
            long r13 = r11.longValue()
        L_0x01e8:
            if (r0 == 0) goto L_0x0200
            com.google.android.gms.internal.measurement.i3 r11 = r10.f46561g
            boolean r11 = r11.mo37626G()
            if (r11 == 0) goto L_0x0200
            com.google.android.gms.internal.measurement.i3 r11 = r10.f46561g
            boolean r11 = r11.mo37627H()
            if (r11 != 0) goto L_0x0200
            if (r12 == 0) goto L_0x0200
            long r13 = r12.longValue()
        L_0x0200:
            com.google.android.gms.internal.measurement.i3 r11 = r10.f46561g
            boolean r11 = r11.mo37627H()
            if (r11 == 0) goto L_0x020f
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f46524f = r11
            goto L_0x0215
        L_0x020f:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f46523e = r11
        L_0x0215:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9869o9.mo39093k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.z4, boolean):boolean");
    }
}

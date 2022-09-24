package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C9447z2;

/* renamed from: com.google.android.gms.measurement.internal.m9 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9847m9 extends C9858n9 {

    /* renamed from: g */
    private final C9447z2 f46482g;

    /* renamed from: h */
    final /* synthetic */ C9880p9 f46483h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9847m9(C9880p9 p9Var, String str, int i, C9447z2 z2Var) {
        super(str, i);
        this.f46483h = p9Var;
        this.f46482g = z2Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo39069a() {
        return this.f46482g.mo38198A();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo39070b() {
        return this.f46482g.mo38206N();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo39071c() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r5v16, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03fa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03fb  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo39072k(java.lang.Long r16, java.lang.Long r17, com.google.android.gms.internal.measurement.C9143f4 r18, long r19, com.google.android.gms.measurement.internal.C9859o r21, boolean r22) {
        /*
            r15 = this;
            r0 = r15
            com.google.android.gms.internal.measurement.C9427xc.m43850b()
            com.google.android.gms.measurement.internal.p9 r1 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r1 = r1.f21269a
            com.google.android.gms.measurement.internal.f r1 = r1.mo19392z()
            java.lang.String r2 = r0.f46519a
            com.google.android.gms.measurement.internal.r2 r3 = com.google.android.gms.measurement.internal.C9903s2.f46674Y
            boolean r1 = r1.mo19337B(r2, r3)
            com.google.android.gms.internal.measurement.z2 r2 = r0.f46482g
            boolean r2 = r2.mo38205M()
            if (r2 == 0) goto L_0x0021
            r2 = r21
            long r2 = r2.f46529e
            goto L_0x0023
        L_0x0021:
            r2 = r19
        L_0x0023:
            com.google.android.gms.measurement.internal.p9 r4 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r4 = r4.f21269a
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo19276j()
            java.lang.String r4 = r4.mo19278C()
            r5 = 2
            boolean r4 = android.util.Log.isLoggable(r4, r5)
            r5 = 0
            if (r4 == 0) goto L_0x0093
            com.google.android.gms.measurement.internal.p9 r4 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r4 = r4.f21269a
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo19276j()
            com.google.android.gms.measurement.internal.b3 r4 = r4.mo19286v()
            int r6 = r0.f46520b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.gms.internal.measurement.z2 r7 = r0.f46482g
            boolean r7 = r7.mo38207O()
            if (r7 == 0) goto L_0x005c
            com.google.android.gms.internal.measurement.z2 r7 = r0.f46482g
            int r7 = r7.mo38198A()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x005d
        L_0x005c:
            r7 = r5
        L_0x005d:
            com.google.android.gms.measurement.internal.p9 r8 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r8 = r8.f21269a
            com.google.android.gms.measurement.internal.y2 r8 = r8.mo19363D()
            com.google.android.gms.internal.measurement.z2 r9 = r0.f46482g
            java.lang.String r9 = r9.mo38201G()
            java.lang.String r8 = r8.mo39320d(r9)
            java.lang.String r9 = "Evaluating filter. audience, filter, event"
            r4.mo38859d(r9, r6, r7, r8)
            com.google.android.gms.measurement.internal.p9 r4 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r4 = r4.f21269a
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo19276j()
            com.google.android.gms.measurement.internal.b3 r4 = r4.mo19286v()
            com.google.android.gms.measurement.internal.p9 r6 = r0.f46483h
            com.google.android.gms.measurement.internal.x8 r6 = r6.f46518b
            com.google.android.gms.measurement.internal.z8 r6 = r6.mo39292f0()
            com.google.android.gms.internal.measurement.z2 r7 = r0.f46482g
            java.lang.String r6 = r6.mo39343E(r7)
            java.lang.String r7 = "Filter definition"
            r4.mo38857b(r7, r6)
        L_0x0093:
            com.google.android.gms.internal.measurement.z2 r4 = r0.f46482g
            boolean r4 = r4.mo38207O()
            r6 = 0
            if (r4 == 0) goto L_0x043f
            com.google.android.gms.internal.measurement.z2 r4 = r0.f46482g
            int r4 = r4.mo38198A()
            r7 = 256(0x100, float:3.59E-43)
            if (r4 <= r7) goto L_0x00a8
            goto L_0x043f
        L_0x00a8:
            com.google.android.gms.internal.measurement.z2 r4 = r0.f46482g
            boolean r4 = r4.mo38203K()
            com.google.android.gms.internal.measurement.z2 r7 = r0.f46482g
            boolean r7 = r7.mo38204L()
            com.google.android.gms.internal.measurement.z2 r8 = r0.f46482g
            boolean r8 = r8.mo38205M()
            r9 = 1
            if (r4 != 0) goto L_0x00c4
            if (r7 != 0) goto L_0x00c4
            if (r8 == 0) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            r4 = 0
            goto L_0x00c5
        L_0x00c4:
            r4 = 1
        L_0x00c5:
            if (r22 == 0) goto L_0x00f3
            if (r4 != 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.p9 r1 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r1 = r1.f21269a
            com.google.android.gms.measurement.internal.d3 r1 = r1.mo19276j()
            com.google.android.gms.measurement.internal.b3 r1 = r1.mo19286v()
            int r2 = r0.f46520b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.internal.measurement.z2 r3 = r0.f46482g
            boolean r3 = r3.mo38207O()
            if (r3 == 0) goto L_0x00ed
            com.google.android.gms.internal.measurement.z2 r3 = r0.f46482g
            int r3 = r3.mo38198A()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L_0x00ed:
            java.lang.String r3 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.mo38858c(r3, r2, r5)
            return r9
        L_0x00f3:
            com.google.android.gms.internal.measurement.z2 r7 = r0.f46482g
            java.lang.String r8 = r18.mo37555H()
            boolean r10 = r7.mo38206N()
            if (r10 == 0) goto L_0x0115
            com.google.android.gms.internal.measurement.g3 r10 = r7.mo38200F()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C9858n9.m45242h(r2, r10)
            if (r2 != 0) goto L_0x010b
            goto L_0x03e1
        L_0x010b:
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0115
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x0115:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.List r3 = r7.mo38202H()
            java.util.Iterator r3 = r3.iterator()
        L_0x0122:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x015f
            java.lang.Object r10 = r3.next()
            com.google.android.gms.internal.measurement.b3 r10 = (com.google.android.gms.internal.measurement.C9080b3) r10
            java.lang.String r11 = r10.mo37387D()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0157
            com.google.android.gms.measurement.internal.p9 r2 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19287w()
            com.google.android.gms.measurement.internal.p9 r3 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r3 = r3.f21269a
            com.google.android.gms.measurement.internal.y2 r3 = r3.mo19363D()
            java.lang.String r3 = r3.mo39320d(r8)
            java.lang.String r7 = "null or empty param name in filter. event"
            r2.mo38857b(r7, r3)
            goto L_0x03e1
        L_0x0157:
            java.lang.String r10 = r10.mo37387D()
            r2.add(r10)
            goto L_0x0122
        L_0x015f:
            t.a r3 = new t.a
            r3.<init>()
            java.util.List r10 = r18.mo37556I()
            java.util.Iterator r10 = r10.iterator()
        L_0x016c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01ff
            java.lang.Object r11 = r10.next()
            com.google.android.gms.internal.measurement.j4 r11 = (com.google.android.gms.internal.measurement.C9204j4) r11
            java.lang.String r12 = r11.mo37664G()
            boolean r12 = r2.contains(r12)
            if (r12 == 0) goto L_0x016c
            boolean r12 = r11.mo37669V()
            if (r12 == 0) goto L_0x01a0
            java.lang.String r12 = r11.mo37664G()
            boolean r13 = r11.mo37669V()
            if (r13 == 0) goto L_0x019b
            long r13 = r11.mo37663C()
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            goto L_0x019c
        L_0x019b:
            r11 = r5
        L_0x019c:
            r3.put(r12, r11)
            goto L_0x016c
        L_0x01a0:
            boolean r12 = r11.mo37667T()
            if (r12 == 0) goto L_0x01be
            java.lang.String r12 = r11.mo37664G()
            boolean r13 = r11.mo37667T()
            if (r13 == 0) goto L_0x01b9
            double r13 = r11.mo37672z()
            java.lang.Double r11 = java.lang.Double.valueOf(r13)
            goto L_0x01ba
        L_0x01b9:
            r11 = r5
        L_0x01ba:
            r3.put(r12, r11)
            goto L_0x016c
        L_0x01be:
            boolean r12 = r11.mo37671X()
            if (r12 == 0) goto L_0x01d0
            java.lang.String r12 = r11.mo37664G()
            java.lang.String r11 = r11.mo37665H()
            r3.put(r12, r11)
            goto L_0x016c
        L_0x01d0:
            com.google.android.gms.measurement.internal.p9 r2 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19287w()
            com.google.android.gms.measurement.internal.p9 r3 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r3 = r3.f21269a
            com.google.android.gms.measurement.internal.y2 r3 = r3.mo19363D()
            java.lang.String r3 = r3.mo39320d(r8)
            com.google.android.gms.measurement.internal.p9 r7 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r7 = r7.f21269a
            com.google.android.gms.measurement.internal.y2 r7 = r7.mo19363D()
            java.lang.String r8 = r11.mo37664G()
            java.lang.String r7 = r7.mo39321e(r8)
            java.lang.String r8 = "Unknown value for param. event, param"
            r2.mo38858c(r8, r3, r7)
            goto L_0x03e1
        L_0x01ff:
            java.util.List r2 = r7.mo38202H()
            java.util.Iterator r2 = r2.iterator()
        L_0x0207:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x03df
            java.lang.Object r7 = r2.next()
            com.google.android.gms.internal.measurement.b3 r7 = (com.google.android.gms.internal.measurement.C9080b3) r7
            boolean r10 = r7.mo37389H()
            if (r10 == 0) goto L_0x0221
            boolean r10 = r7.mo37388G()
            if (r10 == 0) goto L_0x0221
            r10 = 1
            goto L_0x0222
        L_0x0221:
            r10 = 0
        L_0x0222:
            java.lang.String r11 = r7.mo37387D()
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x024b
            com.google.android.gms.measurement.internal.p9 r2 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19287w()
            com.google.android.gms.measurement.internal.p9 r3 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r3 = r3.f21269a
            com.google.android.gms.measurement.internal.y2 r3 = r3.mo19363D()
            java.lang.String r3 = r3.mo39320d(r8)
            java.lang.String r7 = "Event has empty param name. event"
            r2.mo38857b(r7, r3)
            goto L_0x03e1
        L_0x024b:
            java.lang.Object r12 = r3.get(r11)
            boolean r13 = r12 instanceof java.lang.Long
            if (r13 == 0) goto L_0x02a0
            boolean r13 = r7.mo37390I()
            if (r13 != 0) goto L_0x0284
            com.google.android.gms.measurement.internal.p9 r2 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19287w()
            com.google.android.gms.measurement.internal.p9 r3 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r3 = r3.f21269a
            com.google.android.gms.measurement.internal.y2 r3 = r3.mo19363D()
            java.lang.String r3 = r3.mo39320d(r8)
            com.google.android.gms.measurement.internal.p9 r7 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r7 = r7.f21269a
            com.google.android.gms.measurement.internal.y2 r7 = r7.mo19363D()
            java.lang.String r7 = r7.mo39321e(r11)
            java.lang.String r8 = "No number filter for long param. event, param"
            r2.mo38858c(r8, r3, r7)
            goto L_0x03e1
        L_0x0284:
            java.lang.Long r12 = (java.lang.Long) r12
            long r11 = r12.longValue()
            com.google.android.gms.internal.measurement.g3 r7 = r7.mo37385B()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C9858n9.m45242h(r11, r7)
            if (r7 != 0) goto L_0x0296
            goto L_0x03e1
        L_0x0296:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x0207
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x02a0:
            boolean r13 = r12 instanceof java.lang.Double
            if (r13 == 0) goto L_0x02f1
            boolean r13 = r7.mo37390I()
            if (r13 != 0) goto L_0x02d5
            com.google.android.gms.measurement.internal.p9 r2 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19287w()
            com.google.android.gms.measurement.internal.p9 r3 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r3 = r3.f21269a
            com.google.android.gms.measurement.internal.y2 r3 = r3.mo19363D()
            java.lang.String r3 = r3.mo39320d(r8)
            com.google.android.gms.measurement.internal.p9 r7 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r7 = r7.f21269a
            com.google.android.gms.measurement.internal.y2 r7 = r7.mo19363D()
            java.lang.String r7 = r7.mo39321e(r11)
            java.lang.String r8 = "No number filter for double param. event, param"
            r2.mo38858c(r8, r3, r7)
            goto L_0x03e1
        L_0x02d5:
            java.lang.Double r12 = (java.lang.Double) r12
            double r11 = r12.doubleValue()
            com.google.android.gms.internal.measurement.g3 r7 = r7.mo37385B()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C9858n9.m45241g(r11, r7)
            if (r7 != 0) goto L_0x02e7
            goto L_0x03e1
        L_0x02e7:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x0207
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x02f1:
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L_0x0387
            boolean r13 = r7.mo37392K()
            if (r13 == 0) goto L_0x030e
            java.lang.String r12 = (java.lang.String) r12
            com.google.android.gms.internal.measurement.n3 r7 = r7.mo37386C()
            com.google.android.gms.measurement.internal.p9 r11 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r11 = r11.f21269a
            com.google.android.gms.measurement.internal.d3 r11 = r11.mo19276j()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C9858n9.m45240f(r12, r7, r11)
            goto L_0x0324
        L_0x030e:
            boolean r13 = r7.mo37390I()
            if (r13 == 0) goto L_0x035d
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = com.google.android.gms.measurement.internal.C9978z8.m45538N(r12)
            if (r13 == 0) goto L_0x0332
            com.google.android.gms.internal.measurement.g3 r7 = r7.mo37385B()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C9858n9.m45243i(r12, r7)
        L_0x0324:
            if (r7 != 0) goto L_0x0328
            goto L_0x03e1
        L_0x0328:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x0207
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x0332:
            com.google.android.gms.measurement.internal.p9 r2 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19287w()
            com.google.android.gms.measurement.internal.p9 r3 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r3 = r3.f21269a
            com.google.android.gms.measurement.internal.y2 r3 = r3.mo19363D()
            java.lang.String r3 = r3.mo39320d(r8)
            com.google.android.gms.measurement.internal.p9 r7 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r7 = r7.f21269a
            com.google.android.gms.measurement.internal.y2 r7 = r7.mo19363D()
            java.lang.String r7 = r7.mo39321e(r11)
            java.lang.String r8 = "Invalid param value for number filter. event, param"
            r2.mo38858c(r8, r3, r7)
            goto L_0x03e1
        L_0x035d:
            com.google.android.gms.measurement.internal.p9 r2 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19287w()
            com.google.android.gms.measurement.internal.p9 r3 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r3 = r3.f21269a
            com.google.android.gms.measurement.internal.y2 r3 = r3.mo19363D()
            java.lang.String r3 = r3.mo39320d(r8)
            com.google.android.gms.measurement.internal.p9 r7 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r7 = r7.f21269a
            com.google.android.gms.measurement.internal.y2 r7 = r7.mo19363D()
            java.lang.String r7 = r7.mo39321e(r11)
            java.lang.String r8 = "No filter for String param. event, param"
            r2.mo38858c(r8, r3, r7)
            goto L_0x03e1
        L_0x0387:
            if (r12 != 0) goto L_0x03b5
            com.google.android.gms.measurement.internal.p9 r2 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19286v()
            com.google.android.gms.measurement.internal.p9 r3 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r3 = r3.f21269a
            com.google.android.gms.measurement.internal.y2 r3 = r3.mo19363D()
            java.lang.String r3 = r3.mo39320d(r8)
            com.google.android.gms.measurement.internal.p9 r5 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r5 = r5.f21269a
            com.google.android.gms.measurement.internal.y2 r5 = r5.mo19363D()
            java.lang.String r5 = r5.mo39321e(r11)
            java.lang.String r7 = "Missing param for filter. event, param"
            r2.mo38858c(r7, r3, r5)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x03b5:
            com.google.android.gms.measurement.internal.p9 r2 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19287w()
            com.google.android.gms.measurement.internal.p9 r3 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r3 = r3.f21269a
            com.google.android.gms.measurement.internal.y2 r3 = r3.mo19363D()
            java.lang.String r3 = r3.mo39320d(r8)
            com.google.android.gms.measurement.internal.p9 r7 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r7 = r7.f21269a
            com.google.android.gms.measurement.internal.y2 r7 = r7.mo19363D()
            java.lang.String r7 = r7.mo39321e(r11)
            java.lang.String r8 = "Unknown param type. event, param"
            r2.mo38858c(r8, r3, r7)
            goto L_0x03e1
        L_0x03df:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
        L_0x03e1:
            com.google.android.gms.measurement.internal.p9 r2 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19286v()
            if (r5 != 0) goto L_0x03f2
            java.lang.String r3 = "null"
            goto L_0x03f3
        L_0x03f2:
            r3 = r5
        L_0x03f3:
            java.lang.String r7 = "Event filter result"
            r2.mo38857b(r7, r3)
            if (r5 != 0) goto L_0x03fb
            return r6
        L_0x03fb:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f46521c = r2
            boolean r3 = r5.booleanValue()
            if (r3 != 0) goto L_0x0406
            return r9
        L_0x0406:
            r0.f46522d = r2
            if (r4 == 0) goto L_0x043e
            boolean r2 = r18.mo37559T()
            if (r2 == 0) goto L_0x043e
            long r2 = r18.mo37553C()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            com.google.android.gms.internal.measurement.z2 r3 = r0.f46482g
            boolean r3 = r3.mo38204L()
            if (r3 == 0) goto L_0x0430
            if (r1 == 0) goto L_0x042d
            com.google.android.gms.internal.measurement.z2 r1 = r0.f46482g
            boolean r1 = r1.mo38206N()
            if (r1 != 0) goto L_0x042b
            goto L_0x042d
        L_0x042b:
            r2 = r16
        L_0x042d:
            r0.f46524f = r2
            goto L_0x043e
        L_0x0430:
            if (r1 == 0) goto L_0x043c
            com.google.android.gms.internal.measurement.z2 r1 = r0.f46482g
            boolean r1 = r1.mo38206N()
            if (r1 == 0) goto L_0x043c
            r2 = r17
        L_0x043c:
            r0.f46523e = r2
        L_0x043e:
            return r9
        L_0x043f:
            com.google.android.gms.measurement.internal.p9 r1 = r0.f46483h
            com.google.android.gms.measurement.internal.h4 r1 = r1.f21269a
            com.google.android.gms.measurement.internal.d3 r1 = r1.mo19276j()
            com.google.android.gms.measurement.internal.b3 r1 = r1.mo19287w()
            java.lang.String r2 = r0.f46519a
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r2)
            com.google.android.gms.internal.measurement.z2 r3 = r0.f46482g
            boolean r3 = r3.mo38207O()
            if (r3 == 0) goto L_0x0463
            com.google.android.gms.internal.measurement.z2 r3 = r0.f46482g
            int r3 = r3.mo38198A()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L_0x0463:
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r4 = "Invalid event filter ID. appId, id"
            r1.mo38858c(r4, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9847m9.mo39072k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.f4, long, com.google.android.gms.measurement.internal.o, boolean):boolean");
    }
}

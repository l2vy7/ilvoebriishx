package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bmm */
/* compiled from: IMASDK */
final class bmm<T, B> {
    bmm() {
    }

    bmm(byte[] bArr) {
        this();
    }

    /* renamed from: l */
    static bmn m16656l(Object obj) {
        return ((bkl) obj).f16594c;
    }

    /* renamed from: o */
    static /* bridge */ /* synthetic */ Object m16659o(Object obj, Object obj2) {
        bmn bmn = (bmn) obj2;
        if (bmn.equals(bmn.m16671a())) {
            return obj;
        }
        return bmn.m16673c((bmn) obj, bmn);
    }

    /* renamed from: q */
    static void m16661q(Object obj, bmn bmn) {
        ((bkl) obj).f16594c = bmn;
    }

    /* renamed from: r */
    static /* bridge */ /* synthetic */ Object m16662r(Object obj) {
        bmn bmn = (bmn) obj;
        bmn.mo15507d();
        return bmn;
    }

    /* renamed from: t */
    static String m16664t(bjq bjq) {
        bmk bmk = new bmk(bjq);
        StringBuilder sb = new StringBuilder(bmk.mo15500a());
        for (int i = 0; i < bmk.mo15500a(); i++) {
            byte a = bmk.f16696a.mo15199a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a >= 32 && a <= 126) {
                            sb.append((char) a);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034 A[LOOP:0: B:16:0x0034->B:19:0x0041, LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo15501a(B r7, com.google.ads.interactivemedia.p038v3.internal.blx r8) throws java.io.IOException {
        /*
            r6 = this;
            int r0 = r8.mo15270c()
            int r1 = com.google.ads.interactivemedia.p038v3.internal.bnd.m16788b(r0)
            int r0 = com.google.ads.interactivemedia.p038v3.internal.bnd.m16787a(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0066
            if (r0 == r2) goto L_0x005e
            r3 = 2
            if (r0 == r3) goto L_0x0056
            r3 = 3
            r4 = 4
            if (r0 == r3) goto L_0x002c
            if (r0 == r4) goto L_0x002a
            r3 = 5
            if (r0 != r3) goto L_0x0025
            int r8 = r8.mo15278k()
            ((com.google.ads.interactivemedia.p038v3.internal.bmn) r7).mo15514i(com.google.ads.interactivemedia.p038v3.internal.bnd.m16789c(r1, 5), java.lang.Integer.valueOf(r8))
            return r2
        L_0x0025:
            com.google.ads.interactivemedia.v3.internal.bks r7 = com.google.ads.interactivemedia.p038v3.internal.bkt.m16353f()
            throw r7
        L_0x002a:
            r7 = 0
            return r7
        L_0x002c:
            int r0 = com.google.ads.interactivemedia.p038v3.internal.bnd.m16789c(r1, r4)
            java.lang.Object r3 = com.google.ads.interactivemedia.p038v3.internal.bmn.m16672b()
        L_0x0034:
            int r4 = r8.mo15269b()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x0043
            boolean r4 = r6.mo15501a(r3, r8)
            if (r4 != 0) goto L_0x0034
        L_0x0043:
            int r8 = r8.mo15270c()
            if (r0 != r8) goto L_0x0051
            java.lang.Object r8 = m16662r(r3)
            ((com.google.ads.interactivemedia.p038v3.internal.bmn) r7).mo15514i(com.google.ads.interactivemedia.p038v3.internal.bnd.m16789c(r1, 3), r8)
            return r2
        L_0x0051:
            com.google.ads.interactivemedia.v3.internal.bkt r7 = com.google.ads.interactivemedia.p038v3.internal.bkt.m16352e()
            throw r7
        L_0x0056:
            com.google.ads.interactivemedia.v3.internal.bjq r8 = r8.mo15284q()
            ((com.google.ads.interactivemedia.p038v3.internal.bmn) r7).mo15514i(com.google.ads.interactivemedia.p038v3.internal.bnd.m16789c(r1, 2), r8)
            return r2
        L_0x005e:
            long r3 = r8.mo15277j()
            ((com.google.ads.interactivemedia.p038v3.internal.bmn) r7).mo15514i(com.google.ads.interactivemedia.p038v3.internal.bnd.m16789c(r1, 1), java.lang.Long.valueOf(r3))
            return r2
        L_0x0066:
            long r3 = r8.mo15275h()
            ((com.google.ads.interactivemedia.p038v3.internal.bmn) r7).mo15514i(com.google.ads.interactivemedia.p038v3.internal.bnd.m16789c(r1, 0), java.lang.Long.valueOf(r3))
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.bmm.mo15501a(java.lang.Object, com.google.ads.interactivemedia.v3.internal.blx):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo15502b(Object obj) {
        m16656l(obj).mo15507d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo15503c(Object obj, Object obj2) {
        m16661q(obj, (bmn) obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public /* bridge */ /* synthetic */ Object mo15504d(Object obj) {
        bmn l = m16656l(obj);
        if (l != bmn.m16671a()) {
            return l;
        }
        bmn b = bmn.m16672b();
        m16661q(obj, b);
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public /* bridge */ /* synthetic */ Object mo15505e(Object obj) {
        return m16656l(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public /* bridge */ /* synthetic */ void mo15506f(Object obj, Object obj2) {
        m16661q(obj, (bmn) obj2);
    }
}

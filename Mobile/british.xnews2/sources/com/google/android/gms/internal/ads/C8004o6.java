package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.o6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8004o6 {

    /* renamed from: a */
    long f36284a;

    /* renamed from: b */
    final String f36285b;

    /* renamed from: c */
    final String f36286c;

    /* renamed from: d */
    final long f36287d;

    /* renamed from: e */
    final long f36288e;

    /* renamed from: f */
    final long f36289f;

    /* renamed from: g */
    final long f36290g;

    /* renamed from: h */
    final List<C7929m5> f36291h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C8004o6(java.lang.String r14, com.google.android.gms.internal.ads.C7597d5 r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.f30637b
            long r3 = r15.f30638c
            long r5 = r15.f30639d
            long r7 = r15.f30640e
            long r9 = r15.f30641f
            java.util.List<com.google.android.gms.internal.ads.m5> r0 = r15.f30643h
            if (r0 == 0) goto L_0x0010
        L_0x000e:
            r11 = r0
            goto L_0x0044
        L_0x0010:
            java.util.Map<java.lang.String, java.lang.String> r15 = r15.f30642g
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x0023:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x000e
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.m5 r11 = new com.google.android.gms.internal.ads.m5
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L_0x0023
        L_0x0044:
            r0 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8004o6.<init>(java.lang.String, com.google.android.gms.internal.ads.d5):void");
    }

    /* renamed from: a */
    static C8004o6 m35570a(C8039p6 p6Var) throws IOException {
        List list;
        if (C8111r6.m36943c(p6Var) == 538247942) {
            String f = C8111r6.m36945f(p6Var);
            String f2 = C8111r6.m36945f(p6Var);
            long d = C8111r6.m36944d(p6Var);
            long d2 = C8111r6.m36944d(p6Var);
            long d3 = C8111r6.m36944d(p6Var);
            long d4 = C8111r6.m36944d(p6Var);
            int c = C8111r6.m36943c(p6Var);
            if (c >= 0) {
                if (c == 0) {
                    list = Collections.emptyList();
                } else {
                    list = new ArrayList();
                }
                List list2 = list;
                for (int i = 0; i < c; i++) {
                    list2.add(new C7929m5(C8111r6.m36945f(p6Var).intern(), C8111r6.m36945f(p6Var).intern()));
                }
                return new C8004o6(f, f2, d, d2, d3, d4, list2);
            }
            StringBuilder sb = new StringBuilder(31);
            sb.append("readHeaderList size=");
            sb.append(c);
            throw new IOException(sb.toString());
        }
        throw new IOException();
    }

    private C8004o6(String str, String str2, long j, long j2, long j3, long j4, List<C7929m5> list) {
        this.f36285b = str;
        this.f36286c = true == "".equals(str2) ? null : str2;
        this.f36287d = j;
        this.f36288e = j2;
        this.f36289f = j3;
        this.f36290g = j4;
        this.f36291h = list;
    }
}

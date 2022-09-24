package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ac */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7498ac {

    /* renamed from: a */
    static lc3 f29598a;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r0 != null) goto L_0x0035;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m30279a(com.google.android.gms.internal.ads.C8400zb r6) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            com.google.android.gms.internal.ads.lc3 r0 = f29598a
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            com.google.android.gms.internal.ads.h00<java.lang.String> r0 = com.google.android.gms.internal.ads.p00.f37009W1
            com.google.android.gms.internal.ads.n00 r2 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r0 = r2.mo18570b(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2 = 0
            if (r0 == 0) goto L_0x001b
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0035
        L_0x001b:
            r0 = 0
            if (r6 != 0) goto L_0x001f
            goto L_0x0033
        L_0x001f:
            java.lang.String r3 = "PDJGtr7hH5z8kziZtOwKBHfUklGaxsnuMOcaf4/XJNQXH5uqgOnO+ZxxlrN1G5R2"
            java.lang.String r4 = "8jFByxLLStK1ZA6Q/SQPKITUmXlRJfaQf0bJ+6rt27M="
            java.lang.reflect.Method r6 = r6.mo36036j(r3, r4)
            if (r6 != 0) goto L_0x002a
            goto L_0x0033
        L_0x002a:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Object r6 = r6.invoke(r0, r3)
            java.lang.String r6 = (java.lang.String) r6
            r0 = r6
        L_0x0033:
            if (r0 == 0) goto L_0x0117
        L_0x0035:
            byte[] r6 = com.google.android.gms.internal.ads.C7859k9.m33876b(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0117 }
            com.google.android.gms.internal.ads.wc3 r6 = com.google.android.gms.internal.ads.ad3.m30293a(r6)     // Catch:{  }
            com.google.android.gms.internal.ads.il3 r0 = com.google.android.gms.internal.ads.nf3.f36007a     // Catch:{  }
            java.util.List r0 = r0.mo32646H()     // Catch:{  }
            java.util.Iterator r0 = r0.iterator()     // Catch:{  }
        L_0x0047:
            boolean r3 = r0.hasNext()     // Catch:{  }
            if (r3 == 0) goto L_0x010e
            java.lang.Object r3 = r0.next()     // Catch:{  }
            com.google.android.gms.internal.ads.gk3 r3 = (com.google.android.gms.internal.ads.gk3) r3     // Catch:{  }
            java.lang.String r4 = r3.mo32158J()     // Catch:{  }
            boolean r4 = r4.isEmpty()     // Catch:{  }
            if (r4 != 0) goto L_0x0106
            java.lang.String r4 = r3.mo32157I()     // Catch:{  }
            boolean r4 = r4.isEmpty()     // Catch:{  }
            if (r4 != 0) goto L_0x00fe
            java.lang.String r4 = r3.mo32156H()     // Catch:{  }
            boolean r4 = r4.isEmpty()     // Catch:{  }
            if (r4 != 0) goto L_0x00f6
            java.lang.String r4 = r3.mo32156H()     // Catch:{  }
            java.lang.String r5 = "TinkAead"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo32156H()     // Catch:{  }
            java.lang.String r5 = "TinkMac"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo32156H()     // Catch:{  }
            java.lang.String r5 = "TinkHybridDecrypt"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo32156H()     // Catch:{  }
            java.lang.String r5 = "TinkHybridEncrypt"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo32156H()     // Catch:{  }
            java.lang.String r5 = "TinkPublicKeySign"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo32156H()     // Catch:{  }
            java.lang.String r5 = "TinkPublicKeyVerify"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo32156H()     // Catch:{  }
            java.lang.String r5 = "TinkStreamingAead"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo32156H()     // Catch:{  }
            java.lang.String r5 = "TinkDeterministicAead"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo32156H()     // Catch:{  }
            com.google.android.gms.internal.ads.hc3 r4 = com.google.android.gms.internal.ads.od3.m35631a(r4)     // Catch:{  }
            com.google.android.gms.internal.ads.fd3 r5 = r4.zza()     // Catch:{  }
            com.google.android.gms.internal.ads.od3.m35644n(r5)     // Catch:{  }
            r3.mo32158J()     // Catch:{  }
            r3.mo32157I()     // Catch:{  }
            r3.mo32155E()     // Catch:{  }
            com.google.android.gms.internal.ads.nc3 r4 = r4.zzb()     // Catch:{  }
            boolean r3 = r3.mo32159K()     // Catch:{  }
            com.google.android.gms.internal.ads.od3.m35642l(r4, r3)     // Catch:{  }
            goto L_0x0047
        L_0x00f6:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch:{  }
            java.lang.String r0 = "Missing catalogue_name."
            r6.<init>(r0)     // Catch:{  }
            throw r6     // Catch:{  }
        L_0x00fe:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch:{  }
            java.lang.String r0 = "Missing primitive_name."
            r6.<init>(r0)     // Catch:{  }
            throw r6     // Catch:{  }
        L_0x0106:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch:{  }
            java.lang.String r0 = "Missing type_url."
            r6.<init>(r0)     // Catch:{  }
            throw r6     // Catch:{  }
        L_0x010e:
            com.google.android.gms.internal.ads.lc3 r6 = com.google.android.gms.internal.ads.rf3.m37069a(r6)     // Catch:{  }
            f29598a = r6     // Catch:{  }
            if (r6 == 0) goto L_0x0117
            return r1
        L_0x0117:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7498ac.m30279a(com.google.android.gms.internal.ads.zb):boolean");
    }
}

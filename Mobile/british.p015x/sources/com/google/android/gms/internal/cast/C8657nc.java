package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.nc */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8657nc implements C8752td {

    /* renamed from: a */
    private static final C8657nc f43844a = new C8657nc();

    private C8657nc() {
    }

    /* renamed from: a */
    public static C8657nc m41160a() {
        return f43844a;
    }

    /* renamed from: b */
    public final boolean mo36598b(Class<?> cls) {
        return C8705qc.class.isAssignableFrom(cls);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.cast.C8737sd mo36599c(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<com.google.android.gms.internal.cast.qc> r0 = com.google.android.gms.internal.cast.C8705qc.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 != 0) goto L_0x0024
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.getName()
            java.lang.String r1 = "Unsupported message type: "
            int r2 = r5.length()
            if (r2 == 0) goto L_0x001b
            java.lang.String r5 = r1.concat(r5)
            goto L_0x0020
        L_0x001b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
        L_0x0020:
            r0.<init>(r5)
            throw r0
        L_0x0024:
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch:{ Exception -> 0x0035 }
            com.google.android.gms.internal.cast.qc r0 = com.google.android.gms.internal.cast.C8705qc.m41245f(r0)     // Catch:{ Exception -> 0x0035 }
            r1 = 3
            r2 = 0
            java.lang.Object r0 = r0.mo36369d(r1, r2, r2)     // Catch:{ Exception -> 0x0035 }
            com.google.android.gms.internal.cast.sd r0 = (com.google.android.gms.internal.cast.C8737sd) r0     // Catch:{ Exception -> 0x0035 }
            return r0
        L_0x0035:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r5 = r5.getName()
            java.lang.String r2 = "Unable to get message info for "
            int r3 = r5.length()
            if (r3 == 0) goto L_0x0049
            java.lang.String r5 = r2.concat(r5)
            goto L_0x004e
        L_0x0049:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x004e:
            r1.<init>(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C8657nc.mo36599c(java.lang.Class):com.google.android.gms.internal.cast.sd");
    }
}

package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.e1 */
final class C8885e1 implements C8935k2 {

    /* renamed from: a */
    private static final C8885e1 f44504a = new C8885e1();

    private C8885e1() {
    }

    /* renamed from: c */
    public static C8885e1 m41683c() {
        return f44504a;
    }

    /* renamed from: a */
    public final boolean mo36836a(Class<?> cls) {
        return C8891f1.class.isAssignableFrom(cls);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.clearcut.C8928j2 mo36837b(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<com.google.android.gms.internal.clearcut.f1> r0 = com.google.android.gms.internal.clearcut.C8891f1.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 != 0) goto L_0x0024
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported message type: "
            java.lang.String r5 = r5.getName()
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
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch:{ Exception -> 0x0036 }
            com.google.android.gms.internal.clearcut.f1 r0 = com.google.android.gms.internal.clearcut.C8891f1.m41756p(r0)     // Catch:{ Exception -> 0x0036 }
            int r1 = com.google.android.gms.internal.clearcut.C8891f1.C8896e.f44520c     // Catch:{ Exception -> 0x0036 }
            r2 = 0
            java.lang.Object r0 = r0.mo36855j(r1, r2, r2)     // Catch:{ Exception -> 0x0036 }
            com.google.android.gms.internal.clearcut.j2 r0 = (com.google.android.gms.internal.clearcut.C8928j2) r0     // Catch:{ Exception -> 0x0036 }
            return r0
        L_0x0036:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unable to get message info for "
            java.lang.String r5 = r5.getName()
            int r3 = r5.length()
            if (r3 == 0) goto L_0x004a
            java.lang.String r5 = r2.concat(r5)
            goto L_0x004f
        L_0x004a:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x004f:
            r1.<init>(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C8885e1.mo36837b(java.lang.Class):com.google.android.gms.internal.clearcut.j2");
    }
}

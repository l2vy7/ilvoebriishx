package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.t2 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9626t2 implements C9495d4 {

    /* renamed from: a */
    private static final C9626t2 f45879a = new C9626t2();

    private C9626t2() {
    }

    /* renamed from: c */
    public static C9626t2 m44585c() {
        return f45879a;
    }

    /* renamed from: a */
    public final boolean mo38332a(Class<?> cls) {
        return C9643v2.class.isAssignableFrom(cls);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.vision.C9504e4 mo38333b(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<com.google.android.gms.internal.vision.v2> r0 = com.google.android.gms.internal.vision.C9643v2.class
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
            com.google.android.gms.internal.vision.v2 r0 = com.google.android.gms.internal.vision.C9643v2.m44629o(r0)     // Catch:{ Exception -> 0x0036 }
            int r1 = com.google.android.gms.internal.vision.C9643v2.C9648e.f45915c     // Catch:{ Exception -> 0x0036 }
            r2 = 0
            java.lang.Object r0 = r0.mo38236j(r1, r2, r2)     // Catch:{ Exception -> 0x0036 }
            com.google.android.gms.internal.vision.e4 r0 = (com.google.android.gms.internal.vision.C9504e4) r0     // Catch:{ Exception -> 0x0036 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C9626t2.mo38333b(java.lang.Class):com.google.android.gms.internal.vision.e4");
    }
}

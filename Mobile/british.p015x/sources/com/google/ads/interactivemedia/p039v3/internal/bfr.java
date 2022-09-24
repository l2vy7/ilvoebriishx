package com.google.ads.interactivemedia.p039v3.internal;

import java.lang.reflect.Type;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bfr */
/* compiled from: IMASDK */
final class bfr implements bgj {

    /* renamed from: a */
    final /* synthetic */ Class f16246a;

    /* renamed from: b */
    final /* synthetic */ Type f16247b;

    /* renamed from: c */
    private final bgo f16248c;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x006c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    bfr(java.lang.Class r7, java.lang.reflect.Type r8) {
        /*
            r6 = this;
            java.lang.String r0 = "newInstance"
            r6.f16246a = r7
            r6.f16247b = r8
            r6.<init>()
            r7 = 0
            r8 = 0
            r1 = 1
            java.lang.String r2 = "sun.misc.Unsafe"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r3 = "theUnsafe"
            java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0031 }
            r3.setAccessible(r1)     // Catch:{ Exception -> 0x0031 }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ Exception -> 0x0031 }
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0031 }
            java.lang.Class<java.lang.Class> r5 = java.lang.Class.class
            r4[r8] = r5     // Catch:{ Exception -> 0x0031 }
            java.lang.String r5 = "allocateInstance"
            java.lang.reflect.Method r2 = r2.getMethod(r5, r4)     // Catch:{ Exception -> 0x0031 }
            com.google.ads.interactivemedia.v3.internal.bgk r4 = new com.google.ads.interactivemedia.v3.internal.bgk     // Catch:{ Exception -> 0x0031 }
            r4.<init>(r2, r3)     // Catch:{ Exception -> 0x0031 }
            goto L_0x008a
        L_0x0031:
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x006c }
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            r3[r8] = r4     // Catch:{ Exception -> 0x006c }
            java.lang.Class<java.io.ObjectStreamClass> r4 = java.io.ObjectStreamClass.class
            java.lang.String r5 = "getConstructorId"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r5, r3)     // Catch:{ Exception -> 0x006c }
            r3.setAccessible(r1)     // Catch:{ Exception -> 0x006c }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x006c }
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            r4[r8] = r5     // Catch:{ Exception -> 0x006c }
            java.lang.Object r7 = r3.invoke(r7, r4)     // Catch:{ Exception -> 0x006c }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Exception -> 0x006c }
            int r7 = r7.intValue()     // Catch:{ Exception -> 0x006c }
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x006c }
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            r3[r8] = r4     // Catch:{ Exception -> 0x006c }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x006c }
            r3[r1] = r4     // Catch:{ Exception -> 0x006c }
            java.lang.Class<java.io.ObjectStreamClass> r4 = java.io.ObjectStreamClass.class
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r0, r3)     // Catch:{ Exception -> 0x006c }
            r3.setAccessible(r1)     // Catch:{ Exception -> 0x006c }
            com.google.ads.interactivemedia.v3.internal.bgl r4 = new com.google.ads.interactivemedia.v3.internal.bgl     // Catch:{ Exception -> 0x006c }
            r4.<init>(r3, r7)     // Catch:{ Exception -> 0x006c }
            goto L_0x008a
        L_0x006c:
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0085 }
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r7[r8] = r2     // Catch:{ Exception -> 0x0085 }
            java.lang.Class<java.lang.Class> r8 = java.lang.Class.class
            r7[r1] = r8     // Catch:{ Exception -> 0x0085 }
            java.lang.Class<java.io.ObjectInputStream> r8 = java.io.ObjectInputStream.class
            java.lang.reflect.Method r7 = r8.getDeclaredMethod(r0, r7)     // Catch:{ Exception -> 0x0085 }
            r7.setAccessible(r1)     // Catch:{ Exception -> 0x0085 }
            com.google.ads.interactivemedia.v3.internal.bgm r4 = new com.google.ads.interactivemedia.v3.internal.bgm     // Catch:{ Exception -> 0x0085 }
            r4.<init>(r7)     // Catch:{ Exception -> 0x0085 }
            goto L_0x008a
        L_0x0085:
            com.google.ads.interactivemedia.v3.internal.bgn r4 = new com.google.ads.interactivemedia.v3.internal.bgn
            r4.<init>()
        L_0x008a:
            r6.f16248c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.bfr.<init>(java.lang.Class, java.lang.reflect.Type):void");
    }

    /* renamed from: a */
    public final Object mo15028a() {
        try {
            return this.f16248c.mo15081a(this.f16246a);
        } catch (Exception e) {
            String valueOf = String.valueOf(this.f16247b);
            StringBuilder sb = new StringBuilder(valueOf.length() + 119);
            sb.append("Unable to invoke no-args constructor for ");
            sb.append(valueOf);
            sb.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}

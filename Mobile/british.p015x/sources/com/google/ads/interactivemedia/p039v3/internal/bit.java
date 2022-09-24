package com.google.ads.interactivemedia.p039v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bit */
/* compiled from: IMASDK */
final class bit extends bis {

    /* renamed from: a */
    private static Class f16428a;

    /* renamed from: b */
    private final Object f16429b;

    /* renamed from: c */
    private final Field f16430c;

    bit() {
        Object obj = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f16428a = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get((Object) null);
        } catch (Exception unused) {
        }
        this.f16429b = obj;
        this.f16430c = m15935c();
    }

    /* renamed from: c */
    private static Field m15935c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:0|(3:4|5|6)|7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005b, code lost:
        r10 = java.lang.String.valueOf(r10);
        r3 = new java.lang.StringBuilder(r10.length() + 154);
        r3.append("Gson couldn't modify fields for ");
        r3.append(r10);
        r3.append("\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0080, code lost:
        throw new com.google.ads.interactivemedia.p039v3.internal.bez(r3.toString(), r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0056 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15132a(java.lang.reflect.AccessibleObject r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f16429b
            r1 = 1
            if (r0 == 0) goto L_0x0056
            java.lang.reflect.Field r0 = r9.f16430c
            if (r0 == 0) goto L_0x0056
            java.lang.Class r0 = f16428a     // Catch:{ Exception -> 0x0056 }
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0056 }
            java.lang.Class<java.lang.reflect.Field> r3 = java.lang.reflect.Field.class
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x0056 }
            java.lang.String r3 = "objectFieldOffset"
            java.lang.reflect.Method r0 = r0.getMethod(r3, r2)     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r2 = r9.f16429b     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0056 }
            java.lang.reflect.Field r5 = r9.f16430c     // Catch:{ Exception -> 0x0056 }
            r3[r4] = r5     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r0 = r0.invoke(r2, r3)     // Catch:{ Exception -> 0x0056 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x0056 }
            long r2 = r0.longValue()     // Catch:{ Exception -> 0x0056 }
            java.lang.Class r0 = f16428a     // Catch:{ Exception -> 0x0056 }
            r5 = 3
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0056 }
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r6[r4] = r7     // Catch:{ Exception -> 0x0056 }
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0056 }
            r6[r1] = r7     // Catch:{ Exception -> 0x0056 }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0056 }
            r8 = 2
            r6[r8] = r7     // Catch:{ Exception -> 0x0056 }
            java.lang.String r7 = "putBoolean"
            java.lang.reflect.Method r0 = r0.getMethod(r7, r6)     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r6 = r9.f16429b     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0056 }
            r5[r4] = r10     // Catch:{ Exception -> 0x0056 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x0056 }
            r5[r1] = r2     // Catch:{ Exception -> 0x0056 }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0056 }
            r5[r8] = r2     // Catch:{ Exception -> 0x0056 }
            r0.invoke(r6, r5)     // Catch:{ Exception -> 0x0056 }
            return
        L_0x0056:
            r10.setAccessible(r1)     // Catch:{ SecurityException -> 0x005a }
            return
        L_0x005a:
            r0 = move-exception
            com.google.ads.interactivemedia.v3.internal.bez r1 = new com.google.ads.interactivemedia.v3.internal.bez
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r2 = r10.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 154
            r3.<init>(r2)
            java.lang.String r2 = "Gson couldn't modify fields for "
            r3.append(r2)
            r3.append(r10)
            java.lang.String r10 = "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe."
            r3.append(r10)
            java.lang.String r10 = r3.toString()
            r1.<init>(r10, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.bit.mo15132a(java.lang.reflect.AccessibleObject):void");
    }
}

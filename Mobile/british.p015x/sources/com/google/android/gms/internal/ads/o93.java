package com.google.android.gms.internal.ads;

import com.google.ads.interactivemedia.p039v3.internal.C3828a0;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class o93 extends f93 {

    /* renamed from: a */
    static final Unsafe f20606a;

    /* renamed from: b */
    static final long f20607b;

    /* renamed from: c */
    static final long f20608c;

    /* renamed from: d */
    static final long f20609d;

    /* renamed from: e */
    static final long f20610e;

    /* renamed from: f */
    static final long f20611f;

    /* renamed from: com.google.android.gms.internal.ads.o93$a */
    /* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
    class C4616a implements PrivilegedExceptionAction<Unsafe> {
        C4616a() {
        }

        /* renamed from: a */
        public static final Unsafe m20771a() throws Exception {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        public final /* bridge */ /* synthetic */ Object run() throws Exception {
            return m20771a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r1 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.ads.o93.C4616a());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    static {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.p93> r0 = com.google.android.gms.internal.ads.p93.class
            sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0007 }
            goto L_0x0012
        L_0x0007:
            com.google.android.gms.internal.ads.o93$a r1 = new com.google.android.gms.internal.ads.o93$a     // Catch:{ PrivilegedActionException -> 0x005d }
            r1.<init>()     // Catch:{ PrivilegedActionException -> 0x005d }
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ PrivilegedActionException -> 0x005d }
            sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch:{ PrivilegedActionException -> 0x005d }
        L_0x0012:
            java.lang.Class<com.google.android.gms.internal.ads.q93> r2 = com.google.android.gms.internal.ads.q93.class
            java.lang.String r3 = "d"
            java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
            long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
            f20608c = r3     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = "c"
            java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
            long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
            f20607b = r3     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = "b"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
            long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
            f20609d = r2     // Catch:{ Exception -> 0x0053 }
            java.lang.String r2 = "a"
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
            long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
            f20610e = r2     // Catch:{ Exception -> 0x0053 }
            java.lang.String r2 = "b"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
            long r2 = r1.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
            f20611f = r2     // Catch:{ Exception -> 0x0053 }
            f20606a = r1     // Catch:{ Exception -> 0x0053 }
            return
        L_0x0053:
            r0 = move-exception
            com.google.android.gms.internal.ads.o43.m20756b(r0)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x005d:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Throwable r0 = r0.getCause()
            java.lang.String r2 = "Could not initialize intrinsics"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o93.<clinit>():void");
    }

    /* synthetic */ o93(s93 s93) {
        super((e93) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo18310a(p93 p93, @CheckForNull p93 p932) {
        f20606a.putObject(p93, f20611f, p932);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo18311b(p93 p93, Thread thread) {
        f20606a.putObject(p93, f20610e, thread);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo18312c(q93<?> q93, @CheckForNull i93 i93, i93 i932) {
        return C3828a0.m12686a(f20606a, q93, f20607b, i93, i932);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo18313d(q93<?> q93, @CheckForNull Object obj, Object obj2) {
        return C3828a0.m12686a(f20606a, q93, f20609d, obj, obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo18314e(q93<?> q93, @CheckForNull p93 p93, @CheckForNull p93 p932) {
        return C3828a0.m12686a(f20606a, q93, f20608c, p93, p932);
    }
}

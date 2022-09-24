package com.startapp;

import android.content.Context;

/* renamed from: com.startapp.f2 */
/* compiled from: Sta */
public abstract class C11896f2<T> {

    /* renamed from: a */
    public final Context f52927a;

    /* renamed from: b */
    public volatile T f52928b;

    /* renamed from: c */
    public volatile long f52929c;

    /* renamed from: d */
    public final long f52930d;

    public C11896f2(Context context) {
        this(context, 900000);
    }

    /* renamed from: a */
    public T mo45341a() {
        return null;
    }

    /* renamed from: a */
    public T mo45173a(boolean z) {
        return mo45341a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if ((r8.f52929c + r8.f52930d < android.os.SystemClock.uptimeMillis()) != false) goto L_0x0018;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo45342b() {
        /*
            r8 = this;
            T r0 = r8.f52928b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0018
            long r3 = r8.f52929c
            long r5 = r8.f52930d
            long r3 = r3 + r5
            long r5 = android.os.SystemClock.uptimeMillis()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0015
            r3 = 1
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            if (r3 == 0) goto L_0x0042
        L_0x0018:
            monitor-enter(r8)
            T r0 = r8.f52928b     // Catch:{ all -> 0x004a }
            long r3 = r8.f52929c     // Catch:{ all -> 0x004a }
            long r5 = r8.f52930d     // Catch:{ all -> 0x004a }
            long r3 = r3 + r5
            long r5 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x004a }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            if (r0 == 0) goto L_0x002e
            if (r1 == 0) goto L_0x0041
        L_0x002e:
            java.lang.Object r0 = r8.mo45173a(r1)     // Catch:{ all -> 0x0033 }
            goto L_0x0037
        L_0x0033:
            r1 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r1)     // Catch:{ all -> 0x004a }
        L_0x0037:
            if (r0 == 0) goto L_0x0041
            r8.f52928b = r0     // Catch:{ all -> 0x004a }
            long r1 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x004a }
            r8.f52929c = r1     // Catch:{ all -> 0x004a }
        L_0x0041:
            monitor-exit(r8)     // Catch:{ all -> 0x004a }
        L_0x0042:
            if (r0 == 0) goto L_0x0045
            goto L_0x0049
        L_0x0045:
            java.lang.Object r0 = r8.mo45174c()
        L_0x0049:
            return r0
        L_0x004a:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x004a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C11896f2.mo45342b():java.lang.Object");
    }

    /* renamed from: c */
    public abstract T mo45174c();

    public C11896f2(Context context, long j) {
        this.f52927a = context;
        this.f52930d = j;
    }
}

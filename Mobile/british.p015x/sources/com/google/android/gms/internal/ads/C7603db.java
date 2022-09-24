package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;

/* renamed from: com.google.android.gms.internal.ads.db */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7603db {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public NetworkCapabilities f30699a;

    C7603db(ConnectivityManager connectivityManager) {
        if (connectivityManager != null && Build.VERSION.SDK_INT >= 24) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new C7568cb(this));
            } catch (RuntimeException unused) {
                synchronized (C7603db.class) {
                    this.f30699a = null;
                }
            }
        }
    }

    /* renamed from: c */
    public static C7603db m31340c(Context context) {
        if (context != null) {
            return new C7603db((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        return -1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo31194a() {
        /*
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.ads.db> r0 = com.google.android.gms.internal.ads.C7603db.class
            monitor-enter(r0)
            android.net.NetworkCapabilities r1 = r3.f30699a     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002c
            r2 = 4
            boolean r1 = r1.hasTransport(r2)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0012
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            r0 = 2
            return r0
        L_0x0012:
            android.net.NetworkCapabilities r1 = r3.f30699a     // Catch:{ all -> 0x0030 }
            r2 = 1
            boolean r1 = r1.hasTransport(r2)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x001f
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            r0 = 1
            return r0
        L_0x001f:
            android.net.NetworkCapabilities r1 = r3.f30699a     // Catch:{ all -> 0x0030 }
            r2 = 0
            boolean r1 = r1.hasTransport(r2)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002c
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            r0 = 0
            return r0
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            r0 = -1
            return r0
        L_0x0030:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7603db.mo31194a():long");
    }

    /* renamed from: b */
    public final NetworkCapabilities mo31195b() {
        return this.f30699a;
    }
}

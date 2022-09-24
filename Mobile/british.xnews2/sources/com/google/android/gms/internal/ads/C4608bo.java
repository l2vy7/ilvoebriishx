package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.bo */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4608bo {

    /* renamed from: a */
    private final Object f20153a = new Object();
    @GuardedBy("activityTrackerLock")

    /* renamed from: b */
    private C8412zn f20154b = null;
    @GuardedBy("activityTrackerLock")

    /* renamed from: c */
    private boolean f20155c = false;

    /* renamed from: a */
    public final Activity mo18168a() {
        synchronized (this.f20153a) {
            C8412zn znVar = this.f20154b;
            if (znVar == null) {
                return null;
            }
            Activity a = znVar.mo36084a();
            return a;
        }
    }

    /* renamed from: b */
    public final Context mo18169b() {
        synchronized (this.f20153a) {
            C8412zn znVar = this.f20154b;
            if (znVar == null) {
                return null;
            }
            Context b = znVar.mo36085b();
            return b;
        }
    }

    /* renamed from: c */
    public final void mo18170c(C7510ao aoVar) {
        synchronized (this.f20153a) {
            if (this.f20154b == null) {
                this.f20154b = new C8412zn();
            }
            this.f20154b.mo36086f(aoVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18171d(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f20153a
            monitor-enter(r0)
            boolean r1 = r3.f20155c     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0032
            android.content.Context r1 = r4.getApplicationContext()     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x000e
            r1 = r4
        L_0x000e:
            boolean r2 = r1 instanceof android.app.Application     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x0015
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x0034 }
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            if (r1 != 0) goto L_0x001f
            java.lang.String r4 = "Can not cast Context to Application"
            com.google.android.gms.internal.ads.co0.zzj(r4)     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x001f:
            com.google.android.gms.internal.ads.zn r2 = r3.f20154b     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.zn r2 = new com.google.android.gms.internal.ads.zn     // Catch:{ all -> 0x0034 }
            r2.<init>()     // Catch:{ all -> 0x0034 }
            r3.f20154b = r2     // Catch:{ all -> 0x0034 }
        L_0x002a:
            com.google.android.gms.internal.ads.zn r2 = r3.f20154b     // Catch:{ all -> 0x0034 }
            r2.mo36087g(r1, r4)     // Catch:{ all -> 0x0034 }
            r4 = 1
            r3.f20155c = r4     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4608bo.mo18171d(android.content.Context):void");
    }

    /* renamed from: e */
    public final void mo18172e(C7510ao aoVar) {
        synchronized (this.f20153a) {
            C8412zn znVar = this.f20154b;
            if (znVar != null) {
                znVar.mo36088h(aoVar);
            }
        }
    }
}

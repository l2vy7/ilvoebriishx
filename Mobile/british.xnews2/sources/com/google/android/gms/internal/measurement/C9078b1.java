package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.b1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public final class C9078b1 extends C9171h1 {

    /* renamed from: b */
    private final AtomicReference f44897b = new AtomicReference();

    /* renamed from: c */
    private boolean f44898c;

    /* renamed from: m6 */
    public static final Object m42642m6(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", new Object[]{cls.getCanonicalName(), obj.getClass().getCanonicalName()}), e);
            throw e;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* renamed from: b2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo37382b2(long r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.f44897b
            monitor-enter(r0)
            boolean r1 = r2.f44898c     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicReference r1 = r2.f44897b     // Catch:{ InterruptedException -> 0x000d }
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x000d }
            goto L_0x0010
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            r3 = 0
            return r3
        L_0x0010:
            java.util.concurrent.atomic.AtomicReference r3 = r2.f44897b     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x001a }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r3
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C9078b1.mo37382b2(long):android.os.Bundle");
    }

    /* renamed from: e */
    public final void mo37383e(Bundle bundle) {
        synchronized (this.f44897b) {
            try {
                this.f44897b.set(bundle);
                this.f44898c = true;
                this.f44897b.notify();
            } catch (Throwable th) {
                this.f44897b.notify();
                throw th;
            }
        }
    }

    /* renamed from: f3 */
    public final String mo37384f3(long j) {
        return (String) m42642m6(mo37382b2(j), String.class);
    }
}

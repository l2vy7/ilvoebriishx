package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.ads.d33;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzbz {

    /* renamed from: a */
    private HandlerThread f27870a = null;

    /* renamed from: b */
    private Handler f27871b = null;

    /* renamed from: c */
    private int f27872c = 0;

    /* renamed from: d */
    private final Object f27873d = new Object();

    public final Handler zza() {
        return this.f27871b;
    }

    public final Looper zzb() {
        Looper looper;
        synchronized (this.f27873d) {
            if (this.f27872c != 0) {
                C4604n.m20099l(this.f27870a, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f27870a == null) {
                zze.zza("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.f27870a = handlerThread;
                handlerThread.start();
                this.f27871b = new d33(this.f27870a.getLooper());
                zze.zza("Looper thread started.");
            } else {
                zze.zza("Resuming the looper thread");
                this.f27873d.notifyAll();
            }
            this.f27872c++;
            looper = this.f27870a.getLooper();
        }
        return looper;
    }
}

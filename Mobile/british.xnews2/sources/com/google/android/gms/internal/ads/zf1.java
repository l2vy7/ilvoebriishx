package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class zf1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ bg1 f42461b;

    /* renamed from: c */
    public final /* synthetic */ Object f42462c;

    public /* synthetic */ zf1(bg1 bg1, Object obj) {
        this.f42461b = bg1;
        this.f42462c = obj;
    }

    public final void run() {
        try {
            this.f42461b.zza(this.f42462c);
        } catch (Throwable th) {
            zzt.zzo().mo18591r(th, "EventEmitter.notify");
            zze.zzb("Event emitter exception.", th);
        }
    }
}

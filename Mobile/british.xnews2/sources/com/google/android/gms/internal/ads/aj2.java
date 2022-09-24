package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class aj2 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zi2 f29655b;

    /* renamed from: c */
    public final /* synthetic */ long f29656c;

    public /* synthetic */ aj2(zi2 zi2, long j) {
        this.f29655b = zi2;
        this.f29656c = j;
    }

    public final void run() {
        zi2 zi2 = this.f29655b;
        long j = this.f29656c;
        String canonicalName = zi2.getClass().getCanonicalName();
        long elapsedRealtime = zzt.zzA().elapsedRealtime();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
        sb.append("Signal runtime : ");
        sb.append(canonicalName);
        sb.append(" = ");
        sb.append(elapsedRealtime - j);
        zze.zza(sb.toString());
    }
}

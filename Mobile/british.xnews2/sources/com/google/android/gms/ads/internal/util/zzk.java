package com.google.android.gms.ads.internal.util;

import android.net.Uri;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.d33;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class zzk implements Callable {
    public final /* synthetic */ Uri zza;

    public /* synthetic */ zzk(Uri uri) {
        this.zza = uri;
    }

    public final Object call() {
        Uri uri = this.zza;
        d33 d33 = zzt.zza;
        zzt.zzp();
        return zzt.zzS(uri);
    }
}

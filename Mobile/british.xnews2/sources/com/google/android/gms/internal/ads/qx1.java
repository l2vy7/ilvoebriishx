package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class qx1 implements xa3<String> {

    /* renamed from: a */
    final /* synthetic */ tx1 f20665a;

    qx1(tx1 tx1) {
        this.f20665a = tx1;
    }

    public final void zza(Throwable th) {
        synchronized (this) {
            this.f20665a.f39564c = true;
            this.f20665a.m38055u("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (zzt.zzA().elapsedRealtime() - this.f20665a.f39565d));
            this.f20665a.f39566e.zze(new Exception());
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        String str = (String) obj;
        synchronized (this) {
            this.f20665a.f39564c = true;
            this.f20665a.m38055u("com.google.android.gms.ads.MobileAds", true, "", (int) (zzt.zzA().elapsedRealtime() - this.f20665a.f39565d));
            this.f20665a.f39570i.execute(new px1(this, str));
        }
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class ss1 implements kv0 {

    /* renamed from: b */
    public final /* synthetic */ uo0 f39050b;

    public /* synthetic */ ss1(uo0 uo0) {
        this.f39050b = uo0;
    }

    public final void zza(boolean z) {
        uo0 uo0 = this.f39050b;
        if (z) {
            uo0.zzd(null);
        } else {
            uo0.zze(new Exception("Ad Web View failed to load."));
        }
    }
}

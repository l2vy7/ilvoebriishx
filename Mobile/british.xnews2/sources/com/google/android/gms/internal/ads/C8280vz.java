package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;

/* renamed from: com.google.android.gms.internal.ads.vz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8280vz extends C7884ky {

    /* renamed from: b */
    private final VideoController.VideoLifecycleCallbacks f40591b;

    public C8280vz(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.f40591b = videoLifecycleCallbacks;
    }

    /* renamed from: d5 */
    public final void mo32996d5(boolean z) {
        this.f40591b.onVideoMute(z);
    }

    public final void zze() {
        this.f40591b.onVideoEnd();
    }

    public final void zzg() {
        this.f40591b.onVideoPause();
    }

    public final void zzh() {
        this.f40591b.onVideoPlay();
    }

    public final void zzi() {
        this.f40591b.onVideoStart();
    }
}

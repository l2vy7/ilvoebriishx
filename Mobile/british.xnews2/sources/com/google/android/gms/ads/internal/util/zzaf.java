package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzaf {

    /* renamed from: a */
    private boolean f27822a = false;

    /* renamed from: b */
    private float f27823b = 1.0f;

    /* renamed from: a */
    private final synchronized boolean m28799a() {
        return this.f27823b >= 0.0f;
    }

    public static float zzb(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return ((float) streamVolume) / ((float) streamMaxVolume);
    }

    public final synchronized float zza() {
        if (!m28799a()) {
            return 1.0f;
        }
        return this.f27823b;
    }

    public final synchronized void zzc(boolean z) {
        this.f27822a = z;
    }

    public final synchronized void zzd(float f) {
        this.f27823b = f;
    }

    public final synchronized boolean zze() {
        return this.f27822a;
    }
}

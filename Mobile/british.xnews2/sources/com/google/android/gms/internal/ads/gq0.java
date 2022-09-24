package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.util.zzt;
import java.util.concurrent.TimeUnit;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gq0 {

    /* renamed from: a */
    private final long f32394a = TimeUnit.MILLISECONDS.toNanos(((Long) C8311wv.m39277c().mo18570b(p00.f37249y)).longValue());

    /* renamed from: b */
    private long f32395b;

    /* renamed from: c */
    private boolean f32396c = true;

    gq0() {
    }

    /* renamed from: a */
    public final void mo32218a(SurfaceTexture surfaceTexture, rp0 rp0) {
        if (rp0 != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.f32396c || Math.abs(timestamp - this.f32395b) >= this.f32394a) {
                this.f32396c = false;
                this.f32395b = timestamp;
                zzt.zza.post(new fq0(this, rp0));
            }
        }
    }

    /* renamed from: b */
    public final void mo32219b() {
        this.f32396c = true;
    }
}

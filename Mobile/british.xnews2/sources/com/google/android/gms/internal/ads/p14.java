package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class p14 extends AudioTrack.StreamEventCallback {

    /* renamed from: a */
    final /* synthetic */ r14 f37282a;

    /* renamed from: b */
    final /* synthetic */ q14 f37283b;

    p14(q14 q14, r14 r14) {
        this.f37283b = q14;
        this.f37282a = r14;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        nu1.m20747f(audioTrack == this.f37283b.f37835c.f38489n);
        if (this.f37283b.f37835c.f38486k != null && this.f37283b.f37835c.f38468I) {
            this.f37283b.f37835c.f38486k.zzb();
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        nu1.m20747f(audioTrack == this.f37283b.f37835c.f38489n);
        if (this.f37283b.f37835c.f38486k != null && this.f37283b.f37835c.f38468I) {
            this.f37283b.f37835c.f38486k.zzb();
        }
    }
}

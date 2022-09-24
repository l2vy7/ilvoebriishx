package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
/* renamed from: com.google.android.gms.internal.ads.rf */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8120rf extends C8084qf {

    /* renamed from: j */
    private final AudioTimestamp f38648j = new AudioTimestamp();

    /* renamed from: k */
    private long f38649k;

    /* renamed from: l */
    private long f38650l;

    /* renamed from: m */
    private long f38651m;

    public C8120rf() {
        super((C8048pf) null);
    }

    /* renamed from: c */
    public final long mo34329c() {
        return this.f38651m;
    }

    /* renamed from: d */
    public final long mo34330d() {
        return this.f38648j.nanoTime;
    }

    /* renamed from: g */
    public final void mo34333g(AudioTrack audioTrack, boolean z) {
        super.mo34333g(audioTrack, z);
        this.f38649k = 0;
        this.f38650l = 0;
        this.f38651m = 0;
    }

    /* renamed from: h */
    public final boolean mo34334h() {
        boolean timestamp = this.f38003a.getTimestamp(this.f38648j);
        if (timestamp) {
            long j = this.f38648j.framePosition;
            if (this.f38650l > j) {
                this.f38649k++;
            }
            this.f38650l = j;
            this.f38651m = j + (this.f38649k << 32);
        }
        return timestamp;
    }
}

package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class a14 {

    /* renamed from: a */
    private final AudioTrack f29495a;

    /* renamed from: b */
    private final AudioTimestamp f29496b = new AudioTimestamp();

    /* renamed from: c */
    private long f29497c;

    /* renamed from: d */
    private long f29498d;

    /* renamed from: e */
    private long f29499e;

    public a14(AudioTrack audioTrack) {
        this.f29495a = audioTrack;
    }

    /* renamed from: a */
    public final long mo30287a() {
        return this.f29499e;
    }

    /* renamed from: b */
    public final long mo30288b() {
        return this.f29496b.nanoTime / 1000;
    }

    /* renamed from: c */
    public final boolean mo30289c() {
        boolean timestamp = this.f29495a.getTimestamp(this.f29496b);
        if (timestamp) {
            long j = this.f29496b.framePosition;
            if (this.f29498d > j) {
                this.f29497c++;
            }
            this.f29498d = j;
            this.f29499e = j + (this.f29497c << 32);
        }
        return timestamp;
    }
}

package com.google.ads.interactivemedia.p038v3.internal;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: com.google.ads.interactivemedia.v3.internal.oj */
/* compiled from: IMASDK */
final class C4233oj {

    /* renamed from: a */
    private final AudioTrack f18158a;

    /* renamed from: b */
    private final AudioTimestamp f18159b = new AudioTimestamp();

    /* renamed from: c */
    private long f18160c;

    /* renamed from: d */
    private long f18161d;

    /* renamed from: e */
    private long f18162e;

    public C4233oj(AudioTrack audioTrack) {
        this.f18158a = audioTrack;
    }

    /* renamed from: a */
    public final boolean mo16436a() {
        boolean timestamp = this.f18158a.getTimestamp(this.f18159b);
        if (timestamp) {
            long j = this.f18159b.framePosition;
            if (this.f18161d > j) {
                this.f18160c++;
            }
            this.f18161d = j;
            this.f18162e = j + (this.f18160c << 32);
        }
        return timestamp;
    }

    /* renamed from: b */
    public final long mo16437b() {
        return this.f18159b.nanoTime / 1000;
    }

    /* renamed from: c */
    public final long mo16438c() {
        return this.f18162e;
    }
}

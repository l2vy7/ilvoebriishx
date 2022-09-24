package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.android.gms.internal.ads.qf */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class C8084qf {

    /* renamed from: a */
    protected AudioTrack f38003a;

    /* renamed from: b */
    private boolean f38004b;

    /* renamed from: c */
    private int f38005c;

    /* renamed from: d */
    private long f38006d;

    /* renamed from: e */
    private long f38007e;

    /* renamed from: f */
    private long f38008f;

    /* renamed from: g */
    private long f38009g;

    /* renamed from: h */
    private long f38010h;

    /* renamed from: i */
    private long f38011i;

    /* synthetic */ C8084qf(C8048pf pfVar) {
    }

    /* renamed from: a */
    public final long mo34327a() {
        if (this.f38009g != C6540C.TIME_UNSET) {
            return Math.min(this.f38011i, this.f38010h + ((((SystemClock.elapsedRealtime() * 1000) - this.f38009g) * ((long) this.f38005c)) / 1000000));
        }
        int playState = this.f38003a.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = ((long) this.f38003a.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f38004b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f38008f = this.f38006d;
            }
            playbackHeadPosition += this.f38008f;
        }
        if (this.f38006d > playbackHeadPosition) {
            this.f38007e++;
        }
        this.f38006d = playbackHeadPosition;
        return playbackHeadPosition + (this.f38007e << 32);
    }

    /* renamed from: b */
    public final long mo34328b() {
        return (mo34327a() * 1000000) / ((long) this.f38005c);
    }

    /* renamed from: c */
    public long mo34329c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public long mo34330d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final void mo34331e(long j) {
        this.f38010h = mo34327a();
        this.f38009g = SystemClock.elapsedRealtime() * 1000;
        this.f38011i = j;
        this.f38003a.stop();
    }

    /* renamed from: f */
    public final void mo34332f() {
        if (this.f38009g == C6540C.TIME_UNSET) {
            this.f38003a.pause();
        }
    }

    /* renamed from: g */
    public void mo34333g(AudioTrack audioTrack, boolean z) {
        this.f38003a = audioTrack;
        this.f38004b = z;
        this.f38009g = C6540C.TIME_UNSET;
        this.f38006d = 0;
        this.f38007e = 0;
        this.f38008f = 0;
        if (audioTrack != null) {
            this.f38005c = audioTrack.getSampleRate();
        }
    }

    /* renamed from: h */
    public boolean mo34334h() {
        return false;
    }
}

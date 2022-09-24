package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class b14 {

    /* renamed from: a */
    private final a14 f29862a;

    /* renamed from: b */
    private int f29863b;

    /* renamed from: c */
    private long f29864c;

    /* renamed from: d */
    private long f29865d;

    /* renamed from: e */
    private long f29866e;

    /* renamed from: f */
    private long f29867f;

    public b14(AudioTrack audioTrack) {
        if (d13.f20195a >= 19) {
            this.f29862a = new a14(audioTrack);
            mo30594e();
            return;
        }
        this.f29862a = null;
        m30574h(3);
    }

    /* renamed from: h */
    private final void m30574h(int i) {
        this.f29863b = i;
        long j = ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS;
        if (i == 0) {
            this.f29866e = 0;
            this.f29867f = -1;
            this.f29864c = System.nanoTime() / 1000;
        } else if (i != 1) {
            j = (i == 2 || i == 3) ? 10000000 : 500000;
        } else {
            this.f29865d = ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS;
            return;
        }
        this.f29865d = j;
    }

    @TargetApi(19)
    /* renamed from: a */
    public final long mo30590a() {
        a14 a14 = this.f29862a;
        if (a14 != null) {
            return a14.mo30287a();
        }
        return -1;
    }

    @TargetApi(19)
    /* renamed from: b */
    public final long mo30591b() {
        a14 a14 = this.f29862a;
        return a14 != null ? a14.mo30288b() : C6540C.TIME_UNSET;
    }

    /* renamed from: c */
    public final void mo30592c() {
        if (this.f29863b == 4) {
            mo30594e();
        }
    }

    /* renamed from: d */
    public final void mo30593d() {
        m30574h(4);
    }

    /* renamed from: e */
    public final void mo30594e() {
        if (this.f29862a != null) {
            m30574h(0);
        }
    }

    /* renamed from: f */
    public final boolean mo30595f() {
        return this.f29863b == 2;
    }

    @TargetApi(19)
    /* renamed from: g */
    public final boolean mo30596g(long j) {
        a14 a14 = this.f29862a;
        if (a14 != null && j - this.f29866e >= this.f29865d) {
            this.f29866e = j;
            boolean c = a14.mo30289c();
            int i = this.f29863b;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3 && c) {
                            mo30594e();
                            return true;
                        }
                    } else if (!c) {
                        mo30594e();
                        return false;
                    }
                } else if (!c) {
                    mo30594e();
                } else if (this.f29862a.mo30287a() > this.f29867f) {
                    m30574h(2);
                    return true;
                }
            } else if (c) {
                if (this.f29862a.mo30288b() < this.f29864c) {
                    return false;
                }
                this.f29867f = this.f29862a.mo30287a();
                m30574h(1);
                return true;
            } else if (j - this.f29864c > 500000) {
                m30574h(3);
            }
            return c;
        }
        return false;
    }
}

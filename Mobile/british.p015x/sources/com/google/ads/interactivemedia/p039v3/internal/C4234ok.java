package com.google.ads.interactivemedia.p039v3.internal;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ok */
/* compiled from: IMASDK */
final class C4234ok {

    /* renamed from: a */
    private final C4233oj f18163a;

    /* renamed from: b */
    private int f18164b;

    /* renamed from: c */
    private long f18165c;

    /* renamed from: d */
    private long f18166d;

    /* renamed from: e */
    private long f18167e;

    /* renamed from: f */
    private long f18168f;

    public C4234ok(AudioTrack audioTrack) {
        if (amm.f15298a >= 19) {
            this.f18163a = new C4233oj(audioTrack);
            mo16443e();
            return;
        }
        this.f18163a = null;
        m18347h(3);
    }

    /* renamed from: h */
    private final void m18347h(int i) {
        this.f18164b = i;
        if (i == 0) {
            this.f18167e = 0;
            this.f18168f = -1;
            this.f18165c = System.nanoTime() / 1000;
            this.f18166d = ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS;
        } else if (i == 1) {
            this.f18166d = ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS;
        } else if (i == 2 || i == 3) {
            this.f18166d = 10000000;
        } else {
            this.f18166d = 500000;
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    public final boolean mo16439a(long j) {
        C4233oj ojVar = this.f18163a;
        if (ojVar != null && j - this.f18167e >= this.f18166d) {
            this.f18167e = j;
            boolean a = ojVar.mo16436a();
            int i = this.f18164b;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3 && a) {
                            mo16443e();
                            return true;
                        }
                    } else if (!a) {
                        mo16443e();
                        return false;
                    }
                } else if (!a) {
                    mo16443e();
                } else if (this.f18163a.mo16438c() > this.f18168f) {
                    m18347h(2);
                    return true;
                }
            } else if (a) {
                if (this.f18163a.mo16437b() < this.f18165c) {
                    return false;
                }
                this.f18168f = this.f18163a.mo16438c();
                m18347h(1);
                return true;
            } else if (j - this.f18165c > 500000) {
                m18347h(3);
            }
            return a;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo16440b() {
        m18347h(4);
    }

    /* renamed from: c */
    public final void mo16441c() {
        if (this.f18164b == 4) {
            mo16443e();
        }
    }

    /* renamed from: d */
    public final boolean mo16442d() {
        return this.f18164b == 2;
    }

    /* renamed from: e */
    public final void mo16443e() {
        if (this.f18163a != null) {
            m18347h(0);
        }
    }

    @TargetApi(19)
    /* renamed from: f */
    public final long mo16444f() {
        C4233oj ojVar = this.f18163a;
        return ojVar != null ? ojVar.mo16437b() : C6540C.TIME_UNSET;
    }

    @TargetApi(19)
    /* renamed from: g */
    public final long mo16445g() {
        C4233oj ojVar = this.f18163a;
        if (ojVar != null) {
            return ojVar.mo16438c();
        }
        return -1;
    }
}

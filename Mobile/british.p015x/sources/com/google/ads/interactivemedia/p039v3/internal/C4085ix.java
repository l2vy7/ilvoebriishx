package com.google.ads.interactivemedia.p039v3.internal;

import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.DefaultRenderersFactory;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ix */
/* compiled from: IMASDK */
public final class C4085ix {

    /* renamed from: a */
    private final ajl f17485a;

    /* renamed from: b */
    private final long f17486b = C4083iv.m17452b(50000);

    /* renamed from: c */
    private final long f17487c = C4083iv.m17452b(50000);

    /* renamed from: d */
    private final long f17488d = C4083iv.m17452b(2500);

    /* renamed from: e */
    private final long f17489e = C4083iv.m17452b(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);

    /* renamed from: f */
    private final long f17490f = C4083iv.m17452b(0);

    /* renamed from: g */
    private int f17491g = 13107200;

    /* renamed from: h */
    private boolean f17492h;

    public C4085ix() {
        ajl ajl = new ajl();
        m17463j(2500, 0, "bufferForPlaybackMs", SessionDescription.SUPPORTED_SDP_VERSION);
        m17463j(5000, 0, "bufferForPlaybackAfterRebufferMs", SessionDescription.SUPPORTED_SDP_VERSION);
        m17463j(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        m17463j(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m17463j(50000, 50000, "maxBufferMs", "minBufferMs");
        m17463j(0, 0, "backBufferDurationMs", SessionDescription.SUPPORTED_SDP_VERSION);
        this.f17485a = ajl;
    }

    /* renamed from: i */
    private final void m17462i(boolean z) {
        this.f17491g = 13107200;
        this.f17492h = false;
        if (z) {
            this.f17485a.mo13815a();
        }
    }

    /* renamed from: j */
    private static void m17463j(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        StringBuilder sb = new StringBuilder(str.length() + 21 + str2.length());
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        aup.m14886q(z, sb.toString());
    }

    /* renamed from: a */
    public final void mo15969a() {
        m17462i(false);
    }

    /* renamed from: b */
    public final void mo15970b() {
        m17462i(true);
    }

    /* renamed from: c */
    public final void mo15971c() {
        m17462i(true);
    }

    /* renamed from: d */
    public final long mo15972d() {
        return this.f17490f;
    }

    /* renamed from: e */
    public final boolean mo15973e(long j, float f, boolean z, long j2) {
        long j3;
        long O = amm.m14198O(j, f);
        if (z) {
            j3 = this.f17489e;
        } else {
            j3 = this.f17488d;
        }
        if (j2 != C6540C.TIME_UNSET) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || O >= j3 || this.f17485a.mo13821g() >= this.f17491g;
    }

    /* renamed from: f */
    public final ajl mo15974f() {
        return this.f17485a;
    }

    /* renamed from: g */
    public final void mo15975g(C4156ln[] lnVarArr, aih[] aihArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = lnVarArr.length;
            int i3 = 13107200;
            if (i < 2) {
                if (aihArr[i] != null) {
                    if (lnVarArr[i].mo15945a() != 1) {
                        i3 = DefaultLoadControl.DEFAULT_VIDEO_BUFFER_SIZE;
                    }
                    i2 += i3;
                }
                i++;
            } else {
                int max = Math.max(13107200, i2);
                this.f17491g = max;
                this.f17485a.mo13816b(max);
                return;
            }
        }
    }

    /* renamed from: h */
    public final boolean mo15976h(long j, float f) {
        int g = this.f17485a.mo13821g();
        int i = this.f17491g;
        long j2 = this.f17486b;
        if (f > 1.0f) {
            j2 = Math.min(amm.m14197N(j2, f), this.f17487c);
        }
        boolean z = false;
        if (j < Math.max(j2, 500000)) {
            if (g < i) {
                z = true;
            }
            this.f17492h = z;
            if (!z && j < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= this.f17487c || g >= i) {
            this.f17492h = false;
        }
        return this.f17492h;
    }
}

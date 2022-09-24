package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.DefaultRenderersFactory;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rg3 implements nw3 {

    /* renamed from: a */
    private final o84 f38669a;

    /* renamed from: b */
    private final long f38670b = xy3.m39691c(50000);

    /* renamed from: c */
    private final long f38671c = xy3.m39691c(50000);

    /* renamed from: d */
    private final long f38672d = xy3.m39691c(2500);

    /* renamed from: e */
    private final long f38673e = xy3.m39691c(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);

    /* renamed from: f */
    private final long f38674f = xy3.m39691c(0);

    /* renamed from: g */
    private int f38675g = 13107200;

    /* renamed from: h */
    private boolean f38676h;

    public rg3() {
        o84 o84 = new o84(true, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
        m37092d(2500, 0, "bufferForPlaybackMs", SessionDescription.SUPPORTED_SDP_VERSION);
        m37092d(5000, 0, "bufferForPlaybackAfterRebufferMs", SessionDescription.SUPPORTED_SDP_VERSION);
        m37092d(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        m37092d(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m37092d(50000, 50000, "maxBufferMs", "minBufferMs");
        m37092d(0, 0, "backBufferDurationMs", SessionDescription.SUPPORTED_SDP_VERSION);
        this.f38669a = o84;
    }

    /* renamed from: d */
    private static void m37092d(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        StringBuilder sb = new StringBuilder(str.length() + 21 + str2.length());
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        nu1.m20746e(z, sb.toString());
    }

    /* renamed from: e */
    private final void m37093e(boolean z) {
        this.f38675g = 13107200;
        this.f38676h = false;
        if (z) {
            this.f38669a.mo33855e();
        }
    }

    /* renamed from: a */
    public final void mo33773a(hx3[] hx3Arr, cm0 cm0, e74[] e74Arr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 13107200;
            if (i < 2) {
                if (e74Arr[i] != null) {
                    if (hx3Arr[i].zzb() != 1) {
                        i3 = DefaultLoadControl.DEFAULT_VIDEO_BUFFER_SIZE;
                    }
                    i2 += i3;
                }
                i++;
            } else {
                int max = Math.max(13107200, i2);
                this.f38675g = max;
                this.f38669a.mo33856f(max);
                return;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo33774b(long j, float f, boolean z, long j2) {
        long j3;
        long X = d13.m20293X(j, f);
        if (z) {
            j3 = this.f38673e;
        } else {
            j3 = this.f38672d;
        }
        if (j2 != C6540C.TIME_UNSET) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || X >= j3 || this.f38669a.mo33851a() >= this.f38675g;
    }

    /* renamed from: c */
    public final boolean mo33775c(long j, long j2, float f) {
        int a = this.f38669a.mo33851a();
        int i = this.f38675g;
        long j3 = this.f38670b;
        if (f > 1.0f) {
            j3 = Math.min(d13.m20291V(j3, f), this.f38671c);
        }
        boolean z = false;
        if (j2 < Math.max(j3, 500000)) {
            if (a < i) {
                z = true;
            }
            this.f38676h = z;
            if (!z && j2 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.f38671c || a >= i) {
            this.f38676h = false;
        }
        return this.f38676h;
    }

    public final long zza() {
        return this.f38674f;
    }

    public final void zzb() {
        m37093e(false);
    }

    public final void zzc() {
        m37093e(true);
    }

    public final void zzd() {
        m37093e(true);
    }

    public final boolean zze() {
        return false;
    }

    public final o84 zzh() {
        return this.f38669a;
    }
}

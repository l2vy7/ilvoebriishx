package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class bt0 implements yd1 {

    /* renamed from: a */
    private final yd1 f30101a;

    /* renamed from: b */
    private final long f30102b;

    /* renamed from: c */
    private final yd1 f30103c;

    /* renamed from: d */
    private long f30104d;

    /* renamed from: e */
    private Uri f30105e;

    bt0(yd1 yd1, int i, yd1 yd12) {
        this.f30101a = yd1;
        this.f30102b = (long) i;
        this.f30103c = yd12;
    }

    /* renamed from: b */
    public final int mo30477b(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.f30104d;
        long j2 = this.f30102b;
        if (j < j2) {
            int b = this.f30101a.mo30477b(bArr, i, (int) Math.min((long) i2, j2 - j));
            long j3 = this.f30104d + ((long) b);
            this.f30104d = j3;
            i3 = b;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.f30102b) {
            return i3;
        }
        int b2 = this.f30103c.mo30477b(bArr, i + i3, i2 - i3);
        this.f30104d += (long) b2;
        return i3 + b2;
    }

    /* renamed from: h */
    public final void mo30796h(mt1 mt1) {
    }

    /* renamed from: i */
    public final long mo30478i(ci1 ci1) throws IOException {
        ci1 ci12;
        ci1 ci13 = ci1;
        this.f30105e = ci13.f30390a;
        long j = ci13.f30395f;
        long j2 = this.f30102b;
        ci1 ci14 = null;
        if (j >= j2) {
            ci12 = null;
        } else {
            long j3 = ci13.f30396g;
            ci12 = new ci1(ci13.f30390a, (byte[]) null, j, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, (String) null, 0);
        }
        long j4 = ci13.f30396g;
        if (j4 == -1 || ci13.f30395f + j4 > this.f30102b) {
            long max = Math.max(this.f30102b, ci13.f30395f);
            long j5 = ci13.f30396g;
            ci14 = new ci1(ci13.f30390a, (byte[]) null, max, max, j5 != -1 ? Math.min(j5, (ci13.f30395f + j5) - this.f30102b) : -1, (String) null, 0);
        }
        long j6 = 0;
        long i = ci12 != null ? this.f30101a.mo30478i(ci12) : 0;
        if (ci14 != null) {
            j6 = this.f30103c.mo30478i(ci14);
        }
        this.f30104d = ci13.f30395f;
        if (i == -1 || j6 == -1) {
            return -1;
        }
        return i + j6;
    }

    public final Map<String, List<String>> zza() {
        return t63.m21028e();
    }

    public final Uri zzi() {
        return this.f30105e;
    }

    public final void zzj() throws IOException {
        this.f30101a.zzj();
        this.f30103c.zzj();
    }
}

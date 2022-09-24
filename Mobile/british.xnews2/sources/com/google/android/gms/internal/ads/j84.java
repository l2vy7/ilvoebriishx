package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class j84 extends va1 {

    /* renamed from: e */
    private final byte[] f33804e;

    /* renamed from: f */
    private Uri f33805f;

    /* renamed from: g */
    private int f33806g;

    /* renamed from: h */
    private int f33807h;

    /* renamed from: i */
    private boolean f33808i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j84(byte[] bArr) {
        super(false);
        boolean z = false;
        Objects.requireNonNull(bArr);
        nu1.m20745d(bArr.length > 0 ? true : z);
        this.f33804e = bArr;
    }

    /* renamed from: b */
    public final int mo30477b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f33807h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.f33804e, this.f33806g, bArr, i, min);
        this.f33806g += min;
        this.f33807h -= min;
        mo35395j(min);
        return min;
    }

    /* renamed from: i */
    public final long mo30478i(ci1 ci1) throws IOException {
        this.f33805f = ci1.f30390a;
        mo35397l(ci1);
        long j = ci1.f30395f;
        int length = this.f33804e.length;
        if (j <= ((long) length)) {
            int i = (int) j;
            this.f33806g = i;
            int i2 = length - i;
            this.f33807h = i2;
            long j2 = ci1.f30396g;
            if (j2 != -1) {
                this.f33807h = (int) Math.min((long) i2, j2);
            }
            this.f33808i = true;
            mo35398m(ci1);
            long j3 = ci1.f30396g;
            return j3 != -1 ? j3 : (long) this.f33807h;
        }
        throw new ze1(AdError.REMOTE_ADS_SERVICE_ERROR);
    }

    public final Uri zzi() {
        return this.f33805f;
    }

    public final void zzj() {
        if (this.f33808i) {
            this.f33808i = false;
            mo35396k();
        }
        this.f33805f = null;
    }
}

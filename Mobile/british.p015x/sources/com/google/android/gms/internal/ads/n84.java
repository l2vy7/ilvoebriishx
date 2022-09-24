package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.URLDecoder;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class n84 extends va1 {

    /* renamed from: e */
    private ci1 f35949e;

    /* renamed from: f */
    private byte[] f35950f;

    /* renamed from: g */
    private int f35951g;

    /* renamed from: h */
    private int f35952h;

    public n84() {
        super(false);
    }

    /* renamed from: b */
    public final int mo30477b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f35952h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(d13.m20300c(this.f35950f), this.f35951g, bArr, i, min);
        this.f35951g += min;
        this.f35952h -= min;
        mo35395j(min);
        return min;
    }

    /* renamed from: i */
    public final long mo30478i(ci1 ci1) throws IOException {
        String str;
        mo35397l(ci1);
        this.f35949e = ci1;
        Uri uri = ci1.f30390a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        String valueOf = String.valueOf(scheme);
        if (valueOf.length() != 0) {
            str = "Unsupported scheme: ".concat(valueOf);
        } else {
            str = new String("Unsupported scheme: ");
        }
        nu1.m20746e(equals, str);
        String[] D = d13.m20273D(uri.getSchemeSpecificPart(), ",");
        if (D.length == 2) {
            String str2 = D[1];
            if (D[0].contains(";base64")) {
                try {
                    this.f35950f = Base64.decode(str2, 0);
                } catch (IllegalArgumentException e) {
                    String valueOf2 = String.valueOf(str2);
                    throw C7811iy.m33483b(valueOf2.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(valueOf2) : new String("Error while parsing Base64 encoded string: "), e);
                }
            } else {
                this.f35950f = d13.m20324w(URLDecoder.decode(str2, n33.f35885a.name()));
            }
            long j = ci1.f30395f;
            int length = this.f35950f.length;
            if (j <= ((long) length)) {
                int i = (int) j;
                this.f35951g = i;
                int i2 = length - i;
                this.f35952h = i2;
                long j2 = ci1.f30396g;
                if (j2 != -1) {
                    this.f35952h = (int) Math.min((long) i2, j2);
                }
                mo35398m(ci1);
                long j3 = ci1.f30396g;
                return j3 != -1 ? j3 : (long) this.f35952h;
            }
            this.f35950f = null;
            throw new ze1(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        throw C7811iy.m33483b("Unexpected URI format: ".concat(String.valueOf(uri)), (Throwable) null);
    }

    public final Uri zzi() {
        ci1 ci1 = this.f35949e;
        if (ci1 != null) {
            return ci1.f30390a;
        }
        return null;
    }

    public final void zzj() {
        if (this.f35950f != null) {
            this.f35950f = null;
            mo35396k();
        }
        this.f35949e = null;
    }
}

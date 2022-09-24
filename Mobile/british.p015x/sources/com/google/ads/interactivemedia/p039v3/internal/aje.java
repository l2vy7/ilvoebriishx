package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aje */
/* compiled from: IMASDK */
public final class aje extends aja {

    /* renamed from: a */
    private ajk f15039a;

    /* renamed from: b */
    private byte[] f15040b;

    /* renamed from: c */
    private int f15041c;

    /* renamed from: d */
    private int f15042d;

    public aje() {
        super(false);
    }

    /* renamed from: a */
    public final int mo13294a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f15042d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(amm.m14236f(this.f15040b), this.f15041c, bArr, i, min);
        this.f15041c += min;
        this.f15042d -= min;
        mo13798i(min);
        return min;
    }

    /* renamed from: c */
    public final long mo13296c(ajk ajk) throws IOException {
        String str;
        mo13796g(ajk);
        this.f15039a = ajk;
        Uri uri = ajk.f15056a;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            String valueOf = String.valueOf(scheme);
            if (valueOf.length() != 0) {
                str = "Unsupported scheme: ".concat(valueOf);
            } else {
                str = new String("Unsupported scheme: ");
            }
            throw new C4144lb(str);
        }
        String[] z = amm.m14256z(uri.getSchemeSpecificPart(), ",");
        if (z.length == 2) {
            String str2 = z[1];
            if (z[0].contains(";base64")) {
                try {
                    this.f15040b = Base64.decode(str2, 0);
                } catch (IllegalArgumentException e) {
                    String valueOf2 = String.valueOf(str2);
                    throw new C4144lb(valueOf2.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(valueOf2) : new String("Error while parsing Base64 encoded string: "), e);
                }
            } else {
                this.f15040b = amm.m14255y(URLDecoder.decode(str2, arm.f15613a.name()));
            }
            long j = ajk.f15060e;
            int length = this.f15040b.length;
            if (j <= ((long) length)) {
                int i = (int) j;
                this.f15041c = i;
                int i2 = length - i;
                this.f15042d = i2;
                long j2 = ajk.f15061f;
                if (j2 != -1) {
                    this.f15042d = (int) Math.min((long) i2, j2);
                }
                mo13797h(ajk);
                long j3 = ajk.f15061f;
                return j3 != -1 ? j3 : (long) this.f15042d;
            }
            this.f15040b = null;
            throw new ajh();
        }
        String valueOf3 = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(valueOf3.length() + 23);
        sb.append("Unexpected URI format: ");
        sb.append(valueOf3);
        throw new C4144lb(sb.toString());
    }

    /* renamed from: d */
    public final Uri mo13297d() {
        ajk ajk = this.f15039a;
        if (ajk != null) {
            return ajk.f15056a;
        }
        return null;
    }

    /* renamed from: f */
    public final void mo13299f() {
        if (this.f15040b != null) {
            this.f15040b = null;
            mo13799j();
        }
        this.f15039a = null;
    }
}

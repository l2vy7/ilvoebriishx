package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.bl */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7543bl implements C7613dl {

    /* renamed from: a */
    private final byte[] f30032a;

    /* renamed from: b */
    private Uri f30033b;

    /* renamed from: c */
    private int f30034c;

    /* renamed from: d */
    private int f30035d;

    public C7543bl(byte[] bArr) {
        Objects.requireNonNull(bArr);
        C8195tl.m37898c(bArr.length > 0);
        this.f30032a = bArr;
    }

    /* renamed from: a */
    public final int mo30699a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f30035d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.f30032a, this.f30034c, bArr, i, min);
        this.f30034c += min;
        this.f30035d -= min;
        return min;
    }

    /* renamed from: b */
    public final long mo30700b(C7687fl flVar) throws IOException {
        this.f30033b = flVar.f31785a;
        long j = flVar.f31787c;
        int i = (int) j;
        this.f30034c = i;
        long j2 = flVar.f31788d;
        int length = (int) (j2 == -1 ? ((long) this.f30032a.length) - j : j2);
        this.f30035d = length;
        if (length > 0 && i + length <= this.f30032a.length) {
            return (long) length;
        }
        int length2 = this.f30032a.length;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i);
        sb.append(", ");
        sb.append(j2);
        sb.append("], length: ");
        sb.append(length2);
        throw new IOException(sb.toString());
    }

    public final Uri zzc() {
        return this.f30033b;
    }

    public final void zzd() throws IOException {
        this.f30033b = null;
    }
}

package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.fl */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7687fl {

    /* renamed from: a */
    public final Uri f31785a;

    /* renamed from: b */
    public final long f31786b;

    /* renamed from: c */
    public final long f31787c;

    /* renamed from: d */
    public final long f31788d;

    public C7687fl(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = false;
        C8195tl.m37898c(j >= 0);
        C8195tl.m37898c(j2 >= 0);
        C8195tl.m37898c((j3 > 0 || j3 == -1) ? true : z);
        this.f31785a = uri;
        this.f31786b = j;
        this.f31787c = j2;
        this.f31788d = j3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f31785a);
        String arrays = Arrays.toString((byte[]) null);
        long j = this.f31786b;
        long j2 = this.f31787c;
        long j3 = this.f31788d;
        StringBuilder sb = new StringBuilder(valueOf.length() + 93 + String.valueOf(arrays).length() + 4);
        sb.append("DataSpec[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(arrays);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", null, 0]");
        return sb.toString();
    }
}

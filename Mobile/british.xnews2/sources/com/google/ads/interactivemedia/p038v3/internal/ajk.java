package com.google.ads.interactivemedia.p038v3.internal;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajk */
/* compiled from: IMASDK */
public final class ajk {

    /* renamed from: a */
    public final Uri f15056a;

    /* renamed from: b */
    public final int f15057b;

    /* renamed from: c */
    public final byte[] f15058c;

    /* renamed from: d */
    public final Map<String, String> f15059d;

    /* renamed from: e */
    public final long f15060e;

    /* renamed from: f */
    public final long f15061f;

    /* renamed from: g */
    public final int f15062g;

    private ajk(Uri uri, int i, byte[] bArr, Map<String, String> map, long j, long j2, int i2) {
        boolean z = false;
        boolean z2 = j >= 0;
        aup.m14885p(z2);
        aup.m14885p(z2);
        aup.m14885p((j2 > 0 || j2 == -1) ? true : z);
        this.f15056a = uri;
        this.f15057b = i;
        this.f15058c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f15059d = Collections.unmodifiableMap(new HashMap(map));
        this.f15060e = j;
        this.f15061f = j2;
        this.f15062g = i2;
    }

    /* renamed from: a */
    public static String m13851a(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public final boolean mo13812b(int i) {
        return (this.f15062g & i) == i;
    }

    /* renamed from: c */
    public final ajk mo13813c(long j) {
        long j2 = this.f15061f;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        long j4 = j3;
        return (j == 0 && j2 == j4) ? this : new ajk(this.f15056a, this.f15057b, this.f15058c, this.f15059d, this.f15060e + j, j4, this.f15062g);
    }

    public final String toString() {
        String a = m13851a(this.f15057b);
        String valueOf = String.valueOf(this.f15056a);
        long j = this.f15060e;
        long j2 = this.f15061f;
        int i = this.f15062g;
        int length = a.length();
        StringBuilder sb = new StringBuilder(length + 70 + valueOf.length() + "null".length());
        sb.append("DataSpec[");
        sb.append(a);
        sb.append(" ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append((String) null);
        sb.append(", ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    /* synthetic */ ajk(Uri uri, int i, byte[] bArr, Map map, long j, long j2, int i2, byte[] bArr2) {
        this(uri, i, bArr, map, j, j2, i2);
    }

    public ajk(Uri uri, long j, long j2) {
        this(uri, 1, (byte[]) null, Collections.emptyMap(), j, j2, 0);
    }
}

package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ci1 {

    /* renamed from: a */
    public final Uri f30390a;

    /* renamed from: b */
    public final int f30391b;

    /* renamed from: c */
    public final byte[] f30392c;

    /* renamed from: d */
    public final Map<String, String> f30393d;
    @Deprecated

    /* renamed from: e */
    public final long f30394e;

    /* renamed from: f */
    public final long f30395f;

    /* renamed from: g */
    public final long f30396g;

    /* renamed from: h */
    public final String f30397h;

    /* renamed from: i */
    public final int f30398i;

    private ci1(Uri uri, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, Object obj) {
        long j4 = j + j2;
        boolean z = false;
        nu1.m20745d(j4 >= 0);
        nu1.m20745d(j2 >= 0);
        nu1.m20745d((j3 > 0 || j3 == -1) ? true : z);
        this.f30390a = uri;
        this.f30391b = 1;
        this.f30392c = null;
        this.f30393d = Collections.unmodifiableMap(new HashMap(map));
        this.f30395f = j2;
        this.f30394e = j4;
        this.f30396g = j3;
        this.f30397h = null;
        this.f30398i = i2;
    }

    /* synthetic */ ci1(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj, bh1 bh1) {
        this(uri, 0, 1, (byte[]) null, map, j2, -1, (String) null, i2, (Object) null);
    }

    /* renamed from: a */
    public static String m31032a(int i) {
        return "GET";
    }

    /* renamed from: b */
    public final boolean mo30932b(int i) {
        return (this.f30398i & i) == i;
    }

    public final String toString() {
        String a = m31032a(1);
        String valueOf = String.valueOf(this.f30390a);
        long j = this.f30395f;
        long j2 = this.f30396g;
        int i = this.f30398i;
        StringBuilder sb = new StringBuilder(a.length() + 70 + valueOf.length() + 4);
        sb.append("DataSpec[");
        sb.append(a);
        sb.append(" ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", null, ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    @Deprecated
    public ci1(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        this(uri, j - j2, 1, (byte[]) null, Collections.emptyMap(), j2, j3, (String) null, i, (Object) null);
    }
}

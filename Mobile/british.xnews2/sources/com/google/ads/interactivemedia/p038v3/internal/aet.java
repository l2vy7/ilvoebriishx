package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aet */
/* compiled from: IMASDK */
public final class aet {

    /* renamed from: a */
    public final C4510yq[] f14465a;

    /* renamed from: b */
    public final long[] f14466b;

    /* renamed from: c */
    public final String f14467c;

    /* renamed from: d */
    public final String f14468d;

    public aet(String str, String str2, long[] jArr, C4510yq[] yqVarArr) {
        this.f14467c = str;
        this.f14468d = str2;
        this.f14466b = jArr;
        this.f14465a = yqVarArr;
    }

    /* renamed from: a */
    public final String mo13577a() {
        String str = this.f14467c;
        String str2 = this.f14468d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }
}

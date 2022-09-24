package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.m5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7929m5 {

    /* renamed from: a */
    private final String f35401a;

    /* renamed from: b */
    private final String f35402b;

    public C7929m5(String str, String str2) {
        this.f35401a = str;
        this.f35402b = str2;
    }

    /* renamed from: a */
    public final String mo33476a() {
        return this.f35401a;
    }

    /* renamed from: b */
    public final String mo33477b() {
        return this.f35402b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7929m5.class == obj.getClass()) {
            C7929m5 m5Var = (C7929m5) obj;
            return TextUtils.equals(this.f35401a, m5Var.f35401a) && TextUtils.equals(this.f35402b, m5Var.f35402b);
        }
    }

    public final int hashCode() {
        return (this.f35401a.hashCode() * 31) + this.f35402b.hashCode();
    }

    public final String toString() {
        String str = this.f35401a;
        String str2 = this.f35402b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}

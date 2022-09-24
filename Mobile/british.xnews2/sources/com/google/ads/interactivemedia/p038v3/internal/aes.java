package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aes */
/* compiled from: IMASDK */
public final class aes {

    /* renamed from: a */
    public final String f14462a;

    /* renamed from: b */
    public final String f14463b;

    /* renamed from: c */
    public final String f14464c;

    public aes(String str, String str2, String str3) {
        this.f14462a = str;
        this.f14463b = str2;
        this.f14464c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aes.class == obj.getClass()) {
            aes aes = (aes) obj;
            return amm.m14233c(this.f14462a, aes.f14462a) && amm.m14233c(this.f14463b, aes.f14463b) && amm.m14233c(this.f14464c, aes.f14464c);
        }
    }

    public final int hashCode() {
        int hashCode = this.f14462a.hashCode() * 31;
        String str = this.f14463b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14464c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }
}

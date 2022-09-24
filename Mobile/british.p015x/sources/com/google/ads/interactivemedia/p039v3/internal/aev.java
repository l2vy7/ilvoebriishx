package com.google.ads.interactivemedia.p039v3.internal;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aev */
/* compiled from: IMASDK */
public final class aev {

    /* renamed from: a */
    public final String f14473a;

    /* renamed from: b */
    public final String f14474b;

    /* renamed from: c */
    public final String f14475c;

    /* renamed from: d */
    public final String f14476d;

    /* renamed from: e */
    public final String f14477e;

    public aev(String str, String str2, String str3, String str4, String str5) {
        this.f14473a = str;
        this.f14474b = str2;
        this.f14475c = str3;
        this.f14476d = str4;
        this.f14477e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aev.class == obj.getClass()) {
            aev aev = (aev) obj;
            return amm.m14233c(this.f14473a, aev.f14473a) && amm.m14233c(this.f14474b, aev.f14474b) && amm.m14233c(this.f14475c, aev.f14475c) && amm.m14233c(this.f14476d, aev.f14476d) && amm.m14233c(this.f14477e, aev.f14477e);
        }
    }

    public final int hashCode() {
        String str = this.f14473a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f14474b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14475c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f14476d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f14477e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }
}

package com.google.ads.interactivemedia.p038v3.impl.data;

import com.google.ads.interactivemedia.p038v3.internal.ark;

@ark(mo14242a = C3818r.class)
/* renamed from: com.google.ads.interactivemedia.v3.impl.data.at */
/* compiled from: IMASDK */
public abstract class C3780at {
    public static C3780at create(String str, String str2, String str3, String str4) {
        return new C3818r(str, str2, str3, str4);
    }

    public abstract String addtlConsent();

    public abstract String gdprApplies();

    public abstract String tcString();

    public abstract String uspString();
}

package com.google.ads.interactivemedia.p038v3.impl.data;

import com.google.ads.interactivemedia.p038v3.api.UniversalAdId;
import com.google.ads.interactivemedia.p038v3.internal.bnh;
import com.google.ads.interactivemedia.p038v3.internal.bnj;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.bm */
/* compiled from: IMASDK */
public final class C3800bm implements UniversalAdId {
    private String adIdRegistry = C3791bd.UNKNOWN_CONTENT_TYPE;
    private String adIdValue = C3791bd.UNKNOWN_CONTENT_TYPE;

    public boolean equals(Object obj) {
        return bnh.m16832c(this, obj, new String[0]);
    }

    public String getAdIdRegistry() {
        return this.adIdRegistry;
    }

    public String getAdIdValue() {
        return this.adIdValue;
    }

    public int hashCode() {
        return bnj.m16840b(this, new String[0]);
    }

    public void setAdIdRegistry(String str) {
        this.adIdRegistry = str;
    }

    public void setAdIdValue(String str) {
        this.adIdValue = str;
    }

    public String toString() {
        String str = this.adIdValue;
        String str2 = this.adIdRegistry;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41 + String.valueOf(str2).length());
        sb.append("UniversalAdId [adIdValue=");
        sb.append(str);
        sb.append(", adIdRegistry=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}

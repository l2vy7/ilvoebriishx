package com.google.ads.interactivemedia.p039v3.impl.data;

import com.google.ads.interactivemedia.p039v3.api.CompanionAd;
import com.google.ads.interactivemedia.p039v3.internal.bnh;
import com.google.ads.interactivemedia.p039v3.internal.bnj;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.CompanionAdImpl */
/* compiled from: IMASDK */
public class CompanionAdImpl implements CompanionAd {
    private String apiFramework;
    private String resourceValue;
    private C3796bi size;

    public boolean equals(Object obj) {
        return bnh.m16832c(this, obj, new String[0]);
    }

    public String getApiFramework() {
        return this.apiFramework;
    }

    public int getHeight() {
        return this.size.height().intValue();
    }

    public String getResourceValue() {
        return this.resourceValue;
    }

    public int getWidth() {
        return this.size.width().intValue();
    }

    public int hashCode() {
        return bnj.m16840b(this, new String[0]);
    }

    /* access modifiers changed from: package-private */
    public void setApiFramework(String str) {
        this.apiFramework = str;
    }

    /* access modifiers changed from: package-private */
    public void setResourceValue(String str) {
        this.resourceValue = str;
    }

    /* access modifiers changed from: package-private */
    public void setSize(C3796bi biVar) {
        this.size = biVar;
    }

    public String toString() {
        String str = this.apiFramework;
        String str2 = this.resourceValue;
        String valueOf = String.valueOf(this.size.width());
        String valueOf2 = String.valueOf(this.size.height());
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 58 + length2 + valueOf.length() + valueOf2.length());
        sb.append("CompanionAd [apiFramework=");
        sb.append(str);
        sb.append(", resourceUrl=");
        sb.append(str2);
        sb.append(", width=");
        sb.append(valueOf);
        sb.append(", height=");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}

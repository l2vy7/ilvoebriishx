package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.internal.dc */
/* compiled from: IMASDK */
final class C3929dc extends C3918cs {
    private final int appVersion;
    private final String packageName;

    C3929dc(int i, String str) {
        this.appVersion = i;
        Objects.requireNonNull(str, "Null packageName");
        this.packageName = str;
    }

    public int appVersion() {
        return this.appVersion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3918cs) {
            C3918cs csVar = (C3918cs) obj;
            return this.appVersion == csVar.appVersion() && this.packageName.equals(csVar.packageName());
        }
    }

    public int hashCode() {
        return ((this.appVersion ^ 1000003) * 1000003) ^ this.packageName.hashCode();
    }

    public String packageName() {
        return this.packageName;
    }

    public String toString() {
        int i = this.appVersion;
        String str = this.packageName;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("MarketAppInfo{appVersion=");
        sb.append(i);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}

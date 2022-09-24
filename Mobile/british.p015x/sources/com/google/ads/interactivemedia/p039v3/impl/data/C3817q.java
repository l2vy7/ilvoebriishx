package com.google.ads.interactivemedia.p039v3.impl.data;

import java.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.q */
/* compiled from: IMASDK */
final class C3817q extends CompanionData {
    private final String clickThroughUrl;
    private final String size;
    private final String src;
    private final C3779as type;

    C3817q(String str, String str2, String str3, C3779as asVar) {
        Objects.requireNonNull(str, "Null size");
        this.size = str;
        Objects.requireNonNull(str2, "Null src");
        this.src = str2;
        Objects.requireNonNull(str3, "Null clickThroughUrl");
        this.clickThroughUrl = str3;
        Objects.requireNonNull(asVar, "Null type");
        this.type = asVar;
    }

    public String clickThroughUrl() {
        return this.clickThroughUrl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompanionData) {
            CompanionData companionData = (CompanionData) obj;
            return this.size.equals(companionData.size()) && this.src.equals(companionData.src()) && this.clickThroughUrl.equals(companionData.clickThroughUrl()) && this.type.equals(companionData.type());
        }
    }

    public int hashCode() {
        return ((((((this.size.hashCode() ^ 1000003) * 1000003) ^ this.src.hashCode()) * 1000003) ^ this.clickThroughUrl.hashCode()) * 1000003) ^ this.type.hashCode();
    }

    public String size() {
        return this.size;
    }

    public String src() {
        return this.src;
    }

    public C3779as type() {
        return this.type;
    }
}

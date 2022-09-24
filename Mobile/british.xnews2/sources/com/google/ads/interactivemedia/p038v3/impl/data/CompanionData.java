package com.google.ads.interactivemedia.p038v3.impl.data;

import com.google.ads.interactivemedia.p038v3.internal.ark;

@ark(mo14242a = C3817q.class)
/* renamed from: com.google.ads.interactivemedia.v3.impl.data.CompanionData */
/* compiled from: IMASDK */
public abstract class CompanionData {
    private String companionId;

    private static CompanionData create(String str, String str2, String str3, C3779as asVar) {
        return new C3817q(str, str2, str3, asVar);
    }

    public abstract String clickThroughUrl();

    public String companionId() {
        return this.companionId;
    }

    public abstract String size();

    public abstract String src();

    public final String toString() {
        String companionId2 = companionId();
        String size = size();
        String src = src();
        String clickThroughUrl = clickThroughUrl();
        String valueOf = String.valueOf(type());
        int length = String.valueOf(companionId2).length();
        int length2 = String.valueOf(size).length();
        int length3 = String.valueOf(src).length();
        StringBuilder sb = new StringBuilder(length + 66 + length2 + length3 + String.valueOf(clickThroughUrl).length() + valueOf.length());
        sb.append("CompanionData [companionId=");
        sb.append(companionId2);
        sb.append(", size=");
        sb.append(size);
        sb.append(", src=");
        sb.append(src);
        sb.append(", clickThroughUrl=");
        sb.append(clickThroughUrl);
        sb.append(", type=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public abstract C3779as type();

    public static CompanionData create(String str, String str2, String str3, String str4, C3779as asVar) {
        CompanionData create = create(str2, str3, str4, asVar);
        create.companionId = str;
        return create;
    }
}

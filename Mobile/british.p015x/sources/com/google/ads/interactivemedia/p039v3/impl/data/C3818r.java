package com.google.ads.interactivemedia.p039v3.impl.data;

import java.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.r */
/* compiled from: IMASDK */
final class C3818r extends C3780at {
    private final String addtlConsent;
    private final String gdprApplies;
    private final String tcString;
    private final String uspString;

    C3818r(String str, String str2, String str3, String str4) {
        Objects.requireNonNull(str, "Null gdprApplies");
        this.gdprApplies = str;
        Objects.requireNonNull(str2, "Null tcString");
        this.tcString = str2;
        Objects.requireNonNull(str3, "Null addtlConsent");
        this.addtlConsent = str3;
        Objects.requireNonNull(str4, "Null uspString");
        this.uspString = str4;
    }

    public String addtlConsent() {
        return this.addtlConsent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3780at) {
            C3780at atVar = (C3780at) obj;
            return this.gdprApplies.equals(atVar.gdprApplies()) && this.tcString.equals(atVar.tcString()) && this.addtlConsent.equals(atVar.addtlConsent()) && this.uspString.equals(atVar.uspString());
        }
    }

    public String gdprApplies() {
        return this.gdprApplies;
    }

    public int hashCode() {
        return ((((((this.gdprApplies.hashCode() ^ 1000003) * 1000003) ^ this.tcString.hashCode()) * 1000003) ^ this.addtlConsent.hashCode()) * 1000003) ^ this.uspString.hashCode();
    }

    public String tcString() {
        return this.tcString;
    }

    public String toString() {
        String str = this.gdprApplies;
        String str2 = this.tcString;
        String str3 = this.addtlConsent;
        String str4 = this.uspString;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 67 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("ConsentSettings{gdprApplies=");
        sb.append(str);
        sb.append(", tcString=");
        sb.append(str2);
        sb.append(", addtlConsent=");
        sb.append(str3);
        sb.append(", uspString=");
        sb.append(str4);
        sb.append("}");
        return sb.toString();
    }

    public String uspString() {
        return this.uspString;
    }
}

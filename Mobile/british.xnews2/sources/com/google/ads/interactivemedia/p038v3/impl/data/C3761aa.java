package com.google.ads.interactivemedia.p038v3.impl.data;

import java.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.aa */
/* compiled from: IMASDK */
final class C3761aa extends C3791bd {
    private final String content;
    private final String contentType;
    private final int errorCode;

    /* renamed from: id */
    private final String f13893id;

    C3761aa(String str, String str2, String str3, int i) {
        Objects.requireNonNull(str, "Null id");
        this.f13893id = str;
        Objects.requireNonNull(str2, "Null content");
        this.content = str2;
        Objects.requireNonNull(str3, "Null contentType");
        this.contentType = str3;
        this.errorCode = i;
    }

    public String content() {
        return this.content;
    }

    public String contentType() {
        return this.contentType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3791bd) {
            C3791bd bdVar = (C3791bd) obj;
            return this.f13893id.equals(bdVar.mo12943id()) && this.content.equals(bdVar.content()) && this.contentType.equals(bdVar.contentType()) && this.errorCode == bdVar.errorCode();
        }
    }

    public int errorCode() {
        return this.errorCode;
    }

    public int hashCode() {
        return ((((((this.f13893id.hashCode() ^ 1000003) * 1000003) ^ this.content.hashCode()) * 1000003) ^ this.contentType.hashCode()) * 1000003) ^ this.errorCode;
    }

    /* renamed from: id */
    public String mo12943id() {
        return this.f13893id;
    }

    public String toString() {
        String str = this.f13893id;
        String str2 = this.content;
        String str3 = this.contentType;
        int i = this.errorCode;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("NetworkResponseData{id=");
        sb.append(str);
        sb.append(", content=");
        sb.append(str2);
        sb.append(", contentType=");
        sb.append(str3);
        sb.append(", errorCode=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}

package com.google.ads.interactivemedia.p038v3.impl.data;

import java.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.z */
/* compiled from: IMASDK */
final class C3826z extends C3790bc {
    private final int connectionTimeoutMs;
    private final String content;

    /* renamed from: id */
    private final String f13899id;
    private final int readTimeoutMs;
    private final C3789bb requestType;
    private final String url;
    private final String userAgent;

    C3826z(C3789bb bbVar, String str, String str2, String str3, String str4, int i, int i2) {
        Objects.requireNonNull(bbVar, "Null requestType");
        this.requestType = bbVar;
        Objects.requireNonNull(str, "Null id");
        this.f13899id = str;
        Objects.requireNonNull(str2, "Null url");
        this.url = str2;
        this.content = str3;
        Objects.requireNonNull(str4, "Null userAgent");
        this.userAgent = str4;
        this.connectionTimeoutMs = i;
        this.readTimeoutMs = i2;
    }

    public int connectionTimeoutMs() {
        return this.connectionTimeoutMs;
    }

    public String content() {
        return this.content;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r1 = r4.content;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.ads.interactivemedia.p038v3.impl.data.C3790bc
            r2 = 0
            if (r1 == 0) goto L_0x0062
            com.google.ads.interactivemedia.v3.impl.data.bc r5 = (com.google.ads.interactivemedia.p038v3.impl.data.C3790bc) r5
            com.google.ads.interactivemedia.v3.impl.data.bb r1 = r4.requestType
            com.google.ads.interactivemedia.v3.impl.data.bb r3 = r5.requestType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0062
            java.lang.String r1 = r4.f13899id
            java.lang.String r3 = r5.mo13111id()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0062
            java.lang.String r1 = r4.url
            java.lang.String r3 = r5.url()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0062
            java.lang.String r1 = r4.content
            if (r1 != 0) goto L_0x003a
            java.lang.String r1 = r5.content()
            if (r1 != 0) goto L_0x0062
            goto L_0x0045
        L_0x003a:
            java.lang.String r3 = r5.content()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0045
            goto L_0x0062
        L_0x0045:
            java.lang.String r1 = r4.userAgent
            java.lang.String r3 = r5.userAgent()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0062
            int r1 = r4.connectionTimeoutMs
            int r3 = r5.connectionTimeoutMs()
            if (r1 != r3) goto L_0x0062
            int r1 = r4.readTimeoutMs
            int r5 = r5.readTimeoutMs()
            if (r1 != r5) goto L_0x0062
            return r0
        L_0x0062:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.impl.data.C3826z.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        int hashCode = (((((this.requestType.hashCode() ^ 1000003) * 1000003) ^ this.f13899id.hashCode()) * 1000003) ^ this.url.hashCode()) * 1000003;
        String str = this.content;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.userAgent.hashCode()) * 1000003) ^ this.connectionTimeoutMs) * 1000003) ^ this.readTimeoutMs;
    }

    /* renamed from: id */
    public String mo13111id() {
        return this.f13899id;
    }

    public int readTimeoutMs() {
        return this.readTimeoutMs;
    }

    public C3789bb requestType() {
        return this.requestType;
    }

    public String toString() {
        String valueOf = String.valueOf(this.requestType);
        String str = this.f13899id;
        String str2 = this.url;
        String str3 = this.content;
        String str4 = this.userAgent;
        int i = this.connectionTimeoutMs;
        int i2 = this.readTimeoutMs;
        int length = valueOf.length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 125 + length2 + length3 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("NetworkRequestData{requestType=");
        sb.append(valueOf);
        sb.append(", id=");
        sb.append(str);
        sb.append(", url=");
        sb.append(str2);
        sb.append(", content=");
        sb.append(str3);
        sb.append(", userAgent=");
        sb.append(str4);
        sb.append(", connectionTimeoutMs=");
        sb.append(i);
        sb.append(", readTimeoutMs=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    public String url() {
        return this.url;
    }

    public String userAgent() {
        return this.userAgent;
    }
}

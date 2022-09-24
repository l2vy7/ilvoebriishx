package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class q03 extends m03 {

    /* renamed from: a */
    private final String f37823a;

    /* renamed from: b */
    private final boolean f37824b;

    /* renamed from: c */
    private final boolean f37825c;

    /* synthetic */ q03(String str, boolean z, boolean z2, p03 p03) {
        this.f37823a = str;
        this.f37824b = z;
        this.f37825c = z2;
    }

    /* renamed from: b */
    public final String mo33454b() {
        return this.f37823a;
    }

    /* renamed from: c */
    public final boolean mo33455c() {
        return this.f37825c;
    }

    /* renamed from: d */
    public final boolean mo33456d() {
        return this.f37824b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m03) {
            m03 m03 = (m03) obj;
            return this.f37823a.equals(m03.mo33454b()) && this.f37824b == m03.mo33456d() && this.f37825c == m03.mo33455c();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.f37823a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f37824b ? 1237 : 1231)) * 1000003;
        if (true == this.f37825c) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f37823a;
        boolean z = this.f37824b;
        boolean z2 = this.f37825c;
        StringBuilder sb = new StringBuilder(str.length() + 99);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}

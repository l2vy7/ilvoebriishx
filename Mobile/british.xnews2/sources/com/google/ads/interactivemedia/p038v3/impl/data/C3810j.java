package com.google.ads.interactivemedia.p038v3.impl.data;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.j */
/* compiled from: IMASDK */
final class C3810j extends C3787b {
    private final String appState;
    private final String eventId;
    private final long nativeTime;
    private final C3778ar nativeViewBounds;
    private final boolean nativeViewHidden;
    private final C3778ar nativeViewVisibleBounds;
    private final double nativeVolume;
    private final String queryId;

    private C3810j(String str, String str2, String str3, long j, double d, boolean z, C3778ar arVar, C3778ar arVar2) {
        this.queryId = str;
        this.eventId = str2;
        this.appState = str3;
        this.nativeTime = j;
        this.nativeVolume = d;
        this.nativeViewHidden = z;
        this.nativeViewBounds = arVar;
        this.nativeViewVisibleBounds = arVar2;
    }

    public String appState() {
        return this.appState;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3787b) {
            C3787b bVar = (C3787b) obj;
            return this.queryId.equals(bVar.queryId()) && this.eventId.equals(bVar.eventId()) && this.appState.equals(bVar.appState()) && this.nativeTime == bVar.nativeTime() && Double.doubleToLongBits(this.nativeVolume) == Double.doubleToLongBits(bVar.nativeVolume()) && this.nativeViewHidden == bVar.nativeViewHidden() && this.nativeViewBounds.equals(bVar.nativeViewBounds()) && this.nativeViewVisibleBounds.equals(bVar.nativeViewVisibleBounds());
        }
    }

    public String eventId() {
        return this.eventId;
    }

    public int hashCode() {
        int hashCode = this.queryId.hashCode();
        int hashCode2 = this.eventId.hashCode();
        int hashCode3 = this.appState.hashCode();
        long j = this.nativeTime;
        return ((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.nativeVolume) >>> 32) ^ Double.doubleToLongBits(this.nativeVolume)))) * 1000003) ^ (true != this.nativeViewHidden ? 1237 : 1231)) * 1000003) ^ this.nativeViewBounds.hashCode()) * 1000003) ^ this.nativeViewVisibleBounds.hashCode();
    }

    public long nativeTime() {
        return this.nativeTime;
    }

    public C3778ar nativeViewBounds() {
        return this.nativeViewBounds;
    }

    public boolean nativeViewHidden() {
        return this.nativeViewHidden;
    }

    public C3778ar nativeViewVisibleBounds() {
        return this.nativeViewVisibleBounds;
    }

    public double nativeVolume() {
        return this.nativeVolume;
    }

    public String queryId() {
        return this.queryId;
    }

    public String toString() {
        String str = this.queryId;
        String str2 = this.eventId;
        String str3 = this.appState;
        long j = this.nativeTime;
        double d = this.nativeVolume;
        boolean z = this.nativeViewHidden;
        String valueOf = String.valueOf(this.nativeViewBounds);
        String valueOf2 = String.valueOf(this.nativeViewVisibleBounds);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 191 + length2 + length3 + valueOf.length() + valueOf2.length());
        sb.append("ActivityMonitorData{queryId=");
        sb.append(str);
        sb.append(", eventId=");
        sb.append(str2);
        sb.append(", appState=");
        sb.append(str3);
        sb.append(", nativeTime=");
        sb.append(j);
        sb.append(", nativeVolume=");
        sb.append(d);
        sb.append(", nativeViewHidden=");
        sb.append(z);
        sb.append(", nativeViewBounds=");
        sb.append(valueOf);
        sb.append(", nativeViewVisibleBounds=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

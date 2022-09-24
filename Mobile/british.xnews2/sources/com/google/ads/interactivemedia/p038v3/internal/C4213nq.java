package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.nq */
/* compiled from: IMASDK */
public final class C4213nq {

    /* renamed from: a */
    public static final C4213nq f18095a = new C4213nq(-1, -1, -1);

    /* renamed from: b */
    public final int f18096b;

    /* renamed from: c */
    public final int f18097c;

    /* renamed from: d */
    public final int f18098d;

    /* renamed from: e */
    public final int f18099e;

    public C4213nq(int i, int i2, int i3) {
        this.f18096b = i;
        this.f18097c = i2;
        this.f18098d = i3;
        this.f18099e = amm.m14207X(i3) ? amm.m14211aa(i3, i2) : -1;
    }

    public final String toString() {
        int i = this.f18096b;
        int i2 = this.f18097c;
        int i3 = this.f18098d;
        StringBuilder sb = new StringBuilder(83);
        sb.append("AudioFormat[sampleRate=");
        sb.append(i);
        sb.append(", channelCount=");
        sb.append(i2);
        sb.append(", encoding=");
        sb.append(i3);
        sb.append(']');
        return sb.toString();
    }
}

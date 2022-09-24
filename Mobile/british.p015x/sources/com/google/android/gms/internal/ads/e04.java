package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class e04 {

    /* renamed from: e */
    public static final e04 f31142e = new e04(-1, -1, -1);

    /* renamed from: a */
    public final int f31143a;

    /* renamed from: b */
    public final int f31144b;

    /* renamed from: c */
    public final int f31145c;

    /* renamed from: d */
    public final int f31146d;

    public e04(int i, int i2, int i3) {
        this.f31143a = i;
        this.f31144b = i2;
        this.f31145c = i3;
        this.f31146d = d13.m20319r(i3) ? d13.m20288S(i3, i2) : -1;
    }

    public final String toString() {
        int i = this.f31143a;
        int i2 = this.f31144b;
        int i3 = this.f31145c;
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

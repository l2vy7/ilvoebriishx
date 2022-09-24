package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class b04 {

    /* renamed from: a */
    public final long f29850a;

    /* renamed from: b */
    public final gi0 f29851b;

    /* renamed from: c */
    public final int f29852c;

    /* renamed from: d */
    public final c54 f29853d;

    /* renamed from: e */
    public final long f29854e;

    /* renamed from: f */
    public final gi0 f29855f;

    /* renamed from: g */
    public final int f29856g;

    /* renamed from: h */
    public final c54 f29857h;

    /* renamed from: i */
    public final long f29858i;

    /* renamed from: j */
    public final long f29859j;

    public b04(long j, gi0 gi0, int i, c54 c54, long j2, gi0 gi02, int i2, c54 c542, long j3, long j4) {
        this.f29850a = j;
        this.f29851b = gi0;
        this.f29852c = i;
        this.f29853d = c54;
        this.f29854e = j2;
        this.f29855f = gi02;
        this.f29856g = i2;
        this.f29857h = c542;
        this.f29858i = j3;
        this.f29859j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b04.class == obj.getClass()) {
            b04 b04 = (b04) obj;
            return this.f29850a == b04.f29850a && this.f29852c == b04.f29852c && this.f29854e == b04.f29854e && this.f29856g == b04.f29856g && this.f29858i == b04.f29858i && this.f29859j == b04.f29859j && x33.m21118a(this.f29851b, b04.f29851b) && x33.m21118a(this.f29853d, b04.f29853d) && x33.m21118a(this.f29855f, b04.f29855f) && x33.m21118a(this.f29857h, b04.f29857h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f29850a), this.f29851b, Integer.valueOf(this.f29852c), this.f29853d, Long.valueOf(this.f29854e), this.f29855f, Integer.valueOf(this.f29856g), this.f29857h, Long.valueOf(this.f29858i), Long.valueOf(this.f29859j)});
    }
}

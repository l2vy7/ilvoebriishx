package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ja0 {

    /* renamed from: j */
    public static final wx3<ja0> f33812j = i90.f33141a;

    /* renamed from: a */
    public final Object f33813a;

    /* renamed from: b */
    public final int f33814b;

    /* renamed from: c */
    public final C7764ho f33815c;

    /* renamed from: d */
    public final Object f33816d;

    /* renamed from: e */
    public final int f33817e;

    /* renamed from: f */
    public final long f33818f;

    /* renamed from: g */
    public final long f33819g;

    /* renamed from: h */
    public final int f33820h;

    /* renamed from: i */
    public final int f33821i;

    public ja0(Object obj, int i, C7764ho hoVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.f33813a = obj;
        this.f33814b = i;
        this.f33815c = hoVar;
        this.f33816d = obj2;
        this.f33817e = i2;
        this.f33818f = j;
        this.f33819g = j2;
        this.f33820h = i3;
        this.f33821i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ja0.class == obj.getClass()) {
            ja0 ja0 = (ja0) obj;
            return this.f33814b == ja0.f33814b && this.f33817e == ja0.f33817e && this.f33818f == ja0.f33818f && this.f33819g == ja0.f33819g && this.f33820h == ja0.f33820h && this.f33821i == ja0.f33821i && x33.m21118a(this.f33813a, ja0.f33813a) && x33.m21118a(this.f33816d, ja0.f33816d) && x33.m21118a(this.f33815c, ja0.f33815c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33813a, Integer.valueOf(this.f33814b), this.f33815c, this.f33816d, Integer.valueOf(this.f33817e), Integer.valueOf(this.f33814b), Long.valueOf(this.f33818f), Long.valueOf(this.f33819g), Integer.valueOf(this.f33820h), Integer.valueOf(this.f33821i)});
    }
}

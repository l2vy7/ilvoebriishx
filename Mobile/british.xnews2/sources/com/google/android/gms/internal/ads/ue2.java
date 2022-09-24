package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ue2 implements yi2<Bundle> {

    /* renamed from: a */
    public final int f39834a;

    /* renamed from: b */
    public final boolean f39835b;

    /* renamed from: c */
    public final boolean f39836c;

    /* renamed from: d */
    public final int f39837d;

    /* renamed from: e */
    public final int f39838e;

    /* renamed from: f */
    public final int f39839f;

    /* renamed from: g */
    public final float f39840g;

    /* renamed from: h */
    public final boolean f39841h;

    public ue2(int i, boolean z, boolean z2, int i2, int i3, int i4, float f, boolean z3) {
        this.f39834a = i;
        this.f39835b = z;
        this.f39836c = z2;
        this.f39837d = i2;
        this.f39838e = i3;
        this.f39839f = i4;
        this.f39840g = f;
        this.f39841h = z3;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("am", this.f39834a);
        bundle.putBoolean("ma", this.f39835b);
        bundle.putBoolean("sp", this.f39836c);
        bundle.putInt("muv", this.f39837d);
        bundle.putInt("rm", this.f39838e);
        bundle.putInt("riv", this.f39839f);
        bundle.putFloat("android_app_volume", this.f39840g);
        bundle.putBoolean("android_app_muted", this.f39841h);
    }
}

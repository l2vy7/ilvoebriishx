package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ij2 implements yi2<Bundle> {

    /* renamed from: a */
    public final String f33262a;

    /* renamed from: b */
    public final int f33263b;

    /* renamed from: c */
    public final int f33264c;

    /* renamed from: d */
    public final int f33265d;

    /* renamed from: e */
    public final boolean f33266e;

    /* renamed from: f */
    public final int f33267f;

    public ij2(String str, int i, int i2, int i3, boolean z, int i4) {
        this.f33262a = str;
        this.f33263b = i;
        this.f33264c = i2;
        this.f33265d = i3;
        this.f33266e = z;
        this.f33267f = i4;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f33262a;
        boolean z = true;
        ms2.m34893g(bundle, "carrier", str, !TextUtils.isEmpty(str));
        Integer valueOf = Integer.valueOf(this.f33263b);
        if (this.f33263b == -2) {
            z = false;
        }
        ms2.m34892f(bundle, "cnt", valueOf, z);
        bundle.putInt("gnt", this.f33264c);
        bundle.putInt("pt", this.f33265d);
        Bundle a = ms2.m34887a(bundle, "device");
        bundle.putBundle("device", a);
        Bundle a2 = ms2.m34887a(a, "network");
        a.putBundle("network", a2);
        a2.putInt("active_network_state", this.f33267f);
        a2.putBoolean("active_network_metered", this.f33266e);
    }
}

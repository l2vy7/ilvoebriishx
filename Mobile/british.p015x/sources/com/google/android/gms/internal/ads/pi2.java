package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.mediationsdk.config.VersionInfo;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pi2 implements yi2<Bundle> {

    /* renamed from: a */
    public final boolean f37673a;

    /* renamed from: b */
    public final boolean f37674b;

    /* renamed from: c */
    public final String f37675c;

    /* renamed from: d */
    public final boolean f37676d;

    /* renamed from: e */
    public final int f37677e;

    /* renamed from: f */
    public final int f37678f;

    /* renamed from: g */
    public final int f37679g;

    public pi2(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3) {
        this.f37673a = z;
        this.f37674b = z2;
        this.f37675c = str;
        this.f37676d = z3;
        this.f37677e = i;
        this.f37678f = i2;
        this.f37679g = i3;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.f37675c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) C8311wv.m39277c().mo18570b(p00.f37159n2));
        bundle.putInt("target_api", this.f37677e);
        bundle.putInt("dv", this.f37678f);
        bundle.putInt("lv", this.f37679g);
        Bundle a = ms2.m34887a(bundle, "sdk_env");
        a.putBoolean("mf", e20.f31166a.mo34648e().booleanValue());
        a.putBoolean("instant_app", this.f37673a);
        a.putBoolean("lite", this.f37674b);
        a.putBoolean("is_privileged_process", this.f37676d);
        bundle.putBundle("sdk_env", a);
        Bundle a2 = ms2.m34887a(a, "build_meta");
        a2.putString("cl", "428884702");
        a2.putString("rapid_rc", "dev");
        a2.putString("rapid_rollup", VersionInfo.GIT_BRANCH);
        a.putBundle("build_meta", a2);
    }
}

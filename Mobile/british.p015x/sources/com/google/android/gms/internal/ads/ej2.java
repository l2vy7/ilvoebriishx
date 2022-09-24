package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ej2 implements yi2<Bundle> {

    /* renamed from: a */
    public final boolean f20273a;

    /* renamed from: b */
    public final boolean f20274b;

    /* renamed from: c */
    public final String f20275c;

    /* renamed from: d */
    public final boolean f20276d;

    /* renamed from: e */
    public final boolean f20277e;

    /* renamed from: f */
    public final boolean f20278f;

    /* renamed from: g */
    public final String f20279g;

    /* renamed from: h */
    public final ArrayList<String> f20280h;

    /* renamed from: i */
    public final String f20281i;

    /* renamed from: j */
    public final String f20282j;

    /* renamed from: k */
    public final String f20283k;

    /* renamed from: l */
    public final boolean f20284l;

    /* renamed from: m */
    public final String f20285m;

    /* renamed from: n */
    public final long f20286n;

    public ej2(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList<String> arrayList, @Nullable String str3, @Nullable String str4, String str5, boolean z6, String str6, long j) {
        this.f20273a = z;
        this.f20274b = z2;
        this.f20275c = str;
        this.f20276d = z3;
        this.f20277e = z4;
        this.f20278f = z5;
        this.f20279g = str2;
        this.f20280h = arrayList;
        this.f20281i = str3;
        this.f20282j = str4;
        this.f20283k = str5;
        this.f20284l = z6;
        this.f20285m = str6;
        this.f20286n = j;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.f20273a);
        bundle.putBoolean("coh", this.f20274b);
        bundle.putString("gl", this.f20275c);
        bundle.putBoolean("simulator", this.f20276d);
        bundle.putBoolean("is_latchsky", this.f20277e);
        bundle.putBoolean("is_sidewinder", this.f20278f);
        bundle.putString("hl", this.f20279g);
        if (!this.f20280h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.f20280h);
        }
        bundle.putString("mv", this.f20281i);
        bundle.putString("submodel", this.f20285m);
        Bundle a = ms2.m34887a(bundle, "device");
        bundle.putBundle("device", a);
        a.putString("build", this.f20283k);
        a.putLong("remaining_data_partition_space", this.f20286n);
        Bundle a2 = ms2.m34887a(a, "browser");
        a.putBundle("browser", a2);
        a2.putBoolean("is_browser_custom_tabs_capable", this.f20284l);
        if (!TextUtils.isEmpty(this.f20282j)) {
            Bundle a3 = ms2.m34887a(a, "play_store");
            a.putBundle("play_store", a3);
            a3.putString("package_version", this.f20282j);
        }
    }
}

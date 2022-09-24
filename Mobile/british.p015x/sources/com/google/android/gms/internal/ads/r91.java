package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class r91 {

    /* renamed from: a */
    private final dw2 f38598a;

    /* renamed from: b */
    private final zzcjf f38599b;

    /* renamed from: c */
    private final ApplicationInfo f38600c;

    /* renamed from: d */
    private final String f38601d;

    /* renamed from: e */
    private final List<String> f38602e;

    /* renamed from: f */
    private final PackageInfo f38603f;

    /* renamed from: g */
    private final ou3<mb3<String>> f38604g;

    /* renamed from: h */
    private final String f38605h;

    /* renamed from: i */
    private final cj2<Bundle> f38606i;

    public r91(dw2 dw2, zzcjf zzcjf, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, ou3<mb3<String>> ou3, zzg zzg, String str2, cj2<Bundle> cj2) {
        this.f38598a = dw2;
        this.f38599b = zzcjf;
        this.f38600c = applicationInfo;
        this.f38601d = str;
        this.f38602e = list;
        this.f38603f = packageInfo;
        this.f38604g = ou3;
        this.f38605h = str2;
        this.f38606i = cj2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzcdq mo34519a(mb3 mb3) throws Exception {
        return new zzcdq((Bundle) mb3.get(), this.f38599b, this.f38600c, this.f38601d, this.f38602e, this.f38603f, (String) this.f38604g.zzb().get(), this.f38605h, (zzffu) null, (String) null);
    }

    /* renamed from: b */
    public final mb3<Bundle> mo34520b() {
        dw2 dw2 = this.f38598a;
        return mv2.m34932c(this.f38606i.mo30938a(new Bundle()), wv2.SIGNALS, dw2).mo35042a();
    }

    /* renamed from: c */
    public final mb3<zzcdq> mo34521c() {
        mb3<Bundle> b = mo34520b();
        return this.f38598a.mo35306a(wv2.REQUEST_PARCEL, b, this.f38604g.zzb()).mo33189a(new q91(this, b)).mo35042a();
    }
}

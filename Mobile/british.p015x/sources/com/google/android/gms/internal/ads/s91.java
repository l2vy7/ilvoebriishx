package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class s91 implements uu3<r91> {

    /* renamed from: a */
    private final iv3<dw2> f38909a;

    /* renamed from: b */
    private final iv3<zzcjf> f38910b;

    /* renamed from: c */
    private final iv3<ApplicationInfo> f38911c;

    /* renamed from: d */
    private final iv3<String> f38912d;

    /* renamed from: e */
    private final iv3<List<String>> f38913e;

    /* renamed from: f */
    private final iv3<PackageInfo> f38914f;

    /* renamed from: g */
    private final iv3<mb3<String>> f38915g;

    /* renamed from: h */
    private final iv3<zzg> f38916h;

    /* renamed from: i */
    private final iv3<String> f38917i;

    /* renamed from: j */
    private final iv3<cj2<Bundle>> f38918j;

    public s91(iv3<dw2> iv3, iv3<zzcjf> iv32, iv3<ApplicationInfo> iv33, iv3<String> iv34, iv3<List<String>> iv35, iv3<PackageInfo> iv36, iv3<mb3<String>> iv37, iv3<zzg> iv38, iv3<String> iv39, iv3<cj2<Bundle>> iv310) {
        this.f38909a = iv3;
        this.f38910b = iv32;
        this.f38911c = iv33;
        this.f38912d = iv34;
        this.f38913e = iv35;
        this.f38914f = iv36;
        this.f38915g = iv37;
        this.f38916h = iv38;
        this.f38917i = iv39;
        this.f38918j = iv310;
    }

    /* renamed from: a */
    public final r91 zzb() {
        return new r91(this.f38909a.zzb(), ((kw0) this.f38910b).mo33191a(), ((iz1) this.f38911c).zzb(), ((oz1) this.f38912d).zzb(), p00.m35911a(), this.f38914f.zzb(), tu3.m38016a(this.f38915g), ((dt2) this.f38916h).zzb(), this.f38917i.zzb(), ((dj2) this.f38918j).zzb());
    }
}

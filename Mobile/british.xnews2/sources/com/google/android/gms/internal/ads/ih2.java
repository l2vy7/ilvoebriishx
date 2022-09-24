package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ih2 implements zi2, yi2 {

    /* renamed from: a */
    private final ApplicationInfo f33242a;

    /* renamed from: b */
    private final PackageInfo f33243b;

    ih2(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.f33242a = applicationInfo;
        this.f33243b = packageInfo;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Integer num;
        Bundle bundle = (Bundle) obj;
        String str = this.f33242a.packageName;
        PackageInfo packageInfo = this.f33243b;
        String str2 = null;
        if (packageInfo == null) {
            num = null;
        } else {
            num = Integer.valueOf(packageInfo.versionCode);
        }
        bundle.putString("pn", str);
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        PackageInfo packageInfo2 = this.f33243b;
        if (packageInfo2 != null) {
            str2 = packageInfo2.versionName;
        }
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
    }

    public final mb3<yi2<Bundle>> zzb() {
        return bb3.m30649i(this);
    }
}

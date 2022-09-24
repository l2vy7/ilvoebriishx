package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class iz1 implements uu3<ApplicationInfo> {

    /* renamed from: a */
    private final iv3<Context> f33679a;

    public iz1(iv3<Context> iv3) {
        this.f33679a = iv3;
    }

    /* renamed from: a */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = this.f33679a.zzb().getApplicationInfo();
        cv3.m31156b(applicationInfo);
        return applicationInfo;
    }
}

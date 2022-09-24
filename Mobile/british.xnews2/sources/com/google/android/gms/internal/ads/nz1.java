package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import p192c5.C6520c;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nz1 implements uu3<PackageInfo> {

    /* renamed from: a */
    private final iv3<Context> f36196a;

    /* renamed from: b */
    private final iv3<ApplicationInfo> f36197b;

    public nz1(iv3<Context> iv3, iv3<ApplicationInfo> iv32) {
        this.f36196a = iv3;
        this.f36197b = iv32;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return C6520c.m28321a(this.f36196a.zzb()).mo24355f(((iz1) this.f36197b).zzb().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}

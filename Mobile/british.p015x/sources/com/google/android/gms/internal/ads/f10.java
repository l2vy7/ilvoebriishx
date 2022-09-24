package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import javax.annotation.ParametersAreNonnullByDefault;
import p199d5.C10487a;
import p199d5.C10489b;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class f10 extends h10 {

    /* renamed from: b */
    private final zzf f20319b;

    /* renamed from: c */
    private final String f20320c;

    /* renamed from: d */
    private final String f20321d;

    public f10(zzf zzf, String str, String str2) {
        this.f20319b = zzf;
        this.f20320c = str;
        this.f20321d = str2;
    }

    /* renamed from: D */
    public final void mo18288D(C10487a aVar) {
        if (aVar != null) {
            this.f20319b.zza((View) C10489b.m48194f3(aVar));
        }
    }

    public final String zzb() {
        return this.f20320c;
    }

    public final String zzc() {
        return this.f20321d;
    }

    public final void zze() {
        this.f20319b.zzb();
    }

    public final void zzf() {
        this.f20319b.zzc();
    }
}

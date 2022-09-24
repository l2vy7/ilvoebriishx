package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class oa2 implements zzf {
    @GuardedBy("this")

    /* renamed from: a */
    private zzf f36355a;

    /* renamed from: a */
    public final synchronized void mo33858a(zzf zzf) {
        this.f36355a = zzf;
    }

    public final synchronized void zza(View view) {
        zzf zzf = this.f36355a;
        if (zzf != null) {
            zzf.zza(view);
        }
    }

    public final synchronized void zzb() {
        zzf zzf = this.f36355a;
        if (zzf != null) {
            zzf.zzb();
        }
    }

    public final synchronized void zzc() {
        zzf zzf = this.f36355a;
        if (zzf != null) {
            zzf.zzc();
        }
    }
}

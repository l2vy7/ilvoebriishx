package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wi1 extends cg1<VideoController.VideoLifecycleCallbacks> {
    @GuardedBy("this")

    /* renamed from: c */
    private boolean f40806c;

    protected wi1(Set<yh1<VideoController.VideoLifecycleCallbacks>> set) {
        super(set);
    }

    public final void zza() {
        mo30919B0(si1.f38976a);
    }

    public final void zzb() {
        mo30919B0(ti1.f39430a);
    }

    public final synchronized void zzc() {
        if (!this.f40806c) {
            mo30919B0(vi1.f40433a);
            this.f40806c = true;
        }
        mo30919B0(ui1.f39871a);
    }

    public final synchronized void zzd() {
        mo30919B0(vi1.f40433a);
        this.f40806c = true;
    }
}

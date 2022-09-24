package com.google.android.gms.ads.search;

import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.internal.ads.C7995ny;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzb {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C7995ny f28137a = new C7995ny();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f28138b;

    public final zzb zzb(Class<? extends CustomEvent> cls, Bundle bundle) {
        this.f28137a.mo33793E(cls, bundle);
        return this;
    }

    public final zzb zzc(NetworkExtras networkExtras) {
        this.f28137a.mo33797I(networkExtras);
        return this;
    }

    public final zzb zzd(Class<? extends MediationAdapter> cls, Bundle bundle) {
        this.f28137a.mo33796H(cls, bundle);
        return this;
    }

    public final zzb zze(String str) {
        this.f28138b = str;
        return this;
    }
}

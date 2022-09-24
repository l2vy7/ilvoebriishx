package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzw;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class cr1 implements C7659eu, d60, zzo, f60, zzw {

    /* renamed from: b */
    private C7659eu f30475b;

    /* renamed from: c */
    private d60 f30476c;

    /* renamed from: d */
    private zzo f30477d;

    /* renamed from: e */
    private f60 f30478e;

    /* renamed from: f */
    private zzw f30479f;

    /* synthetic */ cr1(br1 br1) {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final synchronized void m31128c(C7659eu euVar, d60 d60, zzo zzo, f60 f60, zzw zzw) {
        this.f30475b = euVar;
        this.f30476c = d60;
        this.f30477d = zzo;
        this.f30478e = f60;
        this.f30479f = zzw;
    }

    /* renamed from: M */
    public final synchronized void mo18309M(String str, String str2) {
        f60 f60 = this.f30478e;
        if (f60 != null) {
            f60.mo18309M(str, str2);
        }
    }

    /* renamed from: n */
    public final synchronized void mo18195n(String str, Bundle bundle) {
        d60 d60 = this.f30476c;
        if (d60 != null) {
            d60.mo18195n(str, bundle);
        }
    }

    public final synchronized void onAdClicked() {
        C7659eu euVar = this.f30475b;
        if (euVar != null) {
            euVar.onAdClicked();
        }
    }

    public final synchronized void zzb() {
        zzo zzo = this.f30477d;
        if (zzo != null) {
            zzo.zzb();
        }
    }

    public final synchronized void zzbK() {
        zzo zzo = this.f30477d;
        if (zzo != null) {
            zzo.zzbK();
        }
    }

    public final synchronized void zzbS() {
        zzo zzo = this.f30477d;
        if (zzo != null) {
            zzo.zzbS();
        }
    }

    public final synchronized void zzbz() {
        zzo zzo = this.f30477d;
        if (zzo != null) {
            zzo.zzbz();
        }
    }

    public final synchronized void zze() {
        zzo zzo = this.f30477d;
        if (zzo != null) {
            zzo.zze();
        }
    }

    public final synchronized void zzf(int i) {
        zzo zzo = this.f30477d;
        if (zzo != null) {
            zzo.zzf(i);
        }
    }

    public final synchronized void zzg() {
        zzw zzw = this.f30479f;
        if (zzw != null) {
            ((dr1) zzw).f30986b.zzb();
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzw;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mr1 implements C7659eu, d60, zzo, f60, zzw, gi1 {

    /* renamed from: b */
    private C7659eu f35607b;

    /* renamed from: c */
    private d60 f35608c;

    /* renamed from: d */
    private zzo f35609d;

    /* renamed from: e */
    private f60 f35610e;

    /* renamed from: f */
    private zzw f35611f;

    /* renamed from: g */
    private gi1 f35612g;

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final synchronized void m34884c(C7659eu euVar, d60 d60, zzo zzo, f60 f60, zzw zzw, gi1 gi1) {
        this.f35607b = euVar;
        this.f35608c = d60;
        this.f35609d = zzo;
        this.f35610e = f60;
        this.f35611f = zzw;
        this.f35612g = gi1;
    }

    /* renamed from: M */
    public final synchronized void mo18309M(String str, String str2) {
        f60 f60 = this.f35610e;
        if (f60 != null) {
            f60.mo18309M(str, str2);
        }
    }

    /* renamed from: n */
    public final synchronized void mo18195n(String str, Bundle bundle) {
        d60 d60 = this.f35608c;
        if (d60 != null) {
            d60.mo18195n(str, bundle);
        }
    }

    public final synchronized void onAdClicked() {
        C7659eu euVar = this.f35607b;
        if (euVar != null) {
            euVar.onAdClicked();
        }
    }

    public final synchronized void zzb() {
        zzo zzo = this.f35609d;
        if (zzo != null) {
            zzo.zzb();
        }
    }

    public final synchronized void zzbK() {
        zzo zzo = this.f35609d;
        if (zzo != null) {
            zzo.zzbK();
        }
    }

    public final synchronized void zzbS() {
        zzo zzo = this.f35609d;
        if (zzo != null) {
            zzo.zzbS();
        }
    }

    public final synchronized void zzbz() {
        zzo zzo = this.f35609d;
        if (zzo != null) {
            zzo.zzbz();
        }
    }

    public final synchronized void zze() {
        zzo zzo = this.f35609d;
        if (zzo != null) {
            zzo.zze();
        }
    }

    public final synchronized void zzf(int i) {
        zzo zzo = this.f35609d;
        if (zzo != null) {
            zzo.zzf(i);
        }
    }

    public final synchronized void zzg() {
        zzw zzw = this.f35611f;
        if (zzw != null) {
            ((nr1) zzw).f36094b.zzb();
        }
    }

    public final synchronized void zzq() {
        gi1 gi1 = this.f35612g;
        if (gi1 != null) {
            gi1.zzq();
        }
    }
}

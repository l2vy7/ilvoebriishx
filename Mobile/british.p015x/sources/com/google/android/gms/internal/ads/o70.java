package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzu;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class o70 implements zzu {

    /* renamed from: a */
    boolean f36308a = false;

    /* renamed from: b */
    final /* synthetic */ boolean f36309b;

    /* renamed from: c */
    final /* synthetic */ C7659eu f36310c;

    /* renamed from: d */
    final /* synthetic */ Map f36311d;

    /* renamed from: e */
    final /* synthetic */ Map f36312e;

    o70(q70 q70, boolean z, C7659eu euVar, Map map, Map map2) {
        this.f36309b = z;
        this.f36310c = euVar;
        this.f36311d = map;
        this.f36312e = map2;
    }

    public final void zza(boolean z) {
        if (!this.f36308a) {
            if (z && this.f36309b) {
                ((gi1) this.f36310c).zzq();
            }
            this.f36308a = true;
            this.f36311d.put((String) this.f36312e.get("event_id"), Boolean.valueOf(z));
            ((t90) this.f36310c).mo18321Z("openIntentAsync", this.f36311d);
        }
    }

    public final void zzb(int i) {
    }
}

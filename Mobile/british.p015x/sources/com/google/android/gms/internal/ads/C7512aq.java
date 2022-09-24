package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.C7377d;

/* renamed from: com.google.android.gms.internal.ads.aq */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7512aq implements C7377d.C7378a {

    /* renamed from: b */
    final /* synthetic */ zzbak f29716b;

    /* renamed from: c */
    final /* synthetic */ uo0 f29717c;

    /* renamed from: d */
    final /* synthetic */ C7583cq f29718d;

    C7512aq(C7583cq cqVar, zzbak zzbak, uo0 uo0) {
        this.f29718d = cqVar;
        this.f29716b = zzbak;
        this.f29717c = uo0;
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.f29718d.f30459d) {
            if (!this.f29718d.f30457b) {
                this.f29718d.f30457b = true;
                C8163sp a = this.f29718d.f30456a;
                if (a != null) {
                    mb3<?> c = po0.f37722a.mo33676c(new C8341xp(this, a, this.f29716b, this.f29717c));
                    uo0 uo0 = this.f29717c;
                    uo0.zzc(new C8378yp(uo0, c), po0.f37727f);
                }
            }
        }
    }

    public final void onConnectionSuspended(int i) {
    }
}

package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.internal.C7377d;
import com.google.android.gms.common.internal.C7390g0;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.k0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7267k0 extends C7302r0 {

    /* renamed from: c */
    private final Map<C7191a.C7201f, C7250h0> f29036c;

    /* renamed from: d */
    final /* synthetic */ C7306s0 f29037d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7267k0(C7306s0 s0Var, Map<C7191a.C7201f, C7250h0> map) {
        super(s0Var, (C7297q0) null);
        this.f29037d = s0Var;
        this.f29036c = map;
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo29885a() {
        C7390g0 g0Var = new C7390g0(this.f29037d.f29109d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C7191a.C7201f next : this.f29036c.keySet()) {
            if (!next.requiresGooglePlayServices() || this.f29036c.get(next).f29019c) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i2 < size) {
                i = g0Var.mo30099b(this.f29037d.f29108c, (C7191a.C7201f) arrayList.get(i2));
                i2++;
                if (i != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i2 < size2) {
                i = g0Var.mo30099b(this.f29037d.f29108c, (C7191a.C7201f) arrayList2.get(i2));
                i2++;
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i, (PendingIntent) null);
            C7306s0 s0Var = this.f29037d;
            s0Var.f29106a.mo17920o(new C7255i0(this, s0Var, connectionResult));
            return;
        }
        C7306s0 s0Var2 = this.f29037d;
        if (s0Var2.f29118m && s0Var2.f29116k != null) {
            s0Var2.f29116k.mo39382b();
        }
        for (C7191a.C7201f next2 : this.f29036c.keySet()) {
            C7377d.C7380c cVar = this.f29036c.get(next2);
            if (!next2.requiresGooglePlayServices() || g0Var.mo30099b(this.f29037d.f29108c, next2) == 0) {
                next2.connect(cVar);
            } else {
                C7306s0 s0Var3 = this.f29037d;
                s0Var3.f29106a.mo17920o(new C7262j0(this, s0Var3, cVar));
            }
        }
    }
}

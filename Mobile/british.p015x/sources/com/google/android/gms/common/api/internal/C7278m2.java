package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;
import p264x5.C11095a;
import p264x5.C11099e;
import p264x5.C11100f;
import p267y5.C11107a;

/* renamed from: com.google.android.gms.common.api.internal.m2 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7278m2 extends C11107a implements C7206f.C7208b, C7206f.C7209c {

    /* renamed from: i */
    private static final C7191a.C7192a<? extends C11100f, C11095a> f29061i = C11099e.f50067c;

    /* renamed from: b */
    private final Context f29062b;

    /* renamed from: c */
    private final Handler f29063c;

    /* renamed from: d */
    private final C7191a.C7192a<? extends C11100f, C11095a> f29064d;

    /* renamed from: e */
    private final Set<Scope> f29065e;

    /* renamed from: f */
    private final C4601e f29066f;

    /* renamed from: g */
    private C11100f f29067g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C7274l2 f29068h;

    public C7278m2(Context context, Handler handler, C4601e eVar) {
        C7191a.C7192a<? extends C11100f, C11095a> aVar = f29061i;
        this.f29062b = context;
        this.f29063c = handler;
        this.f29066f = (C4601e) C4604n.m20099l(eVar, "ClientSettings must not be null");
        this.f29065e = eVar.mo17983g();
        this.f29064d = aVar;
    }

    /* renamed from: m6 */
    static /* bridge */ /* synthetic */ void m29704m6(C7278m2 m2Var, zak zak) {
        ConnectionResult C0 = zak.mo39397C0();
        if (C0.mo29686G0()) {
            zav zav = (zav) C4604n.m20098k(zak.mo39398D0());
            ConnectionResult C02 = zav.mo30179C0();
            if (!C02.mo29686G0()) {
                String valueOf = String.valueOf(C02);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                m2Var.f29068h.mo29895b(C02);
                m2Var.f29067g.disconnect();
                return;
            }
            m2Var.f29068h.mo29896c(zav.mo30180D0(), m2Var.f29065e);
        } else {
            m2Var.f29068h.mo29895b(C0);
        }
        m2Var.f29067g.disconnect();
    }

    /* renamed from: D1 */
    public final void mo29897D1(zak zak) {
        this.f29063c.post(new C7269k2(this, zak));
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.common.api.a$f, x5.f] */
    /* renamed from: n6 */
    public final void mo29898n6(C7274l2 l2Var) {
        C11100f fVar = this.f29067g;
        if (fVar != null) {
            fVar.disconnect();
        }
        this.f29066f.mo17988l(Integer.valueOf(System.identityHashCode(this)));
        C7191a.C7192a aVar = this.f29064d;
        Context context = this.f29062b;
        Looper looper = this.f29063c.getLooper();
        C4601e eVar = this.f29066f;
        this.f29067g = aVar.buildClient(context, looper, eVar, eVar.mo17984h(), (C7206f.C7208b) this, (C7206f.C7209c) this);
        this.f29068h = l2Var;
        Set<Scope> set = this.f29065e;
        if (set == null || set.isEmpty()) {
            this.f29063c.post(new C7264j2(this));
        } else {
            this.f29067g.mo39382b();
        }
    }

    /* renamed from: o6 */
    public final void mo29899o6() {
        C11100f fVar = this.f29067g;
        if (fVar != null) {
            fVar.disconnect();
        }
    }

    public final void onConnected(Bundle bundle) {
        this.f29067g.mo39381a(this);
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f29068h.mo29895b(connectionResult);
    }

    public final void onConnectionSuspended(int i) {
        this.f29067g.disconnect();
    }
}

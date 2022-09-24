package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import androidx.mediarouter.media.C1003s;
import com.google.android.gms.common.internal.C4604n;
import p243q4.C10922b;

/* renamed from: com.google.android.gms.internal.cast.b */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C8446b extends C1003s.C1005b {

    /* renamed from: b */
    private static final C10922b f43275b = new C10922b("MediaRouterCallback");

    /* renamed from: a */
    private final C8692pf f43276a;

    public C8446b(C8692pf pfVar) {
        this.f43276a = (C8692pf) C4604n.m20098k(pfVar);
    }

    /* renamed from: d */
    public final void mo4168d(C1003s sVar, C1003s.C1022i iVar) {
        try {
            this.f43276a.mo36647I3(iVar.mo4805k(), iVar.mo4803i());
        } catch (RemoteException e) {
            f43275b.mo43191b(e, "Unable to call %s on %s.", "onRouteAdded", C8692pf.class.getSimpleName());
        }
    }

    /* renamed from: e */
    public final void mo4169e(C1003s sVar, C1003s.C1022i iVar) {
        try {
            this.f43276a.mo36648b3(iVar.mo4805k(), iVar.mo4803i());
        } catch (RemoteException e) {
            f43275b.mo43191b(e, "Unable to call %s on %s.", "onRouteChanged", C8692pf.class.getSimpleName());
        }
    }

    /* renamed from: g */
    public final void mo4170g(C1003s sVar, C1003s.C1022i iVar) {
        try {
            this.f43276a.mo36650t2(iVar.mo4805k(), iVar.mo4803i());
        } catch (RemoteException e) {
            f43275b.mo43191b(e, "Unable to call %s on %s.", "onRouteRemoved", C8692pf.class.getSimpleName());
        }
    }

    /* renamed from: h */
    public final void mo4196h(C1003s sVar, C1003s.C1022i iVar) {
        try {
            this.f43276a.mo36649r1(iVar.mo4805k(), iVar.mo4803i());
        } catch (RemoteException e) {
            f43275b.mo43191b(e, "Unable to call %s on %s.", "onRouteSelected", C8692pf.class.getSimpleName());
        }
    }

    /* renamed from: l */
    public final void mo4721l(C1003s sVar, C1003s.C1022i iVar, int i) {
        try {
            this.f43276a.mo36646G4(iVar.mo4805k(), iVar.mo4803i(), i);
        } catch (RemoteException e) {
            f43275b.mo43191b(e, "Unable to call %s on %s.", "onRouteUnselected", C8692pf.class.getSimpleName());
        }
    }
}

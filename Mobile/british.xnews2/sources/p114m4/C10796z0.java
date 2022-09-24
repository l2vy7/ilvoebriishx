package p114m4;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import p108l4.C10695o0;

/* renamed from: m4.z0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final class C10796z0 extends C10695o0 {

    /* renamed from: a */
    final /* synthetic */ C5759d f49527a;

    /* synthetic */ C10796z0(C5759d dVar, C10786u0 u0Var) {
        this.f49527a = dVar;
    }

    /* renamed from: a */
    public final void mo42859a() {
        if (this.f49527a.f24424f != null) {
            try {
                if (this.f49527a.f24428j != null) {
                    this.f49527a.f24428j.mo17831P();
                }
                this.f49527a.f24424f.mo42927I((Bundle) null);
            } catch (RemoteException e) {
                C5759d.f24421n.mo43191b(e, "Unable to call %s on %s.", "onConnected", C10763i1.class.getSimpleName());
            }
        }
    }

    /* renamed from: b */
    public final void mo42860b(int i) {
        if (this.f49527a.f24424f != null) {
            try {
                this.f49527a.f24424f.mo42929j2(new ConnectionResult(i));
            } catch (RemoteException e) {
                C5759d.f24421n.mo43191b(e, "Unable to call %s on %s.", "onConnectionFailed", C10763i1.class.getSimpleName());
            }
        }
    }

    /* renamed from: c */
    public final void mo42861c(int i) {
        if (this.f49527a.f24424f != null) {
            try {
                this.f49527a.f24424f.zzf(i);
            } catch (RemoteException e) {
                C5759d.f24421n.mo43191b(e, "Unable to call %s on %s.", "onConnectionSuspended", C10763i1.class.getSimpleName());
            }
        }
    }

    /* renamed from: d */
    public final void mo42862d(int i) {
        if (this.f49527a.f24424f != null) {
            try {
                this.f49527a.f24424f.mo42929j2(new ConnectionResult(i));
            } catch (RemoteException e) {
                C5759d.f24421n.mo43191b(e, "Unable to call %s on %s.", "onDisconnected", C10763i1.class.getSimpleName());
            }
        }
    }
}

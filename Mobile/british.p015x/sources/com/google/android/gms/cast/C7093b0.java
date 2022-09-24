package com.google.android.gms.cast;

import androidx.mediarouter.media.C1003s;

/* renamed from: com.google.android.gms.cast.b0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C7093b0 extends C1003s.C1005b {

    /* renamed from: a */
    final /* synthetic */ CastRemoteDisplayLocalService f28537a;

    C7093b0(CastRemoteDisplayLocalService castRemoteDisplayLocalService) {
        this.f28537a = castRemoteDisplayLocalService;
    }

    /* renamed from: k */
    public final void mo4197k(C1003s sVar, C1003s.C1022i iVar) {
        this.f28537a.m29062l("onRouteUnselected");
        if (this.f28537a.f28359e == null) {
            this.f28537a.m29062l("onRouteUnselected, no device was selected");
            return;
        }
        CastDevice F0 = CastDevice.m29040F0(iVar.mo4803i());
        if (F0 == null || !F0.mo29180C0().equals(this.f28537a.f28359e.mo29180C0())) {
            this.f28537a.m29062l("onRouteUnselected, device does not match");
        } else {
            CastRemoteDisplayLocalService.m29052b();
        }
    }
}

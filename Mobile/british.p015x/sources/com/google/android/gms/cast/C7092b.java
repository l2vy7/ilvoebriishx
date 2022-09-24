package com.google.android.gms.cast;

/* renamed from: com.google.android.gms.cast.b */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C7092b implements Runnable {

    /* renamed from: b */
    final /* synthetic */ CastRemoteDisplayLocalService f28536b;

    C7092b(CastRemoteDisplayLocalService castRemoteDisplayLocalService) {
        this.f28536b = castRemoteDisplayLocalService;
    }

    public final void run() {
        CastRemoteDisplayLocalService castRemoteDisplayLocalService = this.f28536b;
        boolean e = castRemoteDisplayLocalService.f28365k;
        StringBuilder sb = new StringBuilder(59);
        sb.append("onCreate after delay. The local service been started: ");
        sb.append(e);
        castRemoteDisplayLocalService.m29062l(sb.toString());
        if (!this.f28536b.f28365k) {
            CastRemoteDisplayLocalService.f28351o.mo43192c("[Instance: %s] %s", this.f28536b, "The local service has not been been started, stopping it");
            this.f28536b.stopSelf();
        }
    }
}

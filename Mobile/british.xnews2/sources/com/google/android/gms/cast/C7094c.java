package com.google.android.gms.cast;

/* renamed from: com.google.android.gms.cast.c */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C7094c implements Runnable {

    /* renamed from: b */
    final /* synthetic */ boolean f28538b;

    /* renamed from: c */
    final /* synthetic */ CastRemoteDisplayLocalService f28539c;

    C7094c(CastRemoteDisplayLocalService castRemoteDisplayLocalService, boolean z) {
        this.f28539c = castRemoteDisplayLocalService;
        this.f28538b = z;
    }

    public final void run() {
        this.f28539c.m29060j(this.f28538b);
    }
}

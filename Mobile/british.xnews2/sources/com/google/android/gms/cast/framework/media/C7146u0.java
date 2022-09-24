package com.google.android.gms.cast.framework.media;

import android.graphics.Bitmap;
import p234n4.C10813a;

/* renamed from: com.google.android.gms.cast.framework.media.u0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final class C7146u0 implements C10813a {

    /* renamed from: a */
    final /* synthetic */ C7150w0 f28741a;

    /* renamed from: b */
    final /* synthetic */ MediaNotificationService f28742b;

    C7146u0(MediaNotificationService mediaNotificationService, C7150w0 w0Var) {
        this.f28742b = mediaNotificationService;
        this.f28741a = w0Var;
    }

    /* renamed from: a */
    public final void mo29584a(Bitmap bitmap) {
        C7150w0 w0Var = this.f28741a;
        w0Var.f28756b = bitmap;
        C7150w0 unused = this.f28742b.f28607m = w0Var;
        this.f28742b.m29279k();
    }
}

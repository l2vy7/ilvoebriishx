package com.google.android.gms.cast.framework.media.widget;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import p235n4.C10813a;

/* renamed from: com.google.android.gms.cast.framework.media.widget.d */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final class C7154d implements C10813a {

    /* renamed from: a */
    final /* synthetic */ ExpandedControllerActivity f28819a;

    C7154d(ExpandedControllerActivity expandedControllerActivity) {
        this.f28819a = expandedControllerActivity;
    }

    @TargetApi(23)
    /* renamed from: a */
    public final void mo29584a(Bitmap bitmap) {
        if (bitmap != null) {
            if (this.f28819a.f28798W != null) {
                this.f28819a.f28798W.setVisibility(8);
            }
            if (this.f28819a.f28797V != null) {
                this.f28819a.f28797V.setVisibility(0);
                this.f28819a.f28797V.setImageBitmap(bitmap);
            }
        }
    }
}

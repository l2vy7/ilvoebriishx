package com.google.android.gms.internal.cast;

import android.graphics.Bitmap;
import p234n4.C10813a;

/* renamed from: com.google.android.gms.internal.cast.i */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final class C8563i implements C10813a {

    /* renamed from: a */
    final /* synthetic */ C8580j f43524a;

    C8563i(C8580j jVar) {
        this.f43524a = jVar;
    }

    /* renamed from: a */
    public final void mo29584a(Bitmap bitmap) {
        if (bitmap != null) {
            if (this.f43524a.f43557e != null) {
                this.f43524a.f43557e.setVisibility(4);
            }
            this.f43524a.f43554b.setVisibility(0);
            this.f43524a.f43554b.setImageBitmap(bitmap);
        }
    }
}

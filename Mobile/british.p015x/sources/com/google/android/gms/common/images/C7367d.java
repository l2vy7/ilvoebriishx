package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.common.internal.C4600c;
import p229l5.C10717e;

/* renamed from: com.google.android.gms.common.images.d */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C7367d {

    /* renamed from: a */
    protected int f29263a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo30012a(Drawable drawable, boolean z, boolean z2, boolean z3);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo30013b(Context context, C10717e eVar, boolean z) {
        int i = this.f29263a;
        mo30012a(i != 0 ? context.getResources().getDrawable(i) : null, z, false, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo30014c(Context context, Bitmap bitmap, boolean z) {
        C4600c.m20062c(bitmap);
        mo30012a(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}

package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class cp1 implements p33 {

    /* renamed from: a */
    public final /* synthetic */ String f30447a;

    /* renamed from: b */
    public final /* synthetic */ double f30448b;

    /* renamed from: c */
    public final /* synthetic */ int f30449c;

    /* renamed from: d */
    public final /* synthetic */ int f30450d;

    public /* synthetic */ cp1(String str, double d, int i, int i2) {
        this.f30447a = str;
        this.f30448b = d;
        this.f30449c = i;
        this.f30450d = i2;
    }

    public final Object apply(Object obj) {
        String str = this.f30447a;
        return new c30(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.f30448b, this.f30449c, this.f30450d);
    }
}

package com.startapp;

import android.graphics.Bitmap;
import com.startapp.C11840d1;
import com.startapp.sdk.adsbase.adinformation.ImageResourceConfig;

/* renamed from: com.startapp.b4 */
/* compiled from: Sta */
public class C11799b4 implements C11840d1.C11843b {

    /* renamed from: a */
    public final /* synthetic */ ImageResourceConfig f52622a;

    public C11799b4(ImageResourceConfig imageResourceConfig) {
        this.f52622a = imageResourceConfig;
    }

    /* renamed from: a */
    public void mo20798a(Bitmap bitmap, int i) {
        ImageResourceConfig imageResourceConfig = this.f52622a;
        imageResourceConfig.f54523a = bitmap;
        if (bitmap != null) {
            imageResourceConfig.f54525c = bitmap;
        }
    }
}

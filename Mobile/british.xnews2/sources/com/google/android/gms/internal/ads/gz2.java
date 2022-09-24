package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class gz2 implements Runnable {

    /* renamed from: b */
    private final WebView f32536b;

    /* renamed from: c */
    final /* synthetic */ hz2 f32537c;

    gz2(hz2 hz2) {
        this.f32537c = hz2;
        this.f32536b = hz2.f33000d;
    }

    public final void run() {
        this.f32536b.destroy();
    }
}

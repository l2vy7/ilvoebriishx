package com.google.ads.interactivemedia.p038v3.internal;

import android.net.Uri;

/* renamed from: com.google.ads.interactivemedia.v3.internal.agr */
final /* synthetic */ class agr implements Runnable {

    /* renamed from: a */
    private final ags f14718a;

    /* renamed from: b */
    private final Uri f14719b;

    agr(ags ags, Uri uri) {
        this.f14718a = ags;
        this.f14719b = uri;
    }

    public final void run() {
        this.f14718a.mo13702f(this.f14719b);
    }
}

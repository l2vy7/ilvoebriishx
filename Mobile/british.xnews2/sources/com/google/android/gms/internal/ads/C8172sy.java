package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

/* renamed from: com.google.android.gms.internal.ads.sy */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final /* synthetic */ class C8172sy implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C4632yy f39119b;

    /* renamed from: c */
    public final /* synthetic */ OnInitializationCompleteListener f39120c;

    public /* synthetic */ C8172sy(C4632yy yyVar, OnInitializationCompleteListener onInitializationCompleteListener) {
        this.f39119b = yyVar;
        this.f39120c = onInitializationCompleteListener;
    }

    public final void run() {
        this.f39119b.mo19018m(this.f39120c);
    }
}

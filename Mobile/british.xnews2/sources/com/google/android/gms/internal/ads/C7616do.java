package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* renamed from: com.google.android.gms.internal.ads.do */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7616do implements ValueCallback<String> {

    /* renamed from: a */
    final /* synthetic */ C7653eo f30878a;

    C7616do(C7653eo eoVar) {
        this.f30878a = eoVar;
    }

    /* renamed from: a */
    public final void onReceiveValue(String str) {
        C7653eo eoVar = this.f30878a;
        eoVar.f31441f.mo18353d(eoVar.f31438c, eoVar.f31439d, str, eoVar.f31440e);
    }
}

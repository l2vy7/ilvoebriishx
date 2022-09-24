package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class qt0 implements DialogInterface.OnClickListener {

    /* renamed from: b */
    final /* synthetic */ JsResult f38282b;

    qt0(JsResult jsResult) {
        this.f38282b = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f38282b.cancel();
    }
}

package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class rt0 implements DialogInterface.OnClickListener {

    /* renamed from: b */
    final /* synthetic */ JsResult f38770b;

    rt0(JsResult jsResult) {
        this.f38770b = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f38770b.confirm();
    }
}

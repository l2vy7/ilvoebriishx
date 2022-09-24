package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class pt0 implements DialogInterface.OnCancelListener {

    /* renamed from: b */
    final /* synthetic */ JsResult f37765b;

    pt0(JsResult jsResult) {
        this.f37765b = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f37765b.cancel();
    }
}

package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class st0 implements DialogInterface.OnCancelListener {

    /* renamed from: b */
    final /* synthetic */ JsPromptResult f39054b;

    st0(JsPromptResult jsPromptResult) {
        this.f39054b = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f39054b.cancel();
    }
}

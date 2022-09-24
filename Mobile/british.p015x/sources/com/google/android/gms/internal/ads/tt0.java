package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class tt0 implements DialogInterface.OnClickListener {

    /* renamed from: b */
    final /* synthetic */ JsPromptResult f39528b;

    tt0(JsPromptResult jsPromptResult) {
        this.f39528b = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f39528b.cancel();
    }
}

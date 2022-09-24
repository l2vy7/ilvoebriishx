package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ut0 implements DialogInterface.OnClickListener {

    /* renamed from: b */
    final /* synthetic */ JsPromptResult f39967b;

    /* renamed from: c */
    final /* synthetic */ EditText f39968c;

    ut0(JsPromptResult jsPromptResult, EditText editText) {
        this.f39967b = jsPromptResult;
        this.f39968c = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f39967b.confirm(this.f39968c.getText().toString());
    }
}

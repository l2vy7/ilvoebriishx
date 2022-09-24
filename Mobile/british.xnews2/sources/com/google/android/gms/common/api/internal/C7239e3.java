package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* renamed from: com.google.android.gms.common.api.internal.e3 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7239e3 extends C7307s1 {

    /* renamed from: a */
    final /* synthetic */ Dialog f29002a;

    /* renamed from: b */
    final /* synthetic */ C7244f3 f29003b;

    C7239e3(C7244f3 f3Var, Dialog dialog) {
        this.f29003b = f3Var;
        this.f29002a = dialog;
    }

    /* renamed from: a */
    public final void mo29854a() {
        this.f29003b.f29009c.m29661d();
        if (this.f29002a.isShowing()) {
            this.f29002a.dismiss();
        }
    }
}

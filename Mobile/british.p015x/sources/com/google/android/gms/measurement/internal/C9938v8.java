package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.v8 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9938v8 implements C9741c9 {

    /* renamed from: a */
    final /* synthetic */ C9958x8 f46818a;

    C9938v8(C9958x8 x8Var) {
        this.f46818a = x8Var;
    }

    /* renamed from: a */
    public final void mo38887a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            C9958x8 x8Var = this.f46818a;
            if (x8Var.f46876l != null) {
                x8Var.f46876l.mo19276j().mo19282q().mo38857b("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        this.f46818a.mo19273e().mo38909z(new C9928u8(this, str, "_err", bundle));
    }
}

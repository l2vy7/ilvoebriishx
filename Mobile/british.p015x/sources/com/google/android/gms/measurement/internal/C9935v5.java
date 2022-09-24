package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.v5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9935v5 implements C9741c9 {

    /* renamed from: a */
    final /* synthetic */ C9779g6 f46804a;

    C9935v5(C9779g6 g6Var) {
        this.f46804a = g6Var;
    }

    /* renamed from: a */
    public final void mo38887a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f46804a.mo38955t(TtmlNode.TEXT_EMPHASIS_AUTO, "_err", bundle, str);
        } else {
            this.f46804a.mo38953q(TtmlNode.TEXT_EMPHASIS_AUTO, "_err", bundle);
        }
    }
}

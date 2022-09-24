package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.r5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9327r5 extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C9359t5 f45418a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9327r5(C9359t5 t5Var, Handler handler) {
        super((Handler) null);
        this.f45418a = t5Var;
    }

    public final void onChange(boolean z) {
        this.f45418a.mo38057f();
    }
}
